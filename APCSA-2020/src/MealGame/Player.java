package MealGame;

import java.awt.Graphics;

import StarShip.Alien;

public class Player extends MoveThing{
	
	private String ingredientType, ingredientName;
	private boolean hasIngredient = false;
	
	public Player(){
		super(20,20,20,20,"",2,2);
	}
	
	public Player(int x, int y, String s, int w, int h, int xSpd) {
		super(x,y,w,h,s,xSpd);
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
			ingredientName = in.getName();
			hasIngredient = true;
			return true;
		}
		return false;
	}
	
	public boolean didCollideOvenWithIngredient(Oven oh, Meals meal) {
		if (getX() + getW() >= oh.getX() && getX() <= oh.getX() + oh.getW() && getY() >= oh.getY() && getY() <= oh.getY() + oh.getH()) {
			if(hasIngredient) {
				if(ingredientType.equals("vegetable"))
					meal.removeOne(0);
				else if(ingredientType.equals("grain"))
					meal.removeOne(1);
				else if(ingredientType.equals("fruit"))
					meal.removeOne(1);
				else if(ingredientType.equals("protein"))
					meal.removeOne(1);
				else if(ingredientType.equals("dairy"))
					meal.removeOne(1);
				else
					System.out.println("wtf do u eat alien food or smth?");
				return true;
			}
		}
		System.out.println("No gredient");
		return false;
	}
	
	public boolean didCollideComWithIngredient(Compost co, FallingIngredients fal) {
		if (getX() + getW() >= co.getX() && getX() <= co.getX() + co.getW() && getY() >= co.getY() && getY() <= co.getY() + co.getH()) {
			if(hasIngredient) {
				fal.removeIngredient(ingredientName);
				return true;
			}
		}
		return false;
	}
}