package barista;

public class Coffee {

	public void prepareRecipe() {
		boilWater();
		brewCoffeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	public void boilWater() {
		System.out.println("Boiling water");
	}

	public void brewCoffeGrinds() {
		System.out.println("Dripping Coffee through filter");
	}

	private void pourInCup() {
		System.out.println("Pouring into cup");
	}

	private void addSugarAndMilk() {
		System.out.println("Adding Sugar and Milk");
	}
}
