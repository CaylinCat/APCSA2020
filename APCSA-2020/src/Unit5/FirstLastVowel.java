package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String stringy = a.substring(0,1).toLowerCase();
	   String lastStringy = a.substring(a.length()-1, a.length()).toLowerCase();
	   if(stringy.equals("a") || stringy.equals("e") || stringy.equals("i") || stringy.equals("o") || stringy.equals("u") || stringy.equals("a") || lastStringy.equals("e") || lastStringy.equals("i") || lastStringy.equals("o") || lastStringy.equals("u"))
		   return "yes";
	   
	   else
		   return "no";
	}
}