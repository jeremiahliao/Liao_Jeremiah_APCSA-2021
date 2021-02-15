//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect();
		//add test cases
		test.setNumber(496);
		test.isPerfect();
		System.out.println(test);
								
		test.setNumber(45);
		test.isPerfect();
		System.out.println(test);
		
		test.setNumber(6);
		test.isPerfect();
		System.out.println(test);
		
		test.setNumber(14);
		test.isPerfect();
		System.out.println(test);
		
		test.setNumber(8128);
		test.isPerfect();
		System.out.println(test);
		
		test.setNumber(1245);
		test.isPerfect();
		System.out.println(test);
		
		test.setNumber(33);
		test.isPerfect();
		System.out.println(test);
		
		test.setNumber(28);
		test.isPerfect();
		System.out.println(test);
		
		test.setNumber(27);
		test.isPerfect();
		System.out.println(test);
		
		test.setNumber(33550336);
		test.isPerfect();
		System.out.println(test);
	}
}