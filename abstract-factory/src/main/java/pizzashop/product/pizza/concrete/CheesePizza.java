package pizzashop.product.pizza.concrete;

import pizzashop.abstractfactory.ingredient.PizzaIngredientFactory;
import pizzashop.product.pizza.Pizza;

public class CheesePizza extends Pizza {

  public CheesePizza(PizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory);
  }

  @Override
  public CheesePizza prepare() {
    System.out.println("preparing " + getName());
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    return this;
  }

}
