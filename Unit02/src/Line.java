//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle
//Date - 1/18/22

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		float yChange = y2 - y1;
		float xChange = x2 - x1;
		float slope = yChange / xChange;
		return slope;
	}
}