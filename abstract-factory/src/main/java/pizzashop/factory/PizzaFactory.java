package pizzashop.factory;

import pizzashop.product.pizza.Pizza;
import pizzashop.product.pizza.exception.InvalidPizzaType;
import pizzashop.product.pizza.type.PizzaType;

public interface PizzaFactory {
	public Pizza createPizza(PizzaType type) throws InvalidPizzaType;
}
