package pizzashop.client;

import pizzashop.factory.PizzaFactory;
import pizzashop.product.Pizza;
import pizzashop.product.type.PizzaType;

public class PizzaStore {
	PizzaFactory pizzaFactory;
	
	public PizzaStore(PizzaFactory factory) {
		this.pizzaFactory = factory;
	}

	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = pizzaFactory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

}
