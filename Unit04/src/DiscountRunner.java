//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ernest Ibarolle
//Date - 1/20/22
//Class - AP Computer Science A
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amtOne = keyboard.nextDouble();
		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amtOne));

		out.print("Enter the original bill amount :: ");
		double amtTwo = keyboard.nextDouble();
		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amtTwo));

		out.print("Enter the original bill amount :: ");
		double amtThree = keyboard.nextDouble();
		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amtThree));

		out.print("Enter the original bill amount :: ");
		double amtFour = keyboard.nextDouble();
		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amtFour));

		out.print("Enter the original bill amount :: ");
		double amtFive = keyboard.nextDouble();
		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amtFive));
	}
}