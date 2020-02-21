package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
		
	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int smolNum = a;
		if(b<smolNum)
			smolNum = b;
		if(c<smolNum)
			smolNum = c;
		for(int i = 1; i<smolNum; i++) {
			if(a%i == 0 && b%i == 0 && c%i ==0) {
				max = i;
				//Debugging: System.out.println(" smolNum: " + smolNum + " GCF: " + max);
			}
		}

		return max;
	}

	public String toString()
	{
		String output="";
		int a =1;
		int b = 1;
		int c = 1;

		for(int i=1; i<number; i++) {
			for(int j=1; j<number; j++) {
				for(int k=1; k<number; k+=2) {
					c = k;
					if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
						if((a%2==1 && b%2==0) || (a%2==0 && b%2==1)) {
							if(b>a && greatestCommonFactor(a,b,c) == 1) {
								output = output + a + " " + b + " " + c + "\n";
							}
						}
					}
				}
				b = j;;
				
			}
			a = i;
			
		}




		return output+"\n";
	}
}