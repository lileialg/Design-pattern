package com.designpattern.observer;

public class ObserverA implements Observer, DisplayElement {

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("do something...");
	}

	public void update() {
		// TODO Auto-generated method stub

		display();
	}

}
