//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Ernest Ibarolle

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble runOne = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println("biggest = " + runOne.getBiggest() + "\n");
		BiggestDouble runTwo = new BiggestDouble(14.51,6.17,71.8,1.0);
		System.out.println("biggest = " + runTwo.getBiggest() + "\n");
		BiggestDouble runThree = new BiggestDouble(41.15,816.7,17.8,19.0);
		System.out.println("biggest = " + runThree.getBiggest() + "\n");
		BiggestDouble runFour = new BiggestDouble(884.5,16.7,7.8,9.0);
		System.out.println("biggest = " + runFour.getBiggest() + "\n");
		BiggestDouble runFive = new BiggestDouble(4.5,-456.7,677.8,9.0);
		System.out.println("biggest = " + runFive.getBiggest() + "\n");
		BiggestDouble runSix = new BiggestDouble(4.5,16.7,-7.8,-9.0);
		System.out.println("biggest = " + runSix.getBiggest() + "\n");
	}
}