import java.io.ByteArrayOutputStream ;
import java.util.Scanner ;

import com.fazecast.jSerialComm.SerialPort ;


public class PAL1Mon {

	static final String LF = "\r" ;
	static final String CR = "\n" ;


	public static void main(String[] args) {

		System.out.println("Hello world !!!") ;


		for ( SerialPort port : SerialPort.getCommPorts() )
			System.out.println(port.getSystemPortName()) ;

		SerialPort comPort = SerialPort.getCommPorts()[0] ;

		comPort.openPort() ;

		comPort.setNumDataBits(8) ;
		comPort.setParity(SerialPort.NO_PARITY) ;
		comPort.setNumStopBits(SerialPort.ONE_STOP_BIT) ;
		comPort.setFlowControl(SerialPort.FLOW_CONTROL_DISABLED) ;
		comPort.setBaudRate(1200) ;

		byte[] byteOut = new byte[1] ;
		byte[] bytesIn ;

		int idx = 0 ;
		byte[] msg = (LF + LF + LF + "0000 " + LF + LF + LF + LF + LF + LF + LF + LF + LF + LF).getBytes() ;


		try ( Scanner reader = new Scanner(System.in) ) {

			while ( true ) {

				if ( comPort.bytesAvailable() > 0 ) {
					bytesIn = new byte[comPort.bytesAvailable()] ;
					comPort.readBytes(bytesIn, bytesIn.length) ;

					for ( byte byteIn : bytesIn )
						if ( byteIn > 0 )
							if ( byteIn != LF.getBytes()[0] /* && byteIn != CR.getBytes()[0] */ )
								System.out.print((char) byteIn) ;

					Thread.sleep(100) ;
				}


//				if ( System.in.available() > 0 ) {
//
//					byteOut = System.in.readNBytes(1) ;
//
//					if ( byteOut[0] != CR.getBytes()[0] )
//						comPort.writeBytes(byteOut, 1) ;
//
//					Thread.sleep(100) ;
//				}


				if ( idx < msg.length ) {
					byteOut[0] = msg[idx++] ;
					comPort.writeBytes(byteOut, 1) ;

					Thread.sleep(100) ;
				}
			}
		}
		catch ( Exception e ) {
			e.printStackTrace() ;
		}

		comPort.closePort() ;

	}
}
