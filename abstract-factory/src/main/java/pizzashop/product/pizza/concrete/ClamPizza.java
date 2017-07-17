package pizzashop.product.pizza.concrete;

import pizzashop.factory.ingredient.PizzaIngredientFactory;
import pizzashop.product.pizza.Pizza;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	public void prepare() {
		System.out.println("preparing " + getName());
		setDough(ingredientFactory.createDough());
		setSauce(ingredientFactory.createSauce());
		setCheese(ingredientFactory.createCheese());
		setClam(ingredientFactory.createClam());
	}

}
