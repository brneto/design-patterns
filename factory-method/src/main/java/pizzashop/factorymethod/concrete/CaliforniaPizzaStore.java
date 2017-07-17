package pizzashop.factorymethod.concrete;

import pizzashop.factorymethod.PizzaStore;
import pizzashop.product.Pizza;
import pizzashop.product.concrete.CaliforniaStyleCheesePizza;
import pizzashop.product.concrete.CaliforniaStyleClamPizza;
import pizzashop.product.concrete.CaliforniaStylePepperoniPizza;
import pizzashop.product.concrete.CaliforniaStyleVeggiePizza;
import pizzashop.product.exception.InvalidPizzaType;
import pizzashop.product.type.PizzaType;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaType type) throws InvalidPizzaType {
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
