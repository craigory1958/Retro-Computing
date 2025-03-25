

#include <Arduino.h>


#ifndef   Misc_h_
#define   Misc_h_


#define   BIT0          _BV(0)
#define   BIT1          _BV(1)
#define   BIT2          _BV(2)
#define   BIT3          _BV(3)
#define   BIT4          _BV(4)
#define   BIT5          _BV(5)
#define   BIT6          _BV(6)
#define   BIT7          _BV(7)

#define   BigBitMask(from, to)   ( (~(uint32_t(-1) << (from - to +1))) << to )
#define   BitMask(from, to)   ( (~(unsigned(-1) << (from - to +1))) << to )


FILE serial_stdout;

int serial_putchar(char c, FILE* f) {

    if (c == '\n') serial_putchar('\r', f);
    return Serial.write(c) == 1? 0 : 1;
}

void serial_begin(unsigned long baud) {

    Serial.begin(baud); 
    fdev_setup_stream(&serial_stdout, serial_putchar, NULL, _FDEV_SETUP_WRITE);
    stdout = &serial_stdout;
}


#endif
