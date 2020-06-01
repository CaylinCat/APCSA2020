package MealGame;

import java.awt.Graphics;

public class MoveThing extends Thing{
	
	private int xSpd, ySpd;
	
	public MoveThing() {
		super(20,20,20,20,"");
		xSpd = 2;
		ySpd = 2;
	}
	public MoveThing(int x, int y, int w, int h, String s, int xSpd) {
		super(x,y,w,h,s);
		this.xSpd = xSpd;
	}
	public MoveThing(int x, int y, int w, int h, int ySpd, String s) {
		super(x,y,w,h,s);
		this.ySpd = ySpd;
	}
	public MoveThing(int x, int y, int w, int h, String s, int xSpd, int ySpd) {
		super(x,y,w,h,s);
		this.xSpd = xSpd;
		this.ySpd = ySpd;
	}
	
	public void draw( Graphics window ){
		super.draw(window);
	}
	
	public void move(String direction)
	{
		//add code here
		if(direction.equals("RIGHT"))
			setX(getX() + xSpd);
			
		if(direction.equals("LEFT"))
			setX(getX() - xSpd);

		if(direction.equals("UP"))
			setY(getY() - ySpd);
		
		if(direction.equals("DOWN"))
			setY(getY() + ySpd);
	}
	
}