//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 1;
		while(number/10 != 0)
		{
			count++;
			number = number/10;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = null;
		
		int size = getNumDigits(number);
		int[] unsorted = new int[size];
		for(int i = size - 1; i >= 0; i--)
		{
			unsorted[i] = number%10;
			number = number/10;
		}
		
		Arrays.sort(unsorted);
		sorted = unsorted;
		return sorted;
	}
}