

package xcom.retro.xa.directives.dir ;


import java.io.IOException ;
import java.util.ArrayList ;
import java.util.List ;
import java.util.function.Function ;
import java.util.stream.Collectors ;

import org.antlr.v4.runtime.ParserRuleContext ;
import org.apache.commons.lang3.StringUtils ;

import xcom.retro.xa.Argument ;
import xcom.retro.xa.Statement ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.directives.DirectiveUtils ;
import xcom.retro.xa.directives.Macro ;
import xcom.retro.xa.expressions.value.Identifier ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


@aDirective
public class MACRO implements iDirective {

	AssemblyContext actx ;


	public MACRO(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {

		final Macro m = buildMacro(actx, pctx) ;
		actx.macros().put(m.name().toLowerCase(), m) ;

		actx.statement().bytes(new byte[0]) ;
	}


	@Log
	public static Macro buildMacro(final AssemblyContext actx, final ParserRuleContext pctx) {

		
		System.out.println("buildMacro: " +pctx.getChild(0).getChild(0).getText()) ;
		final String name = pctx.getChild(0).getChild(0).getText() ;
		final List<String> parms = actx.statement().arguments().stream().map(new Function<Argument, String>() {
			@Override
			public String apply(Argument a) {
				return ((Identifier) a.expr()).getValueAsString() ;
			}
		}).collect(Collectors.toCollection(ArrayList::new)) ;

		final List<String> lines = new ArrayList<>() ;
		try {
			String line ;
			while ( !StringUtils.trimToEmpty(line = actx.source().peek().next()).equalsIgnoreCase(".endmacro") ) {
				lines.add(line) ;
				actx.statements().add(new Statement(actx.source().peek().sn(), actx.source().peek().ln(), line, actx.segment().lc(), actx.list())) ;
				actx.statement(actx.statements().get(actx.statements().size() - 1)) ;
			}
			actx.statements().add(new Statement(actx.source().peek().sn(), actx.source().peek().ln(), line, actx.segment().lc(), actx.list())) ;
			actx.statement(actx.statements().get(actx.statements().size() - 1)) ;
		}
		catch ( final IOException e ) {}
		System.out.println("macro body: " + lines) ;


		return new Macro(actx, name, parms, lines) ;
	}
}
