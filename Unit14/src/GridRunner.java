//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid test = new Grid(16,16,new String[] {"a","b","c","1","@","9","#","8","f"});
		System.out.println(test);
		
		System.out.println(test.findMax(new String[] {"a","b","c","1","@","9","#","8","f"}));
	}
}