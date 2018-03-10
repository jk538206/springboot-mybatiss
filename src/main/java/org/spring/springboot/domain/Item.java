package org.spring.springboot.domain;

public class Item {
	
	
	/**
	 * describe wx_item ;
	+-------------+--------------+------+-----+---------+-------+
	| Field       | Type         | Null | Key | Default | Extra |
	+-------------+--------------+------+-----+---------+-------+
	| item_id     | varchar(100) | NO   | PRI | NULL    |       |
	| short_name  | varchar(100) | YES  |     | NULL    |       |
	| full_name   | varchar(100) | YES  |     | NULL    |       |
	| item_type   | varchar(100) | YES  |     | NULL    |       |
	| brand       | varchar(100) | YES  |     | NULL    |       |
	| weight      | varchar(100) | YES  |     | NULL    |       |
	| shelf_life  | varchar(100) | YES  |     | NULL    |       |
	| description | varchar(500) | YES  |     | NULL    |       |
	| remarks     | varchar(800) | YES  |     | NULL    |       |
	| insert_date | varchar(100) | YES  |     | NULL    |       |
	| insert_time | varchar(100) | YES  |     | NULL    |       |
	| update_date | varchar(100) | YES  |     | NULL    |       |
	| update_time | varchar(100) | YES  |     | NULL    |       |
	+-------------+--------------+------+-----+---------+-------+
	CREATE TABLE `wx_item` (
  `item_id` varchar(100) NOT NULL COMMENT '商品编码',
  `short_name` varchar(100) DEFAULT NULL COMMENT '商品简称',
  `full_name` varchar(100) DEFAULT NULL COMMENT '商品全称',
  `item_type` varchar(100) DEFAULT NULL COMMENT '商品类型',
  `brand` varchar(100) DEFAULT NULL COMMENT '商品品牌',
  `weight` varchar(100) DEFAULT NULL COMMENT '商品毛重',
  `shelf_life` varchar(100) DEFAULT NULL COMMENT '商品保质期',
  `description` varchar(500) DEFAULT NULL COMMENT '商品描述',
  `remarks` varchar(800) DEFAULT NULL COMMENT '备注',
  `insert_date` varchar(100) DEFAULT NULL COMMENT '插入日期',
  `insert_time` varchar(100) DEFAULT NULL COMMENT '插入时间',
  `update_date` varchar(100) DEFAULT NULL COMMENT '更新日期',
  `update_time` varchar(100) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品基本表';
	 */
	private static final long serialVersionUID = 3474754787L;
	private String itemId;
	private String shortName;
	private String fullName ;
	private String itemType;
	private String brand;
	private String weight;
	private String shelfLife;
	private String description;
	private String remarks;
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
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getShelfLife() {
		return shelfLife;
	}
	public void setShelfLife(String shelfLife) {
		this.shelfLife = shelfLife;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
		return "Item [itemId=" + itemId + ", shortName=" + shortName + ", fullName=" + fullName + ", itemType="
				+ itemType + ", brand=" + brand + ", weight=" + weight + ", shelfLife=" + shelfLife + ", description="
				+ description + ", remarks=" + remarks + ", insertDate=" + insertDate + ", insertTime=" + insertTime
				+ ", updateDate=" + updateDate + ", updateTime=" + updateTime + "]";
	}
	
	
	
	;
	
}

