

package xcom.retro.xa.SmokeTests ;


import static org.junit.Assert.assertEquals ;

import java.io.File ;
import java.nio.charset.StandardCharsets ;

import org.apache.commons.io.FileUtils ;
import org.apache.commons.io.FilenameUtils ;
import org.junit.Test ;

import xcom.retro.xa.XA ;


public class _Test_KIM1_ROM {

    @Test
    public void kim1_rom_Test () throws Exception {

		String _dSpec = FilenameUtils.getFullPath(this.getClass().getResource("KIM-1 ROM.a65").toURI().getPath()) ;
		String _fSpec = FilenameUtils.getBaseName(FilenameUtils.getBaseName("KIM-1 ROM.a65")) ;

		String[] args = { "-b", _dSpec + "KIM-1 ROM.a65" } ;

		XA.main(args) ;

		String expected = FileUtils.readFileToString(new File(_dSpec + _fSpec + ".expected.bin"), StandardCharsets.UTF_8) ;
		String actual = FileUtils.readFileToString(new File(_dSpec + _fSpec + ".bin"), StandardCharsets.UTF_8) ;

		assertEquals(expected, actual) ;
    }
}
