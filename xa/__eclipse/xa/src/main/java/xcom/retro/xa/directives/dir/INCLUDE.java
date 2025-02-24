

package xcom.retro.xa.directives.dir ;


import java.io.FileNotFoundException ;
import java.util.Map ;
import java.util.function.Consumer ;

import org.antlr.v4.runtime.ParserRuleContext ;
import org.apache.commons.io.FilenameUtils ;

import xcom.retro.xa.FileSource ;
import xcom.retro.xa.Operand ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
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

//		actx.statement().operands().put("list", new Option("list").assignment(new StringLiteral(".nolist"))) ;

		final Map<String, Operand> operands = actx.statement().operands() ;

		final Operand operand1 = Maps.firstEntryValue(operands) ;
		final String fSpec = FilenameUtils.getFullPath(actx.cmdArgs().get("source")) + operand1.assignment().eval(actx.identifiers()).getValue() ;

//		System.out.println(actx.statement().operands()) ;

		final Operand operandList = operands.get("list") ;
		final boolean list = (operandList != null ? operandList.assignment().eval(actx.identifiers()).getValue().equals(".list") : false) ;
		actx.list(list) ;

//		final Operand operandAs = operands.get("as") ;
//		String as = (operandList != null ? (String) ((_ValueNode) operandAs.assignment()).getValue() : null) ;
//		System.err.println("as: " + as) ;

		try {
			actx.sources().add(new FileSource(actx.sources().size(), fSpec, list)) ;
			actx.source().push(Lists.last(actx.sources())) ;
		}
		catch ( final FileNotFoundException e ) {}
	}
}
