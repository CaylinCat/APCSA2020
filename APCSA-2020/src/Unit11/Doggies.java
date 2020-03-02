package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.*;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		String oldestName = "";
		int oldestAge = 0;
		for(Dog tisDog : pups) {
			if(tisDog.getAge() > oldestAge) {
				oldestName = tisDog.getName();
				oldestAge = tisDog.getAge();
			}
		}
		return oldestName;
	}

	public String getNameOfYoungest()
	{
		String youngestName = "";
		int age = pups[0].getAge();
		for(Dog tisDog : pups) {
			if(tisDog.getAge() < age)
				youngestName = tisDog.getName();
		}
		return youngestName;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}