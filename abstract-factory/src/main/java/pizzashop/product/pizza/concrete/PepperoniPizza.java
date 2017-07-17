package pizzashop.product.pizza.concrete;

import pizzashop.factory.ingredient.PizzaIngredientFactory;
import pizzashop.product.pizza.Pizza;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("preparing " + getName());
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		pepperoni = ingredientFactory.createPepperoni();
	}

}
