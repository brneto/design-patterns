package starbuzzcoffe.decorator;

import starbuzzcoffe.component.Beverage;

public class Soy extends Condiment {
	
	public Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String description() {
		return super.description() + ", Soy";
	}

	@Override
	public double cost() {
		return .15F + super.cost();
	}

}
