package MealGame;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Meals{
	
	private static ArrayList<Integer> food = new ArrayList<Integer>();
	private int mealsDone = 0;
	
	public static void main(String args[]) {
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
		food.set(i, food.get(i)-1);
	}
	
	public void removeFirstFive() {
		for(int i=0; i<5; i++) {
			food.remove(i);
		}
		mealsDone++;
	}
	
	public int getMealsDone() {
		return mealsDone;
	}
	
	public String toString() {
		return "Meal requires: " + food.get(0) + "" + food.get(1) + "" + food.get(2) + "" + food.get(3) + "" + food.get(4) + "";
	}
	
}