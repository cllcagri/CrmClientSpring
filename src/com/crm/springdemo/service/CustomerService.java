package com.crm.springdemo.service;

import java.util.List;

import com.crm.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomerList();
	
	public void saveCustomers(Customer customer);

	public Customer getCustomer(int customerId);

	public void deleteCustomer(int customerId);

}
