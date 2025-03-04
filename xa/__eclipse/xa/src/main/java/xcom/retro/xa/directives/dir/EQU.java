

package xcom.retro.xa.directives.dir ;


import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_formatQualifiedID ;
import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_parsedText ;

import java.util.Map ;

import org.antlr.v4.runtime.ParserRuleContext ;

import xcom.retro.xa.Identifier ;
import xcom.retro.xa.Operand ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.api.interfaces.iSource ;
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

		final Map<String, Operand> _operands = actx.statement().operands() ;
		final iSource _source = actx.source().peek() ;
		final String _identfier = EXPR_parsedText(pctx.getParent().getChild(0).getChild(0)) ;


		final Operand operand1 = Maps.firstEntryValue(_operands) ;
		final _ValueNode value = operand1.assignment().eval(actx.identifiers()) ;

//		final String id = pctx.getParent().getChild(0).getChild(0).getText() ;
		final String identifier = EXPR_formatQualifiedID(_identfier, _source.as()) ;
//		System.err.println("identifier: " + identifier + ", value: " + value) ;

		if ( !actx.identifiers().containsKey(identifier) )
			actx.identifiers().put(identifier, new Identifier(identifier)) ;

		actx.identifier(actx.identifiers().get(identifier)) ;
		actx.identifier().value(value.value()) ;
		actx.identifier().origin(actx.identifier().new Reference(actx.ln(), _source.sourceID(), _source.sourceLN())) ;

//		System.err.println(actx.identifier().scopedMoniker() + ": " + asInteger(actx.identifier().value())) ;
//		System.err.println(actx.identifiers().keySet()) ;
//		System.err.println(actx.identifier().scopedMoniker() + ": "
//				+ formatAsHexLiterial(asInteger(actx.identifiers().get(actx.identifier().scopedMoniker()).value()))) ;
	}
}
