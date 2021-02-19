//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter((char)0);
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		char modify = letter;
		for(int i = amount;i > 0; i--)
		{
			for(int j = amount; j > amount - i; j--)
			{
				for(int k = j; k > 0 ; k--)
				{
					output += modify;
				}
				output += " ";
				if(modify == 'Z')
					modify = 'A';
				else
					modify = (char)(modify + 1);
			}
			output += "\n";
			modify = letter;
		}
		return output + "\n";
	}
}