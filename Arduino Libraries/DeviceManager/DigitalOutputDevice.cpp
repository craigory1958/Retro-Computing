

#include <Arduino.h>
#include <ChannelValue.h>
#include <DigitalOutputDevice.h>


DigitalOutputDevice::DigitalOutputDevice() {
  _bound = false;
}

DigitalOutputDevice::DigitalOutputDevice(int pin, int initialState, int transitions[]) {

  _bound = false;
  _pin = pin;
  _state = initialState;
  _transitions = transitions;

  initialize();
}

DigitalOutputDevice::DigitalOutputDevice(int pin, int initialState, ChannelValue *binding, int transitions[]) {

  _bound = true;
  _pin = pin;
  _binding = binding;
  _state = initialState;
  _transitions = transitions;

  initialize();
}


void DigitalOutputDevice::initialize() {

  _transitionIdx = 0;
  _lastTransition = 0;

  pinMode(_pin, OUTPUT);

  if (_bound)
    analogWrite(_pin, _binding->value());
  else
    digitalWrite(_pin, _state);
}


DigitalOutputDevice DigitalOutputDevice::execute() {

  if ( _transitions[_transitionIdx] > 0 ) {

    unsigned long current = millis();

    if ( current - _lastTransition >= _transitions[_transitionIdx] ) {

      _lastTransition = current;

      if ( _transitions[++_transitionIdx] == 0 )
        _transitionIdx = 0;

      _state = !_state;

      if (_bound)
        if (_state)
          analogWrite(_pin, _binding->value());
        else
          analogWrite(_pin, 0);
      else
        digitalWrite(_pin, _state);
    }

  } else if (_bound)
    analogWrite(_pin, _binding->value());




  return *this;
}

