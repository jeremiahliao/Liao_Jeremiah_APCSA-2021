//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		String player = "";
		char response = 'Y';
		RockPaperScissors game = new RockPaperScissors();
		Scanner keyboard = new Scanner(System.in);
		Scanner repeat = new Scanner(System.in);
		
		//add in a do while loop after you get the basics up and running
			do 
			{
				System.out.print("type in your prompt [R,P,S] :: ");
				player = keyboard.nextLine();
				System.out.println(player);
				
			//read in the player value
				game.setPlayers(player);
				System.out.println(game);
				System.out.print("Do you want to play again?");
				response = repeat.next().charAt(0);
			}while(response == 'Y');
	}
}



