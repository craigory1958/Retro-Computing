

package xcom.retro.xa ;


import xcom.retro.xa.expressions._ExprNode ;


public class Argument extends Operand {

	//@formatter:off

	String name ;
	@Override
	public String name() { return null ; }

	//@formatter:on

	public Argument(final _ExprNode assignment) {
		super(assignment) ;
	}
}
