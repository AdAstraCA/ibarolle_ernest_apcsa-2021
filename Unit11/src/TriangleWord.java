//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word, int times)
	{
		for (int i = 0; i < times; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(word);
			}
			System.out.println("");
		}
	}
}