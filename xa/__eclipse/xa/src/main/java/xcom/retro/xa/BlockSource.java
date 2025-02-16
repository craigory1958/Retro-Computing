

package xcom.retro.xa ;


import java.io.IOException ;
import java.util.List ;

import xcom.retro.xa.api.interfaces.iSource ;


public class BlockSource implements iSource {

	//@formatter:off

	boolean list ;
	public boolean list() { return list ; }
	public BlockSource list(final boolean list) {
		this.list = list ;
		return this ;
	}

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

	//@formatter:on


	public BlockSource(final int sn, final int ln, final List<String> lines, boolean list) {

		this.sn = sn ;
		this.ln = ln - 1 ;
		this.lines = lines ;
		this.list = list ;

		x = 0 ;
	}


	@Override
	public String next() throws IOException {
		ln++ ;
		return (x < lines.size() ? lines.get(x++) : null) ;
	}
}
