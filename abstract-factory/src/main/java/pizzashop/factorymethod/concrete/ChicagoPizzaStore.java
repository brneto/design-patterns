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
		String style = "Chicago";
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		switch (type) {
		case CHEESE:
			return pizzaStyle(new CheesePizza(ingredientFactory), style);
		case PEPPERONI:
			return pizzaStyle(new PepperoniPizza(ingredientFactory), style);
		case CLAM:
			return pizzaStyle(new ClamPizza(ingredientFactory), style);
		case VEGGIE:
			return pizzaStyle(new VeggiePizza(ingredientFactory), style);
		default:
			throw new InvalidPizzaType(type);
		}
	}
	
	private Pizza pizzaStyle(Pizza pizza, String style) {
		pizza.setName(style + " Style Cheese Pizza");
		return pizza;
	}

}
