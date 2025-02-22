

package xcom.retro.xa ;


import java.util.ArrayList ;
import java.util.List ;

import xcom.retro.xa.expressions.ExpressionUtils ;


public class Identifier {

	public enum IdentifierTypes {
		Identifer, Label, Symbol,;
	}


	public class Reference {

		//@formatter:off

		int ln ;
		public int ln() { return ln ; }
		public Reference ln(final int ln) {
			this.ln = ln ;
			return this;
		}

		int sourceID ;
		public int sourceID() { return sourceID ; }
		public Reference sourceID(final int sourceID) {
			this.sourceID = sourceID ;
			return this;
		}

		int sourceLN ;
		public int sourceLN() { return sourceLN ; }
		public Reference sourceLN(final int sourceLN) {
			this.sourceLN = sourceLN ;
			return this;
		}

		//@formatter:on


		public Reference(final int ln, final int sourceID, final int sourceLN) {

			this.ln = ln ;
			this.sourceID = sourceID ;
			this.sourceLN = sourceLN ;
		}
	}


	//@formatter:off

	String name ;
	public String name() { return name ; }

	String canonicalName ;
	public String canonicalName() { return canonicalName ; }

	Reference origin ;
	public Reference origin() { return origin ; }
	public Identifier origin(final Reference origin) {
		this.origin = origin ;
		return this;
	}

	List<Reference> references ;
	public List<Reference> references() { return references ; }

	String rootName ;
	public String rootName() { return rootName ; }

//	int ln ;
//	public int ln() { return ln ; }
//	public Identifier ln(int ln) {
//		this.ln = ln ;
//		return this;
//	}
//
//	int sourceID ;
//	public int sourceID() { return sourceID ; }
//	public Identifier sourceID(int sourceID) {
//		this.sourceID = sourceID ;
//		return this;
//	}
//
//	int sourceLN ;
//	public int sourceLN() { return sourceLN ; }
//	public Identifier sourceLN(int sourceLN) {
//		this.sourceLN = sourceLN ;
//		return this;
//	}

	IdentifierTypes type ;
	public IdentifierTypes type() { return type ; }

	byte[] value ;
	public byte[] value() { return value ; }
	public Identifier value(final byte[] value) {
		this.value = value ;
		return this;
	}
	public Identifier value(final int value) {
		this.value = ExpressionUtils.asBytes(value) ;
		return this;
	}

	//@formatter:on


	public Identifier(final String name) {

		this.name = name ;

		references = new ArrayList<>() ;
	}


//	public Identifier(final String name, final byte[] value) {
//
//		this.name = name ;
//		this.value = value.clone() ;
//
//		this.references = new ArrayList<>();
//	}


//	public Identifier(final String name, final int value) {
//
//		this.name = name ;
//		this.value = ExpressionUtils.asBytes(value) ;
//
//		this.references = new ArrayList<>();
//	}
}
