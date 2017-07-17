package pizzashop.product.pizza.concrete;

import pizzashop.factory.ingredient.PizzaIngredientFactory;
import pizzashop.product.pizza.Pizza;

public class GreekPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public GreekPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("preparing " + getName());
		setDough(ingredientFactory.createDough());
		setSauce(ingredientFactory.createSauce());
		setCheese(ingredientFactory.createCheese());
	}

}
