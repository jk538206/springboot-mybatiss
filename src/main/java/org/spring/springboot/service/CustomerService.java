package org.spring.springboot.service;

import java.util.List;

import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.domain.Customer;


public interface CustomerService {
	

	ResInfo addCustomer(Customer customer);
	
	ResInfo findByNikeNameGetResInfo(Customer customer);
	
	Customer findByNikeNameGetCustomer(Customer customer);
	
	ResInfo updateByPhone(Customer customer);
	
	ResInfo findByOpenidGetResInfo(Customer customer);
	
	
	ResInfo updateById(Customer customer);
	
}
