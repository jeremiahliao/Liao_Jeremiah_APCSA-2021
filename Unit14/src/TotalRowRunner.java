//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		//add code here	
		TotalRow test = new TotalRow();
		System.out.println("Row totals are :: " + test.getRowTotals(new int[][] {{1,2,3},{5,5,5,5}}));
		
		System.out.println("Row totals are :: " + test.getRowTotals(new int[][] {{1,2,3},{5},{1},{2,2}}));
		
		System.out.println("Row totals are :: " + test.getRowTotals(new int[][] {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}}));
	}
}



