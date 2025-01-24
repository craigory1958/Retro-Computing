

package xcom.retro.xa.directives.dir ;


import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.InjectSource ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.expressions.value._ValueNode ;


@aDirective
public class IF implements iDirective {

	AssemblyContext actx ;


	public IF(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Override
	public void parse(final ParserRuleContext pctx) {

//		System.out.println(pctx.getChild(3).getText()) ;

		if ( (pctx.getChildCount() == 4) && pctx.getChild(3).getText().startsWith("->") ) {
			final _ValueNode value = actx.statement().operands().get(0).assignment().eval(actx.symbols()) ;
			if ( value.getValueAsInteger() != 0 ) {
				actx.sources().add(new InjectSource(actx.sources().size(), 0, pctx.getChild(3).getText().substring(2))) ;
				actx.source().push(actx.sources().get(actx.sources().size() - 1)) ;
//			System.out.println(actx.getSource()) ;
			}
		}

		actx.statement().bytes(new byte[0]) ;
	}
}
