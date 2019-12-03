package pizzashop.factorymethod;

import pizzashop.product.pizza.Pizza;
import pizzashop.product.pizza.exception.InvalidPizzaType;
import pizzashop.product.pizza.type.PizzaType;

public abstract class PizzaStore {
	
	public final Pizza orderPizza(PizzaType type) {
		return createPizza(type)
			.prepare()
			.bake()
			.cut()
			.box();
	}

	protected abstract Pizza createPizza(PizzaType type) throws InvalidPizzaType;
	
	Pizza addIngredients(PizzaType type, PizzaIngredientFactory ingredientFactory) throws InvalidPizzaType {
		switch (type) {
		case CHEESE:
			return new CheesePizza(ingredientFactory);
		case PEPPERONI:
			return new PepperoniPizza(ingredientFactory);
		case CLAM:
			return new ClamPizza(ingredientFactory);
		case VEGGIE:
			return new VeggiePizza(ingredientFactory);
		default:
			throw new InvalidPizzaType(type);
		}
	}

}
