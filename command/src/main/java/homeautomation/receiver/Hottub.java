package homeautomation.receiver;

public class Hottub {

	public void circulate() {
		System.out.println("Hottub is bubbling");
	}
	
	public void jetsOn() {
		System.out.println("Hottub is filling");
	}
	
	public void jetsOff() {
		System.out.println("Hottub is off");
	}
	
	public void setTemperature(int temp) {
		System.out.println("Hottub is heating to a steaming " + temp + " degrees");
	}

}
