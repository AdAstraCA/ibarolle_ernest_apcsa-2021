//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Ernest Ibarolle

import static java.lang.System.*;
import java.lang.Math;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a, b, c, d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
	    one = a;
	    two = b;
	    three = c;
	    four = d;
	    System.out.println(one + " " + two + " " + three + " " + four);
	}

	public double getBiggest()
	{
		return Math.max(Math.max(one, two), Math.max(three, four));
	}
}