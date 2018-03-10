package org.spring.springboot.domain;

public class Order {

	
	/***
	 * wx_order
	 * CREATE TABLE `wx_order` (
  `order_id` varchar(100) NOT NULL COMMENT '订单ID',
  ` ` varchar(100) DEFAULT NULL COMMENT '用户ID',
  `item_id` varchar(100) DEFAULT NULL COMMENT '商品ID',
  `order_num` varchar(100) DEFAULT NULL COMMENT '订单编号',
  `pay_price` varchar(100) DEFAULT NULL COMMENT '付款单价',
  `pay_num` varchar(100) DEFAULT NULL COMMENT '付款数量',
  `promotion_total` varchar(100) DEFAULT NULL COMMENT '促销金额合计',
  `pay_total` varchar(100) DEFAULT NULL COMMENT '付款合计',
  `order_date` varchar(100) DEFAULT NULL COMMENT '订单日期',
  `order_status` varchar(100) DEFAULT NULL COMMENT '订单状态',
  `receive_id` varchar(100) DEFAULT NULL COMMENT '收货ID',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_date` varchar(100) DEFAULT NULL COMMENT '创建日期',
  `create_time` varchar(100) DEFAULT NULL COMMENT '创建时间',
  `update_date` varchar(100) DEFAULT NULL COMMENT '更新日期',
  `update_time` varchar(100) DEFAULT NULL COMMENT '更细时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	 */
	private static final long serialVersionUID = 3474754787L;
	
	private String orderId;
	private String userId;
	private String itemId;
	private String orderNum;
	private String payPrice;
	private String payNum;
	private String promotionTotal;
	private String payTotal;
	private String orderDate;
	private String orderStatus;
	private String receiveId;
	private String remarks;
	private String createDate;
	private String createTime;
	private String updateDate;
	private String updateTime;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getPayPrice() {
		return payPrice;
	}
	public void setPayPrice(String payPrice) {
		this.payPrice = payPrice;
	}
	public String getPayNum() {
		return payNum;
	}
	public void setPayNum(String payNum) {
		this.payNum = payNum;
	}
	public String getPromotionTotal() {
		return promotionTotal;
	}
	public void setPromotionTotal(String promotionTotal) {
		this.promotionTotal = promotionTotal;
	}
	public String getPayTotal() {
		return payTotal;
	}
	public void setPayTotal(String payTotal) {
		this.payTotal = payTotal;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getReceiveId() {
		return receiveId;
	}
	public void setReceiveId(String receiveId) {
		this.receiveId = receiveId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", itemId=" + itemId + ", orderNum=" + orderNum
				+ ", payPrice=" + payPrice + ", payNum=" + payNum + ", promotionTotal=" + promotionTotal + ", payTotal="
				+ payTotal + ", orderTate=" + orderDate + ", orderTtatus=" + orderStatus + ", receiveId=" + receiveId
				+ ", remarks=" + remarks + ", createDate=" + createDate + ", createTime=" + createTime + ", updateDate="
				+ updateDate + ", updateTime=" + updateTime + "]";
	}

	
	
	
	
}
