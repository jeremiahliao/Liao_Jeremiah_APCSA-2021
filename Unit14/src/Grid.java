//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				int index = (int)(Math.random()*vals.length);
				grid[i][j] = vals[index];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		int index = 0;
		for(int i = 0; i < vals.length; i++)
		{
			int current = countVals(vals[i]);
			
//			Debug Code
			System.out.println(vals[i] + " count is " + current);
			
			if(current > max)
			{
				max = current;
				index = i;
			}
		}
		
		System.out.println();
		
		return "" + vals[index] + " occurs the most.";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int total = 0;
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[i].length; j++)
			{
				if(grid[i][j].equals(val))
					total++;
			}
		}
		return total;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[i].length; j++)
			{
				output = output + grid[i][j] + " ";
			}
			output += "\n";
		}
		return output;
	}
}