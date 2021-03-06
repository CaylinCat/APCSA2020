package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Caylin Canoy
//Date - 2/5/20
//Class - APCSA
//Lab  - DistanceRunner

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{

		Scanner keyboard = new Scanner(in);
		
		//ask for user input 1 1 2 1
		out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();

		out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();

		out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		
		out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();

		Distance test = new Distance(x1, y1, x2, y2);
		test.calcDistance();
		System.out.println(test);
		
		//ask for user input 1 1 -2 2
		out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();

		out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();

		out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		
		out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();

		Distance testo = new Distance(x1, y1, x2, y2);
		testo.calcDistance();
		System.out.println(testo);
		
		//ask for user input 1 1 0 0
		out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();

		out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();

		out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		
		out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();

		Distance testy = new Distance(x1, y1, x2, y2);
		testy.calcDistance();
		System.out.println(testy);
			
		//add additional test cases (same test cases xd)
		System.out.println("\nTest Cases of Sample Data: ");
		Distance test1 = new Distance(1, 1, 2, 1);
		test1.calcDistance();
		System.out.println(test1);
		Distance test2 = new Distance(1, 1, -2, 2);
		test2.calcDistance();
		System.out.println(test2);
		Distance test3 = new Distance(1, 1, 0, 0);
		test3.calcDistance();
		System.out.println(test3);
	}
}
