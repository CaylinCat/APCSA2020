package QuarterThreeLabAssessment;

public class Ingredient{
	
	private String name;
	private double cost;
	private int rating;
	
	public Ingredient() {
		setName("");
		setCost(0);
		setRating(0);
	}
	
	public Ingredient(String n, double c, int r) {
		setName(n);
		setCost(c);
		setRating(r);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}