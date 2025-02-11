

package xcom.retro.xa.directives ;


import org.antlr.v4.runtime.ParserRuleContext ;
import org.fest.reflect.core.Reflection ;
import org.fest.reflect.exception.ReflectionError ;

import xcom.retro.xa.XA.AssemblyContext ;
import xcom.retro.xa.antlr.DirectivesBaseListener ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;
import xcom.utils4j.logging.aspects.api.annotations.NoLog ;


public class DirectiveListener extends DirectivesBaseListener {

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


	@NoLog
	public void invokeMethodFromContext(final String prefix, final ParserRuleContext pctx) {

		try {
			String method = pctx.getClass().getSimpleName() ;
//			System.out.println(method) ;
			method = prefix + method.substring(0, method.length() - 7) ;
			Reflection.method(method).withParameterTypes(ParserRuleContext.class).in(this).invoke(pctx) ;
		}
		catch ( final ReflectionError ex ) {}
	}


	@Log
	public void exitDirective(final ParserRuleContext pctx) {

		try {
			 String phase = actx.phase().name().toLowerCase() ;

//			for ( int x = 0; (x < pctx.getChildCount()); x++ ) {
//				System.out.println("_" + pctx.getChild(x).getClass().getSimpleName()) ;
//			}

//			System.out.println("directives: " + actx.directives().keySet()) ;
//			System.out.println("macros: " + actx.macros().keySet()) ;
			
//			System.out.println("r: " + pctx.getClass().getSimpleName()) ;
//			System.out.println("r: " + pctx.getChildCount()) ;
//			System.out.println("r.1: " + pctx.getChild(0).getClass().getSimpleName()) ;
//			System.out.println("r.1: " + pctx.getChild(0).getChildCount()) ;
//			System.out.println("r.1.1: " + pctx.getChild(0).getChild(0).getClass().getSimpleName()) ;
//			System.out.println("r.1.1: " + pctx.getChild(0).getChild(0).getChildCount()) ;
//			System.out.println("r.1.2: " + pctx.getChild(0).getChild(1).getClass().getSimpleName()) ;
//			System.out.println("r.1.2: " + pctx.getChild(0).getChild(1).getChildCount()) ;
//			System.out.println("r.1.2.1: " + pctx.getChild(0).getChild(1).getChild(0).getClass().getSimpleName()) ;
//			System.out.println("r.1.2.1: " + pctx.getChild(0).getChild(1).getChild(0).getChildCount()) ;
//			System.out.println("r.1.2.1: " + pctx.getChild(0).getChild(1).getChild(0).getText()) ;
//			System.out.println("r.1.3: " + pctx.getChild(0).getChild(2).getClass().getSimpleName()) ;
//			System.out.println("r.1.3: " + pctx.getChild(0).getChild(2).getChildCount()) ;

			String name = null ;
			iDirective worker = null;
			switch ( pctx.getChild(0).getClass().getSimpleName() ) {
				
				case "AssemblerContext":
					name = pctx.getChild(0).getChild(1).getText().toUpperCase() ;
					worker = actx.directives().get(name) ;
					break ;
					
				case "InvocationContext":
					name = pctx.getChild(0).getChild(1).getText() ;
					worker = actx.macros().get(name) ;
					phase = "expand" ;
					break ;
					
				case "MacroContext":
					name = "MACRO" ;
					worker = actx.directives().get(name) ;
					break ;
			}

//			System.out.println("exit directive: " + name + " @" + phase) ;
//			System.out.println("worker: " + worker) ;
//			System.out.println("macros: " + actx.macros().keySet()) ;

//			if ( directive == null )
//				directive = actx.macros().get(name) ;

//			System.out.println("worker: " + worker) ;


			Reflection.method(phase).withParameterTypes(ParserRuleContext.class).in(worker).invoke(pctx) ;

//			System.out.println(actx.getStatement()) ;
//			System.out.println(actx.getDirectives().keySet()) ;
//			System.out.println("macros_: " + actx.macros().keySet()) ;
//			System.out.println("macros_: "+ actx.getMacros().size()) ;
		}
		catch ( final ReflectionError ex ) {
//			catch ( final Throwable ex ) {
			ex.printStackTrace() ;
		}
	}
}
