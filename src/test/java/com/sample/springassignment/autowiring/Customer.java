package com.sample.springassignment.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	@Autowired
	private Person person;
	private int type;
	private String action;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String toString() {
		return "Customer name:::" + this.getPerson().getName() + "\nAction:::"+getAction();
	}

	
}