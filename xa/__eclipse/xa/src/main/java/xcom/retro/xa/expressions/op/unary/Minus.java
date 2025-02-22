

package xcom.retro.xa.expressions.op.unary ;


import java.util.Map ;

import xcom.retro.xa.Identifier ;
import xcom.retro.xa.expressions.ExpressionUtils ;
import xcom.retro.xa.expressions.value.DecimalLiteral ;
import xcom.retro.xa.expressions.value._ValueNode ;


public class Minus extends _UnaryOpNode {

	public Minus(final Integer precedence) {
		super(precedence) ;
	}


	@Override
	public _ValueNode eval(final Map<String, Identifier> identifiers) {
		return new DecimalLiteral(0 - ExpressionUtils.asInteger(node.eval(identifiers).value())) ;
	}
}
