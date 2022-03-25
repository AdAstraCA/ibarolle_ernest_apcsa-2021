//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] RowOne = {{1, 2, 3}, {5, 5, 5, 5}};
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(RowOne));
		
		int[][] RowTwo = {{1, 2, 3}, {5}, {1}, {2, 2}};
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(RowTwo));
		
		int[][] RowThree = {{1, 2}, {5, 5}, {5, 5}, {4, 5, 6, 7}, {123124, 12312}};
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(RowThree));	
	}
}



