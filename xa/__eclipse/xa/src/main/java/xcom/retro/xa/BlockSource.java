

package xcom.retro.xa ;


import java.io.IOException ;
import java.util.List ;

import xcom.retro.xa.api.interfaces.iSource ;


public class BlockSource implements iSource {

	//@formatter:off

	String fSpec ;
	@Override
	public String fSpec() { return fSpec ; }

	boolean list ;
	@Override
	public boolean list() { return list ; }
	public BlockSource list(final boolean list) {
		this.list = list ;
		return this ;
	}

	int sourceLN ;
	@Override
	public int sourceLN() { return sourceLN ; }

	int sourceID ;
	@Override
	public int sourceID() { return sourceID ; }

	List<String> lines ;

	//@formatter:on


	int curLN ;


	public BlockSource(final int sourceID, final int ln, final List<String> lines, final boolean list) {

		this.sourceID = sourceID ;
		sourceLN = ln - 1 ;
		this.lines = lines ;
		this.list = list ;

		curLN = 0 ;
	}


	@Override
	public String next() throws IOException {
		sourceLN++ ;
		return (curLN < lines.size() ? lines.get(curLN++) : null) ;
	}
}
