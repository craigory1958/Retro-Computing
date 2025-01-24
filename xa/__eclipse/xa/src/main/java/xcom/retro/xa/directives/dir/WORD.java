

package xcom.retro.xa.directives.dir ;


import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.Symbol ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.expressions.ExpressionUtils ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


@aDirective
public class WORD implements iDirective {

	AssemblyContext actx ;


	public WORD(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {

		if ( !pctx.getParent().getChild(0).getChild(0).getText().isEmpty() ) {
			actx.symbol(new Symbol(pctx.getParent().getChild(0).getChild(0).getText(), actx.statement().lc())) ;
			actx.symbols().put(pctx.getParent().getChild(0).getChild(0).getText(), actx.symbol()) ;
		}

		final byte[] bytes = new byte[actx.statement().operands().size() * 2] ;
		actx.statement().bytes(bytes) ;
		actx.segment().allocateBytes(actx.statement().bytes()) ;

		actx.statement().assemblyCallbackMethod("assemble") ;
		actx.statement().assemblyCallbackObject(this) ;
	}


	@Log
	public void assemble() {

		final byte[] bytes = actx.statement().bytes() ;

		for ( int b = 0; b < bytes.length; b = b + 2 ) {
			bytes[b] = ExpressionUtils.lsb(actx.statement().operands().get(0).assignment().eval(actx.symbols()).getValue()) ;
			bytes[b + 1] = ExpressionUtils.msb(actx.statement().operands().get(0).assignment().eval(actx.symbols()).getValue()) ;
		}
		
		actx.statement().bytes(bytes) ;
	}
}
