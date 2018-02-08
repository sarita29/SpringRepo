package com.sample.springassignment.dependencyinjection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanForConstructor.xml");

		Person cust = (Person) context.getBean("personBean");
		System.out.println(cust);
	}
}