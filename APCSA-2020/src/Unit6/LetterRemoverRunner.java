package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases	
		LetterRemover testyLetterRemover = new LetterRemover("I am Sam I am", 'a');
		System.out.println(testyLetterRemover);
		System.out.println(testyLetterRemover.removeLetters() + "\n");
		testyLetterRemover.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(testyLetterRemover);
		System.out.println(testyLetterRemover.removeLetters() + "\n");
		testyLetterRemover.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(testyLetterRemover);
		System.out.println(testyLetterRemover.removeLetters() + "\n");
		testyLetterRemover.setRemover("abababababa", 'b');
		System.out.println(testyLetterRemover);
		System.out.println(testyLetterRemover.removeLetters() + "\n");
		testyLetterRemover.setRemover("abaababababa", 'x');
		System.out.println(testyLetterRemover);
		System.out.println(testyLetterRemover.removeLetters() + "\n");
											
	}
}