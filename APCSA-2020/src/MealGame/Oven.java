package MealGame;

import java.awt.Graphics;

public class Oven extends Thing{
	
	public Oven() {
		super(20,20,20,20,"");
	}
	
	public Oven(int x, int y, int w, int h, String s) {
		super(x,y,w,h,s);
	}
	
	public void draw( Graphics window ){
		super.draw(window);
	}
}