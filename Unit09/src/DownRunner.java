//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle
//Date - 2/16/22

import java.util.List;
import java.util.ArrayList;

public class DownRunner
{
	public static void main( String args[] )
	{			
		ListDown s = new ListDown();
	    
	    ArrayList<Integer> listOne = new ArrayList<Integer>();
	    listOne.add(-99);
	    listOne.add(1);
	    listOne.add(2);
	    listOne.add(3);
	    listOne.add(4);
	    listOne.add(5);
	    listOne.add(6);
	    listOne.add(7);
	    listOne.add(8);
	    listOne.add(9);
	    listOne.add(10);
	    listOne.add(12345);
		System.out.println( s.go(listOne) );
	    
	    ArrayList<Integer> listTwo = new ArrayList<Integer>();
	    listTwo.add(10);
	    listTwo.add(20);
	    listTwo.add(30);
	    listTwo.add(40);
	    listTwo.add(50);
	    listTwo.add(-11818);
	    listTwo.add(40);
	    listTwo.add(30);
	    listTwo.add(20);
	    listTwo.add(10);
		System.out.println( s.go(listTwo) );
	    
	    ArrayList<Integer> listThree = new ArrayList<Integer>();
	    listThree.add(9);
	    listThree.add(10);
	    listThree.add(-88);
	    listThree.add(100);
	    listThree.add(-555);
	    listThree.add(2);
		System.out.println( s.go(listThree) );	

	    ArrayList<Integer> listFour = new ArrayList<Integer>();
	    listFour.add(10);
	    listFour.add(9);
	    listFour.add(8);
	    listFour.add(7);
	    listFour.add(6);
	    listFour.add(5);
	    listFour.add(4);
	    listFour.add(3);
	    listFour.add(2);
	    listFour.add(1);
	    listFour.add(-99);
		System.out.println( s.go(listFour) );
	}
}