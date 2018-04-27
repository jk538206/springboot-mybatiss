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
import org.spring.springboot.domain.Sales;
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
	private CustomerDao customerDao;
	    
	    @Autowired
	    private SalesDao salesDao;
		
	    @Test
	    public void save() throws UnsupportedEncodingException { 
	    	Sales ssSales = new Sales();
	    	ssSales.setSalesId(CreateUtil.CreateUUID());
	    	ssSales.setUserId("0f0b40dc-fd3b-4ea4-bc4e-187bcad69a23");
	    	ssSales.setBuyNum("2");
	    	ssSales.setBuyPrice("12");
	    	ssSales.setCostTotal("24");
	    	ssSales.setItemId("002");
	    	//Integer i= salesDao.createSales(ssSales);
	    	 //System.out.println("========"+i);
	    }
	    
	    @Test
	    public void update() {
	    	
	    }
	    
	    @Test
	    public void find() {
	    	Sales ssSales = new Sales();
	    	ssSales.setUserId("1");
	    	ssSales.setSalesId("1");;
	    	//List<Sales> list= salesDao.findSales(ssSales);
	    	//System.err.println("list.size(): "+list.size());
	    	
	    }
	    
	    
	    @Test
	    public void delete() {
	    	Sales ssSales = new Sales();
	    	ssSales.setItemId("1");
	    	int i = salesDao.deleteByItemId(ssSales);
	    	System.out.println("---"+i);
	    }
	    
	    
	    
	
}
