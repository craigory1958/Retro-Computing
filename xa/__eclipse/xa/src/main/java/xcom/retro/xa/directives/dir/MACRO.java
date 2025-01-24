

package xcom.retro.xa.directives.dir ;


import static xcom.utils4j.format.Templator.UnixDelimiters ;

import java.io.IOException ;
import java.util.ArrayList ;
import java.util.HashMap ;
import java.util.List ;
import java.util.Map ;

import org.antlr.v4.runtime.ParserRuleContext ;
import org.apache.commons.lang3.StringUtils ;

import xcom.retro.xa.MacroSource ;
import xcom.retro.xa.Operand ;
import xcom.retro.xa.Statement ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.utils4j.format.Templator ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


@aDirective
public class MACRO implements iDirective {

	//@formatter:off

	AssemblyContext actx ;

	String name ;
	public String name() { return name ; }

	List<Operand> options ;
	public List<Operand> options() { return options ; }

	List<String> lines ;
	int sn ;
	int ln ;

	//@formatter:on


	public MACRO(final AssemblyContext actx) {
		this.actx = actx ;
	}


	public MACRO(final AssemblyContext actx, final String name, final List<Operand> optioms, final List<String> lines) {

		this.actx = actx ;
		this.name = name ;
		this.options = optioms ;
		this.lines = lines ;

		sn = actx.sources().size() - 1 ;
		ln = actx.source().peek().ln() - 1 ;
	}


	@Log
	public void expand(final ParserRuleContext pctx) {

//		System.out.println(name) ;
//
//		options.forEach(o -> { //
//			System.out.print("option>>> " + o.name() + ": " + o.getClass().getSimpleName()) ; //
//			if ( o.assignment() != null )
//				System.out.print(" - " + o.assignment().getClass().getSimpleName() + ": " + o.assignment()) ; //
//			System.out.println() ; //
//		}) ;
//
//		actx.statement().operands().forEach(o -> { //
//			System.out.print("operand>>> " + o.name() + ": " + o.getClass().getSimpleName()) ; //
//			if ( o.assignment() != null )
//				System.out.print(" - " + o.assignment().getClass().getSimpleName() + ": " + o.assignment()) ; //
//			System.out.println() ; //
//		}) ;


		boolean ordinalMode = true ;
		final Map<String, Object> _namedParms = new HashMap<>() ;
		final Map<String, Object> _parms = new HashMap<>() ;

		for ( int optIdx = 0; optIdx < actx.statement().operands().size(); optIdx++ ) {
			Operand param = actx.statement().operands().get(optIdx) ;

			if ( param.name() == null && ordinalMode )
				_parms.put(options.get(optIdx).name(), param.assignment().eval(actx.symbols()).getValueAsInteger()) ;

			else if ( param.name() != null ) {
				ordinalMode = false ;
				_namedParms.put(param.name(), param.assignment().eval(actx.symbols()).getValueAsInteger()) ;
			}
		}


//		_namedParms.entrySet().stream().forEach(e -> { //
//			System.out.print("named>>> " + e.getKey() + ": " + e.getValue().getClass().getSimpleName()) ; //
//			if ( e.getValue() != null )
//				System.out.print(" - " + e.getValue().getClass().getSimpleName() + ": " + e.getValue()) ; //
//			System.out.println() ; //
//		}) ;


		_namedParms.entrySet().stream().forEach(e -> _parms.put(e.getKey(), e.getValue())) ;

//		_parms.entrySet().stream().forEach(e -> { //
//			System.out.print("param>>> " + e.getKey() + ": " + e.getValue().getClass().getSimpleName()) ; //
//			if ( e.getValue() != null )
//				System.out.print(" - " + e.getValue().getClass().getSimpleName() + ": " + e.getValue()) ; //
//			System.out.println() ; //
//		}) ;


//		final Map<String, Object> _parms = new HashMap<>() ;
//		int i = 0 ;
//
//		for ( final String parm : optioms )
//			_parms.put(parm, actx.statement().operands().get(i++).assignment().eval(actx.symbols()).getValueAsInteger()) ;


		final List<String> _lines = new ArrayList<>() ;
		for ( final String _line : lines )
			_lines.add(Templator.delimiters(UnixDelimiters).template(_line).inject(_parms)) ;


		actx.sources().add(new MacroSource(sn, ln, _lines)) ;
		actx.source().push(actx.sources().get(actx.sources().size() - 1)) ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {

		final MACRO m = buildMacro(actx, pctx) ;
		actx.macros().put(m.name().toLowerCase(), m) ;

		actx.statement().bytes(new byte[0]) ;
	}


	@Log
	public static MACRO buildMacro(final AssemblyContext actx, final ParserRuleContext pctx) {

//		actx.statement().operands().forEach(o -> { //
//			System.out.print("opt>>> " + o.name() + ": " + o.getClass().getSimpleName()) ; //
//			if ( o.assignment() != null )
//				System.out.print(" - " + o.assignment().getClass().getSimpleName() + ": " + o.assignment()) ; //
//			System.out.println() ; //
//		}) ;

		Statement _statement = actx.statement() ;

		final String name = pctx.parent.getChild(0).getText() ;

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
//		System.out.println("macro body: " + lines) ;


		return new MACRO(actx, name, _statement.operands(), lines) ;
	}
}
