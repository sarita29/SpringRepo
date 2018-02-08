package com.sample.springassignment.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerService {

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}
}
