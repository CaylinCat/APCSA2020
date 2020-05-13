package StarShip;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private boolean alive;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		this(x,y,0);
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x,y);
		speed = s;
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		int r = (int)(Math.random()*256);	
 		int g = (int)(Math.random()*256);
 		int b = (int)(Math.random()*256);
 		Color uwu = new Color(r,g,b);
		window.setColor(uwu);
		window.fillRect(getX(), getY(), 10, 10);
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
		if (direction.equals("RIGHT")) 
			setX(getX() + speed);

		if (direction.equals("LEFT")) 
			setX(getX() - speed);

		if (direction.equals("UP"))
			setY(getY() - speed);
			
		if (direction.equals("DOWN"))
			setY(getY() + speed);
	}
	
	public boolean didCollide(Alien al) {
		if (getX() + 10 >= al.getX() && getX() <= al.getX() + al.getWidth() && getY() - 10 >= al.getY() && getY() <= al.getY() + al.getHeight()) {
			kill();
			return true;
		} else {
			return false;
		}
	}

	public boolean isAlive() {
		if (getY() < 0)
			kill();
		return alive;
	}

	public void kill() {
		alive = false;
	}
	

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}
