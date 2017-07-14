package starbuzzcoffe.decorator;

import starbuzzcoffe.component.Beverage;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String description() {
		return super.description() + ", Whip";
	}

	@Override
	public double cost() {
		return .10F + super.cost();
	}

}
