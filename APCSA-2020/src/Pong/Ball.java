package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x,y);
		setXSpeed(2);
		setYSpeed(2);
	}
	public Ball(int x, int y, int w, int h) {
		super(x,y,w,h);
		setXSpeed(2);
		setYSpeed(2);
	}
	public Ball(int x, int y, int w, int h, Color c) {
		super(x,y,w,h,c);
		setXSpeed(2);
		setYSpeed(2);
	}
	public Ball(int x, int y, int w, int h, Color c, int xS, int yS) {
		super(x,y,w,h,c);
		setXSpeed(xS);
		setYSpeed(yS);
	}
	
	
	   
   //add the set methods
	public void setXSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public void setYSpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}   


   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.white);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window, super.getColor());
   }
   
	public boolean equals(Object obj)
	{
		Ball hi = (Ball)obj;
		
		if(xSpeed == hi.getXSpeed() && ySpeed == hi.getYSpeed())
			return true;

		return false;
	}
	
   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

   //add a toString() method
	public String toString() {
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}
}