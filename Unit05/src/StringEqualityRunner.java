//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ernest Ibarolle
//Date - 1/28/22
//Class - AP Computer Science A
//Lab  - String Equality

import static java.lang.System.*;
import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
	    Scanner keyboard = new Scanner(System.in);
	    String one = keyboard.next();
	    String two = keyboard.next();
	    StringEquality compareOne = new StringEquality(one, two);
	    System.out.println(compareOne.toString());
	    String three = keyboard.next();
	    String four = keyboard.next();
	    StringEquality compareTwo = new StringEquality(three, four);
	    System.out.println(compareTwo.toString());
	    String five = keyboard.next();
	    String six = keyboard.next();
	    StringEquality compareThree = new StringEquality(five, six);
	    System.out.println(compareThree.toString());
	}
}