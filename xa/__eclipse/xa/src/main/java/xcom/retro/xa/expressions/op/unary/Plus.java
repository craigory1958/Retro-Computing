

package xcom.retro.xa.expressions.op.unary ;


import java.util.Map ;

import xcom.retro.xa.Identifier ;
import xcom.retro.xa.expressions.ExpressionUtils ;
import xcom.retro.xa.expressions.value.DecimalLiteral ;
import xcom.retro.xa.expressions.value._ValueNode ;


public class Plus extends _UnaryOpNode {

	public Plus(final Integer precedence) {
		super(precedence) ;
	}


	@Override
	public _ValueNode eval(final Map<String, Identifier> identifiers) {
		return new DecimalLiteral(ExpressionUtils.asInteger(node.eval(identifiers).value())) ;
	}
}
