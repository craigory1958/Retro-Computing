

package xcom.retro.xa.directives.dir ;


import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.Symbol ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.expressions.value._ValueNode ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


@aDirective
public class EQU implements iDirective {

	AssemblyContext actx ;


	public EQU(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {

		final _ValueNode value = actx.statement().operands().get(0).assignment().eval(actx.symbols()) ;
		actx.symbol(new Symbol(pctx.getParent().getChild(0).getChild(0).getText(), value.value())) ;
		actx.symbols().put(pctx.getParent().getChild(0).getChild(0).getText(), actx.symbol()) ;
	}
}
