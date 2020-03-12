package DataLab;
/*
 Represents information about a NWS weather station
*/

public class FarmersMarket {
   private String name, day, monthsopen, monthsclose, openingtime, closingtime;
   private int numberOfVendors;
   
   FarmersMarket(String name, String day, String monthsopen, String monthsclose, String openingtime, String closingtime, int numberOfVendors) {
	   this.name = name;
	   this.day = day;
	   this.monthsopen = monthsopen;
	   this.monthsclose = monthsclose;
	   this.openingtime = openingtime;
	   this.closingtime = closingtime;
	   this.numberOfVendors = numberOfVendors;
   }
	
   //getters & setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDay() {
		return day;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	public String getMonthsopen() {
		return monthsopen;
	}
	
	public void setMonthsopen(String monthsopen) {
		this.monthsopen = monthsopen;
	}
	
	public String getMonthsclose() {
		return monthsclose;
	}
	
	public void setMonthsclose(String monthsclose) {
		this.monthsclose = monthsclose;
	}
	
	public String getOpeningtime() {
		return openingtime;
	}
	
	public void setOpeningtime(String openingtime) {
		this.openingtime = openingtime;
	}
	
	public String getClosingtime() {
		return closingtime;
	}
	
	public void setClosingtime(String closingtime) {
		this.closingtime = closingtime;
	}
	
	public int getNumberOfVendors() {
		return numberOfVendors;
	}
	
	public void setNumberOfVendors(int numberOfVendors) {
		this.numberOfVendors = numberOfVendors;
	}
	
	public boolean open(String day) {
		if(this.day.equals(day))
			return true;
		return false;
	}
   
   
}