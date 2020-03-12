package DataLab;
import java.util.*;

public class Cereal{
	String name;
	char type;
	int calories, protein, fat, sodium, sugar, potassium, vitamins, shelf;
	double fiber, carbohydrates, weight, cups, rating;
	
	public Cereal(){
		setCereal("uwu", 'u', 1, 1, 1, 1, 1, 1, 1, 1, 2.0, 2.0, 2.0, 2.0, 2.0);
	}
	public Cereal(String name, char type, int calories, int protein, int fat, int sodium, int sugar, int potassium, int vitamins, int shelf, 
			double fiber, double carbohydrates, double weight, double cups, double rating) {
		setCereal(name, type, calories, protein, fat, sodium, sugar, potassium, vitamins, shelf, fiber, carbohydrates, weight, cups, rating);
	}
	
	//setters
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
	public void setName(String name) {
		this.name = name;
	}
	public void setType(char type) {
		this.type = type;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public void setProtein(int protein) {
		this.protein = protein;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public void setSodium(int sodium) {
		this.sodium = sodium;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setPotassium(int potassium) {
		this.potassium = potassium;
	}
	public void setVitamins(int vitamins) {
		this.vitamins = vitamins;
	}
	public void setShelf(int shelf) {
		this.shelf = shelf;
	}
	public void setFiber(double fiber) {
		this.fiber = fiber;
	}
	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setCups(double cups) {
		this.cups = cups;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public char getType() {
		return type;
	}
	public int getCalories() {
		return calories;
	}
	public int getProtein() {
		return protein;
	}
	public int getFat() {
		return fat;
	}
	public int getSodium() {
		return sodium;
	}
	public int getSugar() {
		return sugar;
	}
	public int getPotassium() {
		return potassium;
	}
	public int getVitamins() {
		return vitamins;
	}
	public int getShelf() {
		return shelf;
	}
	public double getFiber() {
		return fiber;
	}
	public double getCarbohydrates() {
		return carbohydrates;
	}
	public double getWeight() {
		return weight;
	}
	public double getCups() {
		return cups;
	}
	public double getRating() {
		return rating;
	}
	
	public String toString() {
		return name + ": Type: " + type + ", Calories: " + calories + ", Protein: " + protein + ", Fat: " + fat + ", Sodium: " + sodium + ", Sugar: " + 
	sugar + ", Potassium: " + potassium + ", Vitamins: " + vitamins + ", Shelf: " + shelf + ", Fiber: " + fiber + ", Carbs: " + carbohydrates + 
	", Weight: " + weight + ", Cups: " + cups + ", Rating: " + rating;
	}
	
	public static void main(String args[]) {
		Cereal boo = new Cereal();
		System.out.println(boo);
		boo.setCereal("uwu", 'c', 6, 3, 6, 1, 6, 4, 2, 6, 4.6, 1.2, 6.4, 71.7, 583985.55);
		System.out.println(boo);
	}
	
}

