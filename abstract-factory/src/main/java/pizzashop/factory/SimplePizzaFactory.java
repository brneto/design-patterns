package pizzashop.factory;

import pizzashop.product.CheesePizza;
import pizzashop.product.ClamPizza;
import pizzashop.product.PepperoniPizza;
import pizzashop.product.Pizza;
import pizzashop.product.VeggiePizza;
import pizzashop.product.exception.InvalidPizzaType;
import pizzashop.product.type.PizzaType;

public class SimplePizzaFactory implements PizzaFactory {

	public Pizza createPizza(PizzaType type) throws InvalidPizzaType {
		switch (type) {
		case CHEESE:
			return new CheesePizza();
		case PEPPERONI:
			return new PepperoniPizza();
		case CLAM:
			return new ClamPizza();
		case VEGGIE:
			return new VeggiePizza();
		default:
			throw new InvalidPizzaType(type);
		}
	}

}
