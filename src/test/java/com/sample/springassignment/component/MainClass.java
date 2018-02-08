package com.sample.springassignment.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Component.xml");

		CustomerService cust = (CustomerService) context.getBean("customer");
		System.out.println(cust);
	}
}
