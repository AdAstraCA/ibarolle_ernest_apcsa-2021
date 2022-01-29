//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ernest Ibarolle
//Date - 1/28/22
//Class - AP Computer Science A
//Lab  - String Equality

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		setWords("", "");
	}

	public StringEquality(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality(String one, String two)
	{
		return one.equals(two);
	}

	public String toString()
	{
		if (checkEquality(wordOne, wordTwo)) {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		} else {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
	}
}