package Unit0;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Caylin Canoy
//Date - 1/31/20
//Class - APCSA
//Lab  - AsciiBox

public class AsciiBox
{
	public static void main(String[] args)
	{
		System.out.println("Caylin \t  1/30/20 \n\n" );
		for(int i = 0; i < 3; i++) {
			plus(3);
			aa(1);
		}
		
	}
	public static void plus(int x) {
		for(int i = 0; i < x; i++) {
			System.out.println("+++++++++++++++++++++++++");
		}
	}
	public static void aa(int x) {
		for(int i = 0; i < x; i++) {
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");
		}
	}
}