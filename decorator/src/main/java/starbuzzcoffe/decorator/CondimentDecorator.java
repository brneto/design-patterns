package starbuzzcoffe.decorator;

import starbuzzcoffe.component.Beverage;

public	abstract class CondimentDecorator implements Beverage {
	private Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public float cost() {
		return beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription();
	}
	
	
	
}
