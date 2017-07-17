package pizzashop.factory.concrete;

import pizzashop.factory.PizzaFactory;
import pizzashop.product.pizza.Pizza;
import pizzashop.product.pizza.concrete.CheesePizza;
import pizzashop.product.pizza.concrete.ClamPizza;
import pizzashop.product.pizza.concrete.PepperoniPizza;
import pizzashop.product.pizza.concrete.VeggiePizza;
import pizzashop.product.pizza.exception.InvalidPizzaType;
import pizzashop.product.pizza.type.PizzaType;

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
