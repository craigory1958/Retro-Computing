

package xcom.retro.xa ;


import java.io.BufferedReader ;
import java.io.FileInputStream ;
import java.io.FileNotFoundException ;
import java.io.IOException ;
import java.io.InputStreamReader ;

import org.apache.commons.lang3.StringUtils ;

import xcom.retro.xa.api.interfaces.iSource ;


public class FileSource implements iSource {

	//@formatter:off

	String fSpec ;
	@Override
	public String fSpec() { return fSpec ; }

	boolean list ;
	@Override
	public boolean list() { return list ; }
	public FileSource list(final boolean list) {
		this.list = list ;
		return this ;
	}

	int sourceLN ;
	@Override
	public int sourceLN() { return sourceLN ; }

	int sourceID ;
	@Override
	public int sourceID() { return sourceID ; }

	//@formatter:on


	BufferedReader br ;
	boolean wasNull = false ;
	boolean wasEmpty = false ;


	public FileSource(final int sourceID, final String fSpec, final boolean list) throws FileNotFoundException {

		this.sourceID = sourceID ;
		this.fSpec = fSpec ;
		this.list = list ;

		sourceLN = 0 ;
		br = new BufferedReader(new InputStreamReader(new FileInputStream(fSpec))) ;
	}


	@Override
	public String next() throws IOException {

		String line = null ;

		if ( !wasNull ) {
			sourceLN++ ;
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
