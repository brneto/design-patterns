package pizzashop.product.pizza;

import pizzashop.abstractfactory.ingredient.PizzaIngredientFactory;
import pizzashop.product.ingredient.Cheese;
import pizzashop.product.ingredient.Clams;
import pizzashop.product.ingredient.Dough;
import pizzashop.product.ingredient.Pepperoni;
import pizzashop.product.ingredient.Sauce;
import pizzashop.product.ingredient.Veggie;

public abstract class Pizza {
	private String name;
	protected PizzaIngredientFactory ingredientFactory;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggie veggies[];
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;
	
	public Pizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public abstract Pizza prepare();

	public Pizza bake() {
		System.out.println("Bake for 25 minutes at 350");
		return this;
	}

	public Pizza cut() {
		System.out.println("Cutting the pizza into diagonal slices");
		return this;
	}

	public Pizza box() {
		System.out.println("Place pizza in official PizzaStore box");
		return this;
	}

	public Pizza setName(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

}
