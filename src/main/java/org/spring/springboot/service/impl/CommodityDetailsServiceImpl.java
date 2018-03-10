package org.spring.springboot.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.Vo.CommodityDetails;
import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.dao.CommodityDetailsDao;
import org.spring.springboot.service.CommodityDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

public class CommodityDetailsServiceImpl implements CommodityDetailsService{
	protected static final Logger logger = LoggerFactory.getLogger(CommodityDetailsServiceImpl.class);
	
	@Autowired
	private CommodityDetailsDao commodityDetailsDao;

	@Override
	public ResInfo getCommodityDetails(CommodityDetails c) {
		ResInfo resInfo = new ResInfo();
		CommodityDetails commodityDetails = commodityDetailsDao.queryCommodityDetailsbyId(c);
		
		return resInfo;
	}
	

}
