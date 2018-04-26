package org.spring.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.controller.home.HomeViewControll;
import org.spring.springboot.domain.Customer;
import org.spring.springboot.domain.Sales;
import org.spring.springboot.service.CustomerService;
import org.spring.springboot.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesRestController {
	protected static final Logger logger = LoggerFactory.getLogger(SalesRestController.class);
	@Autowired
	private CustomerService customerService;
	@Autowired
	private SalesService salesService;
	
	//ajax 获取购物车内商品列表
	@RequestMapping("sales/shopCart")
	public ResInfo ShopsCart(HttpServletRequest request) {
		ResInfo resInfo = new ResInfo();
		resInfo.setResCode("99");
		resInfo.setResMsg("查询失败");
		HttpSession session = request.getSession();
		String openid = (String) session.getAttribute("openid");
		//根据openid查找用户
		if(openid!=null&&!"".equals(openid)) {
			Customer cin = new Customer();
			cin.setOpenId(openid);
			resInfo = customerService.findByOpenidGetResInfo(cin);
			logger.info("-returnHome-findByOpenidGetResInfo-:code: " + resInfo.getResCode() + "msg: "+ resInfo.getResMsg());
			if(resInfo!=null) {
				String userId =null;
				//userId=resInfo.getCustomer().getUserId();
				userId = "1";
				Sales sales = new Sales();
				sales.setPageNo(1);
				sales.setPageSize(4);
				sales.setUserId(userId);
				//查找list 购物车
				List<Sales> list = salesService.findSalesbyUserId(sales);
				resInfo.setList(list);
				logger.info("--list.size():"+list.size()+"resInfo:"+resInfo.toString());
			}
		}
		return resInfo;
	}
	//ajax 修改商品数量
	public ResInfo changeItemNum(String itemId,String num) {
		ResInfo resInfo = new ResInfo();
		resInfo.setResCode("99");
		resInfo.setResMsg("修改失败");
		Sales sales = new Sales();
		sales.setItemId(itemId);
		sales.setBuyNum(num);
		Integer i=salesService.updateSales(sales);
		if(i>0) {
			resInfo.setResCode("00");
			resInfo.setResMsg("修改成功");
		}
		return resInfo;
	}
	
	//ajax 添加商品& 数量 详情页里添加
	public ResInfo addItem(String itemId,String num,HttpServletRequest request) {
		ResInfo resInfo = new ResInfo();
		resInfo.setResCode("99");
		resInfo.setResMsg("添加失败");
		//获取用户 和商品id联合查询 一条结果
		HttpSession session = request.getSession();
		String openid = (String) session.getAttribute("openid");
		if(openid!=null&&!"".equals(openid)) {
			Customer cin = new Customer();
			cin.setOpenId(openid);
			resInfo = customerService.findByOpenidGetResInfo(cin);
			logger.info("-returnHome-findByOpenidGetResInfo-:code: " + resInfo.getResCode() + "msg: "+ resInfo.getResMsg());
			if(resInfo!=null) {
				String userId =null;
				//userId=resInfo.getCustomer().getUserId();
				userId = "1";
				Sales sales = new Sales();
				sales.setPageNo(1);
				sales.setPageSize(4);
				sales.setUserId(userId);
				//查找list 购物车
				List<Sales> list = salesService.findSalesbyUserId(sales);
				resInfo.setList(list);
				logger.info("--list.size():"+list.size()+"resInfo:"+resInfo.toString());
			}

		}
		Sales sales = new Sales();
		sales.setItemId(itemId);
		sales.setBuyNum(num);
		Integer i=salesService.updateSales(sales);
		if(i>0) {
			resInfo.setResCode("00");
			resInfo.setResMsg("修改成功");
		}
		return resInfo;
	}
}
