package StarShip;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   //add code here
		this(x,y,10,10,10);
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		this(x,y,10,10,10);
		speed = s;
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("RIP");
		}
	}
	
	public Ship(int x, int y, int w, int h, int s, boolean hi)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("ship2.jpg");
			image = ImageIO.read(url);
			//
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("RIP");
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void setImage(String im) {
		try {
			image = ImageIO.read(getClass().getResource(im));
		} catch (IOException e) {
			System.out.println("RIP");
		}
	}

	public void move(String direction)
	{
		//add code here
		if(direction.equals("RIGHT"))
			setX(getX() + speed);
			
		if(direction.equals("LEFT"))
			setX(getX() - speed);

		if(direction.equals("UP"))
			setY(getY() - speed);
		
		if(direction.equals("DOWN"))
			setY(getY() + speed);
	}
	
	public boolean didCollide(Alien al) {
		if (getX() + getWidth() >= al.getX() && getX() <= al.getX() + al.getWidth() && getY() >= al.getY() && getY() <= al.getY() + al.getHeight()) {
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
