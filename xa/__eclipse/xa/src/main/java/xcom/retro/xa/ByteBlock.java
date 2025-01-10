

package xcom.retro.xa ;


import java.util.Arrays ;


public class ByteBlock {

	Integer org ;

	public Integer org() {
		return org ;
	}

	int lc ;

	public ByteBlock lc(int lc) {
		this.lc = lc ;
		return this ;
	}

	int numBytes ;

	public int numBytes() {
		return numBytes ;
	}

	byte[] bytes ;

	public byte[] bytes() {
		return bytes ;
	}


	public ByteBlock() {
		lc = 0 ;
		numBytes = 0 ;
		bytes = new byte[0] ;
	}


	public int allocateBytes(final byte[] bytes) {

		if ( org == null )
			org = lc ;

		this.bytes = ((numBytes + bytes.length) > this.bytes.length) ? Arrays.copyOf(this.bytes, this.bytes.length + 16) : this.bytes ;

		System.arraycopy(bytes, 0, this.bytes, numBytes, bytes.length) ;
		numBytes += bytes.length ;

		return (lc += bytes.length) ;
	}


	public void fillBytes(final int address, final byte[] bytes) {

//		for ( final byte b : this.bytes ) 
//			System.out.print(String.format("%02X", b)) ;
//		System.out.println() ;

		try {
			for ( int b = 0; b < bytes.length; b++ )
				this.bytes[(address - org) + b] = bytes[b] ;
		}
		catch ( final Exception ex ) {
//			System.out.println("address:" + address) ;
//			System.out.println("length:" + bytes.length) ;
//			System.out.println("org:" + org) ;
		}
	}


	public int setOrg(final int value) {
		return lc = org = value ;
	}


	public boolean hasOrg() {
		return org == null ;
	}
}
