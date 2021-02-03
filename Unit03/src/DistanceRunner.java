//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases
		//test case 1
		Distance Runner = new Distance();
		Runner.setCoordinates(1, 1, 2, 1);
		Runner.calcDistance();
		Runner.getDistance();
		Runner.print();
		//test case 2
		Runner.setCoordinates(1, 1, -2, 2);
		Runner.calcDistance();
		Runner.getDistance();
		Runner.print();
		//test case 3
		Runner.setCoordinates(1, 1, 0, 0);
		Runner.calcDistance();
		Runner.getDistance();
		Runner.print();
		
	}
}