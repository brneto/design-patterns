package pizzashop.factory;

import pizzashop.pizza.CheesePizza;
import pizzashop.pizza.GreekPizza;
import pizzashop.pizza.PepperoniPizza;
import pizzashop.pizza.Pizza;

public class SimplePizzaFactory implements PizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		return pizza;
	}

}
