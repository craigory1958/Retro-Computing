

package xcom.retro.xa.Directives ;


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


@RunWith(Parameterized.class)
public class _Test_XA_OrgDirective {

	@Parameterized.Parameters
	public static Collection<Object[]> data() {

		//@formatter:off

        final Object[][] results = {

                // { String desc, String srcFSpec }

                { "No org drirectives", "898e1438-033a-11ee-be56-0242ac120002.asm", },
                { ".org $200", "3fbc3fc0-0343-11ee-be56-0242ac120002.asm", },
                { "Non-Consecutive Memory Blocks", "9256bd36-039e-11ee-be56-0242ac120002.asm", },
        } ;

        //@formatter:on

		return (Arrays.asList(results)) ;
	}


	private static final Logger Logger = LoggerFactory.getLogger(_Test_XA_OrgDirective.class) ;

	String desc ;
	String srcFSpec ;


	public _Test_XA_OrgDirective(final String desc, final String srcFSpec) {

		this.desc = desc ;
		this.srcFSpec = srcFSpec ;
	}


	@Test
	public void assembleTest() throws Exception {

		final String _dSpec = FilenameUtils.getFullPath(this.getClass().getResource(srcFSpec).toURI().getPath()) ;
		final String _fSpec = FilenameUtils.getBaseName(FilenameUtils.getBaseName(srcFSpec)) ;

		final String[] args = { "-b", "-l", _dSpec + srcFSpec } ;

		Logger.info("{}", String.format("%s - XA %s", desc, Arrays.asList(args))) ;

		XA.main(args) ;

		final String expected = FileUtils.readFileToString(new File(_dSpec + _fSpec + ".kim"), StandardCharsets.UTF_8) ;
		final String actual = FileUtils.readFileToString(new File(_dSpec + _fSpec + ".bin"), StandardCharsets.UTF_8) ;

		assertEquals(expected, actual) ;
	}
}
