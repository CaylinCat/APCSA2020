package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
		sort();
	}

	public void sort()
	{
		Arrays.parallelSort(wordRay);
	}

	public String toString()
	{
		String output="";
		for(String w : wordRay) {
			System.out.println(w);
		}
		return output+"\n\n";
	}
}