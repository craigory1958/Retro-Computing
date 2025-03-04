

package xcom.retro.xa.expressions.op.binary ;


import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_asInteger ;

import java.util.Map ;

import xcom.retro.xa.Identifier ;
import xcom.retro.xa.expressions.ExpressionUtils ;
import xcom.retro.xa.expressions.value.DecimalLiteral ;
import xcom.retro.xa.expressions.value._ValueNode ;


public class Equal extends _BinaryOpNode {

	public Equal(final Integer precedence) {
		super(precedence) ;
	}


	@Override
	public _ValueNode eval(final Map<String, Identifier> identifiers) {
		return new DecimalLiteral(
				ExpressionUtils.EXPR_asBytes(EXPR_asInteger(lNode.eval(identifiers).value()) == EXPR_asInteger(rNode.eval(identifiers).value()) ? 1 : 0)) ;
	}
}
