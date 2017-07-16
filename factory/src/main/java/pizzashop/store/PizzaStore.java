package pizzashop.store;

import pizzashop.factory.PizzaFactory;
import pizzashop.pizza.Pizza;

public class PizzaStore {
	PizzaFactory factory;
	
	public PizzaStore(PizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza order(String type) {
		Pizza pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
