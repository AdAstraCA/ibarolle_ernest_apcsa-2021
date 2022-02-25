//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle
//Date - 2/14/22

import java.util.List;
import java.util.ArrayList;

public class SumFirstRunner
{
	public static void main( String args[] )
	{				
    ListSumFirst s = new ListSumFirst();	
    ArrayList<Integer> rayOne = new ArrayList<Integer>();
    rayOne.add(-99);
    rayOne.add(1);
    rayOne.add(2);
    rayOne.add(3);
    rayOne.add(4);
    rayOne.add(5);
    rayOne.add(6);
    rayOne.add(7);
    rayOne.add(8);
    rayOne.add(9);
    rayOne.add(10);
    rayOne.add(5);
    System.out.println(s.go(rayOne));

    ArrayList<Integer> rayTwo = new ArrayList<Integer>();
    rayTwo.add(10);
    rayTwo.add(20);
    rayTwo.add(30);
    rayTwo.add(40);
    rayTwo.add(50);
    rayTwo.add(-11818);
    rayTwo.add(40);
    rayTwo.add(30);
    rayTwo.add(20);
    rayTwo.add(10);
    System.out.println(s.go(rayTwo));

    ArrayList<Integer> rayThree = new ArrayList<Integer>();
    rayThree.add(9);
    rayThree.add(10);
    rayThree.add(-88);
    rayThree.add(100);
    rayThree.add(-555);
    rayThree.add(2);
    System.out.println(s.go(rayThree));
	}
}