package ua.kpi.leshchenko.dao;

import java.util.List;

import ua.kpi.leshchenko.model.Customer;

public interface CustomerDAO {

	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int theId);

	void deleteCustomer(int theId);

	void updateCustomer(Customer theCustomer);

}
