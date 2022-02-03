//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import static java.lang.System.*;

public class LetterRemover
{
	private String sentence;
	private char lookFor;
	private String cleaned;
	
	public LetterRemover()
	{
		setRemover("", '\0');
	}
	
	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}
		
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}
	
	public String removeLetters()
	{
		cleaned = sentence;
	    int loc = cleaned.indexOf(lookFor);
	    while (loc != -1) 
	    {
	    	cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
	    	loc = cleaned.indexOf(lookFor);
	    }
			return cleaned;
	}
	
	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}