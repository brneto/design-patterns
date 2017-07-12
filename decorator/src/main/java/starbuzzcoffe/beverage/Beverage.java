package starbuzzcoffe.beverage;

public abstract class Beverage {
	private String description;
	
	public abstract float cost();
	
	public String getDescription() {
		return description;
	}
}
