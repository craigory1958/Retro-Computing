

package xcom.retro.xa.expressions ;


import static xcom.retro.xa.expressions.ExpressionListener.OperatorOperands.Binary ;
import static xcom.retro.xa.expressions.ExpressionListener.OperatorOperands.Unary ;

import java.util.Stack ;

import org.antlr.v4.runtime.ParserRuleContext ;
import org.fest.reflect.core.Reflection ;
import org.fest.reflect.exception.ReflectionError ;
import org.slf4j.Logger ;
import org.slf4j.LoggerFactory ;

import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.antlr.ExpressionsBaseListener ;
import xcom.retro.xa.expressions.op._OpNode ;
import xcom.retro.xa.expressions.op.binary._BinaryOpNode ;
import xcom.retro.xa.expressions.op.unary._UnaryOpNode ;
import xcom.retro.xa.expressions.value.DecimalLiteral ;
import xcom.retro.xa.expressions.value.ExprMarker ;
import xcom.retro.xa.expressions.value.Identifier ;
import xcom.retro.xa.expressions.value._ValueNode ;
import xcom.utils4j.Enums ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


public class ExpressionListener extends ExpressionsBaseListener {

	enum OperatorOperands {
		Unary, Binary, Ternary;
	}

	// https://en.cppreference.com/w/c/language/operator_precedence
	enum Operators {

		BitwiseAnd(Binary, 8), //
		BitwiseShiftOr(Binary, 10), //
		BitwiseShiftLeft(Binary, 5), //
		BitwiseShiftRight(Binary, 5), //

		IntegerAdd(Binary, 4), //
		IntegerDivide(Binary, 3), //
		IntegerMultiply(Binary, 3), //
		IntegerSubtract(Binary, 4), //

		Equal(Binary, 7), //

		HighByte(Unary, 2), //
		LogicalNot(Unary, 2), //
		LowByte(Unary, 2), //
		Minus(Unary, 2), //
		Plus(Unary, 2), //
		;


		OperatorOperands operands ;
		int precedence ;


		Operators(final OperatorOperands operands, final int precedence) {
			this.operands = operands ;
			this.precedence = precedence ;
		}
	}


	private static final Logger Logger = LoggerFactory.getLogger(ExpressionListener.class) ;


	AssemblyContext actx ;
	Stack<_ExprNode> shunt = new Stack<>() ;
	Stack<_ExprNode> stack = new Stack<>() ;
	_ExprNode expr ;


	public ExpressionListener(final AssemblyContext actx) {
		this.actx = actx ;
	}

	@Override
	public void enterEveryRule(final ParserRuleContext pctx) {
		invokeMethodFromContext("enter", pctx) ;
	}

	@Override
	public void exitEveryRule(final ParserRuleContext pctx) {
		invokeMethodFromContext("exit", pctx) ;
	}


	public void invokeMethodFromContext(final String prefix, final ParserRuleContext pctx) {

		try {
			String method = pctx.getClass().getSimpleName() ;
			method = prefix + method.substring(0, method.length() - 7) ;
			Logger.debug("invoke: {}", method) ;
			Reflection.method(method).withParameterTypes(ParserRuleContext.class).in(this).invoke(pctx) ;
		}
		catch ( final ReflectionError ex ) {}
	}


	@Log
	public void exitArgument(final ParserRuleContext pctx) {
		expr = stack.pop() ;
	}


	@Log
	public void enterExpr(final ParserRuleContext pctx) {
		shunt.push(new ExprMarker("(")) ;
	}

	@Log
	public void exitExpr(final ParserRuleContext pctx) {

		while ( !shunt.isEmpty() && !(shunt.peek() instanceof ExprMarker) ) {

			final _OpNode t = (_OpNode) shunt.pop() ;
			t.popOperands(stack) ;
			stack.push(t) ;
		}

		shunt.pop() ;
	}


//	@Log
//	public void exitDottedIdentifier(final ParserRuleContext pctx) {
//		stack.push(new StringLiteral('"' + pctx.getText() + '"')) ;
//	}


	@Log
	public void exitIdentifier(final ParserRuleContext pctx) {
		stack.push(new Identifier(pctx.getText())) ;
	}


	@Log
	public void exitOrg(final ParserRuleContext pctx) {
		stack.push(new DecimalLiteral(ExpressionUtils.asBytes(actx.segment().lc()))) ;
	}


	@Log
	public void exitParameter(final ParserRuleContext pctx) {
		expr = (_ExprNode) pctx.getChild(0) ;
	}


	//
	// Operators ...
	//

	@Log
	public void exitBinary(final ParserRuleContext pctx) {
		exitOperator(pctx, _BinaryOpNode.class) ;
	}

	@Log
	public void exitUnary(final ParserRuleContext pctx) {
		exitOperator(pctx, _UnaryOpNode.class) ;
	}


	@Log
	public void exitOperator(final ParserRuleContext pctx, final Class<? extends _OpNode> clazz) {

		String name = pctx.getChild(0).getClass().getSimpleName() ;
		name = name.substring(0, name.length() - 7) ;
		final Operators _op = Enums.valueOfIgnoreCase(Operators.class, name) ;

		final String classname = clazz.getPackageName() + "." + _op.name() ;
		final _OpNode op = Reflection.constructor().withParameterTypes(Integer.class).in(Reflection.type(classname).loadAs(clazz)).newInstance(_op.precedence) ;

		while ( !shunt.isEmpty() && !(shunt.peek() instanceof ExprMarker) && (((_OpNode) shunt.peek()).precedence() < op.precedence()) ) {

			final _OpNode t = (_OpNode) shunt.pop() ;
			t.popOperands(stack) ;

			stack.push(t) ;
		}

		shunt.push(op) ;
	}


	//
	// Literals ...
	//

	@Log
	public void exitAlphanumericLiteral(final ParserRuleContext pctx) {

		String name = pctx.getChild(0).getClass().getSimpleName() ;
		name = name.substring(0, name.length() - 7) ;

		final String classname = _ValueNode.class.getPackageName() + "." + name ;
		final _ValueNode literal = Reflection.constructor().withParameterTypes(String.class).in(Reflection.type(classname).loadAs(_ValueNode.class))
				.newInstance(pctx.getChild(0).getChild(0).getText()) ;

		stack.push(literal) ;
	}

	@Log
	public void exitNumericLiteral(final ParserRuleContext pctx) {

		String name = pctx.getChild(0).getClass().getSimpleName() ;
		name = name.substring(0, name.length() - 7) ;

		final String classname = _ValueNode.class.getPackageName() + "." + name ;
		final _ValueNode literal = Reflection.constructor().withParameterTypes(String.class).in(Reflection.type(classname).loadAs(_ValueNode.class))
				.newInstance(pctx.getChild(0).getChild(0).getText()) ;

		stack.push(literal) ;
	}
}
