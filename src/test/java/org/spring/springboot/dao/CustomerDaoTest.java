package org.spring.springboot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CustomerDaoTest {

	@Autowired
	private CustomerDao customerDao;
	
	@Test
	public void  queryCusByPhone() {
		Customer customer = new Customer();
		customer.setPhone("15901513353");
		Customer customer2 =  customerDao.queryCusByPhone(customer);
		//System.out.println("-------"+customer2.toString());
		
	}
	
}
