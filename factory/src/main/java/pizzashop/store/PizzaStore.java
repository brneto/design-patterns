package pizzashop.store;

import pizzashop.pizza.Pizza;
import pizzashop.pizza.PizzaType;

public abstract class PizzaStore {

	public final Pizza orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	abstract Pizza createPizza(PizzaType type);

}
