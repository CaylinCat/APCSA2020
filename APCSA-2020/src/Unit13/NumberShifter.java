package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] newArray = new int[size];
		for(int i=0; i<size; i++) {
			newArray[i] = (int)(Math.random()*10);
			//System.out.println(newArray[i]);
		}
		return newArray;
	}
	public static void shiftEm(int[] array)
	{
	  for( int i = 0; i < array.length; i++){
				
	    int j = i;
				
	    while( j < array.length && array[j] != 7){

	       j++;
	    }
	 
	    if( j != i && j < array.length ){
	       int t = array[j];
	       array[j] = array[i];
	       array[i] = t;
	    }
	  }
	}
}