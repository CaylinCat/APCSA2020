package MealGame;

import java.awt.Graphics;

public class Compost extends Thing{
	public Compost() {
		super(20,20,20,20,"");
	}
	
	public Compost(int x, int y, int w, int h, String s) {
		super(x,y,w,h,s);
	}
	
	public void draw( Graphics window ){
		super.draw(window);
	}
}