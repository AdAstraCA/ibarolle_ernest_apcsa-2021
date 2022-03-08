//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter 1st monster's name : ");
		String nameOne = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int sizeOne = keyboard.nextInt();
		 
		Skeleton one = new Skeleton(nameOne, sizeOne);
		
		System.out.print("Enter 2nd monster's name : ");
		String nameTwo = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		int sizeTwo = keyboard.nextInt();
		 
		Skeleton two = new Skeleton(nameTwo, sizeTwo);
		
		System.out.println("Monster 1 - " + one.toString());
		System.out.println("Monster 2 - " + two.toString());
		
		System.out.println("Monster 1 is smaller than Monster 2 - " + one.isSmaller(two) + ".");
		
		System.out.println("Monster 1 has the same name as Monster 2 - " + one.namesTheSame(two) + ".");
	}
}