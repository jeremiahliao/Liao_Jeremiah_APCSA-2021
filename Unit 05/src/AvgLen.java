//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class AvgLen
{
   public static double go( String a, String b )
	{
	   	int aLength = a.length();
	   	int bLength = b.length();
	   	
	   	double avgLength = ((double)aLength + bLength)/2;
		return avgLength;
	}
}