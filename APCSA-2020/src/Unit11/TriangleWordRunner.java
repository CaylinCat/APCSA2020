package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		String sample = "y";
		
		Scanner testy = new Scanner(System.in);
		
		while(sample.equals("y")) {
			System.out.print("Enter a word :: ");
			String input = testy.next();
			TriangleWord.printTriangle(input);
			System.out.print("\nDo you want to enter more sample input? ");
			sample = testy.next();
			System.out.println("");
		}
	}
}