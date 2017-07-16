package pizzashop.factory;

import pizzashop.product.Pizza;
import pizzashop.product.exception.InvalidPizzaType;
import pizzashop.product.type.PizzaType;

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
