
/*
 * GDCuyasen https://gmac.2600tech.com/
 */
import java.util.Scanner ;

import com.fazecast.jSerialComm.SerialPort ;
import com.fazecast.jSerialComm.SerialPortDataListener ;
import com.fazecast.jSerialComm.SerialPortEvent ;


public class MainClass {

	SerialPort activePort ;
	SerialPort[] ports = SerialPort.getCommPorts() ;

	public void showAllPort() {
		int i = 0 ;
		for ( SerialPort port : ports ) {
			System.out.print(i + ". " + port.getDescriptivePortName() + " ") ;
			System.out.println(port.getPortDescription()) ;
			i++ ;
		}
	}

	public void setPort(int portIndex) {
		activePort = ports[portIndex] ;

		activePort.setNumDataBits(8) ;
		activePort.setParity(SerialPort.NO_PARITY) ;
		activePort.setNumStopBits(SerialPort.ONE_STOP_BIT) ;
		activePort.setFlowControl(SerialPort.FLOW_CONTROL_DISABLED) ;
		activePort.setBaudRate(1200) ;


		if ( activePort.openPort() )
			System.out.println(activePort.getPortDescription() + " port opened.") ;


		activePort.addDataListener(new SerialPortDataListener() {

			@Override
			public void serialEvent(SerialPortEvent event) {
				System.out.println("We is here ...") ;
				int size = event.getSerialPort().bytesAvailable() ;
				byte[] buffer = new byte[size] ;
				event.getSerialPort().readBytes(buffer, size) ;
				for ( byte b : buffer )
					System.out.print((char) b) ;
			}

			@Override
			public int getListeningEvents() {
				return SerialPort.LISTENING_EVENT_DATA_AVAILABLE ;
			}
		}) ;
	}


	public void start() {

		showAllPort() ;
		setPort(0) ;


		byte[] bytes = new byte[1] ;
		try ( Scanner reader = new Scanner(System.in) ) {
			while ( true ) {
				if ( reader.hasNext() ) {
					bytes[0] = reader.nextByte() ;
					activePort.writeBytes(bytes, 1) ;
				}
				
				
			}
		}
	}

	public static void main(String[] args) {
		MainClass mainClass = new MainClass() ;
		mainClass.start() ;
	}

}
