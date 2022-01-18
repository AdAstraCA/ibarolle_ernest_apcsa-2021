//© A+ Computer Science
//www.apluscompsci.com

//Name - Ernest Ibarolle
//Date - 1/17/22
//Class - AP Computer Science A
//Lab  - Stars And Stripes

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
	  StarsAndStripes starfall = new StarsAndStripes();
      //call the methods needed to make the patterns on the word document
	  starfall.printASmallBox();
	  starfall.printTwoBlankLines();
	  starfall.printABigBox();
	  starfall.printTwoBlankLines();
	  starfall.printAnInverseBox();
   }
}