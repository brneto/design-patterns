package pizzashop.factory;

import pizzashop.pizza.Pizza;

public interface PizzaFactory {
	public Pizza createPizza(String type);
}
