

package xcom.retro.xa.parsing ;


import java.util.List ;

import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.antlr.processors._MOS6502.MOS6502_BaseListener ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


public class ParsingListener extends MOS6502_BaseListener {


	List<String> walked ;


	@Log
	public ParsingListener() {}


	@Log
	@Override
	public void enterEveryRule(ParserRuleContext pctx) {
		walked.add(pctx.getClass().getSimpleName().substring(0, pctx.getClass().getSimpleName().length() - 7)) ;
	}
}
