package org.spring.springboot.controller.home;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.spring.springboot.controller.Config;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.spring.springboot.util.WXOpenidUtil;
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
    public String toHomejsp(HttpServletRequest request, HttpServletResponse response,ModelMap model) {
    		/**
		 * 第一步：用户同意授权，根据参数，获取code
		 */
		String code = request.getParameter("code");
		String state = request.getParameter("state");
    		logger.info("-wx-code=" + code + ",state=" + state);
    	
    		/**
    		 * 第二步：通过code换取网页授权access_token
    		 */
    		String openid = WXOpenidUtil.getOpenId(code);
    		logger.info("-wx-openid=" + openid );
    		
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
        
        //根据手机号查询 用户的各个type订单数量
        
         
        return "shoppingCart/shoppingCart";
    }
   
}
