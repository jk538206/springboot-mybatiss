package org.spring.springboot;

import org.spring.springboot.domain.Customer;
import org.spring.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	/**
	 * 保存客户信息 all 
	 * @author huiliu
	 * @return
	 */
	@RequestMapping(value = "/cus/addcustomer", method = RequestMethod.GET)
	public Customer addCustomer(@RequestParam(value = "openId", required = true)  String openId,
			@RequestParam(value = "loginName", required = true)  String loginName,
			@RequestParam(value = "loginPwd", required = true)  String loginPwd,
			@RequestParam(value = "nikeName", required = true)  String nikeName,
			@RequestParam(value = "area", required = true)  String area,
			@RequestParam(value = "age", required = true)  String age,
			@RequestParam(value = "phone", required = true)  String phone,
			@RequestParam(value = "email", required = true)  String email,
			@RequestParam(value = "profession", required = true)  String profession) {
		
		
		return null;
	}
	
}
