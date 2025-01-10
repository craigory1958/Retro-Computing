

package xcom.retro.xa ;


import xcom.retro.xa.expressions.ExpressionUtils ;


public class Symbol {

	String name ;

	public String name() {
		return name ;
	}

	byte[] value ;

	public byte[] value() {
		return value ;
	}


	public Symbol(final String name, final byte[] value) {
		this.name = name ;
		this.value = value.clone() ;
	}


	public Symbol(final String name, final int value) {
		this.name = name ;
		this.value = ExpressionUtils.asBytes(value) ;
	}
}
