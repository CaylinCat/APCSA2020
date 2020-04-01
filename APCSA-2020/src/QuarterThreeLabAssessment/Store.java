package QuarterThreeLabAssessment;

import java.util.ArrayList;

public class Store{
	
	private String name;
	private ArrayList<Sandwhich> sandwhich = new ArrayList<Sandwhich>();
	
	public Store() {
		setName("");
		addSandwhich("", "");
	}
	
	public Store(String storeName, String ingre, String sanName) {
		setName(storeName);
		addSandwhich(sanName, ingre);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addSandwhich(String name, String ingre) {
		sandwhich.add(new Sandwhich(name, ingre));
	}
	public void setSandwhich(int place, String name, String ingre) {
		sandwhich.set(place, new Sandwhich(name, ingre));
	}
	public ArrayList<Sandwhich> getSandwhiches() {
		return sandwhich;
	}
	
	public String getIngredientsInHouse() {
		String ingredients = "";
		for(Sandwhich hi : sandwhich) {
			ingredients += hi.getIngredients() + " ";
		}
		return ingredients;
	}
	
	public int getTotalNumIngredients() {
		int num = 0;
		for(Sandwhich hi : sandwhich) {
			num+=hi.getNumIngredients();
		}
		return num;
	}

	public int compareIngredientsAmount(Sandwhich param, Sandwhich uwu) {
		if(uwu.getNumIngredients()>param.getNumIngredients())
		  return 1;
		else if (uwu.getNumIngredients()<param.getNumIngredients())
		  return -1;
		return 0;
	}
	
	//Selection sort
	public void sortSandwhichByCost() {
	   for(int i=0; i< sandwhich.size()-1; i++){
	      int min = i;
	      for(int j = i+1; j<sandwhich.size(); j++)
	      {
	         if(sandwhich.get(j).cost() < sandwhich.get(min).cost())
	            min = j;    		//find location of smallest
	      }
	      if(min != i) {
	         Sandwhich temp = sandwhich.get(min);
	         //stuff[min] = stuff[i];
	         sandwhich.set(min, sandwhich.get(i));
	         //stuff[i] = temp;   	//put smallest in spot i
	         sandwhich.set(i,temp);
	      }
	   }
	}
	
	//linear search
	public boolean sandwhichInHouse(String nameWhich) {
	   for(int spot=0; spot<sandwhich.size(); spot++) {
	      if(sandwhich.get(spot).getName()==nameWhich)      
	         return true;   
	   }
	   return false;
	}


	public String toString() {
		return getName() +" = "+ getSandwhiches();
	}
}