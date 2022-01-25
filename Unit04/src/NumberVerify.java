//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ernest Ibarolle
//Date - 1/20/22
//Class - AP Computer Science A
//Lab  - OddOrEven

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if (num % 2 == 1) {
			return true;
		}
		return false;
	}
	
	public static boolean isEven( int num )
	{
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
}