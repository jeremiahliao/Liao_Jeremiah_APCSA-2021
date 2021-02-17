/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		if(position != -1)
		{
			System.out.println ("sample.indexOf(\"quick\") = " + position);
		}
		else {System.out.println("quick is not found.");}
		
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		String str = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		int count = 0;
		for(int i = 0; i < str.length(); i += str.indexOf("the",i))
		if(str.indexOf("the", 0) >= 0)
			{
				count ++;
			}
		System.out.println(count);
	}

}
