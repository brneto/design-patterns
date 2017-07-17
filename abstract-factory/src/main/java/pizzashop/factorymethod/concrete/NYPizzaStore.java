package pizzashop.factorymethod.concrete;

import pizzashop.factory.ingredient.PizzaIngredientFactory;
import pizzashop.factory.ingredient.concrete.NYPizzaIngredientFactory;
import pizzashop.factorymethod.PizzaStore;
import pizzashop.product.pizza.Pizza;
import pizzashop.product.pizza.concrete.CheesePizza;
import pizzashop.product.pizza.concrete.ClamPizza;
import pizzashop.product.pizza.concrete.PepperoniPizza;
import pizzashop.product.pizza.concrete.VeggiePizza;
import pizzashop.product.pizza.exception.InvalidPizzaType;
import pizzashop.product.pizza.type.PizzaType;

public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(PizzaType type) throws InvalidPizzaType {
		Pizza pizza;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		switch (type) {
		case CHEESE:
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
			return pizza;
		case PEPPERONI:
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
			return pizza;
		case CLAM:
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
			return pizza;
		case VEGGIE:
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
			return pizza;
		default:
			throw new InvalidPizzaType(type);
		}
	}

}
