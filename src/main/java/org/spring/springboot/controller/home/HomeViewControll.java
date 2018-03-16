package org.spring.springboot.controller.home;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.spring.springboot.controller.Config;
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
@Controller
public class HomeViewControll {
	protected static final Logger logger = LoggerFactory.getLogger(HomeViewControll.class);
	/***
	 * @param model
	 * @return
	 * http://192.168.1.51:8080/assets/img-home/lunbo_03.jpg
	 */
	// 域名 ip
	
	
    @RequestMapping("/home/toHomejsp")
    public String toHomejsp(ModelMap model) {
        model.addAttribute("hello", "13212");
        //title 图片地址
        String titilImg1 = Config.urlIp+"img-home/lunbo_03.jpg";
        String titilImg2 = Config.urlIp+"img-home/lunbo_03.jpg";
        String titilImg3 = Config.urlIp+"img-home/lunbo_03.jpg";
        String titilImg4 = Config.urlIp+"img-home/lunbo_03.jpg";
        
        model.addAttribute("titilImg1", titilImg1);
        model.addAttribute("titilImg2", titilImg2);
        model.addAttribute("titilImg3", titilImg3);
        model.addAttribute("titilImg4", titilImg4);
        logger.info("--HomeRestController--/home/toHomejsp-");
        return "home/homePage";
    }
    
    /**
     * 
     * @param model
     * @return 分类 跳转页面
     */
    @RequestMapping("/home/toClassificationjsp")
    public String toClassificationjsp(ModelMap model) {
        model.addAttribute("hello", "13212");
        return "classification/classification";
    }
    /**
     * 购物车
     */
    @RequestMapping("/home/toShoppingCartjsp")
    public String toShoppingCartjsp(ModelMap model) {
        model.addAttribute("hello", "13212");
        return "shoppingCart/shoppingCart";
    }
    /**
     * 我的
     * select 头像 userid  名字 订单状态下的 订单数量
     */
    @RequestMapping("/home/toMineSettingjsp")
    public String toMineSettingjsp(ModelMap model) {
        model.addAttribute("hello", "13212");
        
        //根据手机号 查询 用户所有信息 放到页面
        
        return "shoppingCart/shoppingCart";
    }
   
}
