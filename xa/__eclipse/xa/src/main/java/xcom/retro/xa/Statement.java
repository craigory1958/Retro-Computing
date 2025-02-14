

package xcom.retro.xa ;


import java.util.ArrayList ;
import java.util.HashMap ;
import java.util.List ;
import java.util.Map ;

import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.utils4j.logging.aspects.api.annotations.Log ;


public class Statement {

	//@formatter:off

	boolean assembleEnable ;
	public boolean assembleEnable() { return assembleEnable ; }

	List<Operand> operands ;
	public List<Operand> operands() { return operands ; }

	String assemblyCallbackMethod ;
	public Statement assemblyCallbackMethod(final String assemblyCallbackMethod) {
		this.assemblyCallbackMethod = assemblyCallbackMethod ;
		return this ;
	}

	Object assemblyCallbackObject ;
	public Statement assemblyCallbackObject(final Object assemblyCallbackObject) {
		this.assemblyCallbackObject = assemblyCallbackObject ;
		return this ;
	}

	ByteBlock block ;

	byte[] bytes ;
	public byte[] bytes() { return bytes ; }
	public Statement bytes(final byte[] bytes) {
		this.bytes = bytes ;
		return this ;
	}

	Symbol label ;
	public Symbol label() { return label ; }
	public Statement label(final Symbol label) {
		this.label = label ;
		return this ;
	}

	String line ;
	public String line() { return line ; }

	boolean list ;
	public boolean list() { return list ; }
	public Statement list(final boolean list) {
		this.list = list ;
		return this ;
	}

	int ln ;
	public int ln() { return ln ; }

	int lc ;
	public int lc() { return lc ; }

	Map<String, Parameter> parameters ;
	public Map<String, Parameter> parameters() { return parameters ; }

	ParserRuleContext pctx ;
	public ParserRuleContext pctx() { return pctx ; }

	int sn ;
	public int sn() { return sn ; }

	//@formatter:on


	@Log
	public Statement(final int sn, final int ln, final String line, final int lc, final boolean list, final boolean assembleEnable) {

		this.assembleEnable = assembleEnable ;
		this.lc = lc ;
		this.line = line ;
		this.list = list ;
		this.ln = ln ;
		this.sn = sn ;

		operands = new ArrayList<>() ;
		parameters = new HashMap<>() ;
	}
}
