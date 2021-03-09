//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int firstOdd = -1;
		for(int i = 0; i < ray.size(); i++)
		{
			if(ray.get(i) % 2 == 1)
			{
				firstOdd = i;
				break;
			}
		}
		if(firstOdd == -1)
			return firstOdd;
		int d = 0;
		int max = 0;
		for(int i = firstOdd; i < ray.size(); i++)
		{
			if(ray.get(i) % 2 == 0)
				d = i - firstOdd;
			if(d > max)
				max = d;
		}
		if(max == 0)
			return -1;
		return max;
	}
}