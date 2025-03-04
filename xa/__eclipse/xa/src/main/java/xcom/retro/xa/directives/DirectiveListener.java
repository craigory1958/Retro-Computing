

package xcom.retro.xa.directives ;


import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_parsedContextName ;
import static xcom.retro.xa.expressions.ExpressionUtils.EXPR_parsedText ;

import org.antlr.v4.runtime.ParserRuleContext ;
import org.fest.reflect.core.Reflection ;
import org.fest.reflect.exception.ReflectionError ;
import org.slf4j.Logger ;
import org.slf4j.LoggerFactory ;

import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.antlr.AssemblyBaseListener ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;


public class DirectiveListener extends AssemblyBaseListener {

	private static final Logger Logger = LoggerFactory.getLogger(DirectiveListener.class) ;


	AssemblyContext actx ;


	public DirectiveListener(final AssemblyContext actx) {
		this.actx = actx ;
	}


	@Override
	public void enterEveryRule(final ParserRuleContext pctx) {
		invokeMethodFromContext("enter", pctx) ;
	}

	@Override
	public void exitEveryRule(final ParserRuleContext pctx) {
		invokeMethodFromContext("exit", pctx) ;
	}


	public void invokeMethodFromContext(final String prefix, final ParserRuleContext pctx) {

		final String _methodContext = EXPR_parsedContextName(pctx) ;

		try {
			final String method = prefix + _methodContext ;
			Logger.debug("invoke: {}", method) ;
			Reflection //
					.method(method) //
					.withParameterTypes(ParserRuleContext.class) //
					.in(this) //
					.invoke(pctx) ;
		}
		catch ( final ReflectionError ex ) {}
	}


	@Log
	public void exitDirective(final ParserRuleContext pctx) {

		try {
			System.err.println("directives: " + actx.directives().keySet()) ;
			System.err.println("macros (before): " + actx.macros().keySet()) ;
			System.err.println("structs (before): " + actx.structs().keySet()) ;

			final String _directiveContext = EXPR_parsedContextName(pctx.getChild(0)) ;
			System.err.println("context: " + _directiveContext) ;

			String phase = actx.phase().name().toLowerCase() ;


			String directive = null ;
			iDirective worker = null ;
			switch ( _directiveContext ) {

				case "Assembler":
					directive = EXPR_parsedText(pctx.getChild(0).getChild(1)).toUpperCase().toUpperCase() ;
					worker = actx.directives().get(directive) ;
					break ;

				case "Invocation":
					directive = EXPR_parsedText(pctx.getChild(0).getChild(0)).toUpperCase().toLowerCase() ;

					worker = ((worker == null) && actx.macros().containsKey(directive) ? actx.macros().get(directive) : worker) ;
					worker = ((worker == null) && actx.structs().containsKey(directive) ? actx.structs().get(directive) : worker) ;

					phase = "expand" ;
					break ;

				case "Macro":
					directive = "MACRO" ;
					worker = actx.directives().get(directive) ;
					break ;

				case "Struct":
					directive = "STRUCT" ;
					worker = actx.directives().get(directive) ;
					break ;
			}

			System.err.println("exit directive: " + directive + " @" + phase) ;
			System.err.println("worker: " + worker) ;

			Reflection.method(phase).withParameterTypes(ParserRuleContext.class).in(worker).invoke(pctx) ;
			System.err.println("macros (after): " + actx.macros().keySet()) ;
			System.err.println("structs (after): " + actx.structs().keySet()) ;
		}
		catch ( final ReflectionError ex ) {
			ex.printStackTrace() ;
		}
	}
}
