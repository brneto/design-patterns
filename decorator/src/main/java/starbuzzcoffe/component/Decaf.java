package starbuzzcoffe.component;

public class Decaf implements Beverage {

	@Override
	public String getDescription() {
		return "Decaf";
	}
	
	@Override
	public float cost() {
		return 1.05F;
	}

}
