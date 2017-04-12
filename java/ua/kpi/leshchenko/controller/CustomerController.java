package ua.kpi.leshchenko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.kpi.leshchenko.model.Customer;
import ua.kpi.leshchenko.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getCustomers();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public void addCustomer(@RequestBody Customer theCustomer) {
		customerService.saveCustomer(theCustomer);
	}

	@RequestMapping("/customers/{theId}")
	public Customer getCustomer(@PathVariable int theId) {
		return customerService.getCustomer(theId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/customers")
	public void updateCustomer(@RequestBody Customer theCustomer) {
		customerService.updateCustomer(theCustomer);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/customers/{theId}")
	public void deleteCustomer(@PathVariable int theId) {
		customerService.deleteCustomer(theId);
	}

}
