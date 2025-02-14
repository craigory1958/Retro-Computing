

package xcom.retro.xa.api.interfaces ;


import java.io.IOException ;


public interface iSource {
	
	boolean list() ;

	int ln() ;

	String next() throws IOException ;

	int sn() ;
}
