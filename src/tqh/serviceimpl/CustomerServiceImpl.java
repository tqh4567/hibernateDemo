package tqh.serviceimpl;

import java.util.List;

import tqh.dao.CustomDao;
import tqh.daoimpl.CustomDaoImpl;
import tqh.domain.Customer;
import tqh.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	private CustomDao customdao=new CustomDaoImpl();
	public void addCustomer(Customer customer) {
		customdao.addCustomer(customer);
	}
	@Override
	public List<Customer> selectAll() {
		List<Customer> list=customdao.selectAll();
		return list;
	}

}
