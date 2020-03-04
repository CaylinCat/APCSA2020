package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int numer, denom;
	//write two constructors
	public Rational(){
		setRational(1,1);
		
	}
	public Rational(int num1, int num2) {
		setRational(num1, num2);
	}

	//write a setRational method
	public void setRational(int num1, int num2) {
		numer = num1;
		denom = num2;
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int num1) {
		numer = num1;
	}
	public void setDenominator(int num2) {
		denom = num2;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		int numerator = numer*other.denom + other.numer*denom;
		//new denominator = (den1 * den2)
		int denominator = denom*other.denom;
		
		System.out.println(numer + " " + denom + " others: " + other.numer + " " + other.denom);
		numer = numerator;
		denom = denominator;
		System.out.println(numer + " " + denom);
		reduce();
	}

	private void reduce()
	{
		numer = numer/gcd(numer, denom);
		denom = denom/gcd(numer, denom);

	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		for(int x=min; x>1; x--) {
			if(numOne%x==0 && numTwo%x==0)
				return x;
		}
		return 1;
	}

	public Object clone ()
	{
		return new Rational(numer, denom);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return numer;
	}
	public int getDenominator() {
		return denom;
	}
	
	
	public boolean equals( Object obj)
	{
		Rational object = (Rational)obj;
		object.reduce();
		this.reduce();
		if(numer == object.numer && denom == object.denom)
			return true;
		return false;
	}

	public int compareTo(Rational other)
	{
		if(numer/denom > other.numer/other.denom) {
			return 1;
		}

		return -1;
	}



	
	//write  toString() method
	public String toString() {
		return numer + "/" + denom;
	}
	
	
}