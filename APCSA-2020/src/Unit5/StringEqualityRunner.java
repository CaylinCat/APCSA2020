package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Caylin Canoy
//Date - Feb. sometime
//Class - APCSA
//Lab  - String Equality Runner!

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		//all test cases added below
		StringEquality hi = new StringEquality("hello", "goodbye");
		System.out.println(hi);
		hi.setWords("one", "two");
		System.out.println(hi);
		hi.setWords("three", "four");
		System.out.println(hi);
		hi.setWords("TCEA", "UIL");
		System.out.println(hi);
		hi.setWords("State", "Champions");
		System.out.println(hi);
		hi.setWords("ABC", "ABC");
		System.out.println(hi);
		hi.setWords("ABC", "CBA");
		System.out.println(hi);
		hi.setWords("Same", "Same");
		System.out.println(hi);

		
	}
}