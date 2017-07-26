package barista;

public class Tea extends HotBeverage {
	
	public void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	public void steepTeaBag() {
		System.out.println("Steeping the tea");
	}

	public void addLemon() {
		System.out.println("Adding Lemon");
	}
}
