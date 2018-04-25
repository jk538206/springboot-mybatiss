package org.spring.springboot.controller.home;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.controller.Config;
import org.spring.springboot.domain.Customer;
import org.spring.springboot.domain.Sales;
import org.spring.springboot.service.CustomerService;
import org.spring.springboot.service.SalesService;
import org.spring.springboot.util.WXOpenidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import net.sf.json.JSONObject;

/**
 * Created by bysocket on 07/02/2017.
 */
@Controller
public class HomeViewControll {
	protected static final Logger logger = LoggerFactory.getLogger(HomeViewControll.class);
	
	@Autowired
	private SalesService salesService;
	/***
	 * @param model
	 * @return http://192.168.1.51:8080/assets/img-home/lunbo_03.jpg
	 * @throws IOException
	 * @throws ServletException
	 */
	// 域名 ip
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/home/toHomejsp")
	public String toHomejsp(HttpServletRequest request, HttpServletResponse response, ModelMap model)
			throws ServletException, IOException {
		String res = "error";
		// String res = "home/homePage";
		/**
		 * 第一步：用户同意授权，根据参数，获取code
		 */
		String code = request.getParameter("code");
		String state = request.getParameter("state");
		logger.info("-wx-code=" + code + ",state=" + state);
		/**
		 * 第二步：通过code换取网页授权access_token
		 */
		JSONObject userInfoJO = null;
		//userInfoJO=	WXOpenidUtil.auth(request, response, code);
		String userInfoJOstr = "{\"openid\":\"o0y7g1POGmztY-UKsEleEG1S6fxk\",\"nickname\":\"颂辣辣\",\"sex\":2,\"language\":\"zh_CN\",\"city\":\"\",\"province\":\"北京\",\"country\":\"中国\",\"headimgurl\":\"http:\\/\\/thirdwx.qlogo.cn\\/mmopen\\/vi_32\\/4BqTO1sHPXbZE0015ehu2UC0TsUa46AZ7eIndiaoVtV1tqKShhrvL3YMCpSTYRoNf0cXZROXFvvhUkYUItM5AjQ\\/132\",\"privilege\":[]}";
		userInfoJO = JSONObject.fromObject(userInfoJOstr);
		if (userInfoJO == null) {

		} else {
			String user_openid = userInfoJO.getString("openid");
			String user_nickname = userInfoJO.getString("nickname");
			String user_sex = userInfoJO.getString("sex");
			String user_province = userInfoJO.getString("province");// province
			String user_city = userInfoJO.getString("city");
			String user_country = userInfoJO.getString("country");
			String user_headimgurl = userInfoJO.getString("headimgurl");
			/** 根据openid获取 对应用户 如果没有 则进行创建 */
			Customer cin = new Customer();
			cin.setOpenId(user_openid);
			/** openid 放到session里 */
			HttpSession session = request.getSession();
			session.setAttribute("openid", user_openid);

			cin.setNikeName(user_nickname);
			cin.setProfession(user_province);
			cin.setArea(user_province);
			cin.setSex(user_sex);
			cin.setHeadimgurl(user_headimgurl);
			ResInfo resInfo = customerService.findByOpenidGetResInfo(cin);
			logger.info("--findByOpenidGetResInfo-:code: " + resInfo.getResCode() + "msg: " + resInfo.getResMsg());
			/** 44则没有此条记录 进行创建 */
			if ("44".equals(resInfo.getResCode())) {
				ResInfo resInfoadd = customerService.addCustomer(cin);
				logger.info("--resInfoadd-:code: " + resInfoadd.getResCode() + "msg: " + resInfoadd.getResMsg());
			}
			;
			/** 如果有 修改微信信息 */
			if ("00".equals(resInfo.getResCode())) {
				Customer cUpdate = resInfo.getCustomer();
				if (cUpdate.getUserId() != null) {
					cUpdate.setOpenId(user_openid);
					cUpdate.setNikeName(user_nickname);
					cUpdate.setProfession(user_province);
					cUpdate.setArea(user_province);
					cUpdate.setSex(user_sex);
					cUpdate.setHeadimgurl(user_headimgurl);
					ResInfo resInfoupdate = customerService.updateById(cUpdate);
					logger.info("--resInfoupdate-:code: " + resInfoupdate.getResCode() + "msg: "
							+ resInfoupdate.getResMsg());
				}
			}
			;

			/**
			 * 获取轮播图
			 */
			String titilImg1 = Config.urlIp + "img-home/lunbo_03.jpg";
			String titilImg2 = Config.urlIp + "img-home/lunbo_03.jpg";
			String titilImg3 = Config.urlIp + "img-home/lunbo_03.jpg";
			String titilImg4 = Config.urlIp + "img-home/lunbo_03.jpg";
			model.addAttribute("titilImg1", titilImg1);
			model.addAttribute("titilImg2", titilImg2);
			model.addAttribute("titilImg3", titilImg3);
			model.addAttribute("titilImg4", titilImg4);
			res = "home/homePage";
		}
		logger.info("--HomeRestController--/home/toHomejsp-");

		return res;
	}

	/**
	 * 返回首页
	 */
	@RequestMapping("/home/returnHome")
	public String returnHome(HttpServletRequest request, ModelMap model) {
		String res = "error";
		HttpSession session = request.getSession();
		String openid = (String) session.getAttribute("openid");
		if (openid != null) {
			Customer cin = new Customer();
			cin.setOpenId(openid);
			ResInfo resInfo = customerService.findByOpenidGetResInfo(cin);
			logger.info("-returnHome-findByOpenidGetResInfo-:code: " + resInfo.getResCode() + "msg: "
					+ resInfo.getResMsg());

			/**
			 * 获取轮播图
			 */
			String titilImg1 = Config.urlIp + "img-home/lunbo_03.jpg";
			String titilImg2 = Config.urlIp + "img-home/lunbo_03.jpg";
			String titilImg3 = Config.urlIp + "img-home/lunbo_03.jpg";
			String titilImg4 = Config.urlIp + "img-home/lunbo_03.jpg";
			model.addAttribute("titilImg1", titilImg1);
			model.addAttribute("titilImg2", titilImg2);
			model.addAttribute("titilImg3", titilImg3);
			model.addAttribute("titilImg4", titilImg4);

			res = "home/homePage";
		}
		return res;
	}

	/**
	 * 
	 * @param model
	 * @return 分类 跳转页面
	 */
	@RequestMapping("/home/toClassificationjsp")
	public String toClassificationjsp(ModelMap model, String type) {
		logger.info("-toClassificationjsp-type: " + type);
		model.addAttribute("type", type);
		return "classification/classification";
	}

	/**
	 * 购物车
	 */
	@RequestMapping("/home/toShoppingCartjsp")
	public String toShoppingCartjsp(ModelMap model,HttpServletRequest request) {
		
		return "shoppingCart/shoppingCart";
	}

	/**
	 * 我的 select 头像 userid 名字 订单状态下的 订单数量
	 */
	@RequestMapping("/home/toMineSettingjsp")
	public String toMineSettingjsp(ModelMap model) {
		model.addAttribute("hello", "13212");

		// 根据手机号 查询 用户所有信息 放到页面

		// 根据手机号查询 用户的各个type订单数量

		return "mineSetting/mineSetting";
	}

}
