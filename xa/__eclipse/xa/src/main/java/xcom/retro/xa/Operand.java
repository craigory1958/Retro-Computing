

package xcom.retro.xa ;


import xcom.retro.xa.expressions._ExprNode ;


public class Operand {

	//@formatter:off

	String name ;
	public String name() { return name ; }

	_ExprNode assignment ;
	public _ExprNode assignment() { return assignment ; }
	public Operand assignment(final _ExprNode assignment) {
		this.assignment=assignment ;
		return this ;
	}

	//@formatter:on


	public Operand(final String name, final _ExprNode assignment) {
		this.name = name ;
		this.assignment = assignment ;
	}

	public Operand(final String name) {
		this.name = name ;
	}

	public Operand(final _ExprNode assignment) {
		this.assignment = assignment ;
	}
}
