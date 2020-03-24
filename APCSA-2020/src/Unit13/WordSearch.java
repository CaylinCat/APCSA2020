package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    private int size;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	this.size = size;
    	int x = 0;
    	for(int i=0; i<size; i++) {
    		for(int k=0; k<size; k++) {
    			m[i][k] = str.substring(x, x+1);
    			x++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	boolean found = false;
    	for(int i=0; i<size; i++) {
    		if(checkRight(word,i,size) || checkLeft(word,i,size) || checkUp(word,size,i) || checkDown(word,size,i))
    			found = true;
    	}
    	if(checkDiagUpRight(word,size,size) || checkDiagDownRight(word,size,size) || 
    				checkDiagUpLeft(word,size,size) || checkDiagDownLeft(word,size,size))
    		found = true;
    	return found;
    }

	public boolean checkRight(String w, int r, int c)
    {
		String x = "";
		for(int i=0; i<c; i++) {
			x = x + m[r][i];
		}
		//System.out.println(x);
		if(x.contains(w))
			return true;
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String x = "";
		String word = "";
		for(int i=0; i<c; i++) {
			x = x + m[r][i];
		}
		for(int i=w.length()-1; i>=0; i--) {
			word = word + w.substring(i, i+1);
		}
		if(x.contains(word))
			return true;
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String x = "";
		for(int i=r-1; i>=0; i--) {
			x = x + m[i][c];
		}
		//System.out.println(x);
		if(x.contains(w))
			return true;
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		String x = "";
		for(int i=0; i<r; i++) {
			x = x + m[i][c];
		}
		//System.out.println(x);
		if(x.contains(w))
			return true;
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String x = "";
		for(int i=0; i<r; i++) {
			for(int k=0; k<c; k++) {
				if(i==size-k-1)
					x = x + m[k][i];
			}
		}
		if(x.contains(w))
			return true;
		//System.out.println(x);
		
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String x = "";
		for(int i=r; i>=0; i--) {
			for(int k=0; k<c; k++) {
				if(i==k)
					x = x + m[k][i];
			}
		}
		if(x.contains(w))
			return true;
		//System.out.println(x);
		
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
    {
		String x = "";
		for(int i=0; i<r; i++) {
			for(int k=0; k<c; k++) {
				if(i==k)
					x = x + m[k][i];
			}
		}
		if(x.contains(w))
			return true;
		//System.out.println(x);
		
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String x = "";
		for(int i=r; i>=0; i--) {
			for(int k=0; k<c; k++) {
				if(i==size-k-1)
					x = x + m[k][i];
			}
		}
		if(x.contains(w))
			return true;
		//System.out.println(x);
		
		return false;
	}

    public String toString()
    {
 		for(int i=0; i<m.length; i++) {
 			for(int k=0; k<m.length; k++) {
 				System.out.print(m[i][k] + " ");
 			}
 			System.out.println();
 		} 
    	return "";
    }
}
