

package xcom.retro.xa.expressions.value ;


import xcom.retro.xa.expressions.ExpressionUtils ;


public class DecimalLiteral extends _ValueNode {

	public DecimalLiteral(final byte[] value) {
		super(value) ;
	}

	
	public DecimalLiteral(final byte value) {
		super(value) ;
	}

	
	public DecimalLiteral(final int value) {
		super(ExpressionUtils.asBytes(value)) ;
	}


	public DecimalLiteral(final String value) {
		super(ExpressionUtils.asBytes(Integer.valueOf(value))) ;
	}
}
