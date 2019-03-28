int xdot=0;
void setup(){
//Make a variable to hold the X co-ordinate of the dot and set it to void setup() {
 size(800, 200);
}

void draw() {
  background(#F3FC03);
   fill(#3096ED); //make it a nice color

  if(mousePressed){//if the mouse is pressed...
  xdot += 1;
  if(xdot>=800){
  playSound();
  }
  }
    ellipse(xdot,100,10,200);//... change the X co-ordinate so that the dot moves to the right
  //Draw an ellipse of height and width 10Make sure to use your variable for the X position.
    //Make your dot move really fast so that it can win the race 
       // (you have to figure out what part of your code to change)
    //Use this method to play a ding when your dot crosses the finish line. 
}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("llama.wav");
        sound.trigger();
        
    }
}       
