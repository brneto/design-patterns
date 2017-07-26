package barista;

public abstract class HotBeverage {
	public abstract void prepareRecipe();
	
	public final void boilWater() {
		System.out.println("Boiling water");
	}
	
	public final void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
