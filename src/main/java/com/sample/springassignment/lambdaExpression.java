package com.sample.springassignment;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class lambdaExpression {
	public static void main(String[] args) throws ClassNotFoundException {
		List<String> ls = new ArrayList<String>();
		ls.add("hello");
		ls.add("India");
		ls.add("world");

		ls.forEach((n) -> System.out.println(n));

		Runnable r = () -> {
			System.out.println("hello r:::");
		};

		Thread th = new Thread(r);
		th.start();

		Runnable r1 = () -> {
			System.out.println("hello r1:::");
		};

		Thread th1 = new Thread(r1);
		th1.start();

		FunctionInterface d = (name) -> {
				return "Hello, "+name;
		};
		System.out.println(d.demo("John"));
	}
}
