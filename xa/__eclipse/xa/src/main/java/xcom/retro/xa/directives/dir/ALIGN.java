

package xcom.retro.xa.directives.dir ;


import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.Operand ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.expressions.value._ValueNode ;
import xcom.utils4j.data.structured.map.Maps ;


@aDirective
public class ALIGN implements iDirective {

	AssemblyContext actx ;


	public ALIGN(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Override
	public void parse(final ParserRuleContext pctx) {

		final Operand operand1 = Maps.firstEntryValue(actx.statement().operands()) ;
		final _ValueNode value = operand1.assignment().eval(actx.identifiers()) ;
		actx.segment().setOrg((actx.statement().loc() + ((int) value.getValue())) - (actx.statement().loc() % ((int) value.getValue()))) ;
	}
}
