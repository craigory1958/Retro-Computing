

package xcom.retro.xa.directives.dir ;


import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_parsedText ;
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
public class STRUCT implements iDirective {

	//@formatter:off

	AssemblyContext actx ;

	String as ;

	String name ;
	public String name() { return name ; }

	Map<String, Operand> options ;
	public Map<String, Operand> options() { return options ; }

	List<String> lines ;

	int sourceID ;

	int sourceLN ;

	//@formatter:on


	public STRUCT(final AssemblyContext actx) {
		this.actx = actx ;
	}


	public STRUCT(final AssemblyContext actx, final String name, final Map<String, Operand> optioms, final List<String> lines) {

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

		final Map<String, Operand> _operands = actx.statement().operands() ;

		boolean ordinalMode = true ;
		final Iterator<Operand> operands = _operands.values().iterator() ;
		final Iterator<Operand> options = this.options.values().iterator() ;
		final Map<String, Object> parms = new HashMap<>() ;

		for ( /* no loop var */ ; options.hasNext() || operands.hasNext(); /* no increment */ ) {

			final Operand option = (options.hasNext() ? options.next() : null) ;
			final Operand operand = (operands.hasNext() ? operands.next() : null) ;

			if ( ordinalMode && ((operand == null) || (operand.moniker() != null)) )
				ordinalMode = false ;

			if ( ordinalMode && (operand != null) && (operand.moniker() == null) )
				parms.put(option.moniker(), operand.assignment().eval(actx.identifiers()).getValue()) ;

			if ( !ordinalMode && (option != null) && (option.assignment() != null) )
				parms.put(option.moniker(), option.assignment().eval(actx.identifiers()).getValue()) ;

			if ( !ordinalMode && (operand != null) && (operand.moniker() != null) )
				parms.put(operand.moniker(), operand.assignment().eval(actx.identifiers()).getValue()) ;
		}


		final List<String> lines = new ArrayList<>() ;
		for ( final String line : this.lines )
			lines.add(Templator.delimiters(UnixDelimiters).template(line).inject(parms)) ;


		final boolean list = (parms.containsKey("list") ? parms.get("list").equals(".list") : false) ;
		actx.list(list) ;

		actx.sources().add(new BlockSource(sourceID, sourceLN, lines, list, as)) ;
		actx.source().push(Lists.last(actx.sources())) ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {

		final STRUCT struct = buildStruct(actx, pctx) ;
		actx.structs().put(struct.name().toLowerCase(), struct) ;
	}


	@Log
	public static STRUCT buildStruct(final AssemblyContext actx, final ParserRuleContext pctx) {

		final Map<String, Operand> _operands = actx.statement().operands() ;
//		final String name = pctx.getChild(0).getChild(1).getText() ;
		final String parsedName = '.' + EXPR_parsedText(pctx.getChild(0).getChild(1)) ;
//		final Statement _statement = actx.statement() ;

		_operands.put("list", new Option("list").assignment(new StringLiteral(".nolist"))) ;
		
		

		final List<String> lines = new ArrayList<>() ;
		try {
			String line ;
			while ( !StringUtils.trimToEmpty(line = actx.source().peek().next()).equalsIgnoreCase('.' + ENDSTRUCT.class.getSimpleName()) ) {
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


		return new STRUCT(actx, parsedName, _operands, lines) ;
	}
}
