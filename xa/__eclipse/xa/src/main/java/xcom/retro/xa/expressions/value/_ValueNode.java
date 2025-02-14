

package xcom.retro.xa.expressions.value ;


import java.util.Map ;

import com.google.common.primitives.Bytes ;

import xcom.retro.xa.Symbol ;
import xcom.retro.xa.expressions.ExpressionUtils ;
import xcom.retro.xa.expressions._ExprNode ;


public abstract class _ValueNode extends _ExprNode {

	//@formatter:off

	byte[] value ;
	public byte[] value() { return value ; }

	//@formatter:on


	public _ValueNode(final byte[] value) {
		this.value = value.clone() ;
	}


	public _ValueNode(final byte value) {
		final byte[] b = { value } ;
		this.value = b ;
	}


	public Object getValue() {

		if ( this instanceof StringLiteral )
			return ExpressionUtils.asString(value) ;
		else
			return ExpressionUtils.asInteger(value) ;
	}


	@Override
	public _ValueNode eval(final Map<String, Symbol> symbols) {
		return this ;
	}


	@Override
	public String toString() {
		return Bytes.asList(value).toString() ;
	}
}
