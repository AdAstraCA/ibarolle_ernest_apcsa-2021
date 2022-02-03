//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover sentenceOne = new LetterRemover("I am Sam I am", 'a');
		System.out.println(sentenceOne.toString());
		LetterRemover sentenceTwo = new LetterRemover("ssssssssxssssesssssesss", 's');
		System.out.println(sentenceTwo.toString());	
		LetterRemover sentenceThree = new LetterRemover("qwerty qwerty qwerty", 'a');
		System.out.println(sentenceThree.toString());
		LetterRemover sentenceFour = new LetterRemover("abababababa", 'b');
		System.out.println(sentenceFour.toString());
		LetterRemover sentenceFive = new LetterRemover("abaababababa", 'x');
		System.out.println(sentenceFive.toString());									
	}
}