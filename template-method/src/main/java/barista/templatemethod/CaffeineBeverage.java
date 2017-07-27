package barista.templatemethod;

public abstract class CaffeineBeverage {

	// This method is a Template Method
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	public abstract void brew();

	public abstract void addCondiments();

	public final void boilWater() {
		System.out.println("Boiling water");
	}

	public final void pourInCup() {
		System.out.println("Pouring into cup");
	}

	// This method is a Hook on Template Method
	protected boolean customerWantsCondiments() {
		return true;
	}
}
