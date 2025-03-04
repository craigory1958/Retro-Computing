

package xcom.retro.xa.directives.dir ;


import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_formatAsHexLiterial ;
import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_formatQualifiedID ;
import static xcom.utils4j.format.Templator.UnixDelimiters ;

import java.io.IOException ;
import java.util.ArrayList ;
import java.util.HashMap ;
import java.util.Iterator ;
import java.util.List ;
import java.util.Map ;

import org.antlr.v4.runtime.ParserRuleContext ;
import org.apache.commons.lang3.StringUtils ;

import xcom.retro.xa.BlockSource ;
import xcom.retro.xa.Operand ;
import xcom.retro.xa.Option ;
import xcom.retro.xa.Statement ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.expressions.value.StringLiteral ;
import xcom.utils4j.data.structured.list.Lists ;
import xcom.utils4j.format.Templator ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


@aDirective
public class MACRO implements iDirective {

	//@formatter:off

	AssemblyContext actx ;

	String as ;

	String name ;
	public String name() { return name ; }

	Map<String,Operand> options ;
	public Map<String,Operand> options() { return options ; }

	List<String> lines ;

	int sourceID ;

	int sourceLN ;

	//@formatter:on


	public MACRO(final AssemblyContext actx) {
		this.actx = actx ;
	}


	public MACRO(final AssemblyContext actx, final String name, final Map<String, Operand> optioms, final List<String> lines) {

		this.actx = actx ;
		this.name = name ;
		options = optioms ;
		this.lines = lines ;

		sourceID = actx.sources().size() - 1 ;
		sourceLN = actx.source().peek().sourceLN() - 1 ;
		as = actx.source().peek().as() ;
	}


	@Log
	public void expand(final ParserRuleContext pctx) {

//		actx.statement().operands().values().forEach(new Consumer<Operand>() {
//			@Override
//			public void accept(final Operand o) { //
//				System.err.print("operand (before) >>> " + o.moniker() + ": " + o.getClass().getSimpleName()) ; //
//				if ( o.assignment() != null )
//					System.err.print(" - " + o.assignment().getClass().getSimpleName() + ": " + o.assignment()) ; //
//				System.err.println() ; //
//			}
//		}) ;

//		options.values().forEach(new Consumer<Operand>() {
//			@Override
//			public void accept(final Operand o) { //
//				System.err.print("option (before) >>> " + o.moniker() + ": " + o.getClass().getSimpleName()) ; //
//				if ( o.assignment() != null )
//					System.err.print(" - " + o.assignment().getClass().getSimpleName() + ": " + o.assignment()) ; //
//				System.err.println() ; //
//			}
//		}) ;

		final Iterator<Operand> _operands = actx.statement().operands().values().iterator() ;
		final Iterator<Operand> _options = options.values().iterator() ;
		final Map<String, Object> parms = new HashMap<>() ;
		boolean ordinalMode = true ;

		for ( /* no loop var */ ; _operands.hasNext() || _options.hasNext(); /* no increment */ ) {

			final Operand operand = (_operands.hasNext() ? _operands.next() : null) ;
			final Operand option = (_options.hasNext() ? _options.next() : null) ;

			if ( ordinalMode && ((operand == null) || !operand.moniker().startsWith("{generated}.")) )
				ordinalMode = false ;

			if ( ordinalMode && (operand != null) && operand.moniker().startsWith("{generated}.") )
				parms.put(option.moniker(), EXPR_formatAsHexLiterial(operand.assignment().eval(actx.identifiers()).getValue())) ;

			if ( !ordinalMode && (option != null) && (option.assignment() != null) )
				parms.put(option.moniker(), EXPR_formatAsHexLiterial(option.assignment().eval(actx.identifiers()).getValue())) ;

			if ( !ordinalMode && (operand != null) && !operand.moniker().startsWith("{generated}.") )
				parms.put(operand.moniker(), EXPR_formatAsHexLiterial(operand.assignment().eval(actx.identifiers()).getValue())) ;
		}

//		System.err.println(parms) ;

		final List<String> lines = new ArrayList<>() ;
		for ( final String line : this.lines )
			lines.add(Templator.delimiters(UnixDelimiters).template(line).inject(parms)) ;


//		System.err.println("list: " + parms.get("list")) ;

		final boolean list = (parms.containsKey("list") ? parms.get("list").equals(".list") : false) ;
		actx.list(list) ;

		actx.sources().add(new BlockSource(sourceID, sourceLN, lines, list, as)) ;
		actx.source().push(Lists.last(actx.sources())) ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {

		final MACRO macro = buildMacro(actx, pctx) ;
		actx.macros().put(macro.name().toLowerCase(), macro) ;
	}


	@Log
	public static MACRO buildMacro(final AssemblyContext actx, final ParserRuleContext pctx) {

		final String text = "." + pctx.getChild(0).getChild(1).getText() ;
		final Map<String, Operand> _operands = actx.statement().operands() ;

		_operands.put("list", new Option("list").assignment(new StringLiteral(".nolist"))) ;
//		final Statement _statement = actx.statement() ;
		final String name = EXPR_formatQualifiedID(text, actx.source().peek().as()) ;
//		System.err.println("name: " + name) ;

		final List<String> lines = new ArrayList<>() ;
		try {
			String line ;
			while ( !StringUtils.trimToEmpty(line = actx.source().peek().next()).equalsIgnoreCase('.' + ENDMACRO.class.getSimpleName()) ) {
				lines.add(line) ;
				actx.statements().add(new Statement(actx.source().peek().sourceID(), actx.source().peek().sourceLN(), line, actx.segment().loc(), actx.list(),
						actx.assembleEnable())) ;
				actx.statement(Lists.last(actx.statements())) ;
			}

			actx.statements().add(new Statement(actx.source().peek().sourceID(), actx.source().peek().sourceLN(), line, actx.segment().loc(), actx.list(),
					actx.assembleEnable())) ;
			actx.statement(Lists.last(actx.statements())) ;
		}
		catch ( final IOException e ) {}


		return new MACRO(actx, name, _operands, lines) ;
	}
}
