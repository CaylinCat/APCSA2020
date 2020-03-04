package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		int size = word.length();
		String printWord = "";
		for(int i=1; i<=size; i++) {
			for(int j=1; j<=i; j++) {
				printWord = word.substring(0,i);
				System.out.print(printWord);
			}
			System.out.println("");
		}
	}
}