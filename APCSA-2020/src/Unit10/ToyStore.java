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
		String singleToy = "";
		String toyss = toys;
		System.out.println(toyss);
		while(toyss.indexOf(" ") > -1){
			singleToy = toyss.substring(0,toyss.indexOf(" "));
			//System.out.println(singleToy);
			toyList.add(new Toy(singleToy));
			if(toyss.indexOf(" ") > -1)
				toyss = toyss.substring(toyss.indexOf(" ")+1);
			else
				toyss = "";
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
  			if(hi.getCount() > maxInt)
  				maxName = hi.getName();
  		}
  		return maxName;
  	}  
  
  	public void sortToysByCount()
  	{
		int count = 0;
		ArrayList<Toy> newBox = new ArrayList<Toy>();
		ArrayList<Toy> newSortedBox = new ArrayList<Toy>();
		String freq = "";
		//reducing toyList into newBox to contain the string, count
  		for(int i=0; i<toyList.size(); i++){
  			System.out.println(newBox);
			if (newBox.indexOf(toyList.get(i)) == -1) {
				newBox.add(toyList.get(i));
			} else if (newBox.indexOf(toyList.get(i)) > -1) {
				newBox.get(newBox.indexOf(toyList.get(i))).setCount(newBox.get(newBox.indexOf(toyList.get(i))).getCount() + 1);
			}
		}
  		//copying newBox to a newSortedBox
  		for(Toy hi : newBox) {
  			newSortedBox.add(hi);
  		}
  		//sorting the Box
  		for(Toy hi : newBox) {
			for(int i=0; i<newBox.size(); i++){
				if(hi.getCount() <= newBox.get(i).getCount())
					newSortedBox.set(i, newBox.get(i));
			}
  		}
  		for(int i=0; i<toyList.size(); i++) {
  			toyList.remove(i);
  		}
  	}  
  	  
	public String toString()
	{
		String stringy = "";
		for(Toy hi : toyList) {
			stringy = stringy + hi.getName() + " " + hi.getCount() + " ";
		}
	   return stringy;
	}
}
