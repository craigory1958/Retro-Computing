

package xcom.retro.xa.directives.dir ;


import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.Identifier ;
import xcom.retro.xa.Operand ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.expressions.value._ValueNode ;
import xcom.utils4j.data.structured.map.Maps ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


@aDirective
public class EQU implements iDirective {

	AssemblyContext actx ;


	public EQU(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Log
	@Override
	public void parse(final ParserRuleContext pctx) {

		final String id = pctx.getParent().getChild(0).getChild(0).getText() ;


		final Operand operand1 = Maps.firstEntryValue(actx.statement().operands()) ;
		final _ValueNode value = operand1.assignment().eval(actx.identifiers()) ;

		if ( !actx.identifiers().containsKey(id) )
			actx.identifiers().put(id, new Identifier(id)) ;

		actx.identifier(actx.identifiers().get(id)) ;
		actx.identifier().value(value.value()) ;
		actx.identifier().origin(actx.identifier().new Reference(actx.ln(), actx.source().peek().sourceID(), actx.source().peek().sourceLN())) ;

//		System.err.println(actx.identifier().scopedMoniker() + ": "
//				+ ExpressionUtils.formatAsHexLiterial(ExpressionUtils.asInteger(actx.identifiers().get(actx.identifier().scopedMoniker()).value()))) ;
	}
}
