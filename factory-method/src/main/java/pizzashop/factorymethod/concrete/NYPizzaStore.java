package pizzashop.factorymethod.concrete;

import pizzashop.factorymethod.PizzaStore;
import pizzashop.product.Pizza;
import pizzashop.product.concrete.NYStyleCheesePizza;
import pizzashop.product.concrete.NYStyleClamPizza;
import pizzashop.product.concrete.NYStylePepperoniPizza;
import pizzashop.product.concrete.NYStyleVeggiePizza;
import pizzashop.product.exception.InvalidPizzaType;
import pizzashop.product.type.PizzaType;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaType type) throws InvalidPizzaType {
		switch (type) {
		case CHEESE:
			return new NYStyleCheesePizza();
		case PEPPERONI:
			return new NYStylePepperoniPizza();
		case CLAM:
			return new NYStyleClamPizza();
		case VEGGIE:
			return new NYStyleVeggiePizza();
		default:
			throw new InvalidPizzaType(type);
		}
	}
}
