

package xcom.retro.xa.directives.dir ;


import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


@aDirective
public class IF implements iDirective {

	//@formatter:off

	AssemblyContext actx ;

	//@formatter:on


	public IF(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {
		actx.ifBlocks().push(actx.ifBlocks().peek() && (int) actx.statement().operands().get(0).assignment().eval(actx.symbols()).getValue() != 0) ;
	}
}
