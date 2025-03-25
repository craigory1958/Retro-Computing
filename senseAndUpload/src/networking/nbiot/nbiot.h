#ifndef NBIOT_H
#define NBIOT_H

#ifdef ARDUINO_SAMD_MKRNB1500

#include <Arduino.h>

class NBIoT
{
public: 
    static bool connect();
    static bool upload(const String &str);
};

#endif // ARDUINO_SAMD_MKRNB1500

#endif // NBIOT_H