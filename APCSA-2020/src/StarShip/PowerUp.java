package StarShip;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class PowerUp extends MovingThing
{
	private int speed;
	private Image image;

	public PowerUp()
	{
		this(10,10,10,10,10);
	}

	public PowerUp(int x, int y)
	{
	   //add code here
		this(x,y,10,10,10);
	}

	public PowerUp(int x, int y, int s)
	{
	   //add code here
		this(x,y,10,10,10);
		speed = s;
	}

	public PowerUp(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("pu.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("RIP");
		}
	}
	
	public void setSpeed(int s)
	{
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		if(direction.equals("RIGHT"))
			setX(getX() + speed);
			
		if(direction.equals("LEFT"))
			setX(getX() - speed);

		if(direction.equals("UP"))
			setY(getY() - speed);
		
		if(direction.equals("DOWN"))
			setY(getY() + speed);
	}
	
	public boolean didCollide(Ship shippp) {
		if (getX() + getWidth() >= shippp.getX() && getX() <= shippp.getX() + shippp.getWidth() && getY() >= shippp.getY() && getY() <= shippp.getY() + shippp.getHeight()) {
			return true;
		}
		return false;
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}