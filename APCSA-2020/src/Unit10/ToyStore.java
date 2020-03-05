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
			toyList.add(singleToy);
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy hi : toyList){
			if(hi.getname().equals(nm))
				return hi;
		}
		return "";
  	}
  
  	public String getMostFrequentToy()
  	{
		int count = 0;
		int greatestCount = 0;
		String freq = "";
  		for(Toy hi : toyList){
			for(int i=0; i<toyList.size(); i++){
				if(hi.getname()equals(nm))
					count++;
			}
			if(count > greatestCount)
				greatestCount = count;
				freq = hi.getname();
		}
		return freq;
  	}  
  
  	public void sortToysByCount()
  	{
		int count = 0;
		ArrayList<Integer> index = new ArrayList<Integer>();
		ArrayList<Toy> newBox = new ArrayList<Toy>();
		String freq = "";
  		for(Toy hi : toyList){
			for(int i=0; i<toyList.size(); i++){
				if(hi.getname()equals(nm))
					count++;
			}
			freq = hi.getname();
			if(index.size()==0)
				newBox.add(freq);
				index.add(count);
			if(index.size()>0){
				for(int i=0; i<newBox.size(); i++){
					if(count > index.get(i))
						newBox.add(freq,i+1);
					else if (count < index.get(i))
						newBox.add(freq, 0);
				}
			}
		}
		for(int i=0; i<toyBox.size(); i++){
			toyList.get() = newBox.get();
		}
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}
