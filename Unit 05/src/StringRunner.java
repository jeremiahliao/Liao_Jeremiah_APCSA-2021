//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		StringOddOrEven string = new StringOddOrEven();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a word :: ");
		String word = keyboard.nextLine();
		string.setString(word);
		string.isEven();
		System.out.println(word + " is "+ string+".");
		
	}
}