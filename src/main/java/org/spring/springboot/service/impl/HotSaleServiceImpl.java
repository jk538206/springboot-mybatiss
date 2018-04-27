package org.spring.springboot.service.impl;

import java.util.List;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.Vo.HotSale;
import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.dao.HotSaleDao;
import org.spring.springboot.service.HotSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotSaleServiceImpl implements HotSaleService{

	protected static final Logger logger = LoggerFactory.getLogger(HotSaleServiceImpl.class);
	
	@Autowired
	private HotSaleDao hotSaleDao;
	
	
	@Override
	public  ResInfo getHotSalesList(HotSale hotSale) {
		logger.info("-HotSaleServiceImpl-getHotSalesList-start-hotSale "+hotSale.toString());
		ResInfo resInfo  = new  ResInfo();
		List<HotSale> list=hotSaleDao.getHotSalesList(hotSale);
		logger.info("--HotSaleServiceImpl-list.size(): "+list.size());
		resInfo.setResCode("00");
		resInfo.setResMsg("查询成功");
		resInfo.setList(list);
		return resInfo;
	}
	
	
}
