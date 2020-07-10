package com.observerDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class OPMain {

	public static void main(String[] args) {
		
		Product samsungTV = new Product("Samsung LED TV", "LED TV", "60000Rs.", "Not Available");
		
		//Person david object will be created and person david object will be registered to the subject
		Person david = new Person("David", samsungTV); 
		
		 //Person john object will be created and person john object will be registered to the subject
		Person john = new Person("John", samsungTV);
		
		ArrayList<ObserverInterface> subscribers = samsungTV.getObservers();
		
		System.out.println("Subscribers List: " + subscribers);
		
		//Iterator is used for iterating (looping) various collection classes such as HashMap, ArrayList, LinkedList etc.
		for(Iterator<ObserverInterface> iterator = subscribers.iterator(); iterator.hasNext(); ) {
			Person person = (Person) iterator.next();
			System.out.println("This person has subscribed : " + person.getPersonName());
		
		}
		
		System.out.println();
		System.out.println("Samsung LED TV current state: " + samsungTV.getAvailability());
		System.out.println();
		
		// Now product is available
		samsungTV.setAvailability("Available");

	}

}
