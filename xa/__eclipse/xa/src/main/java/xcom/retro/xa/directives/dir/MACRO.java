

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
import xcom.retro.xa.Option ;
import xcom.retro.xa.Statement ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.expressions.value.StringLiteral ;
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
		options = optioms ;
		this.lines = lines ;

		sn = actx.sources().size() - 1 ;
		ln = actx.source().peek().ln() - 1 ;
	}


	@Log
	public void expand(final ParserRuleContext pctx) {

//		System.err.println(name) ;
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
		final Map<String, Object> parms = new HashMap<>() ;

		for ( int i = 0; (i < actx.statement().operands().size()) || (i < options.size()); i++ ) {

			final Operand option = (i < options.size() ? options.get(i) : null) ;
			final Operand operand = (i < actx.statement().operands().size() ? actx.statement().operands().get(i) : null) ;

			if ( ordinalMode && ((operand == null) || (operand.name() != null)) )
				ordinalMode = false ;

			if ( ordinalMode && (operand != null) && (operand.name() == null) )
				parms.put(option.name(), operand.assignment().eval(actx.symbols()).getValue()) ;

			if ( !ordinalMode && (option != null) && (option.assignment() != null) )
				parms.put(option.name(), option.assignment().eval(actx.symbols()).getValue()) ;

			if ( !ordinalMode && (operand != null) && (operand.name() != null) )
				parms.put(operand.name(), operand.assignment().eval(actx.symbols()).getValue()) ;
		}

//		parms.entrySet().stream().forEach(e -> { //
//			System.out.print("param>>> " + e.getKey() + ": " + e.getValue().getClass().getSimpleName()) ; //
//			if ( e.getValue() != null )
//				System.out.print(" - " + e.getValue().getClass().getSimpleName() + ": " + e.getValue()) ; //
//			System.out.println() ; //
//		}) ;


		final List<String> lines = new ArrayList<>() ;
		for ( final String line : this.lines )
			lines.add(Templator.delimiters(UnixDelimiters).template(line).inject(parms)) ;


		boolean list = (parms.containsKey("list") ? parms.get("list").equals(".list") : false) ;
		actx.list(list);

		actx.sources().add(new MacroSource(sn, ln, lines, list)) ;
		actx.source().push(actx.sources().get(actx.sources().size() - 1)) ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {

		final MACRO m = buildMacro(actx, pctx) ;
		actx.macros().put(m.name().toLowerCase(), m) ;

//		actx.statement().bytes(new byte[0]) ;
	}


	@Log
	public static MACRO buildMacro(final AssemblyContext actx, final ParserRuleContext pctx) {

		actx.statement().operands().add(new Option("list").assignment(new StringLiteral(".nolist", true))) ;

//		actx.statement().operands().forEach(o -> { //
//			System.err.print("opt>>> " + o.name() + ": " + o.getClass().getSimpleName()) ; //
//			if ( o.assignment() != null )
//				System.err.print(" - " + o.assignment().getClass().getSimpleName() + ": " + o.assignment()) ; //
//			System.err.println() ; //
//		}) ;

		final Statement _statement = actx.statement() ;

		final String name = pctx.getChild(0).getChild(1).getText() ;

		final List<String> lines = new ArrayList<>() ;
		try {
//			lines.add("${list}") ;

			String line ;
			while ( !StringUtils.trimToEmpty(line = actx.source().peek().next()).equalsIgnoreCase('.' + ENDMACRO.class.getSimpleName()) ) {
				lines.add(line) ;
				actx.statements().add(
						new Statement(actx.source().peek().sn(), actx.source().peek().ln(), line, actx.segment().lc(), actx.list(), actx.assembleEnable())) ;
				actx.statement(actx.statements().get(actx.statements().size() - 1)) ;
			}

//			lines.add(".list") ;
			actx.statements()
					.add(new Statement(actx.source().peek().sn(), actx.source().peek().ln(), line, actx.segment().lc(), actx.list(), actx.assembleEnable())) ;
			actx.statement(actx.statements().get(actx.statements().size() - 1)) ;
		}
		catch ( final IOException e ) {}
//		System.out.println("macro body: " + lines) ;


		return new MACRO(actx, name, _statement.operands(), lines) ;
	}
}
