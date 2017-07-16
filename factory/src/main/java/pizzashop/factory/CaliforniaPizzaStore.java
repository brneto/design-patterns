package pizzashop.factory;

import pizzashop.exception.InvalidPizzaType;
import pizzashop.product.CaliforniaStyleCheesePizza;
import pizzashop.product.CaliforniaStyleClamPizza;
import pizzashop.product.CaliforniaStylePepperoniPizza;
import pizzashop.product.CaliforniaStyleVeggiePizza;
import pizzashop.product.Pizza;
import pizzashop.product.PizzaType;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(PizzaType type) throws InvalidPizzaType {
		switch (type) {
		case CHEESE:
			return new CaliforniaStyleCheesePizza();
		case PEPPERONI:
			return new CaliforniaStylePepperoniPizza();
		case CLAM:
			return new CaliforniaStyleClamPizza();
		case VEGGIE:
			return new CaliforniaStyleVeggiePizza();
		default:
			throw new InvalidPizzaType(type);
		}
	}
	
}
