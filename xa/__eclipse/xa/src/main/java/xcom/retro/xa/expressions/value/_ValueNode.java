

package xcom.retro.xa.expressions.value ;


import java.util.Map ;

import com.google.common.primitives.Bytes ;

import xcom.retro.xa.Symbol ;
import xcom.retro.xa.expressions.ExpressionUtils ;
import xcom.retro.xa.expressions._ExprNode ;


public abstract class _ValueNode extends _ExprNode {

	byte[] value ;

	public byte[] getValue() {
		return value ;
	}


	public _ValueNode(final byte[] value) {
		this.value = value.clone() ;
	}


	public _ValueNode(byte value) {
		byte[] b = { value } ;
		this.value = b ;
	}


	public int getValueAsInteger() {
		return ExpressionUtils.asInteger(value) ;
	}


	public String getValueAsString() {
		return ExpressionUtils.asString(value) ;
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
