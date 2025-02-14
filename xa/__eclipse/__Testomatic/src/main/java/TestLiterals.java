import java.util.HashMap ;
import java.util.Map ;

import com.google.common.primitives.Bytes ;

import xcom.retro.xa.Symbol ;
import xcom.retro.xa.expressions.op.binary.IntegerAdd ;
import xcom.retro.xa.expressions.op.binary._BinaryOpNode ;
import xcom.retro.xa.expressions.op.unary.HighByte ;
import xcom.retro.xa.expressions.op.unary.LowByte ;
import xcom.retro.xa.expressions.op.unary.Minus ;
import xcom.retro.xa.expressions.op.unary._UnaryOpNode ;
import xcom.retro.xa.expressions.value.BinaryLiteral ;
import xcom.retro.xa.expressions.value.DecimalLiteral ;
import xcom.retro.xa.expressions.value.HexLiteral ;
import xcom.retro.xa.expressions.value.Identifier ;
import xcom.retro.xa.expressions.value.StringLiteral ;


public class TestLiterals {

	public static void main(String[] args) {

		Map<String, Symbol> symbols = new HashMap<>() ;
		symbols.put("abc", new Symbol("abc", 123)) ;

		System.out.println("BinaryLiteral(\"0b101\"): " + new BinaryLiteral("0b101").eval(null)) ;

		System.out.println("StringLiteral(\"Hello World\"): " + new StringLiteral("\"Hello World\"").eval(null)) ;

		System.out.println("Identifier(\"abc\"): " + new Identifier("abc").eval(symbols)) ;

		{
			_UnaryOpNode x = new Minus(0) ;
			x.setNode(new HexLiteral("$FF")) ;
			System.out.println("Minus($FF): " + x.eval(symbols)) ;
		}

		{
			System.out.println("HexLiteral($FF): " + new HexLiteral("$FF").eval(null)) ;
			_UnaryOpNode x = new LowByte(0) ;
			x.setNode(new HexLiteral("$EEFF")) ;
			System.out.println("LowByte($EEFF): " + x.eval(symbols)) ;
		}

		{
			System.out.println("HexLiteral($EE): " + new HexLiteral("$EE").eval(null)) ;
			_UnaryOpNode x = new HighByte(0) ;
			x.setNode(new HexLiteral("$EEFF")) ;
			System.out.println("HighByte($EEFF): " + x.eval(symbols)) ;
		}

		{
			_BinaryOpNode x = new IntegerAdd(0) ;
			x.setLNode(new Identifier("abc")) ;
			x.setRNode(new DecimalLiteral("456")) ;
			System.out.println("IntegerAdd(abc+456): " + x.eval(symbols)) ;
		}
	}
}
