package pizzashop.factory.concrete;

import pizzashop.factory.PizzaIngredientFactory;
import pizzashop.product.ingredient.Cheese;
import pizzashop.product.ingredient.Clams;
import pizzashop.product.ingredient.Dough;
import pizzashop.product.ingredient.Pepperoni;
import pizzashop.product.ingredient.Sauce;
import pizzashop.product.ingredient.Veggie;
import pizzashop.product.ingredient.concrete.BlackOlives;
import pizzashop.product.ingredient.concrete.EggPlant;
import pizzashop.product.ingredient.concrete.FrozenClams;
import pizzashop.product.ingredient.concrete.MarinaraSauce;
import pizzashop.product.ingredient.concrete.ReggianoCheese;
import pizzashop.product.ingredient.concrete.SlicedPepperoni;
import pizzashop.product.ingredient.concrete.Spinach;
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
		Veggie[] veggies = { new Spinach(), new BlackOlives(), new EggPlant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
