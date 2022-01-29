//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ernest Ibarolle
//Date - 1/21/22
//Class - AP Computer Science A
//Lab  - StringOddOrEven

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
	private String eitherOr;

	public StringOddOrEven()
	{
		setString("");
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		if (word.length() % 2 == 0) {
 			eitherOr = "even";
 			return true;
 		} else {
    		eitherOr = "odd";
    		return false;
 		}
	}

 	public String toString()
 	{
 		String output = word + " is " + eitherOr;
 		return output;
	}
}