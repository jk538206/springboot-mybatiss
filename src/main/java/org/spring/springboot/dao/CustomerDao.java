package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;
import org.spring.springboot.domain.Customer;

public interface CustomerDao {

	
	 /**
     * 根据城市名称，查询城市信息
     *
     * @param loginName 城市名
     */
    Customer findByName(@Param("loginName") String loginName);
    
    public void addCustomer(Customer customer);
    
}
