package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases		
		Word testy = new Word("Hello");
		System.out.println(testy);
		testy.setString("World");
		System.out.println(testy);
		testy.setString("JukeBox");
		System.out.println(testy);
		testy.setString("TCEA");
		System.out.println(testy);
		testy.setString("UIL");
		System.out.println(testy);
	}
}