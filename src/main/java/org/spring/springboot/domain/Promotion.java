package org.spring.springboot.domain;

public class Promotion {

	private static final long serialVersionUID = 3474754787L;
	
	/**
	 * describe wx_promotion;
	+-----------------+--------------+------+-----+---------+-------+
	| Field           | Type         | Null | Key | Default | Extra |
	+-----------------+--------------+------+-----+---------+-------+
	| promotion_id    | varchar(100) | NO   | PRI | NULL    |       |
	| start_date      | varchar(100) | NO   | PRI | NULL    |       |
	| end_date        | varchar(100) | NO   | PRI | NULL    |       |
	| item_id         | varchar(100) | NO   | PRI | NULL    |       |
	| promotion_name  | varchar(500) | YES  |     | NULL    |       |
	| promotion_total | varchar(100) | YES  |     | NULL    |       |
	| remarks         | varchar(800) | YES  |     | NULL    |       |
	| insert_date     | varchar(100) | YES  |     | NULL    |       |
	| insert_time     | varchar(100) | YES  |     | NULL    |       |
	| update_date     | varchar(100) | YES  |     | NULL    |       |
	| update_time     | varchar(100) | YES  |     | NULL    |       |
	+-----------------+--------------+------+-----+---------+-------+
	 */
	private String promotionId;
	private String startDate;
	private String endDate;
	private String itemId;
	private String promotionName;
	private String promotionTotal;
	private String remarks;
	private String insertDate;
	private String insertTime;
	private String updateDate;
	private String updateTime;
	public String getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getPromotionName() {
		return promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}
	public String getPromotionTotal() {
		return promotionTotal;
	}
	public void setPromotionTotal(String promotionTotal) {
		this.promotionTotal = promotionTotal;
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
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Promotion [promotionId=" + promotionId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", itemId=" + itemId + ", promotionName=" + promotionName + ", promotionTotal=" + promotionTotal
				+ ", remarks=" + remarks + ", insertDate=" + insertDate + ", insertTime=" + insertTime + ", updateDate="
				+ updateDate + ", updateTime=" + updateTime + "]";
	}
	
	
	
	
}
