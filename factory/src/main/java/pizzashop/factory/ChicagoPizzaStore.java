package pizzashop.factory;

import pizzashop.exception.InvalidPizzaType;
import pizzashop.product.ChicagoStyleCheesePizza;
import pizzashop.product.ChicagoStyleClamPizza;
import pizzashop.product.ChicagoStylePepperoniPizza;
import pizzashop.product.ChicagoStyleVeggiePizza;
import pizzashop.product.Pizza;
import pizzashop.product.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaType type) throws InvalidPizzaType {
		switch (type) {
		case CHEESE:
			return new ChicagoStyleCheesePizza();
		case PEPPERONI:
			return new ChicagoStylePepperoniPizza();
		case CLAM:
			return new ChicagoStyleClamPizza();
		case VEGGIE:
			return new ChicagoStyleVeggiePizza();
		default:
			throw new InvalidPizzaType(type);
		}
	}

}
