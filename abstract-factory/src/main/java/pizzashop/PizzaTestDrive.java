package pizzashop;

import pizzashop.client.PizzaStore;
import pizzashop.factory.PizzaFactory;
import pizzashop.factory.SimplePizzaFactory;
import pizzashop.product.Pizza;
import pizzashop.product.type.PizzaType;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaFactory pizzaFactory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(pizzaFactory);
		
		Pizza pizza = store.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
	}

}
