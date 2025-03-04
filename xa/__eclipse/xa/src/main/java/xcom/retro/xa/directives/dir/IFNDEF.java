

package xcom.retro.xa.directives.dir ;


import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_formatQualifiedID ;

import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


@aDirective
public class IFNDEF implements iDirective {

	//@formatter:off

	AssemblyContext actx ;

	//@formatter:on


	public IFNDEF(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {

		final String text = pctx.getChild(0).getChild(2).getChild(0).getChild(0).getChild(0).getChild(0).getText() ;
		final String moniker = EXPR_formatQualifiedID(text, actx.source().peek().as()) ;

		actx.ifBlocks().push(actx.ifBlocks().peek() && (actx.identifiers().get(moniker).value() == null)) ;
	}
}
