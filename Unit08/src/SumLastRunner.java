//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle
//Date - 2/8/22

public class SumLastRunner
{
	public static void main( String args[] )
	{			
	    RaySumLast greaterSum = new RaySumLast();
	    int[] numsOne = {-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5};
	    System.out.println(greaterSum.go(numsOne));
	    int[] numsTwo = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99};
	    System.out.println(greaterSum.go(numsTwo));
	    int[]numsThree = {10, 20, 30, 40, 50, -11818, 40, 30, 20, 10};
	    System.out.println(greaterSum.go(numsThree));
	    int[] numsFour = {32767};
	    System.out.println(greaterSum.go(numsFour));
	    int[] numsFive = {255, 255};
	    System.out.println(greaterSum.go(numsFive));
	    int[] numsSix = {9, 10, -88, 100, -555, 2};
	    System.out.println(greaterSum.go(numsSix));
	    int[] numsSeven = {10, 10, 10, 11, 456};
	    System.out.println(greaterSum.go(numsSeven));
	    int[] numsEight = {-111, 1, 2, 3, 9, 11, 20, 1};
	    System.out.println(greaterSum.go(numsEight));
	    int[] numsNine = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2, 6};
	    System.out.println(greaterSum.go(numsNine));
	    int[] numsTen = {12, 15, 18, 21, 23, 1000};
	    System.out.println(greaterSum.go(numsTen));
	    int[] numsEleven = {250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0};
	    System.out.println(greaterSum.go(numsEleven));
	    int[] numsTwelve = {9, 10, -8, 10000, -5000, -3000};
	    System.out.println(greaterSum.go(numsTwelve));
	}
}