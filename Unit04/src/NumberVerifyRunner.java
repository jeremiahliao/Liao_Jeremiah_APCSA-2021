//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		int num;
		//add in input
		NumberVerify test = new NumberVerify();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
		System.out.printf("%d is odd :: " + NumberVerify.isOdd(num)+"\n",num);
		System.out.printf("%d is even :: " + NumberVerify.isEven(num)+"\n",num);
		
		//add in more test cases
		System.out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
		System.out.printf("%d is odd :: " + NumberVerify.isOdd(num)+"\n",num);
		System.out.printf("%d is even :: " + NumberVerify.isEven(num)+"\n",num);
		
		System.out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
		System.out.printf("%d is odd :: " + NumberVerify.isOdd(num)+"\n",num);
		System.out.printf("%d is even :: " + NumberVerify.isEven(num)+"\n",num);
		
		System.out.print("Enter a whole number :: ");
		num = keyboard.nextInt();
		System.out.printf("%d is odd :: " + NumberVerify.isOdd(num)+"\n",num);
		System.out.printf("%d is even :: " + NumberVerify.isEven(num)+"\n",num);
	}
}