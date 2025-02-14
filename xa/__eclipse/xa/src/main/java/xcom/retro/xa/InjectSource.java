

package xcom.retro.xa ;


import xcom.retro.xa.api.interfaces.iSource ;


public class InjectSource implements iSource {

	boolean list ;
	public boolean list() { return list ; }
	public InjectSource list(final boolean list) {
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

	String line ;
	int x ;

	public InjectSource(final int sn, final int ln, final String line) {

		this.sn = sn ;
		this.ln = ln - 1 ;
		this.line = line ;

		x = 0 ;
	}


	@Override
	public String next() {
		ln++ ;
		return (x++ == 0 ? line : null) ;
	}
}
