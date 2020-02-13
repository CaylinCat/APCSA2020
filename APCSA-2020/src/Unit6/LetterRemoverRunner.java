package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Caylin Canoy

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases	
		LetterRemover testy = new LetterRemover("I am Sam I am", 'a');
		System.out.println(testy);
		System.out.println(testy.removeLetters() + "\n");
		testy.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(testy);
		System.out.println(testy.removeLetters() + "\n");
		testy.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(testy);
		System.out.println(testy.removeLetters() + "\n");
		testy.setRemover("abababababa", 'b');
		System.out.println(testy);
		System.out.println(testy.removeLetters() + "\n");
		testy.setRemover("abaababababa", 'x');
		System.out.println(testy);
		System.out.println(testy.removeLetters() + "\n");
											
	}
}