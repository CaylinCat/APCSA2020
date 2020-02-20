package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "rock";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		if(playChoice.equals("R")) {
			System.out.println("player had R");
			playChoice = "rock";
		}
		if(playChoice.equals("P")) {
			System.out.println("player had P");
			playChoice = "paper";
		}
		if(playChoice.equals("S")) {
			System.out.println("player had S");
			playChoice = "scissors";
		}
		
		int num = (int)(Math.random()*3);
		switch(num) {
			case 0:
				compChoice = "rock";
				System.out.println("computer had R");
				break;
			case 1:
				compChoice = "paper";
				System.out.println("computer had P");
				break;
			case 2:
				compChoice = "scissors";
				System.out.println("computer had S");
				break;
			default:
				compChoice = "rock";
		}
		
	}

	public String determineWinner()
	{
		String winner="";
		if (compChoice.equals(playChoice)) {
			winner = "!Draw Game!";
		} else if (compChoice.equals("rock") && playChoice.equals("scissors")){
			winner = "!Computer wins <<Rock Breaks Scissors>>!";
		} else if (compChoice.equals("scissors") && playChoice.equals("paper")){
			winner = "!Computer wins <<Scissors Cuts Paper>>!";
		} else if (compChoice.equals("paper") && playChoice.equals("rock")) {
			winner = "!Computer wins <<Paper Covers Rock>>!";
		} else if (playChoice.equals("rock") && compChoice.equals("scissors")) {
			winner = "!Player wins <<Rock Breaks Scissors>>!";
		} else if (playChoice.equals("scissors") && compChoice.equals("paper")) {
			winner = "!Player wins <<Scissors Cuts Paper>>!";
		} else if (playChoice.equals("paper") && compChoice.equals("rock")) {
			winner = "!Player wins <<Paper Covers Rock>>!";
		}

		return winner + "\n\nDo you want to play again? ";
	}

	public String toString()
	{
		String output= determineWinner();
		return output;
	}
}