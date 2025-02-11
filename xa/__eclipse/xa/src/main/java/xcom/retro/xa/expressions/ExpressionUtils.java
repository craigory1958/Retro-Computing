

package xcom.retro.xa.expressions ;


import java.nio.ByteBuffer ;

import org.antlr.v4.runtime.ParserRuleContext ;
import org.antlr.v4.runtime.tree.ParseTreeWalker ;

import xcom.retro.xa.XA.AssemblyContext ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


public class ExpressionUtils {

	@Log
	public static _ExprNode buildArgumentExpressionTree(final AssemblyContext actx, final ParserRuleContext pctx) {

		final ExpressionListener listener = new ExpressionListener(actx) ;
		final ParseTreeWalker walker = new ParseTreeWalker() ;
		walker.walk(listener, pctx) ;

		return listener.expr ;
	}


	public static Integer asInteger(final byte[] value) {
		return ByteBuffer.wrap(value).getInt() ;
	}


	public static byte[] asBytes(final int value) {
		return ByteBuffer.allocate(4).putInt(value).array() ;
	}


	public static String asString(final byte[] value) {
		return new String(value) ;
	}


	public static byte[] asBytes(final String value) {
		return value.getBytes() ;
	}


	public static byte lsb(final byte[] bytes) {
		return bytes[bytes.length - 1] ;
	}


	public static byte msb(final byte[] bytes) {
		return bytes[bytes.length - 2] ;
	}
}
