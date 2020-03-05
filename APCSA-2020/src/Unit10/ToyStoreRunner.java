package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore testy = new ToyStore();
		testy.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		testy.sortToysByCount();
		//testy.getMostFrequentToy();
		System.out.println(testy);
	}
}