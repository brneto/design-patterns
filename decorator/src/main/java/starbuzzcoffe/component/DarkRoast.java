package starbuzzcoffe.component;

public class DarkRoast implements Beverage {

	@Override
	public String getDescription() {
		return "Dark Roast Coffee";
	}
	
	@Override
	public float cost() {
		return .99F;
	}

}
