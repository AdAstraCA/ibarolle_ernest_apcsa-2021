//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables

	int numerator;
	int denominator;
	
	//write two constructors
	
	public Rational() {
		numerator = 0;
		denominator = 1;
	}
	
	public Rational(int num, int den) {
		setRational(num, den);
	}

	//write a setRational method
	
	public void setRational(int num, int den) {
		setNumerator(num);
		setDenominator(den);
	}

	//write  a set method for numerator and denominator

	public void setNumerator(int num) {
		numerator = num;
	}
	
	public void setDenominator(int den) {
		denominator = den;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		numerator = numerator + other.denominator + denominator + other.numerator;
		denominator = denominator * other.denominator;

		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(numerator, denominator);
		numerator = numerator / gcd;
		denominator = denominator / gcd;
	}

	private int gcd(int numOne, int numTwo)
	{
		int remainder = numOne % numTwo;
		while (remainder != 0) {
			numOne = numTwo;
			numTwo = remainder;
			remainder = numOne % numTwo;
		}
		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals(Rational obj)
	{
		if (obj.numerator / obj.denominator == numerator / denominator) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		if (other.numerator / other.denominator > numerator / denominator) {
			return 1;
		}
		return -1;
	}



	
	//write  toString() method
	
	
}