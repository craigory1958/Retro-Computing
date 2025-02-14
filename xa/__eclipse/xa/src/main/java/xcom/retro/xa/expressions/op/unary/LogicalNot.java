

package xcom.retro.xa.expressions.op.unary ;


import java.util.Map ;

import xcom.retro.xa.Symbol ;
import xcom.retro.xa.expressions.ExpressionUtils ;
import xcom.retro.xa.expressions.value.DecimalLiteral ;
import xcom.retro.xa.expressions.value._ValueNode ;


public class LogicalNot extends _UnaryOpNode {

	public LogicalNot(final Integer precedence) {
		super(precedence) ;
	}


	@Override
	public _ValueNode eval(final Map<String, Symbol> symbols) {
		return new DecimalLiteral(ExpressionUtils.asBytes(0 - ExpressionUtils.asInteger(node.eval(symbols).value()))) ;
	}
}
