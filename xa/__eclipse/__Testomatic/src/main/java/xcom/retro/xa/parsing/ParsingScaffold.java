

package xcom.retro.xa.parsing ;


import java.io.IOException ;
import java.util.ArrayList ;

import org.antlr.v4.runtime.CharStream ;
import org.antlr.v4.runtime.CharStreams ;
import org.antlr.v4.runtime.CommonTokenStream ;
import org.antlr.v4.runtime.Lexer ;
import org.antlr.v4.runtime.Parser ;
import org.antlr.v4.runtime.ParserRuleContext ;
import org.antlr.v4.runtime.TokenStream ;
import org.antlr.v4.runtime.tree.ParseTreeWalker ;
import org.fest.reflect.core.Reflection ;

import xcom.utils4j.logging.aspects.api.annotations.Log ;


public class ParsingScaffold {

	Lexer lexer ;
	Parser parser ;
	ParsingListener processor ;
	ParseTreeWalker walker ;


	@Log
	ParsingScaffold init(String processorName) throws Exception {

		final String lexerClassname = "xcom.retro.xa.antlr.processors._" + processorName + "." + processorName + "_Lexer" ;
		final Class<? extends Lexer> lexerClass = Reflection.type(lexerClassname).loadAs(Lexer.class) ;
		lexer = Reflection.constructor().withParameterTypes(CharStream.class).in(lexerClass).newInstance(CharStreams.fromString("")) ;

		final String parserClassname = "xcom.retro.xa.antlr.processors._" + processorName + "." + processorName + "_Parser" ;
		final Class<? extends Parser> parserClass = Reflection.type(parserClassname).loadAs(Parser.class) ;
		parser = Reflection.constructor().withParameterTypes(TokenStream.class).in(parserClass).newInstance(new CommonTokenStream(lexer)) ;

		processor = new ParsingListener() ;
		walker = new ParseTreeWalker() ;

		return this ;
	}


	@Log
	ParsingScaffold parse(String statement) throws IOException {

		processor.walked = new ArrayList<>() ;

		lexer.setInputStream(CharStreams.fromString(statement)) ;
		parser.setTokenStream(new CommonTokenStream(lexer)) ;

		ParserRuleContext prc = Reflection.method("statement").withReturnType(ParserRuleContext.class).in(parser).invoke() ;
		walker.walk(processor, prc) ;

		return this ;
	}


	@Log
	public static void main(String[] args) throws IOException, Exception {

		ParsingScaffold $ = new ParsingScaffold() ;
		$.init("MOS6502") ;

		String statement ;

		System.out.println((statement = " NOP ") + " - " + $.parse(statement).processor.walked) ;
		System.out.println((statement = "ABC LDA #0") + " - " + $.parse(statement).processor.walked) ;
	}
}
