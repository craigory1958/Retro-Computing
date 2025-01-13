

#ifndef   PortIO_h_
#define   PortIO_h_


#define   pio_PortAsInput             0x00
#define   pio_PortAsOutput            0xFF

#define   pio__PinToPinNum(pin)       pio__##pin##_PinNum
#define   pio__PinToBIT(pin)          pio__##pin##_BIT
#define   pio__PinToDDR(pin)          pio__##pin##_DDR
#define   pio__PinToPIN(pin)          pio__##pin##_PIN
#define   pio__PinToPORT(pin)         pio__##pin##_PORT

#define   pio_readPin(pin)            ( pio__PinToPIN(pin) & pio__PinToBIT(pin) )
#define   pio_setPin(pin)             ( pio__PinToPORT(pin) |= pio__PinToBIT(pin) )
#define   pio_resetPin(pin)           ( pio__PinToPORT(pin) &= ~pio__PinToBIT(pin) )
// #define   pio_pulsePin(pin)           ()
#define   pio_setPinAsOutput(pin)     ( pio__PinToDDR(pin) |= pio__PinToBIT(pin) )
#define   pio_setPinAsInput(pin)      ( pio__PinToDDR(pin) &= ~pio__PinToBIT(pin) )
// #define   pio_setPinAsInput_wPullup(pin)    ( pio__PinToDDR(pin) |= pio__PinToBIT(pin) )

#define   pio_attachInterruptToPin(pin, edge, handler)   ( attachInterrupt(digitalPinToInterrupt(pio__PinToPinNum(pin)), handler, edge) )


#define   pio__PortToDDR(port)        pio__##port##_DDR 
#define   pio__PortToPIN(port)        pio__##port##_PIN 
#define   pio__PortToPORT(port)       pio__##port##_PORT 

#define   pio_readPort(port)          ( pio__PortToPIN(port) )
#define   pio_writePort(port, data)   ( pio__PortToPORT(port) = data )
#define   pio_setPortIO(port, dir)    ( pio__PortToDDR(port) = dir )

#endif
