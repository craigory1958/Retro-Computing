

package xcom.retro.xa.directives.dir ;


import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.Segment ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;


@aDirective
public class SEGMENT implements iDirective {

	AssemblyContext actx ;


	public SEGMENT(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Override
	public void parse(final ParserRuleContext pctx) {

		final String value = (String) actx.statement().operands().get(0).assignment().eval(actx.symbols()).getValue() ;

		if ( !actx.segments().containsKey(value) )
			actx.segments().put(value, new Segment(value)) ;

		actx.segment(actx.segments().get(value)) ;
	}
}
