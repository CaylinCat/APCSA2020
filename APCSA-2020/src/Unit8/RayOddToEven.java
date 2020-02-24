package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int firstEven =0;
		int firstOdd = 0;
		boolean evenFound = false;
		boolean oddFound = false;
		
		for(int h=0; h<ray.length; h++) {
			if(ray[h]%2==1) {
				firstOdd = h;
				oddFound = true;
				break;
			}
		}
		for(int h=firstOdd; h<ray.length; h++) {
			if(ray[h]%2==0) {
				firstEven = h;
				evenFound = true;
				break;
			}
		}
		
		
		//System.out.println("This is the 1st odd & 1st even: " + firstOdd + " " + firstEven);
		
		if (evenFound && oddFound)
			return Math.abs(firstEven - firstOdd);
		return -1;
	}
}