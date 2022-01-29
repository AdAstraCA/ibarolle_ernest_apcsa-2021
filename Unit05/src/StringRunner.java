//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ernest Ibarolle
//Date - 1/21/22
//Class - AP Computer Science A
//Lab  - StringOddOrEven

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("Enter a word :: ");
	    String wordOne = keyboard.next();
	    StringOddOrEven oddEvenOne = new StringOddOrEven(wordOne);
	    oddEvenOne.isEven();
	    System.out.println(oddEvenOne.toString());
	    System.out.print("Enter a word :: ");
	    String wordTwo = keyboard.next();
	    StringOddOrEven oddEvenTwo = new StringOddOrEven(wordTwo);
	    oddEvenTwo.isEven();
	    System.out.println(oddEvenTwo.toString());
	    System.out.print("Enter a word :: ");
	    String wordThree = keyboard.next();
	    StringOddOrEven oddEvenThree = new StringOddOrEven(wordThree);
	    oddEvenThree.isEven();
	    System.out.println(oddEvenThree.toString());
	}
}