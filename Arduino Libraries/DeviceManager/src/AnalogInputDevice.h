

#ifndef AnalogInputDevice_h_

#define AnalogInputDevice_h_


#include <ChannelValue.h>


class AnalogInputDevice {

  public:

    AnalogInputDevice();

    AnalogInputDevice(int pin, ChannelValue *binding);

    AnalogInputDevice execute();

  private:

    int _pin;
    ChannelValue *_binding;

    void initialize() ;
};

#endif

