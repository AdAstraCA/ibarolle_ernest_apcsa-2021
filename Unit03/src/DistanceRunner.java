//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter X1 :: ");
		int X1First = keyboard.nextInt();

		out.print("Enter Y1 :: ");
		int Y1First = keyboard.nextInt();

		out.print("Enter the X2 :: ");
		int X2First = keyboard.nextInt();
		
		out.print("Enter the Y2 :: ");
		int Y2First = keyboard.nextInt();

		Distance testOne = new Distance(X1First, Y1First, X2First, Y2First);
		testOne.calcDistance();
		testOne.print();
		
		out.print("Enter X1 :: ");
		int X1Second = keyboard.nextInt();

		out.print("Enter Y1 :: ");
		int Y1Second = keyboard.nextInt();

		out.print("Enter X2 :: ");
		int X2Second = keyboard.nextInt();
		
		out.print("Enter Y2 :: ");
		int Y2Second = keyboard.nextInt();

		Distance testTwo = new Distance(X1Second, Y1Second, X2Second, Y2Second);
		testTwo.calcDistance();
		testTwo.print();
	}
}