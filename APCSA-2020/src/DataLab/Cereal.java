package DataLab;
import java.util.*;

public class Cereal{
	String name;
	char type;
	int calories, protein, fat, sodium, sugar, potassium, vitamins, shelf;
	double fiber, carbohydrates, weight, cups, rating;
	
	public Cereal(){
		
	}
	public Cereal(String name, char type, int calories, int protein, int fat, int sodium, int sugar, int potassium, int vitamins, int shelf, 
			double fiber, double carbohydrates, double weight, double cups, double rating) {
		
	}
	public void setCereal(String name, char type, int calories, int protein, int fat, int sodium, int sugar, int potassium, int vitamins, int shelf, 
			double fiber, double carbohydrates, double weight, double cups, double rating) {
		this.name = name;
		this.type = type;
		this.calories = calories;
		this.protein = protein;
		this.fat = fat;
		this.sodium = sodium;
		this.sugar = sugar;
		this.potassium = potassium;
		this.vitamins = vitamins;
		this.shelf = shelf;
		this.fiber = fiber;
		this.carbohydrates = carbohydrates;
		this.weight = weight;
		this.cups = cups;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public char getType() {
		return type;
	}
	public int getCalories() {
		return calories;
	}
	
}