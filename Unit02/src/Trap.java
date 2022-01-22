// © A+ Computer Science  -  www.apluscompsci.com
// Name - Ernest Ibarolle
// Date - 1/18/22
// Class - AP Computer Science A
// Lab  - TrapArea

public class Trap
{
	public static double area( int base1, int base2, int height )
	{
		float baseAddition = base1 + base2;
    	float trapezoidArea = baseAddition * height / 2;
		return trapezoidArea;
	}
}