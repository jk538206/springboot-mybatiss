package org.spring.springboot.service.impl;


import org.spring.springboot.dao.CustomerDao;
import org.spring.springboot.domain.Customer;
import org.spring.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
    private CustomerDao customerDao;
	
	@Override
	public Customer addCustomer(Customer customer) {
		
		
		customerDao.addCustomer(customer);
		
		return  new Customer();
	}

}
