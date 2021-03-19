//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String name = keyboard.next();
		
		System.out.print("Enter 1st monster's size : ");
		int size = keyboard.nextInt();
		
		//instantiate monster one
		Monster mOne = new Skeleton(name,size);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		name = keyboard.next();
		
		System.out.print("Enter 1st monster's size : ");
		size = keyboard.nextInt();
		
		//instantiate monster two
		Monster mTwo = new Skeleton(name,size);
		
		System.out.println();
		System.out.println("Monster 1 - " + mOne);
		System.out.println("Monster 2 - " + mTwo);
		System.out.println();
		
		if(mOne.isBigger(mTwo))
		{
			System.out.println("Monster one is bigger than Monster two");
		}
		else 
			System.out.println("Monster one is smaller than Monster two");
		
		if(mOne.namesTheSame(mTwo))
		{
			System.out.println("Monster one has the same name as Monster two");
		}
		else
			System.out.println("Monster one does not have the same name as Monster two");
		
		
	}
}