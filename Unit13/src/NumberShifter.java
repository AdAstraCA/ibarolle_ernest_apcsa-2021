//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.lang.Math;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array(int size)
	{
		int[] finalArray = new int[size];
		for (int i = 0; i < size; i++) {
			finalArray[i] = (int)(Math.random() * 10 + 1);
		}
		return finalArray;
	}
	public static void shiftEm(int[] array)
	{
		int sevenIndex = 0;
		for (int j = 0; j < array.length; j++) {
			if (array[j] == 7) {
				int swap = array[j];
				array[j] = array[sevenIndex];
				array[sevenIndex] = swap;
			}
		}
	}
}