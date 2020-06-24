package com.lyes.observers;

import com.lyes.subjects.Subject;

public class HexaObserver extends Observer{
	
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("the new state of the subject observed by the hexa observer is "+ this.subject.getState());
	}

}
