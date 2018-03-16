package org.spring.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.spring.springboot.domain.Order;

public interface OrderDao {

	List<Order> findOrderS(Order order);
	
	Integer createOrder(Order order);
	
	Integer deleteByPhone(Order order);//orderid
	
	Integer countBytype(Order order);
}
 