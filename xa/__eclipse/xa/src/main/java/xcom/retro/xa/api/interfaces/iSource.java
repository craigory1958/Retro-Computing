

package xcom.retro.xa.api.interfaces ;


import java.io.IOException ;


public interface iSource {
	
	boolean list() ;

	String next() throws IOException ;

	int sourceID() ;

	int sourceLN() ;
	
	String fSpec() ;
}
