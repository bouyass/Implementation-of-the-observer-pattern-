package com.lyes.observers;

import com.lyes.subjects.Subject;

public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		System.out.println("the new state of the subject observed by the octal observer is "+ this.subject.getState());
	}

}
