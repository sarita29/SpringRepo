package com.sample.springassignment.dependencyinjection.constructor;

public class Customer {

	private int type;
	private String action;

	public Customer(int type, String action) {
		this.type = type;
		this.action = action;
	}
	
	public String toString() {
		return "type ::"+ type + "\naction :: " + action;
	}

	
}