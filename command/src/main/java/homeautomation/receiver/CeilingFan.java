package homeautomation.receiver;

public class CeilingFan {
	private String room;
	private int speed;

	public CeilingFan(String room) {
		this.room = room;
		this.speed = 0;
	}
	
	public void high() {
		System.out.println(room + " ceiling fan is on high");
	}
	
	public void medium() {
		System.out.println(room + " ceiling fan is on medium");
	}
	
	public void low() {
		System.out.println(room + " ceiling fan is on low");
	}
	
	public void off() {
		System.out.println("ceiling fan is off");
	}
	
	public int getSpeed() {
		return this.speed;
	}

}
