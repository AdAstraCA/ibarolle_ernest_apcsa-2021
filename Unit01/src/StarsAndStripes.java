//© A+ Computer Science
//www.apluscompsci.com

//Name - Ernest Ibarolle
//Date - 1/17/22
//Class - AP Computer Science A
//Lab  - Stars And Stripes

import static java.lang.System.*;

public class StarsAndStripes
{
	public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
     out.println("********************");
   }

   public void printTwentyDashes()
   {
     out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
     out.println("\n\n");
   }
   
   public void printASmallBox()
   {	
     printTwentyDashes();
     printTwentyStars();
     printTwentyDashes();
     printTwentyStars();
     printTwentyDashes();
     printTwentyStars();
     printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
     printASmallBox();
     printASmallBox();
   }     
   
   public void printAnInverseBox()
   {
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
   }
}