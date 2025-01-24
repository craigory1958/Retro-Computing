

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
import xcom.retro.xa.Operand ;
import xcom.retro.xa.Statement ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.expressions.value.Identifier ;


public class DirectiveUtils_v1 {

	public static void parseDirective(final AssemblyContext actx) {

		final ParseTreeListener listener = new DirectiveListener(actx) ;
		final ParseTreeWalker walker = new ParseTreeWalker() ;

		walker.walk(listener, actx.statement().prc()) ;
	}


	public static Macro buildMacro(final AssemblyContext actx, final ParserRuleContext pctx) {

		final String name = pctx.getChild(0).getText() ;
		final List<String> parms = actx.statement().operands().stream().map(new Function<Operand, String>() {
			@Override
			public String apply(Operand a) {
				return ((Identifier) a.assignment()).getValueAsString() ;
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
//		System.out.println("lines: " + lines) ;


		return new Macro(actx, name, parms, lines) ;
	}
}
