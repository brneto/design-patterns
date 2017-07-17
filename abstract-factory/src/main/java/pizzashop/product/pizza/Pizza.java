package pizzashop.product.pizza;

import pizzashop.product.ingredient.Cheese;
import pizzashop.product.ingredient.Clams;
import pizzashop.product.ingredient.Dough;
import pizzashop.product.ingredient.Pepperoni;
import pizzashop.product.ingredient.Sauce;
import pizzashop.product.ingredient.Veggie;

public abstract class Pizza {
	private String name;
	private Dough dough;
	private Sauce sauce;
	private Veggie veggies[];
	private Cheese cheese;
	private Pepperoni pepperoni;
	private Clams clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public void setVeggies(Veggie[] veggies) {
		this.veggies = veggies;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}

	public void setClam(Clams clam) {
		this.clam = clam;
	}

}
