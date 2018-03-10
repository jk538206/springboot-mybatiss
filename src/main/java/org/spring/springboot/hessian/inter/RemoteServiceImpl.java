package org.spring.springboot.hessian.inter;

import org.apache.log4j.Logger;
import org.spring.springboot.hessian.bean.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gameAgentRemoteService")
public class RemoteServiceImpl implements RemoteService{
	private static final Logger logger = Logger
			.getLogger(RemoteServiceImpl.class);
	@Autowired
	private InvokeFactory invokeFactory;
	@Override
	public Info method(Info info) {
	
		long startTime = System.currentTimeMillis();
		String methodName = info.getMethodName();
		logger.info("begin methodName="+methodName+"---"+info);
		Info respInfo = new Info();
		
			try {
				respInfo = invokeFactory.getInvoke(methodName).invoke(info);
			} catch (Throwable e) {
				respInfo.setRespCode("98");
				respInfo.setRespMsg("error");
				logger.info("methodName:"+methodName+",exception"+e.getMessage());
				e.printStackTrace();
			}
		String respCode = respInfo.getRespCode();
		String respMessage = respInfo.getRespMsg();

		logger.info("end methodName:"+methodName+"; total cost : "
				+ (System.currentTimeMillis() - startTime) + " =="
				+ respCode +";==:"+ respMessage);
		return respInfo;
	}
	
	

}
