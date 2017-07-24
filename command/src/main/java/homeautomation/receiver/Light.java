package homeautomation.receiver;

public class Light {
	private String location;
	
	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " light is On");
	}

	public void off() {
		System.out.println(location + " light is Off!");
	}

}
