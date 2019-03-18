package tqh.service;

import java.util.List;

import tqh.domain.Customer;

public interface CustomerService {

	 void addCustomer(Customer customer) ;

	List<Customer> selectAll();

}
