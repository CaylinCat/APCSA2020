package Graphics;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color; 
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int xSpeed;
	private int ySpeed;

   /*
    *The constructor is used to initialize all instance variables.
    *The constructor makes the object.
    */
   public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	 //finish this constructor
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		xSpeed = xSpd;
		ySpeed = ySpd;
		
   }

      /*
    *The draw method draws the shape on the screen.
    */
   public void draw(Graphics window)
   {
      window.setColor(color);
      //window.fillRect(xPos, yPos, width, height);

      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()
      window.fillOval(xPos, yPos, 100, 100);
	  window.setColor(color);
      window.fillRect(xPos+50, yPos+80, 200, 100);
      window.setColor(Color.orange);
      window.fillRect(xPos+50, yPos+180, 30, 50);
      window.fillRect(xPos+220, yPos+180, 30, 50);
   
   }

   /*
    *This draw method will be used to erase the shape.
    */
   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(xPos, yPos, width, height);
   }

   public void moveAndDraw(Graphics window)
   {
    	//not needed yet
	   xPos+=xSpeed;
	   yPos+=ySpeed;
	   draw(window);
   }

   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
   public int getX()
   {
   	return xPos;
   }
   public void setX( int x )
   {
   	//add code here
	   xPos = x;
   }
   public int getY()
   {
   	return yPos;
   }
   public void setY( int y )
   {
	   yPos = y;
   }
   public int getXSpeed()
   {
   	return xSpeed;
   }
   public void setXSpeed( int x )
   {
	   xSpeed = x;
   }
   public int getYSpeed()
   {
   	return ySpeed;
   }
   public void setYSpeed( int y )
   {
	   ySpeed = y;
   }

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
}