package org.spring.springboot.domain;

import org.spring.springboot.Vo.BaseVo;

public class Sales extends BaseVo{

	private static final long serialVersionUID = 3474754787L;
	/**
	 * describe wx_sales;
	+-------------+--------------+------+-----+---------+-------+
	| Field       | Type         | Null | Key | Default | Extra |
	+-------------+--------------+------+-----+---------+-------+
	| sales_id    | varchar(100) | NO   | PRI | NULL    |       |
	| item_id     | varchar(100) | NO   | PRI | NULL    |       |
	| user_id     | varchar(100) | NO   | PRI | NULL    |       |
	| buy_num     | varchar(100) | YES  |     | NULL    |       |
	| buy_price   | varchar(100) | YES  |     | NULL    |       |
	| cost_total  | varchar(100) | YES  |     | NULL    |       |
	| remarks     | varchar(500) | YES  |     | NULL    |       |
	| insert_date | varchar(100) | YES  |     | NULL    |       |
	| insert_time | varchar(100) | YES  |     | NULL    |       |
	| update_date | varchar(100) | YES  |     | NULL    |       |
	| update_time | varchar(100) | YES  |     | NULL    |       |
	+-------------+--------------+------+-----+---------+-------+
	 */
	
	private String salesId;
	private String itemId;
	private String userId;
	private String buyNum;
	private String buyPrice;
	private String costTotal;
	private String remarks;
	
	private String insertDate;
	private String insertTime;
	private String updateDate;
	private String updateTime;
	
	
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getSalesId() {
		return salesId;
	}
	public void setSalesId(String salesId) {
		this.salesId = salesId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBuyNum() {
		return buyNum;
	}
	public void setBuyNum(String buyNum) {
		this.buyNum = buyNum;
	}
	public String getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(String buyPrice) {
		this.buyPrice = buyPrice;
	}
	public String getCostTotal() {
		return costTotal;
	}
	public void setCostTotal(String costTotal) {
		this.costTotal = costTotal;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}
	public String getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "Sales [salesId=" + salesId + ", itemId=" + itemId + ", userId=" + userId + ", buyNum=" + buyNum
				+ ", buyPrice=" + buyPrice + ", costTotal=" + costTotal + ", remarks=" + remarks + ", insertDate="
				+ insertDate + ", insertTime=" + insertTime + ", updateDate=" + updateDate + "]";
	}

	
	
	
}
