package org.spring.springboot.service;

import org.junit.Test;
import org.spring.springboot.hessian.inter.RemoteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {

	@Test 
	public void Find() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-factory.xml");
		RemoteService remoteService = (RemoteService) context.getBean("remoteService");
		System.out.println("-remoteService:"+remoteService==null);
	}
}
