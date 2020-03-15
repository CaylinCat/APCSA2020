package DataLab;
import java.util.ArrayList;
import java.util.Scanner;

import core.data.*;

public class FarmersMarketRunner {
   public static void main(String[] args) {
	   DataSource ds = DataSource.connect("https://data.baltimorecity.gov/api/views/atzp-3tnt/rows.xml").load();
	   //ds.printUsageString();
	      ArrayList<FarmersMarket> allmrk = ds.fetchList(FarmersMarket.class, "row/row/name", "row/row/day_", "row/row/monthsopen", 
	    		  "row/row/monthsclose", "row/row/openingtime", "row/row/closingtime", "row/row/numberofvendors");
	      
	      System.out.println("Total number of Farmer's Markets: " + allmrk.size() + "\n");
	      
	      ArrayList<String> Tuesdays = new ArrayList<String>();
	      for (FarmersMarket ws : allmrk) {
	         if(ws.getDay().equals("Tuesday"))
	        	 Tuesdays.add(ws.getName());
	      }
	      System.out.println("The question: How many farmers markets are open on Tuesday in Baltimore? ");
	      System.out.println(Tuesdays.size() + " farmers markets are open on Tuesday! They are: " + Tuesdays);
	      
	      System.out.println("\nThese are all the farmers markets in Baltimore!");
	      for(FarmersMarket ws : allmrk) {
	    	  System.out.println(ws.getName());
	      }
	      
	      
   }
}

