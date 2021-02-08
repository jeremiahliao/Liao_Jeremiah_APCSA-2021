//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new StringEquality();
		//add test cases
		test.setWords("hello","goodbye");
		test.checkEquality();
		System.out.println(test);
		
		test.setWords("one","two");
		test.checkEquality();
		System.out.println(test);
		
		test.setWords("three","four");
		test.checkEquality();
		System.out.println(test);
		
		test.setWords("TCEA","UIL");
		test.checkEquality();
		System.out.println(test);
		
		test.setWords("State","Champions");
		test.checkEquality();
		System.out.println(test);
		
		test.setWords("ABC","ABC");
		test.checkEquality();
		System.out.println(test);
		
		test.setWords("ABC","CBA");
		test.checkEquality();
		System.out.println(test);
		
		test.setWords("Same","Same");
		test.checkEquality();
		System.out.println(test);
	}
}