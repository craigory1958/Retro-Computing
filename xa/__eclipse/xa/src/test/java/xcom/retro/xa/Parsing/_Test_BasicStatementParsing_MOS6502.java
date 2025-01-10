

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
public class _Test_BasicStatementParsing_MOS6502 {

	@Parameterized.Parameters()
	public static Collection<Object[]> data() {

		//@formatter:off

        final Object[][] results = {

                // { String src, String[] expectedContexts }

                { "     NOP",  		"Statement, Instruction, Opcode, AddressingMode, Implied" },
                { "     LDA #zyz",  "Statement, Instruction, Opcode, AddressingMode, Immediate, Expr, Term, Identifier" },
                { "zyz  LDA #zyz", 	"Statement, Label, Instruction, Opcode, AddressingMode, Immediate, Expr, Term, Identifier" },
                { "zyz  NOP",  		"Statement, Label, Instruction, Opcode, AddressingMode, Implied" },

                { "",  							"Statement" },
                { "; w/comment",  				"Statement" },
                { "     NOP ; w/comment",  		"Statement, Instruction, Opcode, AddressingMode, Implied" },
                { "     LDA #zyz ; w/comment",	"Statement, Instruction, Opcode, AddressingMode, Immediate, Expr, Term, Identifier" },
                { "zyz  LDA #zyz ; w/comment",  "Statement, Label, Instruction, Opcode, AddressingMode, Immediate, Expr, Term, Identifier" },
                { "zyz  NOP ; w/comment",  		"Statement, Label, Instruction, Opcode, AddressingMode, Implied" },
        } ;

        //@formatter:on

		return (Arrays.asList(results)) ;
	}


	private static final Logger Logger = LoggerFactory.getLogger(_Test_BasicStatementParsing_MOS6502.class) ;

	static ParsingScaffold parser ;

	String src ;
	List<String> expectedContexts ;


	public _Test_BasicStatementParsing_MOS6502(String src, String expectedContexts) {

		this.src = src ;

		this.expectedContexts = new ArrayList<String>(Arrays.asList(expectedContexts.split(", "))) ;
	}


	@BeforeClass
	public static void setupBeforeEachTest() throws Exception {
		
			parser = new ParsingScaffold() ;
			parser.init("MOS6502") ;
	}


	@Test
	public void parseTest() throws IOException {

		List<String> actual = parser.parse("statement", src).processor().walked() ;

		Logger.info("{}", String.format("%-25s  %s", src, actual)) ;

		assertArrayEquals(expectedContexts.toArray(), actual.toArray()) ;
	}
}
