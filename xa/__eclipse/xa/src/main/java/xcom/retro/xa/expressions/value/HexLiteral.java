

package xcom.retro.xa.expressions.value ;


import xcom.retro.xa.expressions.ExpressionUtils ;


public class HexLiteral extends _ValueNode {

	public HexLiteral(final String value) {
		super(ExpressionUtils.asBytes(Integer.valueOf((value.substring(0, 1).equals("$") ? value.substring(1) : value.substring(2)), 16))) ;
	}
}
