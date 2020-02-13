package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Caylin Canoy
//Date - Sometime

public class VowelsRunner
{
	public static void main( String args[] )
	{
		//FirstLastVowel s = new FirstLastVowel();
		
		/*
		 * Although you could call the go method using s.go(""); after creating an s object,
		 * the go method came static in the FirstLastVowel class. Due to it being static
		 * I think it is appropriate to access it in a static way by using FirstLastVowel.go(""); 
		 * to call the method instead of creating an object and using that to call it.
		*/
			
		System.out.println(  FirstLastVowel.go(  "dog#cat#pigaplus")    );
		System.out.println(  FirstLastVowel.go(  "pigs#apluscompsci#food")    );
		System.out.println(  FirstLastVowel.go(  "##catgiraffeapluscompscI")    );
		System.out.println(  FirstLastVowel.go(  "apluscatsanddogsaplus###")    );
		System.out.println(  FirstLastVowel.go(  "###")    );
		System.out.println(  FirstLastVowel.go(  "Aplusdog#13337#pigaplusprogram")    );
		System.out.println(  FirstLastVowel.go(  "code#H00P#code1234")    );
		System.out.println(  FirstLastVowel.go(  "##wowgira77##eplus")    );
		System.out.println(  FirstLastVowel.go(  "catsandaplusdogsaplus###")    );
		System.out.println(  FirstLastVowel.go(  "7")    );
		System.out.println(  FirstLastVowel.go(  "A")    );
		System.out.println(  FirstLastVowel.go(  "E")    );
		System.out.println(  FirstLastVowel.go(  "9AEIOUaeiou@")    );

	}
}


