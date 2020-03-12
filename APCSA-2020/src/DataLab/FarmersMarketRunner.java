package DataLab;
import java.util.ArrayList;
import java.util.Scanner;

import core.data.*;

public class FarmersMarketRunner {
   public static void main(String[] args) {
	   DataSource ds = DataSource.connect("https://data.baltimorecity.gov/api/views/atzp-3tnt/rows.xml").load();
	   ds.printUsageString();
	      ArrayList<FarmersMarket> allmrk = ds.fetchList(FarmersMarket.class, "row/row/name", "row/row/day_", "row/row/monthsopen", 
	    		  "row/row/monthsclose", "row/row/openingtime", "row/row/closingtime", "row/row/numberofvendors");
	      
	      System.out.println("Total number of Farmer's Markets: " + allmrk.size());
	      
	      /*Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a state abbreviation: ");
	      String state = sc.next();
	      System.out.println("Stations in " + state); */
	      //int count = 0;
	      for (FarmersMarket ws : allmrk) {
	         System.out.println(ws.getName());
	      }
	      
	      
   }
}

