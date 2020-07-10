package com.observerDesignPattern;

public class Person implements ObserverInterface {
	
	private String personName;

	public Person (String personName, SubjectInterface subject) {
		this.personName = personName;
		subject.registerObserver(this);
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName  = personName;
	}
	
	public void updateState(String availability) {
		System.out.println("Hello " + personName + ", Product is now " + availability + " on flipkart");
	}
}
