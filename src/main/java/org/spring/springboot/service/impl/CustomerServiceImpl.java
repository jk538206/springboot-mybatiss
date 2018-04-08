package org.spring.springboot.service.impl;


import org.slf4j.Logger;



import org.slf4j.LoggerFactory;
import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.dao.CustomerDao;
import org.spring.springboot.domain.Customer;
import org.spring.springboot.service.CustomerService;
import org.spring.springboot.util.CreateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.log.Log;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	 protected static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	
	@Autowired
    private CustomerDao customerDao;
	
	/**
	 * 根据opeid获得用户信息
	 */
	@Override
	public ResInfo findByOpenidGetResInfo(Customer customer) {
		Customer customerout = customerDao.queryCusByOpenid(customer);
		ResInfo resInfo = new ResInfo();
		if(customerout!=null&&customerout.getUserId()!=null) {
			resInfo.setCustomer(customerout);
			resInfo.setResCode("00");
			resInfo.setResMsg("查询成功");
		}else {
			resInfo.setResCode("44");
			resInfo.setResMsg("没有查询到此条记录");
		}
		return resInfo;
	}
	/**根据openid 修改顾客信息*/
	@Override
	public ResInfo updateById(Customer customer) {
		logger.info("-updateByPhone-start-customer is "+customer.toString());
		customer.setUpdateDate(CreateUtil.createDate());
		customer.setUpdateTime(CreateUtil.createTime());
		
		ResInfo resInfo = new ResInfo();
		if(customer!=null&&customer.getUserId()!=null) {
			 int i = customerDao.updateById(customer);
			 if(i!=0) {
				resInfo.setResCode("00");
				resInfo.setResMsg("修改成功");
			 }
		}else {
			resInfo.setResCode("99");
			resInfo.setResMsg("修改失败");
		}
		return resInfo;
	}
	
	/**根据手机号 修改顾客信息*/
	@Override
	public ResInfo updateByPhone(Customer customer) {
		logger.info("-updateByPhone-start-customer is "+customer.toString());
		ResInfo resInfo = new ResInfo();
		if(customer!=null&&customer.getPhone()!=null) {
			 int i = customerDao.updateByPhone(customer);
			 if(i!=0) {
				resInfo.setResCode("00");
				resInfo.setResMsg("修改成功");
			 }
		}else {
			resInfo.setResCode("99");
			resInfo.setResMsg("添加失败");
		}
		return resInfo;
	}
	
	@Override 
	public  ResInfo addCustomer(Customer customer) {
		customer.setUserId(CreateUtil.CreateUUID());
		customer.setCreateDate(CreateUtil.createDate());
		customer.setCreateTime(CreateUtil.createTime());
		logger.info("-addCustomer-start-customer is "+customer.toString());
		ResInfo resInfo = new ResInfo();
		ResInfo resInfoRes = findByNikeNameGetResInfo(customer);//"00" 查询此条数据成功
		logger.info("-addCustomer-findByNikeName -res-ResInfoRes-code : "+resInfoRes.getResCode()+" msg : "+resInfoRes.getResMsg());
		if(!"00".equals( resInfoRes.getResCode())) {
			int i = customerDao.saveCustomer(customer);
			logger.info("-addCustomer-saveCustomer -res-i : "+i);
			if(i==1) {
				resInfo.setResCode("00");
				resInfo.setResMsg("添加成功");
			}
		}else {
			resInfo.setResCode("99");
			resInfo.setResMsg("添加失败");
		}
		return resInfo;
	}

	
	
	public ResInfo findByUserId(Customer customer) {
		logger.info("-CustomerServiceImpl-findByNikeName-start-customer.nikeName is "+customer.getNikeName());
		ResInfo resInfo = new ResInfo();
		if(customer.getNikeName()!=null) {
			Customer customerRes =	customerDao.findByNikeName(customer.getNikeName());
			if(customerRes!=null&&customerRes.getUserId()!=null) {
				resInfo.setResCode("00");
				resInfo.setResMsg("查询此条数据成功");
			}
		}else {
			resInfo.setResCode("56");
			resInfo.setResMsg("没有此条数据");
		}
		return resInfo;
	}

	@Override
	public  ResInfo findByNikeNameGetResInfo(Customer customer) {
		logger.info("-CustomerServiceImpl-findByNikeName-start-customer.nikeName is "+customer.getNikeName());
		ResInfo resInfo = new  ResInfo();
		if(customer.getNikeName()!=null) {
			Customer customerRes =	customerDao.findByNikeName(customer.getNikeName());
			if(customerRes!=null&&customerRes.getUserId()!=null) {
				resInfo.setResCode("00");
				resInfo.setResMsg("查询此条数据成功");
			}
		}else {
			resInfo.setResCode("56");
			resInfo.setResMsg("没有此条数据");
		}
		return resInfo;
	}

	@Override
	public Customer findByNikeNameGetCustomer(Customer customer) {
		Customer customerRes  =	customerDao.findByNikeName(customer.getNikeName());
		return customerRes;
	}

	



	

	

}
