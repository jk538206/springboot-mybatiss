package org.spring.springboot.domain;

public class Notify {

	private static final long serialVersionUID = 3474754787L;
	/**
	 * describe wx_notify;
	+----------------+--------------+------+-----+---------+-------+
	| Field          | Type         | Null | Key | Default | Extra |
	+----------------+--------------+------+-----+---------+-------+
	| notify_id      | varchar(100) | NO   | PRI | NULL    |       |
	| user_id        | varchar(100) | YES  |     | NULL    |       |
	| notify_content | varchar(800) | YES  |     | NULL    |       |
	| notify_date    | varchar(100) | YES  |     | NULL    |       |
	| remarks        | varchar(800) | YES  |     | NULL    |       |
	| create_date    | varchar(100) | YES  |     | NULL    |       |
	| create_time    | varchar(100) | YES  |     | NULL    |       |
	| update_date    | varchar(100) | YES  |     | NULL    |       |
	| update_time    | varchar(100) | YES  |     | NULL    |       |
	+----------------+--------------+------+-----+---------+-------+
	 */
	private String notifyId;
	private String userId;
	private String notifyContent;
	private String notifyDate;
	private String remarks;
	private String createDate;
	private String createTime;
	private String updateDate;
	private String updateTime;
	public String getNotifyId() {
		return notifyId;
	}
	public void setNotifyId(String notifyId) {
		this.notifyId = notifyId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNotifyContent() {
		return notifyContent;
	}
	public void setNotifyContent(String notifyContent) {
		this.notifyContent = notifyContent;
	}
	public String getNotifyDate() {
		return notifyDate;
	}
	public void setNotifyDate(String notifyDate) {
		this.notifyDate = notifyDate;
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
		return "Notify [notifyId=" + notifyId + ", userId=" + userId + ", notifyContent=" + notifyContent
				+ ", notifyDate=" + notifyDate + ", remarks=" + remarks + ", createDate=" + createDate + ", createTime="
				+ createTime + ", updateDate=" + updateDate + ", updateTime=" + updateTime + "]";
	}
	
	
	
	
	
}
