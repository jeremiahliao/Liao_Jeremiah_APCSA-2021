//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		if(num < 10)
		{
			if(isEven(num))
				return 1;
			return 0;
		}
		if(isEven(num%10))
			return 1 + countEvenDigits(num/10);
		if(!isEven(num%10))
			return countEvenDigits(num/10);
		return 0;
	}
	public static boolean isEven(int num)
	{
		if(num%2 == 0)
			return true;
		return false;
	}
}