#ifndef WIFI_H
#define WIFI_H

#ifdef ARDUINO_SAMD_MKRWIFI1010

#include <Arduino.h>

class WiFi
{
public: 
    static bool connect();
    static bool upload(const String &str);
};

#endif // ARDUINO_SAMD_MKRWIFI1010

#endif // WIFI_H