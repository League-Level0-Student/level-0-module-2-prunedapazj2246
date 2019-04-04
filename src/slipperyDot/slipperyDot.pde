 // create three integer variables to  
 int dotX = 500;  //    represent the x, y, and the size of the ellipse
  int dotY = 500;  
    int dSize = 100;
    void setup() {
   size(1000,1000);   //set the size of your sketch
    
    }
    
    void draw() {
      background(72,0,103);//set the background color of your sketch
      
      ellipse(dotX,dotY,dSize,dSize);//draw an ellipse. Make sure it fits in the window.
      //use the variables created in step 4 in place of the numbers
      //   in your ellipse
    
    }
    
    void mousePressed() {
    int distance;  //6a. create an integer variable called distance
     distance = getDistance(mouseX,mouseY,dotX,dotY); //6b. use the getDistance method to initialize your varible
      //    use the mouse's x and y and the x and y of your ellipse 
     
     System.out.println(distance); //print the distance variable
    
      
    if(distance <= dSize - 50){
         System.out.println("inside"); //print the distance variable  
  dotX =int( random(width));
   dotY = int(random(height));
  }//8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      
        //8b.  set the x and y of the ellipse to a random location on the window
       
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
