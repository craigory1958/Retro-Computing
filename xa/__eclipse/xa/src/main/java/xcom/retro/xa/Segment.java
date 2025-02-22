

package xcom.retro.xa ;


import java.util.ArrayList ;
import java.util.List ;

import xcom.utils4j.Lists ;


public class Segment {

	//@formatter:off

	String name ;

	int loc ;
	public int loc() { return loc ; }

	List<ByteBlock> blocks ;

	public List<ByteBlock> getBlocks() { return blocks ; }

	//@formatter:on


	public Segment(final String name) {

		this.name = name ;
		blocks = new ArrayList<>() ;
		blocks.add(new ByteBlock()) ;
	}

	public void allocateBytes(final byte[] bytes) {
		loc = Lists.last(blocks).allocateBytes(bytes) ;
	}


//	public void fillBytes(byte[] bytes) {
//		org = Lists.last(blocks).fillBytes(bytes) ;
//	}


	public void setOrg(final int value) {

		if ( !Lists.last(blocks).hasOrg() )
			blocks.add(new ByteBlock()) ;

		loc = Lists.last(blocks).setOrg(value) ;
		Lists.last(blocks).loc(value) ;
	}
}
