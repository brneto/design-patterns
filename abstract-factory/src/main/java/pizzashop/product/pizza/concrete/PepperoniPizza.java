package pizzashop.product.pizza.concrete;

import pizzashop.abstractfactory.ingredient.PizzaIngredientFactory;
import pizzashop.product.pizza.Pizza;

public class PepperoniPizza extends Pizza {

  public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory);
  }

  @Override
  public PepperoniPizza prepare() {
    System.out.println("preparing " + getName());
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    pepperoni = ingredientFactory.createPepperoni();
    return this;
  }

}
