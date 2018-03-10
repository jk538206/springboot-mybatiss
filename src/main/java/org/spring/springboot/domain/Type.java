package org.spring.springboot.domain;

public class Type {
	private static final long serialVersionUID = 3474754787L;
	/**
	 * describe wx_type;
	+-------------+--------------+------+-----+---------+-------+
	| Field       | Type         | Null | Key | Default | Extra |
	+-------------+--------------+------+-----+---------+-------+
	| type_id     | varchar(100) | YES  |     | NULL    |       |
	| type_sub_id | varchar(100) | YES  |     | NULL    |       |
	| type_name   | varchar(100) | YES  |     | NULL    |       |
	| remarks     | varchar(100) | YES  |     | NULL    |       |
	| insert_date | varchar(100) | YES  |     | NULL    |       |
	| insert_time | varchar(100) | YES  |     | NULL    |       |
	| update_date | varchar(100) | YES  |     | NULL    |       |
	| update_time | varchar(100) | YES  |     | NULL    |       |
	+-------------+--------------+------+-----+---------+-------+
	 */
	private String typeId;
	private String typeSubId;
	private String typeName;
	private String remarks;
	private String insertDate;
	private String insertTime;
	private String updateDate;
	private String updateTime;
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTypeSubId() {
		return typeSubId;
	}
	public void setTypeSubId(String typeSubId) {
		this.typeSubId = typeSubId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
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
		return "Type [typeId=" + typeId + ", typeSubId=" + typeSubId + ", typeName=" + typeName + ", remarks=" + remarks
				+ ", insertDate=" + insertDate + ", insertTime=" + insertTime + ", updateDate=" + updateDate
				+ ", updateTime=" + updateTime + "]";
	}
	
	

}
