package starbuzzcoffe.condiment;

public class Soy extends CondimentDecorator {

	@Override
	public String getDescription() {
		return "Soy";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 0.15F;
	}

}
