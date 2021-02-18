//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double bigger = one;
		if(bigger < two)
			bigger = two;
		if(bigger < three)
			bigger = three;
		if(bigger < four)
			bigger = four;
		
		return bigger;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four + "\nbiggest = " + getBiggest();
	}
}