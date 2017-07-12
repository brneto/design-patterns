package starbuzzcoffe.condiment;

public class Milk extends CondimentDecorator {

	@Override
	public String getDescription() {
		return "Milk";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return .10F;
	}

}
