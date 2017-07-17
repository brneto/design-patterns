package pizzashop.factorymethod.concrete;

import pizzashop.factorymethod.PizzaStore;
import pizzashop.product.Pizza;
import pizzashop.product.concrete.ChicagoStyleCheesePizza;
import pizzashop.product.concrete.ChicagoStyleClamPizza;
import pizzashop.product.concrete.ChicagoStylePepperoniPizza;
import pizzashop.product.concrete.ChicagoStyleVeggiePizza;
import pizzashop.product.exception.InvalidPizzaType;
import pizzashop.product.type.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaType type) throws InvalidPizzaType {
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
