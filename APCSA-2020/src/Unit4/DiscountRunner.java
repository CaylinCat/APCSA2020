package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Caylin Canoy
//Date - Feb
//Class - APCSA
//Lab  - DiscountRunner

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Test Data
		
		//Data: 500
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		double dis = Discount.getDiscountedBill(amt);
		System.out.println("Bill after discount :: " + String.format("%.2f", dis) + "\n");
		
		//Data: 2500
		out.print("Enter the original bill amount :: ");
		double amt1 = keyboard.nextDouble();
		double dis1 = Discount.getDiscountedBill(amt1);
		System.out.println("Bill after discount :: " + String.format("%.2f", dis1) + "\n");
		
		//Data: 4000
		out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		double dis2 = Discount.getDiscountedBill(amt2);
		System.out.println("Bill after discount :: " + String.format("%.2f", dis2) + "\n");
		
		//Data: 333.33
		out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		double dis3 = Discount.getDiscountedBill(amt3);
		System.out.println("Bill after discount :: " + String.format("%.2f", dis3) + "\n");
		
		//Data: 95874.2154
		out.print("Enter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		double dis4 = Discount.getDiscountedBill(amt4);
		System.out.println("Bill after discount :: " + String.format("%.2f", dis4) + "\n");
		

	}
}