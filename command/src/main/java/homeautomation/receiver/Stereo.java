package homeautomation.receiver;

public class Stereo {
	String room;
	
	public Stereo(String room) {
		this.room = room;
	}

	public void on() {
		System.out.println(room + " stereo is on");
	}

	public void off() {
		System.out.println(room + " stereo is off");
	}

	public void setCd() {
		System.out.println(room + " stereo is set for CD input");
	}

	public void setDvd() {
		System.out.println(room + " stereo is set for DVD input");
	}

	public void setRadio() {
		System.out.println(room + " stereo is set for Radio input");
	}

	public void setVolume(int level) {
		System.out.println(room + " stereo volume set to " + level);
	}

}
