//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ernest Ibarolle
//Date - 1/20/22
//Class - AP Computer Science A
//Lab  - OddOrEven

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		//add in more test cases
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a whole number :: ");
		int inputOne = keyboard.nextInt();
		System.out.println(inputOne + " is odd :: " + NumberVerify.isOdd(inputOne));
		System.out.println(inputOne + " is even :: " + NumberVerify.isEven(inputOne));
		System.out.print("Enter a whole number :: ");
		int inputTwo = keyboard.nextInt();
		System.out.println(inputTwo + " is odd :: " + NumberVerify.isOdd(inputTwo));
		System.out.println(inputTwo + " is even :: " + NumberVerify.isEven(inputTwo));
		System.out.print("Enter a whole number :: ");
		int inputThree = keyboard.nextInt();
		System.out.println(inputThree + " is odd :: " + NumberVerify.isOdd(inputThree));
		System.out.println(inputThree + " is even :: " + NumberVerify.isEven(inputThree));
		System.out.print("Enter a whole number :: ");
		int inputFour = keyboard.nextInt();
		System.out.println(inputFour + " is odd :: " + NumberVerify.isOdd(inputFour));
		System.out.println(inputFour + " is even :: " + NumberVerify.isEven(inputFour));
		System.out.print("Enter a whole number :: ");
		int inputFive = keyboard.nextInt();
		System.out.println(inputFive + " is odd :: " + NumberVerify.isOdd(inputFive));
		System.out.println(inputFive + " is even :: " + NumberVerify.isEven(inputFive));
	}
}