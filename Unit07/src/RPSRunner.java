//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Ernest Ibarolle

import java.util.*;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response = 'y';
		
		//add in a do while loop after you get the basics up and running
		do {
			String player = "";
		
			System.out.print("type in your prompt [R,P,S] :: ");

			player = keyboard.next();
		
		  RockPaperScissors game = new RockPaperScissors(player);
		  game.determineWinner();
		  System.out.println(game.toString());

		  System.out.print("Would you like to play again? Press y for yes, n for no. ");
		  response = keyboard.next().charAt(0); 
		} while (response != 'n');
		keyboard.close();
	}
}



