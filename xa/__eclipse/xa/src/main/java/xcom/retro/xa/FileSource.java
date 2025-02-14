

package xcom.retro.xa ;


import java.io.BufferedReader ;
import java.io.FileInputStream ;
import java.io.FileNotFoundException ;
import java.io.IOException ;
import java.io.InputStreamReader ;

import org.apache.commons.lang3.StringUtils ;

import xcom.retro.xa.api.interfaces.iSource ;


public class FileSource implements iSource {

	String fSpec ;

	BufferedReader br ;

	boolean list ;
	public boolean list() { return list ; }
	public FileSource list(final boolean list) {
		this.list = list ;
		return this ;
	}

	int ln = 0 ;
	@Override
	public int ln() {
		return ln ;
	}

	int sn ;

	@Override
	public int sn() {
		return sn ;
	}

	boolean wasNull = false ;
	boolean wasEmpty = false ;


	public FileSource(final int sn, final String fSpec, boolean list) throws FileNotFoundException {

		this.sn = sn ;
		this.fSpec = fSpec ;
		this.list=list;

		br = new BufferedReader(new InputStreamReader(new FileInputStream(fSpec))) ;
	}


	@Override
	public String next() throws IOException {

		String line = null ;

		if ( !wasNull ) {
			ln++ ;
			line = br.readLine() ;
		}

		if ( line != null )
			wasEmpty = StringUtils.trimToEmpty(line).isEmpty() ;
		
		else if ( wasNull )
			line = null ;

		else {
			wasNull = true ;
			br.close() ;

			if ( !wasEmpty )
				line = "" ;
		}

		return line ;
	}
}
