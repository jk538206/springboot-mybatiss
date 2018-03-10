package org.spring.springboot.service;
import javax.sound.midi.VoiceStatus;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Find;
import org.spring.springboot.dao.CustomerDao;
import org.spring.springboot.domain.Customer;
import org.spring.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class customerServiceImplTest {

	@Autowired
    private CustomerService customerService;
	@Autowired
    private CustomerDao customerDao;
	
	
	@Test 
	public void Find() {
		Customer customer=	customerDao.findByNikeName("testUpdate");
		 System.out.println("-find--customer-"+customer.toString());
	}
		
//	    @Test
//	    public void findByNikeNameGetResInfo() {
//		    	Customer customer  = new Customer();
//		    	customer.setNikeName("lh");
//		    	ResInfo resInfo =  	customerService.findByNikeNameGetResInfo(customer);
////		    System.out.println("-findByNikeNameGetResInfo-resInfo--"+resInfo.toString());
//	    }
//	    
//	    @Test
//	    public void findByNikeNameGetCustomer() {
//		    	Customer customer  = new Customer();
//		    	customer.setNikeName("lh");
//		    	Customer customerRes=  	customerService.findByNikeNameGetCustomer(customer);
////		    System.out.println("-findByNikeNameGetCustomer-customerRes--"+customerRes.toString());
////		    System.out.println("-findByNikeNameGetCustomer-customerRes--"+customerRes.getUserId());
//	    }
//	    
//	    @Test
//	    public void updateByPhone(){
//		    	Customer customer  = new Customer();
//		    	customer.setPhone("15901513353");
//		    	customer.setNikeName("testUpdate");
//		    	
//		    ResInfo resInfo = customerService.updateByPhone(customer);
////		    System.out.println("-updateByPhone-resInfo--"+resInfo.toString());
//	    	
//	    }
//	
}
