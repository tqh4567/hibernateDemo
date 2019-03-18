package tqh.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import tqh.dao.CustomDao;
import tqh.domain.Customer;
import tqh.utils.HibernateUtils;

public class CustomDaoImpl implements CustomDao{

	@Override
	public void addCustomer(Customer customer) {
		Session session = HibernateUtils.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> selectAll() {
		Session session = HibernateUtils.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		
		return criteria.list();
	}
	
}
