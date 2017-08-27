package djview.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import djview.control.ControllerInterface;
import djview.model.BeatModelInterface;
import djview.model.observer.BPMObserver;
import djview.model.observer.BeatObserver;

public class DJView implements ActionListener, BeatObserver, BPMObserver {
	BeatModelInterface model;
	ControllerInterface controller;
	JFrame viewFrame;
	JPanel viewPanel;
	BeatBar beatBar;
	JLabel bpmOutputLabel;

	public DJView(ControllerInterface controller, BeatModelInterface model) {
		this.controller = controller;
		this.model = model;
		model.registerObserver((BeatObserver)this);
		model.registerObserver((BPMObserver)this);
	}

	@Override
	public void updateBPM() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBeat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
