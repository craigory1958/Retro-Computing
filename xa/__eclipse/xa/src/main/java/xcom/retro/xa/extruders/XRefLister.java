

package xcom.retro.xa.extruders ;


import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_asInteger ;
import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_formatAsHexLiterial ;

import java.io.PrintWriter ;

import xcom.retro.xa.Identifier ;
import xcom.retro.xa.Identifier.Reference ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aExtruder ;
import xcom.retro.xa.api.interfaces.iExtruder ;
import xcom.utils4j.data.structured.map.Maps ;


@aExtruder(format = "Lister")
public class XRefLister implements iExtruder {

	@Override
	public void extrude(final PrintWriter out, final AssemblyContext actx) {

//		System.err.println(actx.identifiers().keySet()) ;

		for ( final Identifier identifier : Maps.sortByKey(actx.identifiers()).values() )
			if ( identifier.value() != null ) {

				out.print(String.format("  %-40s", identifier.scopedMoniker())) ;

				out.print(String.format("  %8s", EXPR_formatAsHexLiterial(EXPR_asInteger(identifier.value())))) ;

				out.print(String.format("  %-15s", formatReference(identifier.origin()))) ;

				for ( final Reference ref : identifier.references() )
					out.print(String.format("  %-15s", formatReference(ref))) ;

				out.println() ;
			}
	}

	private String formatReference(final Reference ref) {

		String _ref = String.format("%d", ref.ln()) ;

		if ( ref.sourceID() > 0 )
			_ref += " (" + "   A B C D E F G H I J K L M O N P Q R S T U V W X Y ZAAABACADAEAFAGAHAIAJAKALAMANAOAPAQARASATAUAVAWAXAYAZ"
					.substring(ref.sourceID() * 2, (ref.sourceID() * 2) + 2).strip() + "." + ref.sourceLN() + ")" ;

		return _ref ;
	}
}
