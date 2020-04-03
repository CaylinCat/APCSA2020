package QuarterThreeLabAssessment;

import static java.lang.System.in;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Main{
	public static void main(String args[]) throws FileNotFoundException {
		System.out.println("Hey guys welcome to the sandwhich store simulation!! \n");
		Scanner testy = new Scanner(new File("src/QuarterThreeLabAssessment/sandwhiches.dat"));
		String storeName = testy.nextLine();
		int numSandwhich = testy.nextInt();
		testy.nextLine();
		
		Store testyStore = new Store(storeName);
		
		for(int i=0; i<numSandwhich; i++){
			String sandwhichName = testy.nextLine();
			String ingredients = testy.nextLine();			
			testyStore.addSandwhich(new Sandwhich(sandwhichName, ingredients));
		} 
		
		System.out.println(testyStore);
		System.out.println("Oops! Sorry good customer those weren't sorted by cost :( here~~ \n");
		testyStore.sortSandwhichByCost();
		System.out.println(testyStore);
		System.out.println("Don't know what to try? Our experts reccomend: " + testyStore.bestStarRating());
		Sandwhich cheapest = testyStore.cheapestSandwhich();
		System.out.println("Feeling short on money? Try our cheapest sandwhich: " + cheapest.getName() +
				" priced only at $" + cheapest.salePrice(0.2));
		System.out.println("If you are feeling like making your own sandwhich, it may be the right way to go with " +
				cheapest.getName() + " since it costs only $" + cheapest.cost() + " to make \nand has a star rating of "
				+ cheapest.starRating() + " stars!"); 
		System.out.println("Do we have a 5 dollar sandwhich??");
		if(testyStore.binarySearch(5, 0, 4) == -1)
			System.out.println("Nope :(");
		else
			System.out.println("Yes!");
		
		//System.out.println(testyStore.sandwhichInHouse("Grilled Cheese"));
		
		Scanner keyboard = new Scanner(in);
		System.out.println("\nNow good sir, what sandwhich would you like?");
		String sandy = keyboard.nextLine();
		if(testyStore.sandwhichInHouse(sandy)) {
			System.out.println("Great that will be $" + testyStore.findMe(sandy).cost());
		} else {
			System.out.println("I'm sorry we don't carry that here :(");
		}
		testy.close();
	}
}