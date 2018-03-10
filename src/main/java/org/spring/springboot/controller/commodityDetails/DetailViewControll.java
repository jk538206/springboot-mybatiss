package org.spring.springboot.controller.commodityDetails;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.spring.springboot.Vo.CommodityDetails;
import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.controller.Config;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.spring.springboot.service.impl.CommodityDetailsServiceImpl;
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
@Controller
public class DetailViewControll {
	protected static final Logger logger = LoggerFactory.getLogger(DetailViewControll.class);
	/***
	 * @param model
	 * @return
	 * http://192.168.1.51:8080/assets/img-home/lunbo_03.jpg
	 */
	/**
	 * 根据itemid 获取itemDetail
	 */
    @RequestMapping("/detail/commodityDetails")
    public String toCommodityDetailsjsp(ModelMap model,String id) {
    	logger.info("--DetailViewControll--/detail/commodityDetails -start-id: "+id);
        //title 图片地址
        String imgUrl = Config.urlIp+"img-home/lunbo_03.jpg";
        ResInfo r = new ResInfo();
        CommodityDetails cOut = r.getCommodityDetails();
        cOut.setImgUrl(imgUrl);
        cOut.setBrand("九龙斋");
        cOut.setDescription("详细描述桂花酸梅汤详细描述桂花酸梅汤详细描述桂花酸梅汤，详细描述桂花酸梅汤，详细描述桂花酸梅汤");
        cOut.setFullName("桂花酸梅汤");
        cOut.setId("001");
        cOut.setPlace("河南");
        cOut.setPromotionPrice("8.8");
        cOut.setPromotionType("yesPro");
        cOut.setRetail("9.9");
        cOut.setSalesVolume("550");
        cOut.setServiceType("一小时到家");
        cOut.setShelfLife("6");
        cOut.setWeight("500");

        model.addAttribute("ImgUrl",  cOut.getImgUrl());
        model.addAttribute("Brand",  cOut.getBrand());
        model.addAttribute("Description", cOut.getDescription());
        model.addAttribute("FullName", cOut.getFullName());
        model.addAttribute("Id", cOut.getId());
        model.addAttribute("Place", cOut.getPlace());
        model.addAttribute("PromotionPrice",  cOut.getPromotionPrice());
        model.addAttribute("Retail", cOut.getRetail());
        model.addAttribute("SalesVolume", cOut.getSalesVolume());
        model.addAttribute("ServiceType", cOut.getServiceType());
        model.addAttribute("ShelfLife", cOut.getShelfLife());
        model.addAttribute("PromotionType", cOut.getPromotionType());
        model.addAttribute("Weight", cOut.getWeight());
        logger.info("--DetailViewControll--/detail/commodityDetails -end-code: "+r.getResCode()+" msg: "+r.getResMsg());
        return "commodityDetails/commodityDetails";
    }
    
    
}
