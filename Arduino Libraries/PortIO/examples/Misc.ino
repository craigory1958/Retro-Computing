

#include <Arduino.h>

#include "Misc.h"


void setup() {

  Serial.begin(115200);
  Serial.println("\n\n\n\n\n\n\n\n\n\n\n\n");
  char s[80];

  sprintf(s, "BIT0: 0x%02X", BIT0);
  Serial.println(s);
  sprintf(s, "BIT1: 0x%02X", BIT1);
  Serial.println(s);
  sprintf(s, "BIT2: 0x%02X", BIT2);
  Serial.println(s);
  sprintf(s, "BIT3: 0x%02X", BIT3);
  Serial.println(s);
  sprintf(s, "BIT4: 0x%02X", BIT4);
  Serial.println(s);
  sprintf(s, "BIT5: 0x%02X", BIT5);
  Serial.println(s);
  sprintf(s, "BIT6: 0x%02X", BIT6);
  Serial.println(s);
  sprintf(s, "BIT7: 0x%02X", BIT7);
  Serial.println(s);

  Serial.println();
  sprintf(s, "BitMask(BIT1, BIT0):  0x%04X", BitMask(BIT1, BIT0));
  Serial.println(s);
  sprintf(s, "BitMask(1, 0):        0x%04X", BitMask(1, 0));
  Serial.println(s);
}


void loop() {}
