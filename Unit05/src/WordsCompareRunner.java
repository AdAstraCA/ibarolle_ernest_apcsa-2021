//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ernest Ibarolle
//Date - 1/25/22
//Class - AP Computer Science A
//Lab  - WordsCompare

import static java.lang.System.*;
import java.util.Scanner;

public class WordsCompareRunner
{
  public static void main( String args[] )
  {
    Scanner keyboard = new Scanner(System.in);
    String one = keyboard.next();
    String two = keyboard.next();
    WordsCompare compareOne = new WordsCompare(one, two);
    compareOne.compare();
    System.out.println(compareOne.toString());
    String three = keyboard.next();
    String four = keyboard.next();
    WordsCompare compareTwo = new WordsCompare(three, four);
    compareTwo.compare();
    System.out.println(compareTwo.toString());
    String five = keyboard.next();
    String six = keyboard.next();
    WordsCompare compareThree = new WordsCompare(five, six);
    compareThree.compare();
    System.out.println(compareThree.toString());
  }
}