package pizzashop.factory;

import pizzashop.product.ingredient.Cheese;
import pizzashop.product.ingredient.Clams;
import pizzashop.product.ingredient.Dough;
import pizzashop.product.ingredient.Pepperoni;
import pizzashop.product.ingredient.Sauce;
import pizzashop.product.ingredient.Veggie;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggie[] createVerggies();

	public Pepperoni createPepperoni();

	public Clams createClam();

}
