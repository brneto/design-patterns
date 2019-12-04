package pizzashop.product.pizza.concrete;

import pizzashop.abstractfactory.ingredient.PizzaIngredientFactory;
import pizzashop.product.pizza.Pizza;

public class GreekPizza extends Pizza {

  public GreekPizza(PizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory);
  }

  @Override
  public GreekPizza prepare() {
    System.out.println("preparing " + getName());
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    return this;
  }

}
