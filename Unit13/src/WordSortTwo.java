//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		int count = 1;
		char separatedChar;
		for (int i = 0; i < sentence.length(); i++) {
  			separatedChar = sentence.charAt(i);
  			if (separatedChar == ' ') {
    			count = count + 1;
  			}
		}
		wordRay = new String[count];
		String word = "";
		count = 0;
		for (int i = 0; i < sentence.length(); i++) {
  			separatedChar = sentence.charAt(i);
    		if (separatedChar != ' '){
    			word = word + sentence.charAt(i);
      			if (i == sentence.length() - 1) {
        				wordRay[count] = word;
      			}
    		} else {
    			wordRay[count] = word;
      			word = "";
      			count = count + 1;
    		}
		}
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < wordRay.length; i++) {
			output = output + wordRay[i] + "\n";
		}
		return output+"\n";
	}
}