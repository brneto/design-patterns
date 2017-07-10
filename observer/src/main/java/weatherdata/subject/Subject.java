package weatherdata.subject;

import weatherdata.observer.Observer;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
