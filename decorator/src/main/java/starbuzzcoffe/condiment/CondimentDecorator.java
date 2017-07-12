package starbuzzcoffe.condiment;

import starbuzzcoffe.beverage.Beverage;

public 	abstract class CondimentDecorator extends Beverage {
	private String description;
	
	public String getDescription() {
		return this.description;
	}
}
