package org.spring.springboot.service.impl;

import java.util.List;

import org.spring.springboot.dao.SalesDao;
import org.spring.springboot.domain.Sales;
import org.spring.springboot.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("salesService")
public class SalesServiceImpl implements SalesService {

	@Autowired
	private SalesDao salesDao;
	
	@Override
	public List<Sales> findSalesbyUserId(Sales sales) {
		return salesDao.findSales(sales);
	}

	@Override
	public Integer updateSales(Sales sales) {
		return salesDao.updateSales(sales);
	}

}
