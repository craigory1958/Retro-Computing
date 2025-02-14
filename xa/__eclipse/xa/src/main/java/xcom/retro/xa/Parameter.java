

package xcom.retro.xa ;


import xcom.retro.xa.expressions._ExprNode ;


public class Parameter extends Operand {

	public Parameter(final String name, final _ExprNode assignment) {
		super(name, assignment) ;
	}

	public Parameter(final String name) {
		super(name) ;
	}
}
