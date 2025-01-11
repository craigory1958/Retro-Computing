

#ifndef ChannelValue_h_

#define ChannelValue_h_


class ChannelValue {

  public:

    ChannelValue();

    ChannelValue(int value);

    int value();

    ChannelValue value(int value);

  private:

    int _value;
};

#endif

