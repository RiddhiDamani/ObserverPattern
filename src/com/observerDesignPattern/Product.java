package com.observerDesignPattern;

import java.util.ArrayList;

// Product.java is a subject bcz it implements the SubjectInterface
public class Product implements SubjectInterface {
		
	private ArrayList<ObserverInterface> observers = new ArrayList<ObserverInterface>();
	private String				productName;
	private String 				productType;
	private String 				productPrice;
	private String 				availability;
	
	public Product(String productName, String productType, String productPrice, String availability) {
		this.productName = productName;
		this.productType = productType;
		this.productPrice = productPrice;
		this.availability = availability;
	}
	
	public void setObservers(ArrayList<ObserverInterface> observers) {
		this.observers = observers;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		System.out.println("Availability changed from Not available to available");
		notifyObservers();
	}

	public ArrayList<ObserverInterface> getObservers() {
		return observers;
	}

	@Override
	public void registerObserver(ObserverInterface observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(ObserverInterface observer) {
		observers.remove(observer);		
	}

	@Override
	public void notifyObservers() {
		System.out.println("Product Name : " + this.getProductName() + " ,Product Type: " + this.productType + " , Product Price : "
				+ this.productPrice + "is available now. So notifying all the users");
		System.out.println();
		for (ObserverInterface observer : observers) {
			observer.updateState(this.availability);
		}
	}


}
