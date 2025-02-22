

package xcom.retro.xa.expressions.op.unary ;


import java.util.Map ;

import xcom.retro.xa.Identifier ;
import xcom.retro.xa.expressions.value.DecimalLiteral ;
import xcom.retro.xa.expressions.value._ValueNode ;


public class HighByte extends _UnaryOpNode {

	public HighByte(final Integer precedence) {
		super(precedence) ;
	}


	@Override
	public _ValueNode eval(final Map<String, Identifier> identifiers) {
		return new DecimalLiteral(node.eval(identifiers).value()[1]) ;
	}
}
