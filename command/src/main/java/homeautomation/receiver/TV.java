package homeautomation.receiver;

public class TV {
	private String location;

	public TV(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println(location + " TV is On");
	}
	
	public void off() {
		System.out.println(location + " TV is Off");
	}
	
	public void setInputChannel(String input) {
		System.out.println(location + " TV channel is set for " + input);
	}
	
	public void setVolume(int level) {
		System.out.println(location + " TV volume is set for " + level);
	}

}
