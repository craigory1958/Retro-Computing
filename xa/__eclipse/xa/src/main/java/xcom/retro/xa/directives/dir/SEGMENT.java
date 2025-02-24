

package xcom.retro.xa.directives.dir ;


import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.Operand ;
import xcom.retro.xa.Segment ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.utils4j.data.structured.map.Maps ;


@aDirective
public class SEGMENT implements iDirective {

	AssemblyContext actx ;


	public SEGMENT(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Override
	public void parse(final ParserRuleContext pctx) {

		final Operand operand1 = Maps.firstEntryValue(actx.statement().operands()) ;
		final String value = (String) operand1.assignment().eval(actx.identifiers()).getValue() ;

		if ( !actx.segments().containsKey(value) )
			actx.segments().put(value, new Segment(value)) ;

		actx.segment(actx.segments().get(value)) ;
	}
}
