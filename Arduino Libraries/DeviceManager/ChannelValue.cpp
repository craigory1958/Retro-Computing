

#include <ChannelValue.h>


ChannelValue::ChannelValue() {}

ChannelValue::ChannelValue(int value) {
  _value = value;
}


int ChannelValue::value() {
  return _value;
}

ChannelValue ChannelValue::value(int value) {
  _value = value;
  return *this;
}

