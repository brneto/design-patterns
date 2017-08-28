package djview.view;

import javax.swing.JProgressBar;

public class BeatBar extends JProgressBar implements Runnable {
	private static final long serialVersionUID = -4901044336364461393L;
    JProgressBar progressBar;
	Thread thread;

	public BeatBar() {
		setMaximum(100);
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		for(;;) {
			int value = getValue();
			value = (int)(value * .75);
			setValue(value);
			repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {};
		}
	}

}
