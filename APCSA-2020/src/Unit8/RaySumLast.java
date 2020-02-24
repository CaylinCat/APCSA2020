package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		for(int h=0; h<ray.length-1; h++) {
			if(ray[h]>ray[ray.length-1])
				sum+=ray[h];
		}
		if(sum>0)
			return sum;
		return -1;
	}
}