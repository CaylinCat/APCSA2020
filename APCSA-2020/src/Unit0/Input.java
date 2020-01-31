package Unit0;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		
		enter("double");
		doubleOne = keyboard.nextDouble();
		enter("double");
		doubleTwo = keyboard.nextDouble();
		
		enter("float");
		floatOne = keyboard.nextFloat();
		enter("float");
		floatTwo = keyboard.nextFloat();
		
		enter("short");
		shortOne = keyboard.nextShort();
		enter("short");
		shortTwo = keyboard.nextShort();
		
		

	
		//add in input for all variables


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
		

		//add in output for all variables


	}
	public static void enter(String i) {
		System.out.print("Enter a " + i + " :: ");
	}
}