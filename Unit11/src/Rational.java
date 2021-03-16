//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num;
	private int den;
	//write two constructors
	public Rational()
	{
		setRational(1,1);
	}
	public Rational(int one, int two)
	{
		setRational(one,two);
	}
	//write a setRational method
	public void setRational(int num1,int den1)
	{
		setNumerator(num1);
		setDenom(den1);
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int n)
	{
		num = n;
	}
	public void setDenom(int n)
	{
		den = n;
	}
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		num = ((num * other.den) + (other.num * den));
		den = den * other.den;

		reduce();
	}

	private void reduce()
	{
		int initial = gcd(num,den);
		if(initial != 1)
		{
			while(gcd(num,den) == initial)
			{
				num = (int)(num/initial);
				den = (int)(den/initial);
			}
		}
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 1;
		for(int i = 1; i <= numOne && i <= numTwo; i++)
		{
			if(numOne % i == 0 && numTwo % i == 0)
				gcd = i;
		}
		return gcd;
	}

	public Object clone ()
	{
		return new Rational(num,den);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{
		reduce();
		Rational compare = (Rational)obj;
		compare.reduce();
		if(compare.num == num && compare.den == den)
		{
			return true;
		}

		return false;
	}

	public int compareTo(Rational other)
	{
		reduce();
		other.reduce();
		if(other.num == num && other.den == den)
			return 0;
		else if(other.num > num && other.den > den)
			return 1;
		return -1;
	}



	
	//write  toString() method
	public String toString()
	{
		return num + "/" + den;
	}
	
}