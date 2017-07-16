package pizzashop.factory;

import pizzashop.exception.InvalidPizzaType;
import pizzashop.product.Pizza;
import pizzashop.product.PizzaType;

public abstract class PizzaStore {

	public final Pizza orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	abstract Pizza createPizza(PizzaType type) throws InvalidPizzaType;

}
