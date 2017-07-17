package pizzashop.product.pizza.concrete;

import pizzashop.factory.PizzaIngredientFactory;
import pizzashop.product.pizza.Pizza;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		 this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("preparing " + getName());
		setDough(ingredientFactory.createDough());
		setSauce(ingredientFactory.createSauce());
		setCheese(ingredientFactory.createCheese());
	}

	@Override
	public void bake() {
		System.out.println("baking cheese pizza...");
	}

	@Override
	public void cut() {
		System.out.println("cutting cheese pizza...");
	}

	@Override
	public void box() {
		System.out.println("boxing cheese pizza...");
	}

}
