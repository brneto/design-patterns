package pizzashop.abstractfactory.ingredient.concrete;

import pizzashop.abstractfactory.ingredient.PizzaIngredientFactory;
import pizzashop.product.ingredient.Cheese;
import pizzashop.product.ingredient.Clams;
import pizzashop.product.ingredient.Dough;
import pizzashop.product.ingredient.Pepperoni;
import pizzashop.product.ingredient.Sauce;
import pizzashop.product.ingredient.Veggie;
import pizzashop.product.ingredient.concrete.FreshClams;
import pizzashop.product.ingredient.concrete.Garlic;
import pizzashop.product.ingredient.concrete.MarinaraSauce;
import pizzashop.product.ingredient.concrete.Mushroom;
import pizzashop.product.ingredient.concrete.Onion;
import pizzashop.product.ingredient.concrete.RedPepper;
import pizzashop.product.ingredient.concrete.ReggianoCheese;
import pizzashop.product.ingredient.concrete.SlicedPepperoni;
import pizzashop.product.ingredient.concrete.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggie[] createVerggies() {
		Veggie[] veggies = { new Garlic(),
							 new Onion(),
							 new Mushroom(),
							 new RedPepper() };
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
