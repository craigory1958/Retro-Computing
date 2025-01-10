

package xcom.retro.xa.expressions.op.binary ;


import java.util.Map ;

import xcom.retro.xa.Symbol ;
import xcom.retro.xa.expressions.ExpressionUtils ;
import xcom.retro.xa.expressions.value.DecimalLiteral ;
import xcom.retro.xa.expressions.value._ValueNode ;


public class Equal extends _BinaryOpNode {

	public Equal(final Integer precedence) {
		super(precedence) ;
	}


	@Override
	public _ValueNode eval(final Map<String, Symbol> symbols) {
		return new DecimalLiteral(ExpressionUtils
				.asBytes(ExpressionUtils.asInteger(lNode.eval(symbols).getValue()) == ExpressionUtils.asInteger(rNode.eval(symbols).getValue()) ? 1 : 0)) ;
	}
}
