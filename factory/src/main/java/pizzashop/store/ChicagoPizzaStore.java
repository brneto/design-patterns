package pizzashop.store;

import pizzashop.pizza.ChicagoStyleCheesePizza;
import pizzashop.pizza.ChicagoStyleClamPizza;
import pizzashop.pizza.ChicagoStylePepperoniPizza;
import pizzashop.pizza.ChicagoStyleVeggiePizza;
import pizzashop.pizza.Pizza;
import pizzashop.pizza.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(PizzaType type) {
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
			return null;
		}
	}

}
