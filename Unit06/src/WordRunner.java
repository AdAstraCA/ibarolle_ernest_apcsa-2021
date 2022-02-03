//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word oneWordle = new Word("Hello");	
	    System.out.println(oneWordle.toString());
	    Word twoWordle = new Word("World");	
	    System.out.println(twoWordle.toString());
	    Word threeWordle = new Word("Jukebox");	
	    System.out.println(threeWordle.toString());
	    Word fourWordle = new Word("TCEA");	
	    System.out.println(fourWordle.toString());
	    Word fiveWordle = new Word("UCIL");	
	    System.out.println(fiveWordle.toString());
	}
}