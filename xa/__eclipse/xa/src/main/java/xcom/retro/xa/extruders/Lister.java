

package xcom.retro.xa.extruders ;


import java.io.PrintWriter ;
import java.math.BigInteger ;

import org.apache.commons.lang3.StringUtils ;

import xcom.retro.xa.Statement ;
import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.api.annotations.aExtruder ;
import xcom.retro.xa.api.interfaces.iExtruder ;


@aExtruder(format = "Lister")
public class Lister implements iExtruder {

	@Override
	public void extrude(PrintWriter out, final AssemblyContext actx) {

		for ( final Statement _statement : actx.statements() )

			if ( _statement.list() ) {

				out.print("   A B C D E F G H I J K L M O N P Q R S T U V W X Y ZAAABACADAEAFAGAHAIAJAKALAMANAOAPAQARASATAUAVAWAXAYAZ"
						.substring(_statement.sn() * 2, _statement.sn() * 2 + 2)) ;
				out.print(String.format("%4d:", _statement.ln())) ;


				out.print( //
						(_statement.line().isEmpty() || (_statement.bytes() == null) || (_statement.bytes().length == 0)) //
								&& (_statement.label() == null || StringUtils.trimToEmpty(_statement.label().name()).isEmpty()) //
								|| (_statement.pctx() != null && _statement.pctx().getChild(1) != null //
										&& _statement.pctx().getChild(1).getChild(0) != null //
										&& _statement.pctx().getChild(1).getChild(0).getClass().getSimpleName().equals("MacroContext")) //
								|| (_statement.pctx() != null && _statement.pctx().getChild(1) != null //
										&& _statement.pctx().getChild(1).getChild(0) != null //
										&& _statement.pctx().getChild(1).getChild(0).getChild(1) != null //
										&& _statement.pctx().getChild(1).getChild(0).getChild(1).getText().equalsIgnoreCase("EQU") //
										&& (_statement.label() != null))  //
												? (_statement.pctx() != null && _statement.pctx().getChild(1) != null //
														&& _statement.pctx().getChild(1).getChild(0) != null //
														&& _statement.pctx().getChild(1).getChild(0).getChild(1) != null //
														&& _statement.pctx().getChild(1).getChild(0).getChild(1).getText().equalsIgnoreCase("EQU") //
														&& (_statement.label() != null)  //
																? String.format(" (%04X)",
																		new BigInteger(actx.symbols().get(_statement.label().name()).value()).intValue()) //
																: "       ")
												: String.format("  %04X ", _statement.lc()) //
				) ;


				for ( int b = 0; b < 4; b++ )
					if ( (_statement.bytes() != null) && (b < _statement.bytes().length) )
						out.print(String.format("%02X ", _statement.bytes()[b])) ;
					else
						out.print("   ") ;

				out.println(String.format(" %s", _statement.line())) ;

				if ( (_statement.bytes() != null) && (_statement.bytes().length > 4) ) {
					for ( int b = 4; b < _statement.bytes().length; b++ ) {

						if ( ((b % 4) == 0) && (b > 4) )
							out.println() ;

						if ( (b % 4) == 0 )
							out.print(String.format("         %04X", _statement.lc() + b)) ;

						out.print(String.format(" %02X", _statement.bytes()[b])) ;
					}

					out.println() ;
				}
			}
	}
}
