//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Ernest Ibarolle

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private int compNumber;
	private String winner;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		compNumber = (int)(Math.random() * 3);
		switch (compNumber) {
			case 0:
				compChoice = "R";
				break;
			case 1:
				compChoice = "P";
	        	break;
			case 2:
				compChoice = "S";
				break;
		}
	}

	public void determineWinner()
	{
		if (playChoice.equals(compChoice)) { 
			winner = "Draw!";
		} else if (playChoice.equals("R")) {
			if (compChoice.equals("S")) {
				winner = "Player wins: Rock crushes Scissors!";
			} else if (compChoice.equals("P")){
				winner = "Computer wins: Paper covers Rock!";
			}
		} else if (playChoice.equals("P")) {
			if (compChoice.equals("R")) {
				winner = "Player wins: Paper covers Rock!";
			} else if (compChoice.equals("S")) {
				winner = "Computer wins: Scissors cuts Paper!";
			}
		} else if (playChoice.equals("S")) {
			if (compChoice.equals("P")) {
				winner = "Player wins: Scissors cut Paper!";
			} else if (compChoice.equals("R")) {
				winner = "Computer wins: Rock crushes Scissors!";
			}
		}
	}

	public String toString()
	{
		String output = "Player choice :: " + playChoice + "\nComputer choice :: " + compChoice + "\n" + winner;
		return output;
	}
}