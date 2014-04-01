int buttonPin = 2;
int ledPin[8];
boolean buttonState;

void setup() {
  for ( int i = 0 ; i < 8; i++ )
    ledPin[i] = i+4;
  for ( int i = 0 ; i < 8; i++ )
    pinMode(ledPin[i], OUTPUT);      
  pinMode(buttonPin, INPUT);     
}

void printOutput(int* input) {
  for ( int i = 0;i < 8; i++ )
    digitalWrite(ledPin[i], HIGH);
}

void printOutput1() {
  for ( int i = 0;i < 8; i++ )
    digitalWrite(ledPin[i], HIGH);
}

void printOutput2() {
  for ( int i = 0;i < 8; i++ )
    digitalWrite(ledPin[i], LOW);
}




void loop(){
  buttonState = digitalRead(buttonPin);

  // check if the pushbutton is pressed.
  // if it is, the buttonState is HIGH:
  if (buttonState == HIGH) {     
    // turn LED on:    
    printOutput1();  
  } 
  else {
    // turn LED off:
    printOutput2(); 
  }
}
