package org.spring.springboot.domain;

public class Receive {

	private static final long serialVersionUID = 3474754787L;
	/**
	 * describe wx_receive;
	+---------------+--------------+------+-----+---------+-------+
	| Field         | Type         | Null | Key | Default | Extra |
	+---------------+--------------+------+-----+---------+-------+
	| receive_id    | varchar(100) | NO   | PRI | NULL    |       |
	| user_id       | varchar(100) | YES  |     | NULL    |       |
	| user_name     | varchar(100) | YES  |     | NULL    |       |
	| postal_code   | varchar(100) | YES  |     | NULL    |       |
	| province_name | varchar(100) | YES  |     | NULL    |       |
	| city_name     | varchar(100) | YES  |     | NULL    |       |
	| country_name  | varchar(100) | YES  |     | NULL    |       |
	| detail_info   | varchar(500) | YES  |     | NULL    |       |
	| national_code | varchar(100) | YES  |     | NULL    |       |
	| tel_number    | varchar(100) | YES  |     | NULL    |       |
	| create_date   | varchar(100) | YES  |     | NULL    |       |
	| create_time   | varchar(100) | YES  |     | NULL    |       |
	| update_date   | varchar(100) | YES  |     | NULL    |       |
	| update_time   | varchar(100) | YES  |     | NULL    |       |
	+---------------+--------------+------+-----+---------+-------+
	 */
	private String receiveId;
	private String userId;
	private String userName;
	private String postalCode;
	private String provinceName;
	private String cityName;
	private String countryName;
	private String detailInfo;
	private String nationalCode;
	private String telNumber;
	private String createDate;
	private String createTime;
	private String updateDate;
	private String updateTime;
	public String getReceiveId() {
		return receiveId;
	}
	public void setReceiveId(String receiveId) {
		this.receiveId = receiveId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getDetailInfo() {
		return detailInfo;
	}
	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}
	public String getNationalCode() {
		return nationalCode;
	}
	public void setNationalCode(String nationalCode) {
		this.nationalCode = nationalCode;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
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
		return "Receive [receiveId=" + receiveId + ", userId=" + userId + ", userName=" + userName + ", postalCode="
				+ postalCode + ", provinceName=" + provinceName + ", cityName=" + cityName + ", countryName="
				+ countryName + ", detailInfo=" + detailInfo + ", nationalCode=" + nationalCode + ", telNumber="
				+ telNumber + ", createDate=" + createDate + ", createTime=" + createTime + ", updateDate=" + updateDate
				+ ", updateTime=" + updateTime + "]";
	}
	
	
}
