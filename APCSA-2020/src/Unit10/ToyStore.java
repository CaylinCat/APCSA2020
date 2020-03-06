package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		//String singleToy = "";
		//String toyss = toys;
		
		for(String singleToy : toys.split(" ")){
			//singleToy = toyss.substring(0,toyss.indexOf(" "));
			Toy boi = getThatToy(singleToy);
				//System.out.println(singleToy);
			if(boi == null)
				toyList.add(new Toy(singleToy));
			else
				boi.setCount(boi.getCount()+1);
		}
	        //System.out.println(toyList);
	}
  
	public Toy getThatToy( String nm )
	{
	    	for(Toy hi : toyList){
	    		if(hi.getName().equals(nm))
	     			return hi;
	  	}
	 	return null;
	}

	public String getMostFrequentToy()
	{
		/*int count = 0;
		int greatestCount = 0;
		String freq = "";
	 	for(Toy hi : toyList){
	    	for(int i=0; i<toyList.size(); i++){
	      	if(hi.getName().equals(freq))
			count++;
	    	}
	    	if(count > greatestCount)
	      		greatestCount = count;
	    	freq = hi.getName();
	  	}
	  	return freq; */
	    	String maxName = "";
	    	int maxInt = 0;
	    	for(Toy hi : toyList) {
	      		if(hi.getCount() > maxInt){
				maxName = hi.getName();
				maxInt = hi.getCount();
	      		}
	    	}
	    	return maxName;
	  }  

	  public void sortToysByCount()
	  {
	  	int size = toyList.size();
	  	ArrayList<Toy> newBox = new ArrayList<Toy>();
	  	//Toy testy = new Toy();

	  	//sorting the Box

	  	for(int i=0; i<size; i++){
	      		Toy me = getThatToy(getMostFrequentToy());
	      		//me.setCount(ge);
	      		newBox.add(me);
	     		toyList.remove(me);
	    	}
	    	toyList = newBox;
	  }  
  	  
	public String toString()
	{
	 	return toyList + "\nmax == " + getMostFrequentToy();
	}
}
