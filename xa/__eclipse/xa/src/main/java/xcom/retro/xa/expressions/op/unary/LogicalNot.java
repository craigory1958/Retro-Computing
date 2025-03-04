

package xcom.retro.xa.expressions.op.unary ;


import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_asBytes ;
import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_asInteger ;

import java.util.Map ;

import xcom.retro.xa.Identifier ;
import xcom.retro.xa.expressions.value.DecimalLiteral ;
import xcom.retro.xa.expressions.value._ValueNode ;


public class LogicalNot extends _UnaryOpNode {

	public LogicalNot(final Integer precedence) {
		super(precedence) ;
	}


	@Override
	public _ValueNode eval(final Map<String, Identifier> identifiers) {
		return new DecimalLiteral(EXPR_asBytes(0 - EXPR_asInteger(node.eval(identifiers).value()))) ;
	}
}
