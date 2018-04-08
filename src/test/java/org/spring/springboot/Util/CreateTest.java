package org.spring.springboot.Util;
import javax.sound.midi.VoiceStatus;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.dao.CustomerDao;
import org.spring.springboot.domain.Customer;
import org.spring.springboot.service.CustomerService;
import org.spring.springboot.util.CreateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CreateTest {
		
	    @Test
	    public void findByNikeNameGetResInfo() {
//	    	System.out.println("-CreateUUID : "+CreateUtil.CreateUUID());
//	    	System.out.println("-createDate : "+CreateUtil.createDate());
	    	System.out.println("-createTime : "+CreateUtil.createTime());
	    	
	    	
	    	int i = 1;
	    	i++;
	    	++i ;
	    	System.out.println(i++);
	    	System.out.println(i++);
	    }
	    
	
}
