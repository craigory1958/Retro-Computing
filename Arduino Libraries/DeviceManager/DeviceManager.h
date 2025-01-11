

#ifndef DeviceManager_h_

#define DeviceManager_h_


#include <LinkedList.h>

#include <AnalogInputDevice.h>
#include <DigitalOutputDevice.h>


class DeviceManager {

  public:

    DeviceManager();

    void add(AnalogInputDevice pin);

    void add(DigitalOutputDevice pin);

    void execute();

  private:

    LinkedList<AnalogInputDevice> _analogInputDevices;
    LinkedList<DigitalOutputDevice> _digitalOutputDevices;
};

#endif

