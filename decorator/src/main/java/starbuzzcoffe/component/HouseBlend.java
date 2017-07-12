package starbuzzcoffe.component;

public class HouseBlend implements Beverage {

	@Override
	public String getDescription() {
		return "House Blend Coffee";
	}
	
	@Override
	public float cost() {
		return .89F;
	}

}
