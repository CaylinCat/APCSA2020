package MealGame;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Meals{
	
	private static ArrayList<Integer> food = new ArrayList<Integer>();
	private int mealsDone = 0;
	private int score = 0;
	
	public Meals() {
	    try {
	      Scanner input = new Scanner(new File("src/MealGame/foodItems.txt"));
	      while(input.hasNext()){
	    	int num = input.nextInt();
	    	//System.out.println(num);
	        food.add(num);
	      }
	      input.close();
	    }
	    catch(Exception e){
	      System.out.println("Error reading or parsing foodItems.txt");
	    }
	    
	}
	
	public Integer getNum(int i) {
		return food.get(i);
	}
	
	public void setNum(int i, int f) {
		food.set(i, f);
	}
	
	public void removeOne(int i) {
		if(food.get(i) > 0)
			food.set(i, food.get(i)-1);
	}
	
	public void removeFirstFive() {
		for(int i=0; i<6; i++) {
			food.remove(0);
		}
		mealsDone++;
	}
	
	public int getMealsDone() {
		return mealsDone;
	}
	
	public void updateScore() {
		score += food.get(5);
	}
	
	public int getScore() {
		return score;
	}
	
	public String toString() {
		return "Meal requires: " + food.get(0) + " vegetables, " + food.get(1) + " grains, \n" + food.get(2) + " fruits, " + food.get(3) + 
				" protein, and " + food.get(4) + " dairy.";
	}
	
	public String scoreString() {
		return "Score: " + getScore();
	}
	
}