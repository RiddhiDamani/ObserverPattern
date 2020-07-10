package com.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class SpaceBarHandler implements ISubject {
//	, IKeyboardObserver
	private List<IObserver> observers = new ArrayList<>();
	
	@Override
	public void registerObserver(IObserver observer) {
//	System.out.println("I am in register Observer");
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
		
	}
	
	public void readInput(String input) {
		if(input.equals(" ")) {
//			System.out.println("I am inside readInput");
			notifyObservers();
		}
	}
	
	// Implementing notifyObserver here and not calling in IObserver, because it is not required always!
	private void notifyObservers() {
		for(IObserver observer : observers) {
			observer.update();
		}
	}


//	@Override
//	public void update(String input) {
//		// TODO Auto-generated method stub
//		if(input.equals(" "))
//		notifyObservers(input);
//		
//	}	
}
