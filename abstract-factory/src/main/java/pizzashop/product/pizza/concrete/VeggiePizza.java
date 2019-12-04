package pizzashop.product.pizza.concrete;

import pizzashop.abstractfactory.ingredient.PizzaIngredientFactory;
import pizzashop.product.pizza.Pizza;

public class VeggiePizza extends Pizza {

  public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory);
  }

  @Override
  public VeggiePizza prepare() {
    System.out.println("preparing " + getName());
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    veggies = ingredientFactory.createVerggies();
    return this;
  }

}
