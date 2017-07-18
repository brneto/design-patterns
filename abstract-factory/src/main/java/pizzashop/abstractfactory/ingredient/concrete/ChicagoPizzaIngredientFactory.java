package pizzashop.abstractfactory.ingredient.concrete;

import pizzashop.abstractfactory.ingredient.PizzaIngredientFactory;
import pizzashop.product.ingredient.Cheese;
import pizzashop.product.ingredient.Clams;
import pizzashop.product.ingredient.Dough;
import pizzashop.product.ingredient.Pepperoni;
import pizzashop.product.ingredient.Sauce;
import pizzashop.product.ingredient.Veggie;
import pizzashop.product.ingredient.concrete.BlackOlives;
import pizzashop.product.ingredient.concrete.Eggplant;
import pizzashop.product.ingredient.concrete.FrozenClams;
import pizzashop.product.ingredient.concrete.MozzarellaCheese;
import pizzashop.product.ingredient.concrete.PlumTomatoSauce;
import pizzashop.product.ingredient.concrete.SlicedPepperoni;
import pizzashop.product.ingredient.concrete.Spinach;
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
		return new MozzarellaCheese();
	}

	@Override
	public Veggie[] createVerggies() {
		Veggie[] veggies = { new BlackOlives(),
							 new Spinach(),
							 new Eggplant() };
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
