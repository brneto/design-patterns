package starbuzzcoffe;

import java.util.Locale;

import starbuzzcoffe.component.Beverage;
import starbuzzcoffe.component.DarkRoast;
import starbuzzcoffe.component.Espresso;
import starbuzzcoffe.component.HouseBlend;
import starbuzzcoffe.decorator.Mocha;
import starbuzzcoffe.decorator.Whip;

public class StarbuzzCoffeeOrder {
	
	public static void main (String[] args) {
		Beverage order;
		
		order = new Espresso();
		System.out.println(order.getDescription() + " $" + String.format(Locale.US, "%.2f", order.cost()));
		
		order = new DarkRoast();
		order = new Mocha(order);
		order = new Mocha(order);
		order = new Whip(order);
		System.out.println(order.getDescription() + " $" + String.format(Locale.US, "%.2f", order.cost()));
		
		order = new HouseBlend();
		order = new Mocha(order);
		order = new Mocha(order);
		order = new Whip(order);
		System.out.println(order.getDescription() + " $" + String.format(Locale.US, "%.2f", order.cost()));
	}

}
