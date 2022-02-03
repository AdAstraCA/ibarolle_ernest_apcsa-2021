//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect numberOne = new Perfect(496);
		System.out.println(numberOne.toString());
		Perfect numberTwo = new Perfect(45);
		System.out.println(numberTwo.toString());
		Perfect numberThree = new Perfect(6);
		System.out.println(numberThree.toString());
		Perfect numberFour = new Perfect(14);
		System.out.println(numberFour.toString());
		Perfect numberFive = new Perfect(8128);
		System.out.println(numberFive.toString());
		Perfect numberSix = new Perfect(1245);
		System.out.println(numberSix.toString());
		Perfect numberSeven = new Perfect(33);
		System.out.println(numberSeven.toString());
		Perfect numberEight = new Perfect(28);
		System.out.println(numberEight.toString());
		Perfect numberNine = new Perfect(27);
		System.out.println(numberNine.toString());
		Perfect numberTen = new Perfect(33550336);
		System.out.println(numberTen.toString());
	}
}