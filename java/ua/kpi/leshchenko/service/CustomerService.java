package ua.kpi.leshchenko.service;

import java.util.List;

import ua.kpi.leshchenko.model.Customer;

public interface CustomerService {
	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int theId);

	void deleteCustomer(int theId);

	void updateCustomer(Customer theCustomer);
}
