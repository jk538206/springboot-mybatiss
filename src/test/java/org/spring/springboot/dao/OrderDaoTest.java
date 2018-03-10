package org.spring.springboot.dao;
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
public class OrderDaoTest {

	
	@Autowired
	private OrderDao orderDao;
	
	    @Test
	    public void findByNikeNameGetResInfo() {
	    	Order o = new Order();
	    	o.setOrderId(CreateUtil.CreateUUID());
	    	o.setCreateDate(CreateUtil.createDate());
	    	o.setCreateTime(CreateUtil.createTime());
	    	o.setReceiveId("张三");
	    	Integer i = 	orderDao.createOrder(o);
	    	System.out.println("------i: "+i);
	    	//		    System.out.println("-findByNikeNameGetResInfo-resInfo--"+resInfo.toString());
	    }
	    
	
}
