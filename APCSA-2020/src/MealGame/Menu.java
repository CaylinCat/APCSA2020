package MealGame;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Menu{
	
	private static HashMap<String, Double> food = new HashMap<String, Double>();
	
	static{
	    try {
	      Scanner input = new Scanner(new File("src/MealGame/foodItems.txt"));
	      while(input.hasNextLine()){
	        String[] temp = input.nextLine().split(",");
	        food.put(temp[0],Double.parseDouble(temp[1]));
	        //System.out.println("added "+ temp[0]+", "+temp[1]);
	      }
	      input.close();
	    }
	    catch(Exception e){
	      System.out.println("Error reading or parsing foodItems.txt");
	    }
	}
	
}