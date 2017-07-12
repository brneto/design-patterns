package starbuzzcoffe.decorator;

import starbuzzcoffe.component.Beverage;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Whip";
	}

	@Override
	public float cost() {
		return .10F + super.cost();
	}

}
