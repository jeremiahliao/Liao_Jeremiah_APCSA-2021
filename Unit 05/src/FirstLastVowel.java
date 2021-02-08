//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   char c = a.charAt(a.length()-1);
	   char C = Character.toUpperCase(c);
	   char b = a.charAt(0);
	   char B = Character.toUpperCase(b);
	   
		if(C == 'A' || C == 'E' || C == 'O' || C == 'I' || C == 'U') {
			return "yes";
		}
		else if(B == 'A' || B == 'E' || B == 'O' || B == 'I' || B == 'U')
		{
			return "yes";
		}
		else {return "no";}
		
	}
}