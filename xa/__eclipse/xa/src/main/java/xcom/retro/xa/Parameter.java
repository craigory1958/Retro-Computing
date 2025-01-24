

package xcom.retro.xa ;


import xcom.retro.xa.expressions._ExprNode ;


public class Parameter extends Operand {

	public Parameter(String name, _ExprNode assignment) {
		super(name, assignment) ;
	}

	public Parameter(String name) {
		super(name) ;
	}
}
