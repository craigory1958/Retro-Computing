

package xcom.retro.xa.directives.dir ;


import java.io.FileNotFoundException ;
import java.nio.charset.StandardCharsets ;
import java.util.Map ;

import org.antlr.v4.runtime.ParserRuleContext ;
import org.apache.commons.io.FilenameUtils ;

import xcom.retro.xa.FileSource ;
import xcom.retro.xa.Operand ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.expressions.value._ValueNode ;
import xcom.utils4j.data.structured.list.Lists ;
import xcom.utils4j.data.structured.map.Maps ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


@aDirective
public class INCLUDE implements iDirective {

	AssemblyContext actx ;


	public INCLUDE(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {

//		actx.statement().operands().values().forEach(new Consumer<Operand>() {
//			@Override
//			public void accept(final Operand o) { //
//				System.err.print("operand (before) >>> " + o.moniker() + ": " + o.getClass().getSimpleName()) ; //
//				if ( o.assignment() != null )
//					System.err.print(" - " + o.assignment().getClass().getSimpleName() + ": " + o.assignment()) ; //
//				System.err.println() ; //
//			}
//		}) ;

		final Map<String, Operand> _operands = actx.statement().operands() ;
		final Operand _operand1 = Maps.firstEntryValue(_operands) ;
		final Operand _operandList = _operands.get("list") ;
//		System.err.println("_operandList: " + _operandList.assignment().eval(actx.identifiers()).getValue()) ;

		final String fSpec = FilenameUtils.getFullPath(actx.cmdArgs().get("source")) + _operand1.assignment().eval(actx.identifiers()).getValue() ;

		final boolean list = (_operandList != null ? _operandList.assignment().eval(actx.identifiers()).getValue().equals(".list") : false) ;
		actx.list(list) ;

		final Operand operandAs = _operands.get("as") ;
		final String as = (operandAs != null ? new String(((_ValueNode) operandAs.assignment()).value(), StandardCharsets.UTF_8) : null) ;
//		System.err.println("as: " + as) ;

		try {
			actx.sources().add(new FileSource(actx.sources().size(), fSpec, actx.list(), as)) ;
			actx.source().push(Lists.last(actx.sources())) ;

//			System.err.println("sourceID: " + actx.source().peek().sourceID()) ;
//			System.err.println("as: " + actx.source().peek().as()) ;
		}
		catch ( final FileNotFoundException e ) {}
	}
}
