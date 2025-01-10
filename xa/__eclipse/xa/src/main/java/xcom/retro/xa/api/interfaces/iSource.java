

package xcom.retro.xa.api.interfaces ;


import java.io.IOException ;


public interface iSource {

	int ln() ;

	String next() throws IOException ;

	int sn() ;
}
