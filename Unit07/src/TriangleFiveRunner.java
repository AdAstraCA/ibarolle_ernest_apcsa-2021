//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import static java.lang.System.*;
import java.util.*;

public class TriangleFiveRunner
{
	public static void main(String args[])
	{
		System.out.println("Enter a character and number separately.");
	  	Scanner keyboard = new Scanner(System.in);
		char chosenLetterOne = keyboard.next().charAt(0);
		int amountOfLettersOne = keyboard.nextInt();
		TriangleFive oneTriangle = new TriangleFive(chosenLetterOne, amountOfLettersOne);
		System.out.println(oneTriangle.toString());
		char chosenLetterTwo = keyboard.next().charAt(0);
		int amountOfLettersTwo = keyboard.nextInt();
		TriangleFive twoTriangle = new TriangleFive(chosenLetterTwo, amountOfLettersTwo);
		System.out.println(twoTriangle.toString());
		char chosenLetterThree = keyboard.next().charAt(0);
		int amountOfLettersThree = keyboard.nextInt();
		TriangleFive threeTriangle = new TriangleFive(chosenLetterThree, amountOfLettersThree);
		System.out.println(threeTriangle.toString());
		char chosenLetterFour = keyboard.next().charAt(0);
		int amountOfLettersFour = keyboard.nextInt();
		TriangleFive fourTriangle = new TriangleFive(chosenLetterFour, amountOfLettersFour);
		System.out.println(fourTriangle.toString());
		char chosenLetterFive = keyboard.next().charAt(0);
		int amountOfLettersFive = keyboard.nextInt();
		TriangleFive fiveTriangle = new TriangleFive(chosenLetterFive, amountOfLettersFive);
		System.out.println(fiveTriangle.toString());
		keyboard.close();
	}
}