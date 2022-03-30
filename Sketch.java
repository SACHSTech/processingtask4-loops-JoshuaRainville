import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
   /**
   * Called once at the beginning of execution, put your size all in this method
   */
   public void settings() {
	 // put your size call here
    size(500, 500);
   }

   /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
   public void setup() {
    background(255);
   }

   /**
   * Called repeatedly, anything drawn to the screen goes here
   */
   public void draw() {
   
   //Quadrent 1 Code

     strokeWeight((float)0.0025 * height);
     stroke(0);

     for (int i = height / 20; i <= height/2; i += height / 20) {
       line(i, 0, i, height / 2);
       line(0, i, width / 2, i);
     }

   //Quadrent 2 Code
     
     fill(224, 9, 185);
     for (int ellipseY = height / 14; ellipseY <= height / 14 * 7; ellipseY += height/11){
     for (int ellipseX = width / 14 + 250; ellipseX <= width / 14 * 7 + 250; ellipseX += width/11){
       ellipse(ellipseX, ellipseY, 27, 27);
     }
     }

   //Quadrent 3 Code

     strokeWeight((float)0.002 * height);
     for (int i = 0; i <= height / 2; i++) {
       stroke (i);
       line(i, height / 2, i, height);
     }

   //Quadrent 4 Code

     for(int intCircle = 0; intCircle < 360; intCircle += 45){
       stroke(0);
       strokeWeight(1);
       fill(196, 67, 2);
     

       pushMatrix();
       translate(width * 3 / 4, height * 3 / 4);
       rotate(radians(intCircle));
       ellipse(0, 0, width / 22, height / 3);
       popMatrix();

     }

     fill(3, 138, 30);
     noStroke();
     ellipse((width / 2) + width / 4, (height / 2) + height / 4, 50, 50);
       
   }
  
  // define other methods down here.
}