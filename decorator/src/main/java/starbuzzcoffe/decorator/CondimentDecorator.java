package starbuzzcoffe.decorator;

import starbuzzcoffe.component.Beverage;

public	abstract class CondimentDecorator extends Beverage {
	private Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost();
	}

	@Override
	public String description() {
		return beverage.description();
	}
	
	
	
}
