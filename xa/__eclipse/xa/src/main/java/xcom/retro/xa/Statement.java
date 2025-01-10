

package xcom.retro.xa ;


import java.util.ArrayList ;
import java.util.List ;

import org.antlr.v4.runtime.ParserRuleContext ;


public class Statement {

	//@formatter:off

	List<Argument> arguments ;
	public List<Argument> arguments() { return arguments ; }

	String assembleCallbackMethod ;
	public Statement assembleCallbackMethod(String assembleCallbackMethod) {
		this.assembleCallbackMethod = assembleCallbackMethod ;
		return this ;
	}

	Object assembleCallbackObject ;
	public Statement assembleCallbackObject(Object assembleCallbackObject) {
		this.assembleCallbackObject = assembleCallbackObject ;
		return this ;
	}

	ByteBlock block ;
	
	byte[] bytes ;
	public byte[] bytes() { return bytes ; }
	public Statement bytes(byte[] bytes) {
		this.bytes = bytes ;
		return this ;
	}

	String line ;
	public String line() { return line ; }
	
	boolean list ;
	public boolean list() { return list ; }
	public Statement list(boolean list) {
		this.list = list ;
		return this ;
	}

	int ln ;
	public int ln() { return ln ; }

	int lc ;
	public int lc() { return lc ; }

	ParserRuleContext prc ;
	public ParserRuleContext prc() { return prc ; }

	int sn ;
	public int sn() { return sn ; }

	//@formatter:on


	public Statement(final int sn, final int ln, final String line, final int lc, final boolean list) {

		this.lc = lc ;
		this.line = line ;
		this.list = list ;
		this.ln = ln ;
		this.sn = sn ;

		arguments = new ArrayList<>() ;
	}
}
