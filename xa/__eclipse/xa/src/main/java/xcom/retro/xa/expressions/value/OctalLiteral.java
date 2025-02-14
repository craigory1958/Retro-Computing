

package xcom.retro.xa.expressions.value ;


import xcom.retro.xa.expressions.ExpressionUtils ;


public class OctalLiteral extends _ValueNode {

	public OctalLiteral(final String value) {
		super(ExpressionUtils.asBytes(Integer.valueOf(value.substring(2), 8))) ;
	}
}
