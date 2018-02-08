package com.sample.springassignment.dependencyinjection.constructor;

public class Person {
	private Customer customer;
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String toString() {
		return "Person details :::"+ customer;
	}
}