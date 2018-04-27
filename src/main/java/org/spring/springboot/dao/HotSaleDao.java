package org.spring.springboot.dao;

import java.util.List;

import org.spring.springboot.Vo.HotSale;
import org.spring.springboot.Vo.ResInfo;

public interface HotSaleDao {

//	List<HotSale> getHotSalesList(HotSale hotSale);
	/**分类页 传type page*/
	List<HotSale> getHotSalesList(HotSale hotSale);
	
	
}
