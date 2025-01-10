

package xcom.retro.xa.directives.dir ;


import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.Segment ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;


@aDirective
public class _SegmentDirective implements iDirective {

	AssemblyContext actx ;


	public _SegmentDirective(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Override
	public void parse(final ParserRuleContext pctx) {
//		actx.getStatement().setBytes(new byte[0]) ;

		final String value = actx.statement().arguments().get(0).expr().eval(actx.symbols()).getValueAsString() ;

		if ( !actx.segments().containsKey(value) )
			actx.segments().put(value, new Segment(value)) ;

		actx.segment(actx.segments().get(value)) ;
	}
}
