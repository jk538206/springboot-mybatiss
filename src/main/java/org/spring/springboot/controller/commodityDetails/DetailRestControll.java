
package org.spring.springboot.controller.commodityDetails;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.Vo.CommodityDetails;
import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.controller.Config;
import org.spring.springboot.controller.home.HomeViewControll;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class DetailRestControll {
	protected static final Logger logger = LoggerFactory.getLogger(DetailRestControll.class);
	//private String urlIp="http://192.168.1.51:8080/assets/";
	private String urlIp=Config.urlIp;
	
   /**
    * 根据详情页的itemtype 获取 这个type 热卖的东西
    * return:list
    * 名称fullName  图片 id retail promotionPrice salesVolume
    */
	 @RequestMapping("/detail/typeHotSale")
    public ResInfo typeHotSale(String itemtype) {
		 logger.info("--DetailRestControll--/detail/typeHotSale-itemtype: "+itemtype);
		 String imgUrl = urlIp+"img-home/lunbo_03.jpg";
		 ResInfo r = new ResInfo();
		 CommodityDetails c= new CommodityDetails();
		 c.setFullName("桂花酸梅汤");
		 c.setId("001");
		 c.setPromotionPrice("8.8");
		 c.setRetail("9.9");
		 c.setImgUrl(imgUrl);
		 c.setSalesVolume("550");
		 List<CommodityDetails> list = new ArrayList<CommodityDetails>();
		 list.add(c);
		 list.add(c);
		 list.add(c);
		 list.add(c);
		 r.setList(list);
		 r.setResCode("00");
		 r.setResMsg("查询成功");
		 logger.info("--DetailRestControll--/detail/typeHotSale- code: "+r.getResCode()+" msg: "+r.getResMsg());
		 return r;
	 }
	 
	 
	 
	 
    
}
