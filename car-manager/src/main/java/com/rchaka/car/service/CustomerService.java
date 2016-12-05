package com.rchaka.car.service;

import java.util.List;

import com.rchaka.car.entities.Customer;

public interface CustomerService {

	void createCustomer(String name);
	
	void updateCustomer();
	
	void removeCustomer();
	
	List<Customer> getCustomers();
}
