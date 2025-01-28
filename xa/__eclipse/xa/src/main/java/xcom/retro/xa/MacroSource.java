

package xcom.retro.xa ;


import java.io.IOException ;
import java.util.List ;

import xcom.retro.xa.api.interfaces.iSource ;


public class MacroSource implements iSource {


	int ln ;

	@Override
	public int ln() {
		return ln ;
	}

	int sn ;

	@Override
	public int sn() {
		return sn ;
	}

	List<String> lines ;
	int x ;

	public MacroSource(final int sn, final int ln, final List<String> lines) {

		this.sn = sn ;
		this.ln = ln - 1 ;
		this.lines = lines ;

		x = 0 ;
	}


	@Override
	public String next() throws IOException {
		ln++ ;
		return (x < lines.size() ? lines.get(x++) : null) ;
	}
}
