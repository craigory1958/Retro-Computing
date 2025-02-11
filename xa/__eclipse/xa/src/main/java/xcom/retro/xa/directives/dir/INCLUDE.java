

package xcom.retro.xa.directives.dir ;


import java.io.FileNotFoundException ;

import org.antlr.v4.runtime.ParserRuleContext ;
import org.apache.commons.io.FilenameUtils ;

import xcom.retro.xa.FileSource ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
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

		try {
			final String fSpec =
					FilenameUtils.getFullPath(actx.cmdArgs().get("source")) + actx.statement().operands().get(0).assignment().eval(actx.symbols()).getValue() ;

			boolean list = (actx.statement().operands().size() == 2 //
					? actx.statement().operands().get(1).assignment().eval(actx.symbols()).getValue().equals(".list") //
					: false) ;
			actx.list(list) ;
			
			actx.sources().add(new FileSource(actx.sources().size(), fSpec, list)) ;
			actx.source().push(actx.sources().get(actx.sources().size() - 1)) ;
		}
		catch ( final FileNotFoundException e ) {}
	}
}
