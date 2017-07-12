package starbuzzcoffe.condiment;

public class Whip extends CondimentDecorator {

	@Override
	public String getDescription() {
		return "Whip";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 0.10F;
	}

}
