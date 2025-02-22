

package xcom.retro.xa.directives.dir ;


import static xcom.utils4j.format.Templator.UnixDelimiters ;

import java.io.IOException ;
import java.util.ArrayList ;
import java.util.HashMap ;
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
import xcom.utils4j.Lists ;
import xcom.utils4j.format.Templator ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


@aDirective
public class STRUCT implements iDirective {

	//@formatter:off

	AssemblyContext actx ;

	String name ;
	public String name() { return name ; }

	List<Operand> options ;
	public List<Operand> options() { return options ; }

	List<String> lines ;

	int sourceID ;

	int sourceLN ;

	//@formatter:on


	public STRUCT(final AssemblyContext actx) {
		this.actx = actx ;
	}


	public STRUCT(final AssemblyContext actx, final String name, final List<Operand> optioms, final List<String> lines) {

		this.actx = actx ;
		this.name = name ;
		options = optioms ;
		this.lines = lines ;

		sourceID = actx.sources().size() - 1 ;
		sourceLN = actx.source().peek().sourceLN() - 1 ;
	}


	@Log
	public void expand(final ParserRuleContext pctx) {

		boolean ordinalMode = true ;
		final Map<String, Object> parms = new HashMap<>() ;

		for ( int i = 0; (i < actx.statement().operands().size()) || (i < options.size()); i++ ) {

			final Operand option = (i < options.size() ? options.get(i) : null) ;
			final Operand operand = (i < actx.statement().operands().size() ? actx.statement().operands().get(i) : null) ;

			if ( ordinalMode && ((operand == null) || (operand.name() != null)) )
				ordinalMode = false ;

			if ( ordinalMode && (operand != null) && (operand.name() == null) )
				parms.put(option.name(), operand.assignment().eval(actx.identifiers()).getValue()) ;

			if ( !ordinalMode && (option != null) && (option.assignment() != null) )
				parms.put(option.name(), option.assignment().eval(actx.identifiers()).getValue()) ;

			if ( !ordinalMode && (operand != null) && (operand.name() != null) )
				parms.put(operand.name(), operand.assignment().eval(actx.identifiers()).getValue()) ;
		}


		final List<String> lines = new ArrayList<>() ;
		for ( final String line : this.lines )
			lines.add(Templator.delimiters(UnixDelimiters).template(line).inject(parms)) ;


		final boolean list = (parms.containsKey("list") ? parms.get("list").equals(".list") : false) ;
//		list = true ;
		actx.list(list) ;

		actx.sources().add(new BlockSource(sourceID, sourceLN, lines, list)) ;
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

		actx.statement().operands().add(new Option("list").assignment(new StringLiteral(".nolist"))) ;
		final Statement _statement = actx.statement() ;
		final String name = pctx.getChild(0).getChild(1).getText() ;

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


		return new STRUCT(actx, name, _statement.operands(), lines) ;
	}
}
