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
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		double compRandom = Math.random();
		int random = (int)(compRandom * 3);
		if(random == 0)
			compChoice = "R";
		if(random == 1)
			compChoice = "P";
		if(random == 2)
			compChoice = "S";
	}

	public String determineWinner()
	{	
		String winner="";
		
		if(playChoice.equals(compChoice) == true)
			winner = "!Draw Game!";
		 if(playChoice.equals("R") == true && compChoice.equals("S") == true)
			winner = "!Player wins << Rock Breaks Scissors>>!";
		if(playChoice.equals("S") == true && compChoice.equals("P") == true)
			winner = "!Player wins << Scissors Cuts Paper>>!";
		if(playChoice.equals("P") == true && compChoice.equals("R") == true)
			winner = "!Player wins << Paper Covers Rock>>!";
		if(compChoice.equals("R") == true && playChoice.equals("S") == true)
			winner = "!Computer wins << Rock Breaks Scissors>>!";
		if(compChoice.equals("S") == true && playChoice.equals("P") == true)
			winner = "!Computer wins << Scissors Cuts Paper>>!";
		if(compChoice.equals("P") == true && playChoice.equals("R") == true)
			winner = "!Computer wins << Paper Covers Rock>>!";
		return winner;
	}

	public String toString()
	{
		String output= "player had " + playChoice + "\ncomputer had " + compChoice + "\n" + determineWinner();
		return output;
	}
}