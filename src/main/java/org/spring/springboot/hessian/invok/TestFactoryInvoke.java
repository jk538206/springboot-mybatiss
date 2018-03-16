package org.spring.springboot.hessian.invok;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.controller.home.HomeRestController;
import org.spring.springboot.hessian.bean.Info;
import org.spring.springboot.hessian.inter.InvokeInterface;
import org.springframework.stereotype.Service;

@Service("testFactoryInvoke")
public class TestFactoryInvoke implements InvokeInterface{
	
	protected static final Logger logger = LoggerFactory.getLogger(TestFactoryInvoke.class);

	@Override
	public Info invoke(Info info) {
		Info respInfo = new Info();
		logger.info("--invok---ok!");
		respInfo.setRespCode("00");
		return respInfo;
	}
	
//	public Info invoke(Info info) {
		//	}
	
}
