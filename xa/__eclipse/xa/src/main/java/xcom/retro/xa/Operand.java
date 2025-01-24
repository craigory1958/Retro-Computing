

package xcom.retro.xa ;


import xcom.retro.xa.expressions._ExprNode ;


public class Operand {

	//@formatter:off

	String name ;
	public String name() { return name ; }

	_ExprNode assignment ;
	public _ExprNode assignment() { return assignment ; }
	public Operand assignment(_ExprNode assignment) { 
		this.assignment=assignment ; 
		return this ; 
	}

	//@formatter:on


	public Operand(String name, _ExprNode assignment) {
		this.name = name ;
		this.assignment = assignment ;
	}

	public Operand(String name) {
		this.name = name ;
	}

	public Operand(_ExprNode assignment) {
		this.assignment = assignment ;
	}
}
