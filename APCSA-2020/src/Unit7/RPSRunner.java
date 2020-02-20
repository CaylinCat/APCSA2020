package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "";
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			//read in the player value
			player = keyboard.next();
		
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers(player);
			System.out.print(game.determineWinner());
			response = keyboard.next();

			do {
				out.print("\ntype in your prompt [R,P,S] :: ");
				player = keyboard.next();
				game.setPlayers(player);
				System.out.print(game.determineWinner());
				response = keyboard.next();
			} while(response.equals("y"));
			
			keyboard.close();
			
	}
}



