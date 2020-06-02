package MealGame;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import StarShip.Alien;

public class FallingIngredients{
	private List<Ingredient> ingre;
	private int size;
	private int nm = 1;

	public FallingIngredients(int size)
	{
		ingre = new ArrayList<Ingredient>(size);
		this.size = size;
	}

	public void add(Ingredient in) {
		ingre.add(in);
	}
	public void add(int x, int y, int w, int h, int ySpd, String s, String n, String t) {
		ingre.add(new Ingredient(x, y, w, h, ySpd, s, n, t));
	}
	
	public void removeIngredient(Ingredient hi) {
		ingre.remove(hi);
	}
	public void removeIngredient(String name) {
		for(int i=0; i<ingre.size(); i++) {
			if(ingre.get(i).getName().equals(name))
				ingre.remove(i);
		}
	}
	
	public void fillIt(int x, int y, int w, int h, int ySpd, String s, String n, String t) {
		int nX = x;
		for (int i = 0; i < size; i++) {
			ingre.add(new Ingredient(nX, y, w, h, ySpd, s, n + nm, t));
			nX+=200;
			nm++;
		}
	}
	
	public void drawEmAll( Graphics window ) {
		for(Ingredient hi : ingre) {
			hi.draw(window);
		}
	}
	
	public void moveEmAll(boolean down) {
		for(Ingredient hi: ingre) {
			hi.move("DOWN");
		}
	}
	
	public List<Ingredient> getIngredients(){
		return ingre;
	}
	
	public void removeIngredients(Player player) {
		for(int i=0; i<ingre.size(); i++) {
			if (!player.hasIngredient()) {
				if (player.didCollide(ingre.get(i))) {
					ingre.remove(i);
				}
			}
		}
	}
	
	public void removeBottonIngredients(Meals meal, MessageBoard board) {
		for(int i=0; i<ingre.size(); i++) {
			if(ingre.get(i).getY() == 640) {
				ingre.remove(i);
				if(meal.getScore()>=5)
					meal.minusScore(5);
				board.changeMessage("Try not to litter!! D: D: D: D:");
			}
		}
	}
}