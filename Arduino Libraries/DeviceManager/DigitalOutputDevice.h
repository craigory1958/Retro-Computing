

#ifndef DigitalOutputDevice_h_

#define DigitalOutputDevice_h_


#include "ChannelValue.h"


class DigitalOutputDevice {

  public:

    DigitalOutputDevice();

    DigitalOutputDevice(int pin, int initialState, int transitions[]);

    DigitalOutputDevice(int pin, int initialState, ChannelValue *binding, int transitions[]);

    DigitalOutputDevice execute();

  private:

    bool _bound;
    int _pin;
    ChannelValue *_binding;
    int _state;
    int *_transitions;

    int _transitionIdx;
    unsigned long _lastTransition;

    void initialize() ;
};

#endif

