package MealGame;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import StarShip.Alien;
import StarShip.Ship;

public class FallingIngredients{
	private List<Ingredient> ingre;
	private int size;
	private int owo=1;
	private int prev;
	private int numDead=0;

	public FallingIngredients(int size)
	{
		ingre = new ArrayList<Ingredient>(size);
		this.size = size;
	}

	public void add(Ingredient in)
	{
		ingre.add(in);
	}
	public void removeIngredient(Ingredient hi) {
		ingre.remove(hi);
	}
	
	public void fillIt(int x, int y, int w, int h, int ySpd, String s, String n, String t) {
		int nX = x;
		for (int i = 0; i < size; i++) {
			ingre.add(new Ingredient(nX, y, w, h, ySpd, s, n, t));
			nX+=100;
		}
	}
	
	public void drawEmAll( Graphics window ) {
		for(Ingredient hi : ingre) {
			hi.draw(window);
		}
	}
	
	public void moveEmAll(boolean down) {
		
	}
	
	public void removeIngredients(Player player) {
		for(int i=0; i<ingre.size(); i++) {
			if (player.didCollide(ingre.get(i))) {
				ingre.remove(i);
			}
		}
	}
}