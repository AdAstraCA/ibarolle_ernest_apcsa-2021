///(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ernest Ibarolle
//Date - 1/25/22
//Class - AP Computer Science A
//Lab  - WordsCompare

import static java.lang.System.*;
import java.util.Scanner;

public class WordsCompare
{
	private String wordOne, wordTwo;
	private int compare;

	public WordsCompare()
	{
		setWords("", "");
	}

	public WordsCompare(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
    	wordTwo = two;
	}

	public void compare()
	{
		compare = wordOne.compareTo(wordTwo);
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}