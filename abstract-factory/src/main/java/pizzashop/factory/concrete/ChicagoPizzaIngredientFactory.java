package pizzashop.factory.concrete;

import pizzashop.factory.PizzaIngredientFactory;
import pizzashop.product.ingredient.Cheese;
import pizzashop.product.ingredient.Clams;
import pizzashop.product.ingredient.Dough;
import pizzashop.product.ingredient.Pepperoni;
import pizzashop.product.ingredient.Sauce;
import pizzashop.product.ingredient.Veggie;
import pizzashop.product.ingredient.concrete.FreshClams;
import pizzashop.product.ingredient.concrete.Garlic;
import pizzashop.product.ingredient.concrete.Mozzarella;
import pizzashop.product.ingredient.concrete.Mushroom;
import pizzashop.product.ingredient.concrete.Onion;
import pizzashop.product.ingredient.concrete.PlumTomatoSauce;
import pizzashop.product.ingredient.concrete.RedPepper;
import pizzashop.product.ingredient.concrete.SlicedPepperoni;
import pizzashop.product.ingredient.concrete.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozzarella();
	}

	@Override
	public Veggie[] createVerggies() {
		Veggie[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
