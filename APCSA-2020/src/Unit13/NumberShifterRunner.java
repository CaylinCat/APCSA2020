package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		int[] testy = NumberShifter.makeLucky7Array(9);
		System.out.println(Arrays.toString(testy));
		NumberShifter.shiftEm(testy);
		System.out.println(Arrays.toString(testy));
		System.out.println();
		testy = NumberShifter.makeLucky7Array(9);
		System.out.println(Arrays.toString(testy));
		NumberShifter.shiftEm(testy);
		System.out.println(Arrays.toString(testy));
		System.out.println();
		testy = NumberShifter.makeLucky7Array(9);
		System.out.println(Arrays.toString(testy));
		NumberShifter.shiftEm(testy);
		System.out.println(Arrays.toString(testy));
	}
}



