package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Caylin Canoy

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   setNumber(0);
   }
   public Perfect(int num) {
	   setNumber(num);
   }

	//add a set method
   public void setNumber(int num) {
	   number = num;
   }

	public boolean isPerfect()
	{
		int i =1;
		int sum = 0;
		while(i<number) {
			if(number%i ==0) {
				sum+=i;
			}
			i++;
		}
		if(sum == number)
			return true;
		return false;
	}

	//add a toString
	public String toString() {
		if(isPerfect() == true) {
			return number + " is perfect.\n";
		} else {
			return number + " is not perfect.\n";
		}
	}
	
}