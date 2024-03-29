package djview.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import djview.model.observer.BPMObserver;
import djview.model.observer.BeatObserver;

public class HeartModel implements HeartModelInterface, Runnable {
	Collection<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	Collection<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	int time = 1000;
    int bpm = 90;
	Random random = new Random(System.currentTimeMillis());
	Thread thread;
	
	public HeartModel() {
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		int lastrate = -1;

		for(;;) {
			int change = random.nextInt(10);
			if (random.nextInt(2) == 0) {
				change = 0 - change;
			}
			int rate = 60000/(time + change);
			if (rate < 120 && rate > 50) {
				time += change;
				notifyBeatObservers();
				if (rate != lastrate) {
					lastrate = rate;
					notifyBPMObservers();
				}
			}
			try {
				Thread.sleep(time);
			} catch (Exception e) {}
		}
	}

	@Override
	public int getHeartRate() {
		return 60000/time;
	}

	@Override
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		beatObservers.remove(o);
	}
	
	public void notifyBeatObservers() {
		if (beatObservers.size() > 0)
			beatObservers.forEach(BeatObserver::updateBeat);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		bpmObservers.remove(o);
	}

	public void notifyBPMObservers() {
		if (bpmObservers.size() > 0)
			bpmObservers.forEach(BPMObserver::updateBPM);
	}
}
	
	
		

		

		
		

		

		

		

		
