package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Caylin Canoy
//Date - Sometime

public class AvgLenRunner
{
	public static void main( String args[] )
	{
		/*
		 * Although you could call the go method using s.go(""); after creating an s object,
		 * the go method came static in the AvgLen class. Due to it being static
		 * I think it is appropriate to access it in a static way by using AvgLen.go(""); 
		 * to call the method instead of creating an object and using that to call it.
		*/
		
		System.out.println( AvgLen.go( "dog", "cats" ) ) ;
		System.out.println( AvgLen.go( "aplus", "pigs" ) ) ;
		System.out.println( AvgLen.go( "catgiraffe", "apluscompsci" ) ) ;
		System.out.println( AvgLen.go( "ap", "aplus" ) ) ;
		System.out.println( AvgLen.go( "pluscat", "dogsaplus" ) ) ;
		System.out.println( AvgLen.go( "#", "#" ) ) ;
		System.out.println( AvgLen.go( "aplusdog#13337#", "pigaplusprogram" ) ) ;
		System.out.println( AvgLen.go( "code", "code1234" ) ) ;
		System.out.println( AvgLen.go( "wow", "eplus" ) ) ;
		System.out.println( AvgLen.go( "catsand" , "aplusdogsaplus" ) ) ;
		System.out.println( AvgLen.go( "7", "77777" ) ) ;
		
	}
}