

#include <Arduino.h>
#include <stddef.h>
#include <AnalogInputDevice.h>


AnalogInputDevice::AnalogInputDevice() {}

AnalogInputDevice::AnalogInputDevice(int pin, ChannelValue *binding) {

  _pin = pin;
  _binding = binding;

  initialize();
}


void AnalogInputDevice::initialize() {
  execute();
}


AnalogInputDevice AnalogInputDevice::execute() {

  _binding->value(map(analogRead(_pin), 0, 1023, 0, 155));

  return *this;
}

