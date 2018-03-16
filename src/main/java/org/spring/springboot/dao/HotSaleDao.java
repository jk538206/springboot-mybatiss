package org.spring.springboot.dao;

import java.util.List;

import org.spring.springboot.Vo.HotSale;

public interface HotSaleDao {

	List<HotSale> getHotSalesList(HotSale hotSale);
	
	
}
