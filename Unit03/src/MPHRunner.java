//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int distOne = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrsOne = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int minsOne = keyboard.nextInt();

		MilesPerHour testOne = new MilesPerHour(distOne, hrsOne, minsOne);
		testOne.calcMPH();
		testOne.print();
		
		out.print("Enter the distance :: ");
		int distTwo = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrsTwo = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int minsTwo = keyboard.nextInt();

		MilesPerHour testTwo = new MilesPerHour(distTwo, hrsTwo, minsTwo);
		testTwo.calcMPH();
		testTwo.print();
		
		out.print("Enter the distance :: ");
		int distThree = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrsThree = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int minsThree = keyboard.nextInt();

		MilesPerHour testThree = new MilesPerHour(distThree, hrsThree, minsThree);
		testThree.calcMPH();
		testThree.print();
	}
}