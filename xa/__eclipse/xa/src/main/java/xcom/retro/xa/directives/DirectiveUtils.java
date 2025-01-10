

package xcom.retro.xa.directives ;


import java.io.IOException ;
import java.util.ArrayList ;
import java.util.List ;
import java.util.function.Function ;
import java.util.stream.Collectors ;

import org.antlr.v4.runtime.ParserRuleContext ;
import org.antlr.v4.runtime.tree.ParseTreeListener ;
import org.antlr.v4.runtime.tree.ParseTreeWalker ;
import org.apache.commons.lang3.StringUtils ;

import xcom.retro.xa.Argument ;
import xcom.retro.xa.Statement ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.expressions.value.Identifier ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


public class DirectiveUtils {

	@Log
	public static void parseDirective(final AssemblyContext actx) {

		final ParseTreeListener listener = new DirectiveListener(actx) ;
		final ParseTreeWalker walker = new ParseTreeWalker() ;

		walker.walk(listener, actx.statement().prc()) ;
	}
}
