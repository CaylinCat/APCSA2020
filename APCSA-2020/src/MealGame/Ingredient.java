package MealGame;

public class Ingredient extends MoveThing{
	
	String name, type;
	
	public Ingredient(){
		
	}
	public Ingredient(int x, int y, int w, int h, String i, int xSpd, int ySpd, String t) {
		super(x,y,w,h,i,xSpd,ySpd);
		type = t;
	}
	public Ingredient(int x, int y, int w, int h, String i, int xSpd, int ySpd, String n, String t) {
		super(x,y,w,h,i,xSpd,ySpd);
		name = n;
		type = t;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}