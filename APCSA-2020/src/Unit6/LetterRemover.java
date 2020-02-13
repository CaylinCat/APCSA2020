package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Caylin Canoy

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("", 'c');
	}

	//add in second constructor
	public LetterRemover(String str, char car)
	{
		setRemover(str, car);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int location = cleaned.indexOf(lookFor);
		while (location > -1) {
			cleaned = cleaned.substring(0,location) + cleaned.substring(location+1);
			location = cleaned.indexOf(lookFor);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}