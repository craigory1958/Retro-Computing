

package xcom.retro.xa.expressions.op.binary ;


import java.util.Map ;

import xcom.retro.xa.Identifier ;
import xcom.retro.xa.expressions.ExpressionUtils ;
import xcom.retro.xa.expressions.value.DecimalLiteral ;
import xcom.retro.xa.expressions.value._ValueNode ;


public class IntegerMultiply extends _BinaryOpNode {

	public IntegerMultiply(final Integer precedence) {
		super(precedence) ;
	}


	@Override
	public _ValueNode eval(final Map<String, Identifier> identifiers) {
		return new DecimalLiteral(
				ExpressionUtils.asBytes(ExpressionUtils.asInteger(lNode.eval(identifiers).value()) * ExpressionUtils.asInteger(rNode.eval(identifiers).value()))) ;
	}
}
