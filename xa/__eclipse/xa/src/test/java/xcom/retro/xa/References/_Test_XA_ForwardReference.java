

package xcom.retro.xa.References ;


import static org.junit.Assert.assertEquals ;

import java.io.File ;
import java.nio.charset.StandardCharsets ;
import java.util.Arrays ;
import java.util.Collection ;

import org.apache.commons.io.FileUtils ;
import org.apache.commons.io.FilenameUtils ;
import org.junit.Test ;
import org.junit.runner.RunWith ;
import org.junit.runners.Parameterized ;
import org.slf4j.Logger ;
import org.slf4j.LoggerFactory ;

import xcom.retro.xa.XA ;
import xcom.retro.xa.Directives._Test_XA_OrgDirective ;


@RunWith(Parameterized.class)
public class _Test_XA_ForwardReference {

	@Parameterized.Parameters
	public static Collection<Object[]> data() {

		//@formatter:off

        final Object[][] results = {

                // { String desc, String fSpec }

                { "JMP AHEAD", "b622e568-07aa-11ee-be56-0242ac120002.asm", },
                { "BEQ AHEAD", "8738fa20-07c4-11ee-be56-0242ac120002.asm", },
                { ".word AHEAD", "23713b56-07ab-11ee-be56-0242ac120002.asm", },
                { ".byte AHEAD", "c22fd7d2-eb1f-481a-9651-451bef709252.asm", },
        } ;

        //@formatter:on

		return (Arrays.asList(results)) ;
	}


	private static final Logger Logger = LoggerFactory.getLogger(_Test_XA_OrgDirective.class) ;

	String desc ;
	String fSpec ;


	public _Test_XA_ForwardReference(final String desc, final String fSpec) {

		this.desc = desc ;
		this.fSpec = fSpec ;
	}


	@Test
	public void basicCheck() throws Exception {

		final String _dSpec = FilenameUtils.getFullPath(this.getClass().getResource(fSpec).toURI().getPath()) ;
		final String _fSpec = FilenameUtils.getBaseName(FilenameUtils.getBaseName(fSpec)) ;

		final String[] args = { "-b", _dSpec + fSpec } ;

		Logger.info("{}", String.format("%s - XA %s", desc, Arrays.asList(args))) ;

		XA.main(args) ;

		final String expected = FileUtils.readFileToString(new File(_dSpec + _fSpec + ".kim"), StandardCharsets.UTF_8) ;
		final String actual = FileUtils.readFileToString(new File(_dSpec + _fSpec + ".bin"), StandardCharsets.UTF_8) ;

		assertEquals(expected, actual) ;
	}
}
