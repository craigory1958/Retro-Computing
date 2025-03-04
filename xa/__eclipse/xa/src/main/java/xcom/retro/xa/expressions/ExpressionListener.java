

package xcom.retro.xa.expressions ;


import static xcom.retro.xa.expressions.ExpressionListener.OperatorOperands.Binary ;
import static xcom.retro.xa.expressions.ExpressionListener.OperatorOperands.Unary ;
import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_asBytes ;
import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_formatQualifiedID ;
import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_formatScopedID ;
import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_parsedContextName ;
import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_parsedText ;

import java.util.Stack ;

import org.antlr.v4.runtime.ParserRuleContext ;
import org.fest.reflect.core.Reflection ;
import org.fest.reflect.exception.ReflectionError ;
import org.slf4j.Logger ;
import org.slf4j.LoggerFactory ;

import xcom.retro.xa.Identifier ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.antlr.AssemblyBaseListener ;
import xcom.retro.xa.api.interfaces.iSource ;
import xcom.retro.xa.expressions.op._OpNode ;
import xcom.retro.xa.expressions.op.binary._BinaryOpNode ;
import xcom.retro.xa.expressions.op.unary._UnaryOpNode ;
import xcom.retro.xa.expressions.value.DecimalLiteral ;
import xcom.retro.xa.expressions.value.ExprMarker ;
import xcom.retro.xa.expressions.value.IdentifierValue ;
import xcom.retro.xa.expressions.value.StringLiteral ;
import xcom.retro.xa.expressions.value._ValueNode ;
import xcom.utils4j.Enums ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


public class ExpressionListener extends AssemblyBaseListener {

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

	final static Identifier $Identifier = new Identifier(null) ;


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

		String _methodContext = EXPR_parsedContextName(pctx) ;

		try {
			String method = prefix + _methodContext ;
			Logger.debug("invoke: {}", method) ;
			Reflection //
					.method(method) //
					.withParameterTypes(ParserRuleContext.class) //
					.in(this) //
					.invoke(pctx) ;
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


	@Log
	public void exitGlobalLabel(final ParserRuleContext pctx) {

		final iSource _source = actx.source().peek() ;
		final String _identfier = EXPR_parsedText(pctx) ;
		final String _qualifedIdentifier = EXPR_formatQualifiedID(_identfier, _source.as()) ;

//		System.err.println("sourceID: " + actx.source().peek().sourceID() + ",  as: " + actx.source().peek().as()) ;
//		System.err.println("moniker: " + _qualifedIdentifier) ;

		stack.push(new IdentifierValue(_qualifedIdentifier)) ;

		if ( !actx.identifiers().containsKey(_qualifedIdentifier) )
			actx.identifiers().put(_qualifedIdentifier, new Identifier(_qualifedIdentifier)) ;

		actx.identifiers().get(_qualifedIdentifier).references().add($Identifier.new Reference(actx.ln(), _source.sourceID(), _source.sourceLN())) ;
	}


//	@Log
//	public void exitIdentifier(final ParserRuleContext pctx) {
//
//		final iSource _source = actx.source().peek() ;
//		final String _identifier = getParsedText(pctx) ;
//		System.err.println("_identifier: " + _identifier) ;
//		final String _qualifedIdentifier = formatQualifiedID(_identifier, _source.as()) ;
//
//		System.err.println("sourceID: " + actx.source().peek().sourceID() + ",  as: " + actx.source().peek().as()) ;
//		System.err.println("_qualifedIdentifier: " + _qualifedIdentifier) ;
//
//		stack.push(new IdentifierValue(_qualifedIdentifier)) ;
//
//		if ( !actx.identifiers().containsKey(_qualifedIdentifier) )
//			actx.identifiers().put(_qualifedIdentifier, new Identifier(_qualifedIdentifier)) ;
//
//		actx.identifiers().get(_qualifedIdentifier).references().add($Identifier.new Reference(actx.ln(), _source.sourceID(), _source.sourceLN())) ;
//	}


	@Log
	public void exitQualifiedIdentifier(final ParserRuleContext pctx) {

		final iSource _source = actx.source().peek() ;
		final String _identifier = EXPR_parsedText(pctx) ;
//		System.err.println("_identifier: " + _identifier) ;
		final String _qualifedIdentifier = EXPR_formatQualifiedID(_identifier, _source.as()) ;

//		System.err.println("sourceID: " + actx.source().peek().sourceID() + ",  as: " + actx.source().peek().as()) ;
//		System.err.println("_qualifedIdentifier: " + _qualifedIdentifier) ;

		stack.push(new IdentifierValue(_qualifedIdentifier)) ;

		if ( !actx.identifiers().containsKey(_qualifedIdentifier) )
			actx.identifiers().put(_qualifedIdentifier, new Identifier(_qualifedIdentifier)) ;

		actx.identifiers().get(_qualifedIdentifier).references().add($Identifier.new Reference(actx.ln(), _source.sourceID(), _source.sourceLN())) ;
	}


	@Log
	public void exitScopedIdentifier(final ParserRuleContext pctx) {

		final iSource _source = actx.source().peek() ;
		final String _identfier = EXPR_parsedText(pctx) ;
		final String _scopedIdentfier = EXPR_formatScopedID(_identfier, _source) ;

//		System.err.println("sourceID: " + actx.source().peek().sourceID() + ",  as: " + actx.source().peek().as()) ;
//		System.err.println("moniker: " + _identfier) ;
//		System.err.println("scopedMoniker: " + _scopedIdentfier) ;

		stack.push(new IdentifierValue(_scopedIdentfier)) ;

		if ( !actx.identifiers().containsKey(_scopedIdentfier) )
			actx.identifiers().put(_scopedIdentfier, new Identifier(_scopedIdentfier, _identfier)) ;

		actx.identifiers().get(_scopedIdentfier).references().add($Identifier.new Reference(actx.ln(), _source.sourceID(), _source.sourceLN())) ;
	}


	@Log
	public void exitOrg(final ParserRuleContext pctx) {
		stack.push(new DecimalLiteral(EXPR_asBytes(actx.segment().loc()))) ;
	}


	@Log
	public void exitParameter(final ParserRuleContext pctx) {
		expr = (_ExprNode) pctx.getChild(0) ;
	}


	@Log
	public void exitSymbol(final ParserRuleContext pctx) {

		final iSource _source = actx.source().peek() ;
		final String _symbol = '.' + EXPR_parsedText(pctx) ;
//		System.err.println("_symbol: " + _symbol) ;
//		final String _qualifedIdentifier = formatQualifiedID(_identifier, _source.as()) ;

//		System.err.println("sourceID: " + actx.source().peek().sourceID() + ",  as: " + actx.source().peek().as()) ;
//		System.err.println("moniker: " + _symbol) ;

//		stack.push(new IdentifierValue(_symbol)) ;
		stack.push(new StringLiteral(_symbol)) ;

		if ( !actx.identifiers().containsKey(_symbol) )
			actx.identifiers().put(_symbol, new Identifier(_symbol, _symbol.getBytes())) ;

		actx.identifiers().get(_symbol).references().add($Identifier.new Reference(actx.ln(), _source.sourceID(), _source.sourceLN())) ;
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

		String _operator = EXPR_parsedContextName(pctx.getChild(0)) ;
		final Operators _op = Enums.valueOfIgnoreCase(Operators.class, _operator) ;

		final _OpNode operator = Reflection //
				.constructor() //
				.withParameterTypes(Integer.class) //
				.in(Reflection //
						.type(clazz.getPackageName() + "." + _op.name()) //
						.loadAs(clazz)) //
				.newInstance(_op.precedence) ;

		while ( !shunt.isEmpty() && !(shunt.peek() instanceof ExprMarker) && (((_OpNode) shunt.peek()).precedence() < operator.precedence()) ) {

			final _OpNode t = (_OpNode) shunt.pop() ;
			t.popOperands(stack) ;

			stack.push(t) ;
		}

		shunt.push(operator) ;
	}


	//
	// Literals ...
	//

	@Log
	public void exitAlphanumericLiteral(final ParserRuleContext pctx) {
		exitAlphanumericOrNumericLiteral(pctx) ;
	}

	@Log
	public void exitNumericLiteral(final ParserRuleContext pctx) {
		exitAlphanumericOrNumericLiteral(pctx) ;
	}

	public void exitAlphanumericOrNumericLiteral(final ParserRuleContext pctx) {

		final String _literal = EXPR_parsedText(pctx.getChild(0).getChild(0)) ;
		String _literalContext = EXPR_parsedContextName(pctx.getChild(0)) ;

		final _ValueNode literal = Reflection //
				.constructor() //
				.withParameterTypes(String.class) //
				.in(Reflection //
						.type(_ValueNode.class.getPackageName() + "." + _literalContext) //
						.loadAs(_ValueNode.class)) //
				.newInstance(_literal) ;

		stack.push(literal) ;
	}
}
