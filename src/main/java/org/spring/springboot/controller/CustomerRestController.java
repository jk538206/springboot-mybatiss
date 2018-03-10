package org.spring.springboot.controller;

import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.domain.Customer;

import org.spring.springboot.service.CustomerService;
import org.spring.springboot.util.CreateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerRestController {

	 @Autowired
	 private CustomerService customerService;

	 /***
	     * @param cityName
	     * @return 
	     * http://localhost:8080/cus/addCustomer?customerName=lhui
	     */
	    @RequestMapping(value = "/cus/addCustomer", method = RequestMethod.GET)
	    public ResInfo addCustomer(@RequestParam(value = "customerName", required = true) String customerName) {
		    	Customer customer  = new Customer();
		    	customer.setUserId(CreateUtil.CreateUUID());
		    	customer.setAge("11");
		    	customer.setArea("山东");
		    	customer.setPhone("15901513353");
//		    	customer.setNikeName("刘慧");
		    	customer.setNikeName(customerName);
	        return customerService.addCustomer(customer);
	    }
	    

}
