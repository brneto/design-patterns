package pizzashop.store;

import pizzashop.pizza.NYStyleCheesePizza;
import pizzashop.pizza.NYStyleClamPizza;
import pizzashop.pizza.NYStylePepperoniPizza;
import pizzashop.pizza.NYStyleVeggiePizza;
import pizzashop.pizza.Pizza;
import pizzashop.pizza.PizzaType;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(PizzaType type) {
		switch (type) {
		case CHEESE:
			return new NYStyleCheesePizza();
		case VEGGIE:
			return new NYStyleVeggiePizza();
		case CLAM:
			return new NYStyleClamPizza();
		case PEPPERONI:
			return new NYStylePepperoniPizza();
		default:
			return null;
		}
	}
}
