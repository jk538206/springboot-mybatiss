package org.spring.springboot.Vo;

import java.util.List;

public class OrderVO extends BaseVo{

	//订单id
	private String orderId;
	//状态
	private String orderType;
	//所属用户
	private String userId;
	//订单满减？包邮？ 优惠方式  促销简称
	private String promotionName;
	//总价 付款合计
	private String payTotal;
	//商品列表「商品名称 购买数量 购买价格
	private List<CommodityDetails> commodityList;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPromotionName() {
		return promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}
	public String getPayTotal() {
		return payTotal;
	}
	public void setPayTotal(String payTotal) {
		this.payTotal = payTotal;
	}
	public List<CommodityDetails> getCommodityList() {
		return commodityList;
	}
	public void setCommodityList(List<CommodityDetails> commodityList) {
		this.commodityList = commodityList;
	}
	@Override
	public String toString() {
		return "OrderVO [orderId=" + orderId + ", orderType=" + orderType + ", userId=" + userId + ", promotionName="
				+ promotionName + ", payTotal=" + payTotal + ", commodityList=" + commodityList + "]";
	}
}
