

package xcom.retro.xa.expressions.value ;


public class StringLiteral extends _ValueNode {

	public StringLiteral(final byte[] value) {
		super(value) ;
	}


	public StringLiteral(final String value) {
		super(value.substring(1, value.length() - 1).getBytes()) ;
	}
}
