

package xcom.retro.xa.Parsing ;


import static org.junit.Assert.assertArrayEquals ;

import java.io.IOException ;
import java.util.ArrayList ;
import java.util.Arrays ;
import java.util.Collection ;
import java.util.List ;

import org.junit.BeforeClass ;
import org.junit.Test ;
import org.junit.runner.RunWith ;
import org.junit.runners.Parameterized ;
import org.slf4j.Logger ;
import org.slf4j.LoggerFactory ;

import xcom.retro.xa.ParsingScaffold ;


@RunWith(Parameterized.class)
public class _Test_DirectiveParsing {

	@Parameterized.Parameters()
	public static Collection<Object[]> data() {

		//@formatter:off

        final Object[][] results = {

                // { String src, String[] expectedContexts }

                { "    .byte abc",  	"Statement, Directive, Assembler, Directives, ArgumentList, Argument, Expr, Term, Identifier" },
                { "abc .byte abc",  	"Statement, Label, Directive, Assembler, Directives, ArgumentList, Argument, Expr, Term, Identifier" },
                { "abc .macro abc",  	"Statement, Label, Directive, Macro, OptionList, Option, Symbol" },
                { "abc .abc abc",  		"Statement, Label, Directive, Invocation, Symbol, ParameterList, Parameter, Argument, Expr, Term, Identifier" },
                { "abc .abc abc=def", 	"Statement, Label, Directive, Invocation, Symbol, ParameterList, Parameter, Symbol, Assignment, Argument, Expr, Term, Identifier" },
        } ;

        //@formatter:on

		return (Arrays.asList(results)) ;
	}


	private static final Logger Logger = LoggerFactory.getLogger(_Test_DirectiveParsing.class) ;

	String src ;
	List<String> expectedContexts ;

	static ParsingScaffold parser ;


	public _Test_DirectiveParsing(String src, String expectedContexts) {

		this.src = src ;

		this.expectedContexts = new ArrayList<String>(Arrays.asList(expectedContexts.split(", "))) ;
	}


	@BeforeClass
	public static void setupBeforeEachTest() throws Exception {
		
			parser = new ParsingScaffold() ;
			parser.init("MOS6502") ;
	}


	@Test
	public void assembleTest() throws IOException {

		List<String> actual = parser.parse("statement", src).processor().walked() ;
		
		Logger.info("{}",String.format("%-25s  %s", src, actual));

		assertArrayEquals(expectedContexts.toArray(), actual.toArray()) ;
	}
}
