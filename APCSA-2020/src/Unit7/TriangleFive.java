package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('c');
		setAmount(6);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		
		for(int j=amount; j > 0; j--) {
			for(int i=amount; i > 0; i--) {
				System.out.println(letter);
			}
			//letter = letter - 1;
		}
		
		
		
		
		return output;
	}
}