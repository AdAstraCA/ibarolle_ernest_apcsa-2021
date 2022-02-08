//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import static java.lang.System.*;

public class TriangleFive
{
	private char letter;
	private int amount;
	private int ASCII;

	public TriangleFive()
	{
		setLetter('\0');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output= "";
		char oldLetter = letter;
	    ASCII = oldLetter;
	    int amountCopy = amount;
	    for (int i = amount; i > 0; i--) {
	    	for (int j = i; j > 0; j--) {
	    		for (int k = amountCopy; k > 0; k--) {
	    			output = output + letter;
	    		}
	    		output = output + " ";
	    		letter = (char)(ASCII + 1);
	    		ASCII = letter;
	    		if (letter > 90) {
	    			letter = (char)(ASCII - 26);
	    			ASCII = letter;
	    		}
	    		amountCopy = amountCopy - 1;
	    	}
	    	ASCII = oldLetter;
	    	letter = oldLetter;
	    	output = output + "\n";
	    	amountCopy = amount;
	    }
		return output;
	}
}