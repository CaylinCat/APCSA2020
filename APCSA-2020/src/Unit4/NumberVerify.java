package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Caylin Canoy
//Date -  Feb
//Class - APCSA
//Lab  - NumberVerify

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if(Math.abs(num) % 2 == 1)
		return true;
		else
		return false;
	}
	public static boolean isEven( int num )
	{
		if(Math.abs(num) % 2 == 0)
		return true;
		else
		return false;
	}	
}