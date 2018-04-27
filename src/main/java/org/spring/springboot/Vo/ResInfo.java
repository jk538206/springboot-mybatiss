package org.spring.springboot.Vo;

import java.util.List;
import org.spring.springboot.domain.Customer;
import org.spring.springboot.domain.Sales;


public class ResInfo extends BaseVo{
	
	private static final long serialVersionUID = 3474754787L;

	private String phone;
	
	private String type;
	
	private String resCode;
	private String resMsg;
	private List list;
	private CommodityDetails commodityDetails;
	private OrderVO orderVO;

	private Customer customer;
	
	private Sales sales;
	
	
	
	public Sales getSales() {
		return sales;
	}
	public void setSales(Sales sales) {
		this.sales = sales;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public OrderVO getOrderVO() {
		return orderVO;
	}
	public void setOrderVO(OrderVO orderVO) {
		this.orderVO = orderVO;
	}
	public CommodityDetails getCommodityDetails() {
		return commodityDetails;
	}
	public void setCommodityDetails(CommodityDetails commodityDetails) {
		this.commodityDetails = commodityDetails;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public String getResCode() {
		return resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getResMsg() {
		return resMsg;
	}
	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	@Override
	public String toString() {
		return "ResInfo [phone=" + phone + ", type=" + type + ", resCode=" + resCode + ", resMsg=" + resMsg + ", list="
				+ list + ", commodityDetails=" + commodityDetails + ", orderVO=" + orderVO + ", customer=" + customer
				+ ", sales=" + sales + "]";
	}
	
	
	
	
	
	
	
}
