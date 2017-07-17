package pizzashop.factory;

import pizzashop.product.Pizza;
import pizzashop.product.exception.InvalidPizzaType;
import pizzashop.product.type.PizzaType;

public interface PizzaFactory {
	public Pizza createPizza(PizzaType type) throws InvalidPizzaType;
}
