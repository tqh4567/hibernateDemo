package tqh.dao;

import java.util.List;

import tqh.domain.Customer;

public interface CustomDao {

	void addCustomer(Customer customer);

	List<Customer> selectAll();

}
