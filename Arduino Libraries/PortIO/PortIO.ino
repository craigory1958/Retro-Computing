

#include <Mega2560.h>
#include <PortIO.h>


#define TestsMax    2
#define TestBegun   0
#define TestEnded   1

bool terminated = false;
String testResult = "";
int testNum = 0;
bool tests[TestsMax][2];


#define   LED   D13
#define   PIN   PA
#define   POUT  PC

byte data;


void setup() {

  Serial.begin(115200);
  Serial.setTimeout(10);
  Serial.print("\n\n\n\n\n\n\n\n\n\n\n\n>");
}


void loop() {

  beginLoop();

  switch (testNum) {
    case 0: test00(); break;
    case 1: test01(); break;
  }

  endLoop();
}


void beginLoop() {
  testResult = readln();
}


void endLoop() {

  if (!terminated && tests[TestsMax - 1][TestEnded]) {
    terminated = true;
    Serial.print("\n> ");
  }
}


bool beginTest(String desc) {

  if (!tests[testNum][TestBegun]) {
    tests[testNum][TestBegun] = true;
    Serial.print("\n> " + desc + " ");
    return true;
  }

  return false;
}

bool endTest() {

  if (!tests[testNum][TestEnded] && (testResult.equalsIgnoreCase("p\n") || testResult.equalsIgnoreCase("f\n"))) {
    tests[testNum][TestEnded] = true;
    testNum++;
    testResult = "";
    return true;
  }

  return false;
}

bool execTest() {

  Serial.print(".");

  return true;
}


String readln() {

  if (Serial.available() > 0)
    return Serial.readString();

  return "";
}


void test00() {

    if (beginTest("Pin I/O")) {
      pio_setPinAsOutput(LED);
    }

    if (execTest()) {
      pio_setPin(LED);
      delay(100);

      pio_resetPin(LED);
      delay(900);
    }

    if (endTest()) {
      pio_resetPin(LED);
    }
}

void test01() {

    if (beginTest("Port I/O")) {
      pio_setPortIO(POUT, pio_PortAsOutput);
      pio_setPortIO(PIN, pio_PortAsInput);
    }

    if (execTest()) {
      data = pio_readPort(PIN);

      pio_writePort(POUT, data);
      delay(500);

      pio_writePort(POUT, ~data);
      delay(500);
    }

    if (endTest()) {
      pio_writePort(POUT, 0x00);
    }
}
