package com.sample.springassignment.dependencyinjection.gettersetter;

public class Customer {

	private int type;
	private String action;

	
	public void setType(int type) {
		this.type = type;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void display() {
		 System.out.println("type ::"+ type + "\naction :: " + action);
	}

	
}