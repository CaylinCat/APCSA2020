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
	public Store(String storeName, Sandwhich hi) {
		setName(storeName);
		addSandwhich(hi);
	}
	public Store(String storeName) {
		setName(storeName);
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
	public void addSandwhich(Sandwhich hi) {
		sandwhich.add(hi);
	}
	public void setSandwhich(int place, String name, String ingre) {
		sandwhich.set(place, new Sandwhich(name, ingre));
	}
	public String getSandwhiches() {
		String uwu = "";
		for(Sandwhich hi : sandwhich) {
			uwu = uwu + hi.getName() + " - " + hi.getIngredients() + "\n";
		}
		return uwu;
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
	
	public String bestStarRating() {
		Sandwhich hi = sandwhich.get(0);
		for(Sandwhich boo : sandwhich) {
			if(boo.starRating() > hi.starRating()) {
				hi = boo;
			}
		}
		return hi.getName() + " with " + hi.starRating() + " stars!";
	}
	
	public Sandwhich cheapestSandwhich() {
		Sandwhich hi = sandwhich.get(0);
		for(Sandwhich boo : sandwhich) {
			if(boo.salePrice(0.2) < hi.salePrice(0.2)) {
				hi = boo;
			}
		}
		return hi;
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
		for(Sandwhich hi : sandwhich) {
		      if(hi.getName().equals(nameWhich))      
		         return true;   
		   }
	   return false;
	}
	public Sandwhich findMe(String nameWhich) {
		   for(Sandwhich hi : sandwhich) {
		      if(hi.getName().equals(nameWhich))      
		         return hi;   
		   }
		   return null;
	}
	//binarySearch
	public int binarySearch(int key, int low, int high) {
		    int middle = (low + high) / 2;
		    if (high < low) {
		        return -1;
		    }
		    if (key == sandwhich.get(middle).salePrice(0.2)) {
		        return middle;
		    } else if (key < sandwhich.get(middle).salePrice(0.2)) {
		        return binarySearch(key, low, middle - 1);
		    } else {
		        return binarySearch(key, middle + 1, high);
		    }
	}


	public String toString() {
		return getName() +" which has \n"+ getSandwhiches();
	}
}