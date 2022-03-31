//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] rayOne = NumberShifter.makeLucky7Array(10);
		System.out.println(Arrays.toString(rayOne));
		NumberShifter.shiftEm(rayOne);
		System.out.println(Arrays.toString(rayOne));
		int[] rayTwo = NumberShifter.makeLucky7Array(15);
		System.out.println(Arrays.toString(rayTwo));
		NumberShifter.shiftEm(rayTwo);
		System.out.println(Arrays.toString(rayTwo));
		int[] rayThree = NumberShifter.makeLucky7Array(20);
		System.out.println(Arrays.toString(rayThree));
		NumberShifter.shiftEm(rayThree);
		System.out.println(Arrays.toString(rayThree));
	}
}



