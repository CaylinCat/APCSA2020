package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy testy = new Toy("sorry");
		Toy bob = new Toy ("gi joe");
		bob.setCount(5);
		System.out.println(testy);
		System.out.println(bob);
	}
}
