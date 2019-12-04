package pizzashop.factorymethod;

import pizzashop.abstractfactory.ingredient.PizzaIngredientFactory;
import pizzashop.product.pizza.Pizza;
import pizzashop.product.pizza.concrete.CheesePizza;
import pizzashop.product.pizza.concrete.ClamPizza;
import pizzashop.product.pizza.concrete.PepperoniPizza;
import pizzashop.product.pizza.concrete.VeggiePizza;
import pizzashop.product.pizza.exception.InvalidPizzaType;
import pizzashop.product.pizza.type.PizzaType;

public abstract class PizzaStore {

  private final PizzaIngredientFactory ingredientFactory;

  protected PizzaStore(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  public final Pizza orderPizza(PizzaType type) {
    return createPizza(type)
        .prepare()
        .bake()
        .cut()
        .box();
  }

  protected final Pizza pickPizza(PizzaType type) throws InvalidPizzaType {
    switch (type) {
      case CHEESE:
        return new CheesePizza(ingredientFactory);
      case PEPPERONI:
        return new PepperoniPizza(ingredientFactory);
      case CLAM:
        return new ClamPizza(ingredientFactory);
      case VEGGIE:
        return new VeggiePizza(ingredientFactory);
      default:
        throw new InvalidPizzaType(type);
    }
  }

  protected abstract Pizza createPizza(PizzaType type) throws InvalidPizzaType;

}
