package pizzashop.factory;

import pizzashop.exception.InvalidPizzaType;
import pizzashop.pizza.Pizza;
import pizzashop.pizza.PizzaType;

public interface PizzaFactory {
	public Pizza createPizza(PizzaType type) throws InvalidPizzaType;
}
