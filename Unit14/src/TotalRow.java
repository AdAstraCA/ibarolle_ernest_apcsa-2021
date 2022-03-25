//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> RowValues = new ArrayList<Integer>();
    	int count = 0;
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m[i].length; j++) {
    			count = count + m[i][j];
    		}
    		RowValues.add(count);
    		count = 0;
    	}
		return RowValues;
    }
}
