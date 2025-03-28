

package xcom.retro.xa.expressions.value ;


import java.util.Map ;
import java.util.Optional ;
import java.util.function.Predicate ;

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

		final String id = new String(value()) ;

		if ( symbols.containsKey(id) && (symbols.get(id).value() != null) )
			return new Identifier(symbols.get(id).value()) ;


		final Optional<Symbol> symbol = symbols.values().stream().filter(new Predicate<Symbol>() {
			@Override
			public boolean test(Symbol v) {
				return v.moniker().equals(id) ;
			}
		}).findFirst() ;

		if ( symbol.isPresent() && (symbol.get().value() != null) )
			return new Identifier(symbol.get().value()) ;

		return null ;
	}
}
