package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Caylin Canoy
//Date - 2/5/20
//Class - APCSA
//Lab  - MPHRunner

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		//ask for user input 45 0 32
		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		//ask for user input 96 1 43
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		MilesPerHour testo = new MilesPerHour(dist, hrs, mins);
		testo.calcMPH();
		testo.print();
		
		//ask for user input 100 2 25
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		MilesPerHour testy = new MilesPerHour(dist, hrs, mins);
		testy.calcMPH();
		testy.print();
		
		//ask for user input 50 2 25
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		MilesPerHour testu = new MilesPerHour(dist, hrs, mins);
		testu.calcMPH();
		testu.print();
		
		//add more test cases
		System.out.println("\nTest Cases of Sample Data: ");
		MilesPerHour test1 = new MilesPerHour(45, 0, 32);
		test1.calcMPH();
		test1.print();
		MilesPerHour test2 = new MilesPerHour(96, 1, 43);
		test2.calcMPH();
		test2.print();
		MilesPerHour test3 = new MilesPerHour(100, 2, 25);
		test3.calcMPH();
		test3.print();
		MilesPerHour test4 = new MilesPerHour(50, 2, 25);
		test4.calcMPH();
		test4.print();
		
		
	}
}