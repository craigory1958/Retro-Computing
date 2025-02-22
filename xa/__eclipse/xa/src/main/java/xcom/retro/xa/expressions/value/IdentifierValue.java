

package xcom.retro.xa.expressions.value ;


import java.util.Map ;

import xcom.retro.xa.Identifier ;


public class IdentifierValue extends _ValueNode {

	public IdentifierValue(final String value) {
		super(value.getBytes()) ;
	}


	public IdentifierValue(final byte[] value) {
		super(value) ;
	}


	@Override
	public _ValueNode eval(final Map<String, Identifier> identifiers) {
		return new IdentifierValue(identifiers.get(new String(value())).value()) ;
	}
}
