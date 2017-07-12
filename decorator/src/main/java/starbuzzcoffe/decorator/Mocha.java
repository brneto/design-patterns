package starbuzzcoffe.decorator;

import starbuzzcoffe.component.Beverage;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		super(beverage);
	}
		
	@Override
	public String getDescription() {
		return super.getDescription() + ", Mocha";
	}

	@Override
	public float cost() {
		return .20F + super.cost();
	}

}
