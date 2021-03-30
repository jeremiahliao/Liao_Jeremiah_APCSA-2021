//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.ArrayList;
import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	List<Integer> output = new ArrayList<Integer>();
    	for(int i = 0; i < m.length; i++)
    	{
    		int total = 0;
    		for(int j = 0; j < m[i].length; j++)
    		{
    			total += m[i][j];
    		}
    		output.add(total);
    	}
		return output;
    }
}
