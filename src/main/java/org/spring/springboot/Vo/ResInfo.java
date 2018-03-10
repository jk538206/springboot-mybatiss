package org.spring.springboot.Vo;

import java.util.List;


public class ResInfo {
	
	private static final long serialVersionUID = 3474754787L;

	private String resCode;
	private String resMsg;
	private List list;
	private CommodityDetails commodityDetails;
	private OrderVO orderVO;

	
	
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
		return "ResInfo [resCode=" + resCode + ", resMsg=" + resMsg + ", list=" + list + ", commodityDetails="
				+ commodityDetails + ", orderVO=" + orderVO + "]";
	}
	
	
	
	
	
	
}
