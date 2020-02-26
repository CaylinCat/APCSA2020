package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddPos = -1;
		int evenPos = -1;
		for(int i=0; i<ray.size(); i++) {
			if(ray.get(i)%2 == 1) {
				oddPos = i;
				break;
			}
		}
		if(oddPos > -1) {
			for(int i=oddPos; i<ray.size(); i++) {
				if(ray.get(i)%2 == 0) {
					evenPos = i;
				}
			}
		}
		//System.out.println("oddPos: " + oddPos + " evenPos: " + evenPos);
		if(oddPos == -1 || evenPos == -1)
			return -1;
		return Math.abs(oddPos-evenPos);
	}
}