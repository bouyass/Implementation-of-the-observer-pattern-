package com.lyes.observers;

import com.lyes.subjects.Subject;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
