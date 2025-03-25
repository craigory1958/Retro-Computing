//Uncomment to compile trhough Arduino IDE
//#define ENABLE_ARDUINO_IDE_SUPPORT

#ifdef ENABLE_ARDUINO_IDE_SUPPORT
  #include <customLibs.h>
#else
  #include <sensor.h>
  #include <nbiot/nbiot.h>
#endif 

void setup() {}

void loop() 
{
  int val = Sensor::readSensorLevel();
  NBIoT::connect();
  NBIoT::upload("hello");
}