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
		
		int curAmount = amount;
		char curLet = letter;
		int diffLetAmount = amount;
		
		for(int k=amount; k>0; k--) {
			for(int j=diffLetAmount; j > 0; j--) {
				for(int i=curAmount; i > 0; i--) {
					System.out.print(curLet);
				}
				curLet = (char)(curLet + 1);
				if(curLet == '[')
					curLet = 'A';
				curAmount = curAmount - 1;
				System.out.print(" ");
			}
			diffLetAmount--;
			curAmount = amount;
			curLet = letter;
			System.out.println("");
		}
		
		
		
		return output;
	}
}