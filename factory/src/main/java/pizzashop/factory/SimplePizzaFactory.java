package pizzashop.factory;

import pizzashop.exception.InvalidPizzaType;
import pizzashop.pizza.CheesePizza;
import pizzashop.pizza.GreekPizza;
import pizzashop.pizza.PepperoniPizza;
import pizzashop.pizza.Pizza;
import pizzashop.pizza.PizzaType;

public class SimplePizzaFactory implements PizzaFactory {

	@Override
	public Pizza createPizza(PizzaType type) throws InvalidPizzaType {
		switch (type) {
		case CHEESE:
			return new CheesePizza();
		case GREEK:
			return new GreekPizza();
		case PEPPERONI:
			return new PepperoniPizza();
		default:
			throw new InvalidPizzaType(type);
		}
	}

}
