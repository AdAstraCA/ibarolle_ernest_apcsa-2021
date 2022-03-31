//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ernest Ibarolle

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private char[][] m;
    private int row;
    private int column;
    public WordSearch(int size, String str)
    {
    	int index = 0;
    	row = size;
    	column = size;
    	m = new char[row][column];
    	for (int i = 0; i < m.length; i++) {
    	    for (int j = 0; j < m[i].length; j++) {
    	    	m[i][j] = str.charAt(index);
    	    	System.out.print(m[i][j]);
    	    	index = index + 1;
    	    }
    	    System.out.println("");
    	}
    }

    public boolean isFound(String word)
    {
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m[i].length; j++) {
    			if (m[i][j] == word.charAt(0)) {
    				if (checkRight(word, i, j) || checkDown(word, i, j) || checkDiagUpRight(word, i, j) || checkDiagDownRight(word, i, j)) {
    		    		return true;
    		    	}
    			} else if (m[i][j] == word.charAt(word.length() - 1)) {
    				if (checkLeft(word, i, j) || checkUp(word, i, j) || checkDiagUpLeft(word, i, j) || checkDiagDownLeft(word, i, j)) {
    					return true;
    				}
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
    {
		for (int i = 1; i < w.length(); i++) {
			int startingRow = r;
			int startingColumn = c;
			if (startingColumn + i < w.length()) {
				System.out.println(m[startingRow][startingColumn + i]);
				System.out.println(w.charAt(i));
				if (m[startingRow][startingColumn + i] != w.charAt(i)) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String newWord = new StringBuilder(w).reverse().toString();
		if (checkRight(newWord, r, c)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkUp(String w, int r, int c)
	{
		String newWord = new StringBuilder(w).reverse().toString();
		if (checkDown(newWord, r, c)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkDown(String w, int r, int c)
   {
		for (int i = 1; i < w.length(); i++) {
			int startingRow = r;
			int startingColumn = c;
			if (startingRow + i < w.length()) {
				if (m[startingRow + i][startingColumn] != w.charAt(i)) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		for (int i = 1; i < w.length(); i++) {
			int startingRow = r;
			int startingColumn = c;
			if (startingRow + i < w.length() && startingColumn + i < w.length() && startingRow - i > 0) {
				if (m[startingRow - i][startingColumn + i] != w.charAt(i)) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String newWord = new StringBuilder(w).reverse().toString();
		if (checkDiagDownRight(newWord, r, c)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String newWord = new StringBuilder(w).reverse().toString();
		if (checkDiagUpRight(newWord, r, c)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		for (int i = 1; i < w.length(); i++) {
			int startingRow = r;
			int startingColumn = c;
			if (startingRow + i < w.length() && startingColumn + i < w.length()) {
				if (m[startingRow + i][startingColumn + i] != w.charAt(i)) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}
}
