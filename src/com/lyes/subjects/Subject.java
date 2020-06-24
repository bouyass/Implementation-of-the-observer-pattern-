package com.lyes.subjects;

import java.util.ArrayList;
import java.util.List;

import com.lyes.observers.Observer;

public class Subject {
	
	public Subject(int state) {
		this.state = 0;
	}
	
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer obs) {
		observers.add(obs);
	}
	
	public void notifyAllObservers() {
		for(Observer obs : observers) {
			obs.update();
		}
	}
	
	
}
