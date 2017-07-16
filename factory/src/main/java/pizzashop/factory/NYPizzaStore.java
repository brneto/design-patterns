package pizzashop.factory;

import pizzashop.exception.InvalidPizzaType;
import pizzashop.product.NYStyleCheesePizza;
import pizzashop.product.NYStyleClamPizza;
import pizzashop.product.NYStylePepperoniPizza;
import pizzashop.product.NYStyleVeggiePizza;
import pizzashop.product.Pizza;
import pizzashop.product.PizzaType;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaType type) throws InvalidPizzaType {
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
