//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
   	Scanner keyboard = new Scanner(System.in);
   	int times = 0;
   	String choice="";
		do{
			out.print("\nEnter the word to display :: ");
			String word = keyboard.next();
			times = times + 1;		
 			TriangleWord.printTriangle(word, times);
			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		}while(choice.equals("Y")||choice.equals("y"));		
	}
}