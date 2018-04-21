package org.spring.springboot.dao;
import java.io.UnsupportedEncodingException;

import java.util.List;

import javax.sound.midi.VoiceStatus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.Vo.HotSale;
import org.spring.springboot.dao.CustomerDao;
import org.spring.springboot.dao.HotSaleDao;
import org.spring.springboot.dao.OrderDao;
import org.spring.springboot.domain.Customer;
import org.spring.springboot.domain.Order;
import org.spring.springboot.service.CustomerService;
import org.spring.springboot.util.CreateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SalesDaoTest {

	    
	    
	    @Autowired
	    private SalesDao salesDao;
		
	    @Test
	    public void findByNikeNameGetResInfo() throws UnsupportedEncodingException { 
	    	

	    }
	    
	
}
