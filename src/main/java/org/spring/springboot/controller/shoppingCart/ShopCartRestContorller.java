package org.spring.springboot.controller.shoppingCart;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.Vo.CommodityDetails;
import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.controller.classification.ClassRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopCartRestContorller {
	protected static final Logger logger = LoggerFactory.getLogger(ShopCartRestContorller.class);
	private String urlIp="http://192.168.1.51:8080/assets/";

	@RequestMapping("/shop/shopCardList")
	public ResInfo shopCardList(String userId) {
		logger.info("--ShopCartRestContorller-/shop/shopCardList -start- ");
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
		 logger.info("--ShopCartRestContorller-/shop/shopCardList -end-code: "+r.getResCode()+" msg: "+r.getResMsg());
		 return r;
		 }
}
