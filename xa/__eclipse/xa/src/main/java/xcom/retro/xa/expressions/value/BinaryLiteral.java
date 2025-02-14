

package xcom.retro.xa.expressions.value ;


import xcom.retro.xa.expressions.ExpressionUtils ;


public class BinaryLiteral extends _ValueNode {

	public BinaryLiteral(final String value) {
		super(ExpressionUtils.asBytes(Integer.valueOf(value.substring(2), 2))) ;
	}
}
