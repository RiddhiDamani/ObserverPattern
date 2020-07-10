package com.observerDesignPattern;
public interface ISubject {
	
	void registerObserver(IObserver observer); // registers the observer to the subject
	void removeObserver(IObserver observer);	// registers the observer from the subject
}
