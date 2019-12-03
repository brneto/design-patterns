package pizzashop.factorymethod.concrete;

import pizzashop.abstractfactory.ingredient.PizzaIngredientFactory;
import pizzashop.abstractfactory.ingredient.concrete.ChicagoPizzaIngredientFactory;
import pizzashop.factorymethod.PizzaStore;
import pizzashop.product.pizza.Pizza;
import pizzashop.product.pizza.concrete.CheesePizza;
import pizzashop.product.pizza.concrete.ClamPizza;
import pizzashop.product.pizza.concrete.PepperoniPizza;
import pizzashop.product.pizza.concrete.VeggiePizza;
import pizzashop.product.pizza.exception.InvalidPizzaType;
import pizzashop.product.pizza.type.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaType type) throws InvalidPizzaType {
		String style = "Chicago Style Cheese Pizza";
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		switch (type) {
		case CHEESE:
			return (new CheesePizza(ingredientFactory)).setName(style);
		case PEPPERONI:
			return (new PepperoniPizza(ingredientFactory)).setName(style);
		case CLAM:
			return (new ClamPizza(ingredientFactory)).setName(style);
		case VEGGIE:
			return (new VeggiePizza(ingredientFactory)).setName(style);
		default:
			throw new InvalidPizzaType(type);
		}
	}
}
