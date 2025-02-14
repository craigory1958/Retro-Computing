

package xcom.retro.xa.expressions.value ;


import java.util.Map ;

import xcom.retro.xa.Symbol ;


public class Identifier extends _ValueNode {

	public Identifier(final String value) {
		super(value.getBytes()) ;
	}


	public Identifier(final byte[] value) {
		super(value) ;
	}


	@Override
	public _ValueNode eval(final Map<String, Symbol> symbols) {
		return new Identifier(symbols.get(new String(value())).value()) ;
	}
}
