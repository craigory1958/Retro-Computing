

package xcom.retro.xa.directives ;


import static xcom.utils4j.format.Templator.UnixDelimiters ;

import java.util.ArrayList ;
import java.util.HashMap ;
import java.util.List ;
import java.util.Map ;

import org.antlr.v4.runtime.ParserRuleContext ;
import org.slf4j.event.Level ;

import xcom.retro.xa.MacroSource ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.utils4j.format.Templator ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;;


public class Macro implements iDirective {

	AssemblyContext actx ;

	String name ;

	public String name() {
		return name ;
	}

	List<String> parms ;
	List<String> lines ;
	int sn ;
	int ln ;


	@Log
	public Macro(final AssemblyContext actx, final String name, final List<String> parms, final List<String> lines) {

		this.actx = actx ;
		this.name = name ;
		this.parms = parms ;
		this.lines = lines ;

		sn = actx.sources().size() - 1 ;
		ln = actx.source().peek().ln() - 1 ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {

		final Map<String, Object> _parms = new HashMap<>() ;
		int i = 0 ;

		for ( final String parm : parms )
			_parms.put(parm, actx.statement().arguments().get(i++).expr().eval(actx.symbols()).getValueAsInteger()) ;


		final List<String> _lines = new ArrayList<>() ;
		for ( final String _line : lines )
			_lines.add(Templator.delimiters(UnixDelimiters).template(_line).inject(_parms)) ;


		actx.sources().add(new MacroSource(sn, ln, _lines)) ;
		actx.source().push(actx.sources().get(actx.sources().size() - 1)) ;
	}
}
