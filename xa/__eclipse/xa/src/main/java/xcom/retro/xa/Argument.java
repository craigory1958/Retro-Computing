

package xcom.retro.xa ;


import xcom.retro.xa.expressions._ExprNode ;


public class Argument {

	//@formatter:off

	_ExprNode expr ;
	public _ExprNode expr() { return expr ; }
	
	Object value ;
	public Object value() { return value; }

	Integer width ;

	//@formatter:on


	public Argument(final _ExprNode expr) {
		this.expr = expr ;
	}
}
