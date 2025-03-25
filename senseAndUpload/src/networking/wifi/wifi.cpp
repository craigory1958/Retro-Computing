#include "wifi.h"

#ifdef ARDUINO_SAMD_MKRWIFI1010

bool WiFi::connect()
{
    return false;
}

bool WiFi::upload(const String &str)
{
    return false;
}

#endif // ARDUINO_SAMD_MKRWIFI1010