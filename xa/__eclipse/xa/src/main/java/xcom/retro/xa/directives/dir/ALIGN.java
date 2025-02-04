

package xcom.retro.xa.directives.dir ;


import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.expressions.value._ValueNode ;


@aDirective
public class ALIGN implements iDirective {

	AssemblyContext actx ;


	public ALIGN(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Override
	public void parse(final ParserRuleContext pctx) {

		final _ValueNode value = actx.statement().operands().get(0).assignment().eval(actx.symbols()) ;
		actx.segment().setOrg(0xFFFF & (1 << ((int) value.getValue() / 2))) ;
	}
}
