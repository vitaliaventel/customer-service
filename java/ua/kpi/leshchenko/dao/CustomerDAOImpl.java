package ua.kpi.leshchenko.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.kpi.leshchenko.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Customer> getCustomers() {
		return entityManager.createQuery("from Customer").getResultList();
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		entityManager.persist(theCustomer);

	}

	@Override
	public Customer getCustomer(int theId) {
		return entityManager.find(Customer.class, theId);
	}

	@Override
	public void deleteCustomer(int theId) {
		Customer theCustomer = entityManager.find(Customer.class, theId);
		if (theCustomer != null) {
			entityManager.remove(theCustomer);
		}

	}

	@Override
	public void updateCustomer(Customer theCustomer) {
		entityManager.merge(theCustomer);

	}

}
