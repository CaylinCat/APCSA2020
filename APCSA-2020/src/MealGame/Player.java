package MealGame;

import java.awt.Graphics;

import StarShip.Alien;

public class Player extends MoveThing{
	
	private String ingredientType;
	private boolean hasIngredient = false;
	
	public Player(){
		super(20,20,20,20,"",2,2);
	}
	
	public Player(int x, int y, String s, int w, int h, int xSpd, int ySpd) {
		super(x,y,w,h,s,xSpd,ySpd);
	}
	
	public void draw(Graphics window) {
		super.draw(window);
	}
	
	public void move(String d) {
		super.move(d);
	}
	
	public boolean hasIngredient() {
		return hasIngredient;
	}
	
	public boolean didCollide(Ingredient in) {
		if (getX() + getW() >= in.getX() && getX() <= in.getX() + in.getW() && getY() >= in.getY() && getY() <= in.getY() + in.getH()) {
			ingredientType = in.getType();
			hasIngredient = true;
			return true;
		}
		return false;
	}
	
	public boolean didCollideOvenWithIngredient(Oven oh) {
		if (getX() + getW() >= oh.getX() && getX() <= oh.getX() + oh.getW() && getY() >= oh.getY() && getY() <= oh.getY() + oh.getH()) {
			if(hasIngredient) {
				//stuff
				return true;
			}
		}
		return false;
	}
	
	public boolean didCollideComWithIngredient(Compost co) {
		if (getX() + getW() >= co.getX() && getX() <= co.getX() + co.getW() && getY() >= co.getY() && getY() <= co.getY() + co.getH()) {
			if(hasIngredient) {
				//stuff
				return true;
			}
		}
		return false;
	}
}