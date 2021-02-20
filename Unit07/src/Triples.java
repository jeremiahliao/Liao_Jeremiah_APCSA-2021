//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = a;
		int GCF = 0;
		max = Math.min(max, b);
		max = Math.min(max, c);
		for(int i = 1; i <= max; i++)
		{
			if(a%i == 0 && b%i == 0 && c%i ==0)
				GCF = i;			
		}
		if(GCF == 1)
			return GCF;
		else return 0;
	}

	public String toString()
	{
		String output="";
		for(int a = 0; a < number; a++)
		{
			for(int b = 0; b < number; b++)
			{
				for(int c = 0; c < number; c++)
					if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
					{
						if(((a%2 == 1 && b%2 == 0) || (a%2 == 0 && b%2 == 1)) && (c%2 == 1))
							if(greatestCommonFactor(a,b,c) == 1)
								if((output.indexOf("" + a) == -1 && output.indexOf("" + b) == -1)
									|| output.indexOf("" + c) == -1)
									output = output + a + " " + b + " " + c + "\n";
					}
			}
		}
		return output+"\n";
	}
}