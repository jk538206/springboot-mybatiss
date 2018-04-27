package org.spring.springboot.dao;


import java.util.List;

import org.spring.springboot.domain.Sales;

public interface SalesDao {

	Integer createSales(Sales sales);
//	userId || (userId&&Sales) 
	List<Sales> findSales(Sales sales);
//	删除所有
	Integer deleteByUserId(Sales sales);
	//删除一条商品记录
	Integer deleteByItemId(Sales sales);
	//修改
	Integer updateSales(Sales sales);
}
