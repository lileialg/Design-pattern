package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();

	public void register(Observer o) {
		// TODO Auto-generated method stub

		observers.add(o);
	}

	public void remove(Observer o) {
		// TODO Auto-generated method stub

		observers.remove(o);
	}

	public void notifyObservers() {

		for(Observer o : observers)
			o.update();
	}
	
	public void change(){
		notifyObservers();
	}

}
