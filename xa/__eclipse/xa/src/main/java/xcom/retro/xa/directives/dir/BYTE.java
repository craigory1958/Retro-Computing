

package xcom.retro.xa.directives.dir ;


import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.Symbol ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.expressions.ExpressionUtils ;
import xcom.retro.xa.expressions.value.StringLiteral ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


@aDirective
public class BYTE implements iDirective {

	AssemblyContext actx ;


	public BYTE(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {

		if ( !pctx.getParent().getChild(0).getChild(0).getText().isEmpty() ) {
			actx.symbol(new Symbol(pctx.getParent().getChild(0).getChild(0).getText(), actx.statement().lc())) ;
			actx.symbols().put(pctx.getParent().getChild(0).getChild(0).getText(), actx.symbol()) ;
		}

		int size = 0 ;
		for ( int a = 0; a < actx.statement().arguments().size(); a++ )
			size = size + (actx.statement().arguments().get(a).expr() instanceof StringLiteral
					? ((StringLiteral) actx.statement().arguments().get(a).expr()).getValue().length
					: 1) ;

		final byte[] bytes = new byte[size] ;
		actx.statement().bytes(bytes) ;
		actx.segment().allocateBytes(actx.statement().bytes()) ;

		actx.statement().assembleCallbackMethod("assemble") ;
		actx.statement().assembleCallbackObject(this) ;
	}


	@Log
	public void assemble() {

		final byte[] bytes = actx.statement().bytes() ;

		int b = 0 ;
		for ( int a = 0; a < actx.statement().arguments().size(); a++ ) {
			byte[] value = actx.statement().arguments().get(a).expr().eval(actx.symbols()).getValue() ;

			if ( actx.statement().arguments().get(a).expr() instanceof StringLiteral )
				for ( byte _byte : value )
					bytes[b++] = _byte ;
			else
				bytes[b++] = ExpressionUtils.lsb(value) ;
		}

		actx.statement().bytes(bytes) ;
	}
}
