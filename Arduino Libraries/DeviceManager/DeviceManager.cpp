

#include <LinkedList.h>

#include <DeviceManager.h>
#include <AnalogInputDevice.h>
#include <DigitalOutputDevice.h>


DeviceManager::DeviceManager() {
  _analogInputDevices = LinkedList<AnalogInputDevice>() ;
  _digitalOutputDevices = LinkedList<DigitalOutputDevice>() ;
}


void DeviceManager::add(AnalogInputDevice pin) {
  _analogInputDevices.add(pin);
}


void DeviceManager::add(DigitalOutputDevice pin) {
  _digitalOutputDevices.add(pin);
}


void DeviceManager::execute() {

  for (int i = 0; i < _analogInputDevices.size(); i++) {
    _analogInputDevices.set(i, _analogInputDevices.get(i).execute());
  }

  for (int i = 0; i < _digitalOutputDevices.size(); i++) {
    _digitalOutputDevices.set(i, _digitalOutputDevices.get(i).execute());
  }
}

