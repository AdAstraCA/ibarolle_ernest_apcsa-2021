//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				grid[i][j] = vals[(int)(Math.random() * 7)];
				System.out.print(grid[i][j]);
			}
			System.out.println("");
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String max = vals[0];
		for (int i = 1; i < vals.length; i++) {
			if (countVals(vals[i]) > countVals(vals[i - 1])) {
				max = vals[i];
			}
		}
		return max;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j].equals(val)) {
					count = count + 1;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString(String[] vals)
	{
		String output = findMax(vals) + " occurs the most.";
		return output;
	}
}