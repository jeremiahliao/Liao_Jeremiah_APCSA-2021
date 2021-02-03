//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	public void calcDistance()
	{
		double xDist = (xTwo - xOne)*(xTwo - xOne);
		double yDist = (yTwo - yOne)*(yTwo - yOne);
		distance = Math.sqrt(xDist + yDist);
		
	}
	
	public double getDistance()
	{
		calcDistance();
		return distance;
	}
	
	public void print()
	{
		System.out.printf("Enter X1 :: %d\n",xOne);
		System.out.printf("Enter Y1 :: %d\n", yOne);
		System.out.printf("Enter X2 :: %d\n",xTwo);
		System.out.printf("Enter Y2 :: %d\n", yTwo);
		System.out.printf("%.3f\n",distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}