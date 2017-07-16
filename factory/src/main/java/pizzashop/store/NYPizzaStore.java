package pizzashop.store;

import pizzashop.pizza.NYStyleCheesePizza;
import pizzashop.pizza.NYStyleClamPizza;
import pizzashop.pizza.NYStylePepperoniPizza;
import pizzashop.pizza.NYStyleVeggiePizza;
import pizzashop.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (type.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else
			return null;
	}
}
