

package xcom.retro.xa.directives ;


import org.antlr.v4.runtime.tree.ParseTreeListener ;
import org.antlr.v4.runtime.tree.ParseTreeWalker ;

import xcom.retro.xa.XA.AssemblyContext ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


public class DirectiveUtils {

	@Log
	public static void DIR_parseDirective(final AssemblyContext actx) {

		final ParseTreeListener listener = new DirectiveListener(actx) ;
		final ParseTreeWalker walker = new ParseTreeWalker() ;

		walker.walk(listener, actx.statement().pctx()) ;
	}
}
