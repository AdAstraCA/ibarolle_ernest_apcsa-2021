//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Ernest Ibarolle 

import static java.lang.System.*;
import java.lang.Math;

public class Triples
{
	private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcf = 2;
		int max = Math.min(Math.min(a, b), c);
		while (gcf <= max) {
			if (a % gcf == 0 && b % gcf == 0 && c % gcf == 0) {
				return gcf;
			}
			gcf = gcf + 1;
		}
		return 1;
	}

	public String toString()
	{
	    String output="";
	    for (int a = 0; a < number; a++) {
	    	for (int b = 0; b < number; b++) {
	    		for (int c = 0; c < number; c++) {
	    			if (a * a + b * b == c * c && a % 2 != b % 2 && c % 2 == 1 && greatestCommonFactor(a, b, c) == 1 && a < b && b < c) {
	    				output = output + a + " " + b + " " + c + "\n";
	    			}
	    		}
	    	}
	    }
		return output+"\n";
	}
}