package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CustomerDao;

import org.spring.springboot.domain.Customer;
import org.spring.springboot.service.ConstomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstomerServiceImpl implements ConstomerService{
	@Autowired
	private CustomerDao CustomerDao;
	
	@Override
	public Customer getCustomerByPhone() {
		Customer customer = new Customer();
		Customer c = CustomerDao.queryCusByPhone(customer);
		return null;
	}

}
