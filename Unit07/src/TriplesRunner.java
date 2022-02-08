//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Ernest Ibarolle

import static java.lang.System.*;
import java.util.*;

public class TriplesRunner
{
	public static void main(String args[])
	{
		System.out.println("Enter the maximum triple number.");
		Scanner keyboard = new Scanner(System.in);
		int maxNumber = keyboard.nextInt();
		Triples allTriples = new Triples(maxNumber);
		System.out.println(allTriples.toString());
		keyboard.close();
	}
}