

package xcom.retro.xa.api.interfaces ;


import java.io.IOException ;


public interface iSource {
	
	String fSpec() ;
	
	boolean list() ;

	String next() throws IOException ;
	
	String scopeID() ;

	int sourceID() ;

	int sourceLN() ;
}
