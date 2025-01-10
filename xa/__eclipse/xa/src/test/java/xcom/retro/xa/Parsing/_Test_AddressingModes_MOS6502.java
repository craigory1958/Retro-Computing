

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
public class _Test_AddressingModes_MOS6502 {

	@Parameterized.Parameters()
	public static Collection<Object[]> data() {

		//@formatter:off

        final Object[][] results = {

                // { String mode,  String src, String[] expectedContexts }

                { "Imm", 		" ADC #zyz",    	"Statement, Instruction, Opcode, AddressingMode, Immediate, Expr, Term, Identifier" },
                { "Abs", 		" ADC zyz",     	"Statement, Instruction, Opcode, AddressingMode, Absolute, Expr, Term, Identifier" },
                { "ZP", 		" ADC zyz",     	"Statement, Instruction, Opcode, AddressingMode, Absolute, Expr, Term, Identifier" },
                { "Acc", 		" ASL A",       	"Statement, Instruction, Opcode, AddressingMode, Accumulator" },
                { "Imp", 		" BRK",         	"Statement, Instruction, Opcode, AddressingMode, Implied" },
                { "[Ind,X]", 	" ADC [zyz,X]",		"Statement, Instruction, Opcode, AddressingMode, ZpIndirectX, Expr, Term, Identifier" },
                { "[Ind],Y", 	" ADC [zyz],Y", 	"Statement, Instruction, Opcode, AddressingMode, ZpIndirectY, Expr, Term, Identifier" },
                { "ZP,X", 		" ADC zp,X",   		"Statement, Instruction, Opcode, AddressingMode, IndexedX, Expr, Term, Identifier" },
                { "Abs,X", 		" ADC zyz,X",   	"Statement, Instruction, Opcode, AddressingMode, IndexedX, Expr, Term, Identifier" },
                { "Abs,Y", 		" ADC zyz,Y",   	"Statement, Instruction, Opcode, AddressingMode, IndexedY, Expr, Term, Identifier" },
                { "Rel", 		" BCC zyz",     	"Statement, Instruction, OpcodeBranch, AddressingModeBranch, Relative, Expr, Term, Identifier" },
                { "ZP,Y", 		" LDX zyz,Y",   	"Statement, Instruction, Opcode, AddressingMode, IndexedY, Expr, Term, Identifier" },
           } ;

        //@formatter:on

		return (Arrays.asList(results)) ;
	}


	private static final Logger Logger = LoggerFactory.getLogger(_Test_AddressingModes_MOS6502.class) ;

	static ParsingScaffold parser ;

	String mode ;
	String src ;
	List<String> expectedContexts ;


	public _Test_AddressingModes_MOS6502(String mode, String src, String expectedContexts) {

		this.mode = mode ;
		this.src = src ;

		this.expectedContexts = new ArrayList<String>(Arrays.asList(expectedContexts.split(", "))) ;
	}


	@BeforeClass
	public static void setupBeforeClass() throws Exception {

		parser = new ParsingScaffold() ;
		parser.init("MOS6502") ;
	}


	@Test
	public void parseTest() throws IOException {

		List<String> actual = parser.parse("statement", src).processor().walked() ;
		
		Logger.info("{}", String.format("%-8s  %-12s  %s", mode, src, actual)) ;

		assertArrayEquals(expectedContexts.toArray(), actual.toArray()) ;
	}
}
