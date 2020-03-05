package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		String singleToy = "";
		String toyss = toys;
		while(toyss.indexOf(" ") > -1){
			singleToy = toyss.substring(0,toyss.indexOf(" "));
			toyss = toyss.substring(toyss.indexOf(" "));
			toyList.add(new Toy(singleToy));
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy hi : toyList){
			if(hi.getName().equals(nm))
				return hi;
		}
		return new Toy();
  	}
  
  	public String getMostFrequentToy()
  	{
		int count = 0;
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
		return freq;
  	}  
  
  	public void sortToysByCount()
  	{
		int count = 0;
		ArrayList<Toy> newBox = new ArrayList<Toy>();
		ArrayList<Toy> newSortedBox = new ArrayList<Toy>();
		String freq = "";
  		for(Toy hi : toyList){
			if (newBox.indexOf(hi) == -1) {
				newBox.add(hi);
			} else if (newBox.indexOf(hi) > -1) {
				newBox.get(newBox.indexOf(hi)).setCount(newBox.get(newBox.indexOf(hi)).getCount() + 1);
			}
		}
  		for(Toy hi : newBox) {
  			newSortedBox.add(hi);
  		}
		for(int i=0; i<newBox.size(); i++){
			if(newBox.get(i).getCount() < newBox.get(i+1).getCount())
				newSortedBox.set(i, newBox.get(i));
		}
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}
