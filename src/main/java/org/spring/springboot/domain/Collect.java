package org.spring.springboot.domain;

public class Collect {

	
	/**
	 *  describe wx_collect;
		+--------------+--------------+------+-----+---------+-------+
		| Field        | Type         | Null | Key | Default | Extra |
		+--------------+--------------+------+-----+---------+-------+
		| collect_id   | varchar(100) | NO   | PRI | NULL    |       |
		| user_id      | varchar(100) | YES  |     | NULL    |       |
		| item_id      | varchar(100) | YES  |     | NULL    |       |
		| remarks      | varchar(800) | YES  |     | NULL    |       |
		| collect_date | varchar(100) | YES  |     | NULL    |       |
		| create_date  | varchar(100) | YES  |     | NULL    |       |
		| create_time  | varchar(100) | YES  |     | NULL    |       |
		| update_date  | varchar(100) | YES  |     | NULL    |       |
		| update_time  | varchar(100) | YES  |     | NULL    |       |
		+--------------+--------------+------+-----+---------+-------+
	 */
	private static final long serialVersionUID = 3474754787L;
	
	private String collectId;
	private String userId;
	private String itemId;
	private String remarks;
	private String collectDate;
	private String createDate;
	private String createTime;
	private String updateDate;
	private String updateTime;
	public String getCollectId() {
		return collectId;
	}
	public void setCollectId(String collectId) {
		this.collectId = collectId;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCollectDate() {
		return collectDate;
	}
	public void setCollectDate(String collectDate) {
		this.collectDate = collectDate;
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
		return "Collect [collectId=" + collectId + ", userId=" + userId + ", itemId=" + itemId + ", remarks=" + remarks
				+ ", collectDate=" + collectDate + ", createDate=" + createDate + ", createTime=" + createTime
				+ ", updateDate=" + updateDate + ", updateTime=" + updateTime + "]";
	}
	
	
	
	
}
