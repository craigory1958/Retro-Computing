

package xcom.retro.xa ;


import java.util.ArrayList ;
import java.util.List ;


public class Segment {

	String name ;
	int lc ;

	public int lc() {
		return lc ;
	}

	List<ByteBlock> blocks ;

	public List<ByteBlock> getBlocks() {
		return blocks ;
	}


	public Segment(final String name) {

		this.name = name ;
		blocks = new ArrayList<>() ;
		blocks.add(new ByteBlock()) ;
	}

	public void allocateBytes(final byte[] bytes) {
		lc = blocks.get(blocks.size() - 1).allocateBytes(bytes) ;
	}


//	public void fillBytes(byte[] bytes) {
//		lc = blocks.get(blocks.size() - 1).fillBytes(bytes) ;
//	}


	public void setOrg(final int value) {

		if ( !blocks.get(blocks.size() - 1).hasOrg() )
			blocks.add(new ByteBlock()) ;

		lc = blocks.get(blocks.size() - 1).setOrg(value) ;
		blocks.get(blocks.size() - 1).lc(value) ;
	}
}
