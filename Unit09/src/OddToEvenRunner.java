//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle
//Date - 2/16/22

import java.util.List;
import java.util.ArrayList;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven s = new ListOddToEven();
		ArrayList<Integer> listOne = new ArrayList<Integer>();
	    listOne.add(7);
	    listOne.add(1);
	    listOne.add(5);
	    listOne.add(3);
	    listOne.add(11);
	    listOne.add(5);
	    listOne.add(6);
	    listOne.add(7);
	    listOne.add(8);
	    listOne.add(9);
	    listOne.add(10);
	    listOne.add(12345);
	    listOne.add(11);
		System.out.println( s.go(listOne) );
	    ArrayList<Integer> listTwo = new ArrayList<Integer>();
	    listTwo.add(11);
	    listTwo.add(9);
	    listTwo.add(8);
	    listTwo.add(7);
	    listTwo.add(6);
	    listTwo.add(5);
	    listTwo.add(4);
	    listTwo.add(3);
	    listTwo.add(2);
	    listTwo.add(1);
	    listTwo.add(-99);
	    listTwo.add(7);
		System.out.println( s.go(listTwo) );
	    ArrayList<Integer> listThree = new ArrayList<Integer>();
	    listThree.add(2);
	    listThree.add(7);
	    listThree.add(11);
	    listThree.add(21);
	    listThree.add(5);
	    listThree.add(7);
		System.out.println( s.go(listThree) );
	}
}