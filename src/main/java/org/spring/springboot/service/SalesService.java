package org.spring.springboot.service;

import java.util.List;

import org.spring.springboot.domain.Sales;

public interface SalesService {

	List<Sales> findSalesbyUserId(Sales sales);
	
	Integer updateSales(Sales sales);
}
