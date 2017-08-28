package djview.model.adapter;

import djview.model.BeatModelInterface;
import djview.model.HeartModelInterface;
import djview.model.observer.BPMObserver;
import djview.model.observer.BeatObserver;

public class HeartModelAdapter implements BeatModelInterface {
	HeartModelInterface heart;

	public HeartModelAdapter(HeartModelInterface heart) {
		this.heart = heart;
	}

	@Override
	public void initialize() {}

	@Override
	public void on() {}

	@Override
	public void off() {}
	@Override
	public int getBPM() {
		return heart.getHeartRate();
	}

	@Override
	public void setBPM(int bpm) {}


	@Override
	public void registerObserver(BeatObserver o) {
		heart.registerObserver(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		heart.removeObserver(o);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		heart.registerObserver(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		heart.removeObserver(o);
	}

}
