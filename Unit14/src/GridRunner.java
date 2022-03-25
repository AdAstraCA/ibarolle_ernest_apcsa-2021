//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String [] vals = {"a", "b", "c", "7", "9", "x", "2"};
		Grid testGrid = new Grid(10, 10, vals);
		System.out.println(testGrid.toString(vals));
	}
}