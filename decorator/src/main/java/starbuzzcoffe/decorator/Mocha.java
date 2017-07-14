package starbuzzcoffe.decorator;

import starbuzzcoffe.component.Beverage;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		super(beverage);
	}
		
	@Override
	public String description() {
		return super.description() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20F + super.cost();
	}

}
