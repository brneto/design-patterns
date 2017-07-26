package barista;

public class Coffee extends HotBeverage {

	public void prepareRecipe() {
		boilWater();
		brewCoffeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	public void brewCoffeGrinds() {
		System.out.println("Dripping Coffee through filter");
	}

	public void addSugarAndMilk() {
		System.out.println("Adding Sugar and Milk");
	}
}
