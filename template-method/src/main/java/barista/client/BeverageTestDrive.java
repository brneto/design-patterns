package barista.client;

import barista.implementation.Coffee;
import barista.implementation.CoffeeWithHook;
import barista.implementation.Tea;
import barista.implementation.TeaWithHook;
import barista.templatemethod.CaffeineBeverage;

public class BeverageTestDrive {

	public static void main(String[] args) {
		CaffeineBeverage tea = new Tea();
		CaffeineBeverage coffee = new Coffee();
		
		
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
		
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();
		
		CaffeineBeverage teaHook = new TeaWithHook();
		CaffeineBeverage coffeeHook = new CoffeeWithHook();
		
		System.out.println("\nMaking tea choosing condiments...");
		teaHook.prepareRecipe();
		
		System.out.println("\nMaking coffee choosing condiments...");
		coffeeHook.prepareRecipe();
	}

}
