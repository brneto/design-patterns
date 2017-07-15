package pizzashop;

import pizzashop.factory.CheesePizza;
import pizzashop.factory.GreekPizza;
import pizzashop.factory.PepperoniPizza;
import pizzashop.factory.Pizza;

public class PizzaOrder {

	public Pizza orderPizza(String type) {
		Pizza pizza;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else {
			pizza=null;
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
