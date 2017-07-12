package starbuzzcoffe.beverage;

public abstract class Beverage {
	private String description;
	
	public String getDescription() {
		return description;
	}
	
	public abstract float cost();
}
