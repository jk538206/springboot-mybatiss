package org.spring.springboot.controller.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.Vo.ResInfo;
import org.spring.springboot.controller.shoppingCart.ShopCartRestContorller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {
	protected static final Logger logger = LoggerFactory.getLogger(OrderRestController.class);
	private String urlIp="http://192.168.1.51:8080/assets/";
	/**
	 *根据order 状态 userid 获取订单list
	 *
	 * @param userId
	 * @return
	 */
	@RequestMapping
	public ResInfo getOrderList(String userId) {
		
		ResInfo resInfo = new ResInfo();
		
		return resInfo;
		
	}
}
