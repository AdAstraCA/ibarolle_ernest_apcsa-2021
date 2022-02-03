//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne oneTriangle = new TriangleOne("hippo");
		oneTriangle.print();
		TriangleOne twoTriangle = new TriangleOne("abcd");
		twoTriangle.print();
		TriangleOne threeTriangle = new TriangleOne("it");
		threeTriangle.print();
		TriangleOne fourTriangle = new TriangleOne("a");
		fourTriangle.print();
		TriangleOne fiveTriangle = new TriangleOne("chicken");
		fiveTriangle.print();	
	}
}