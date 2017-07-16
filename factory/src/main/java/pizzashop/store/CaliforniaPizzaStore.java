package pizzashop.store;

import pizzashop.pizza.CalifoniaStyleCheesePizza;
import pizzashop.pizza.CaliforniaStyleClamPizza;
import pizzashop.pizza.CaliforniaStylePepperoniPizza;
import pizzashop.pizza.CaliforniaStyleVeggiePizza;
import pizzashop.pizza.Pizza;
import pizzashop.pizza.PizzaType;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(PizzaType type) {
		switch (type) {
		case CHEESE:
			return new CalifoniaStyleCheesePizza();
		case PEPPERONI:
			return new CaliforniaStylePepperoniPizza();
		case CLAM:
			return new CaliforniaStyleClamPizza();
		case VEGGIE:
			return new CaliforniaStyleVeggiePizza();
		default:
			return null;
		}
	}
	
}
