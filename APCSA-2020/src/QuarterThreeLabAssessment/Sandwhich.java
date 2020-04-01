package QuarterThreeLabAssessment;
import java.util.*;

public class Sandwhich{
	
	private String sandwhichName;
	private ArrayList<Ingredient> ingredients;
	
	public Sandwhich() {
		ingredients = new ArrayList<Ingredient>();
		sandwhichName = "";
	}
	
	public Sandwhich(String n, String c) {
		setIngredients(c);
		setName(n);
	}
	
	public void setIngredients(String c) {
		Scanner scan = new Scanner(c);
		int numingredients = scan.nextInt();
		for (int i = 0; i < numingredients; i++) {
			ingredients.add(new Ingredient(scan.next(),scan.nextDouble(),scan.nextInt()));
		}
	}
	
	public void setIngredient(int place, String n, double c, int r) {
		ingredients.set(place, new Ingredient(n,c,r));
	}
	public void setName(String name) {
		sandwhichName = name;
	}
	public String getName() {
		return sandwhichName;
	}
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}
	
	public int getNumIngredients() {
		return ingredients.size();
	}
	
	public String cheapestIngredient() {
		double cheapest = ingredients.get(0).getCost();
		String cheapName = ingredients.get(0).getName();
		for(Ingredient hi : ingredients) {
			if (hi.getCost() < cheapest) {
				cheapest = hi.getCost();
				cheapName = hi.getName();
			}
		}
		return cheapName;
	}
	
	public double averageIngredientCost() {
		double avg = 0;
		for(Ingredient hi : ingredients) {
			avg += hi.getCost();
		}
		avg = avg/ingredients.size();
		return avg;
	}
	
	public double starRating() {
		double rating = 0;
		for(Ingredient hi : ingredients) {
			rating += hi.getRating();
		}
		rating = rating/ingredients.size();
		return rating;
	}
	
	public double salePrice(double profit) {
		double sale = 0;
		for(Ingredient hi: ingredients) {
			sale += hi.getCost()*(1+profit);
		}
		return sale;
	}
	
	public double cost() {
		double cost = 0;
		for(Ingredient hi: ingredients) {
			cost += hi.getCost();
		}
		return cost;
	}

	public boolean hasIngredient(String uwu) {
		for(Ingredient hi : ingredients) {
			if (hi.getName().equals(uwu))
				return true;
		}
		return false;
	}
	
	public String toString() {
		String output = sandwhichName + "\n";
		for(Ingredient ingre:ingredients) {
			output += ingre.getName() + " ";
		}
		return output;
	}
	
}