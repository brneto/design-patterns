package barista;

public abstract class CaffeineBeverage {

	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	public abstract void brew();

	public abstract void addCondiments();

	public final void boilWater() {
		System.out.println("Boiling water");
	}

	public final void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
