package org.spring.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.Vo.HotSale;
import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.controller.home.HomeRestController;
import org.spring.springboot.service.HotSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ClassSaleRestController {

	protected static final Logger logger = LoggerFactory.getLogger(ClassSaleRestController.class);
	
	@Autowired
	private HotSaleService  hotSaleService;
	
	/**http://lhuii5163.vicp.io/class/sales?itemType=SG&page=1*/
	@RequestMapping(value = "/class/sales", method = RequestMethod.GET)
    public ResInfo hotSale(@RequestParam(value = "itemType", required = true) String itemType,
    		@RequestParam(value = "page", required = true) String page) {
		//int pageSize = 2;
    	logger.info("-ClassSaleRestController-/hot/hotSales-itemType: "+itemType+" page: "+page);
    	ResInfo resInfo  = new  ResInfo();
    	HotSale hotSale = new HotSale();
    	hotSale.setItemType(itemType);
    	//hotSale.setPageNo(Integer.parseInt(page));
    	hotSale.setPageNo(2);
    	hotSale.setPageSize(2);
    	/**根据sailType pages 查询item 返回list*/
    resInfo  = hotSaleService.getHotSalesList(hotSale);
    logger.info("--ClassSaleRestController--/hot/hotSales-end-code: "+resInfo.getResCode()+" msg: "+resInfo.getResMsg());
    	return resInfo;
    }
}
