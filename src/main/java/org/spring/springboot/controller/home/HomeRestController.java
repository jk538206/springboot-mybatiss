package org.spring.springboot.controller.home;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.Vo.HotSale;
import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.controller.Config;
import org.spring.springboot.service.HotSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	protected static final Logger logger = LoggerFactory.getLogger(HomeRestController.class);
	
	@Autowired
	private HotSaleService  hotSaleService;
	
	
	
	
	 /***
     * @param cityName
     * @return 
     * http://localhost:8080//hot/hotSales?itemType=SG
     */
    @RequestMapping(value = "/hot/hotSales", method = RequestMethod.GET)
    public ResInfo hotSale(@RequestParam(value = "itemType", required = true) String itemType) {
    	logger.info("-HomeRestController-/hot/hotSales-itemType: "+itemType);
    	ResInfo resInfo  = new ResInfo();
    	HotSale hotSale = new HotSale();
    	hotSale.setItemType(itemType);
    	//根据sailType 查询item 返回list
    	/***
    	 * Test
    	 */
    	List<HotSale> list=new ArrayList<HotSale>();
    	HotSale h1 = new HotSale();
    	h1.setHotSaleId("001");
    	h1.setImgUrl(Config.urlIp+"img-home/img_07.jpg");//http://192.168.1.51:8080/assets/img-home/img_07.jpg
    	h1.setItemType("SG");
    	h1.setPrice("21.00");
    	h1.setSaleName("新鲜西柿");
    	h1.setSalesVolume("22");
    	list.add(h1);
    	list.add(h1);
    	list.add(h1);
    	list.add(h1);
    	list.add(h1);
    	resInfo.setList(list);
    	resInfo.setResCode("00");
    	resInfo.setResMsg("查询成功");
    	
    	//TODO
   // ResInfo resInfo  = hotSaleService.getHotSalesList(hotSale);
    logger.info("--HomeRestController--/hot/hotSales-end-code: "+resInfo.getResCode()+" msg: "+resInfo.getResMsg());
    	return resInfo;
    }
	
	
}
