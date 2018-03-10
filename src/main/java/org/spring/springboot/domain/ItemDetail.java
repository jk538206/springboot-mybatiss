package org.spring.springboot.domain;

public class ItemDetail {

	private static final long serialVersionUID = 3474754787L;
	/**
	 *  describe wx_item_detail;
	+--------------+--------------+------+-----+---------+-------+
	| Field        | Type         | Null | Key | Default | Extra |
	+--------------+--------------+------+-----+---------+-------+
	| item_id      | varchar(100) | NO   | PRI | NULL    |       |
	| start_date   | varchar(100) | NO   | PRI | NULL    |       |
	| end_date     | varchar(100) | NO   | PRI | NULL    |       |
	| promotion_id | varchar(100) | YES  |     | NULL    |       |
	| images       | varchar(300) | YES  |     | NULL    |       |
	| remarks      | varchar(800) | YES  |     | NULL    |       |
	| cost         | varchar(100) | YES  |     | NULL    |       |
	| retail       | varchar(100) | YES  |     | NULL    |       |
	| insert_date  | varchar(100) | YES  |     | NULL    |       |
	| insert_time  | varchar(100) | YES  |     | NULL    |       |
	| update_date  | varchar(100) | YES  |     | NULL    |       |
	| update_time  | varchar(100) | YES  |     | NULL    |       |
	+--------------+--------------+------+-----+---------+-------+
	 */
	private String itemId;
	private String startDate;
	private String endDate;
	private String promotionId;
	private String images;
	private String remarks;
	private String cost;
	private String retail;
	private String insertDate;
	private String insertTime;
	private String updateDate;
	private String updateTime;
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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
	public String getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getRetail() {
		return retail;
	}
	public void setRetail(String retail) {
		this.retail = retail;
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
		return "ItemDetail [itemId=" + itemId + ", startDate=" + startDate + ", endDate=" + endDate + ", promotionId="
				+ promotionId + ", images=" + images + ", remarks=" + remarks + ", cost=" + cost + ", retail=" + retail
				+ ", insertDate=" + insertDate + ", insertTime=" + insertTime + ", updateDate=" + updateDate
				+ ", updateTime=" + updateTime + "]";
	}
	
	
	
	
}
