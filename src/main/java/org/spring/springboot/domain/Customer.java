package org.spring.springboot.domain;

/**
 * 
 * 客户表
 * +-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| user_id     | varchar(100) | NO   | PRI | NULL    |       |
| open_id     | varchar(100) | YES  |     | NULL    |       |
| login_name  | varchar(100) | YES  |     | NULL    |       |
| login_pwd   | varchar(100) | YES  |     | NULL    |       |
| nike_name   | varchar(100) | YES  |     | NULL    |       |
| area        | varchar(50)  | YES  |     | NULL    |       |
| age         | varchar(5)   | YES  |     | NULL    |       |
| phone       | varchar(20)  | YES  |     | NULL    |       |
| email       | varchar(100) | YES  |     | NULL    |       |
| profession  | varchar(50)  | YES  |     | NULL    |       |
| regtime     | varchar(20)  | YES  |     | NULL    |       |
| remarks     | varchar(800) | YES  |     | NULL    |       |
| status      | varchar(5)   | YES  |     | NULL    |       |
| create_date | varchar(100) | YES  |     | NULL    |       |
| create_time | varchar(100) | YES  |     | NULL    |       |
| update_date | varchar(100) | YES  |     | NULL    |       |    
| update_time | varchar(100) | YES  |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
 */
public class Customer {

	
	private static final long serialVersionUID = 3474754787L;
	
	private String userId;
	private String openId;
	private String loginName ;
	private String loginPwd ;
	private String nikeName ;
	private String area;
	private String age ;
	private String phone ;
	private String email;
	/**职业*/
	private String profession;
	private String regtime;
	private String remarks;
	private String status;
	private String createDate;
	private String createTime;
	private String updateDate;
	private String updateTime;

	
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getNikeName() {
		return nikeName;
	}
	public void setNikeName(String nikeName) {
		this.nikeName = nikeName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public void setCreateTime(String createDime) {
		this.createTime = createDime;
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
		return "Customer [userId=" + userId + ", openId=" + openId + ", loginName=" + loginName + ", loginPwd="
				+ loginPwd + ", nikeName=" + nikeName + ", area=" + area + ", age=" + age + ", phone=" + phone
				+ ", email=" + email + ", profession=" + profession + ", regtime=" + regtime + ", remarks=" + remarks
				+ ", status=" + status + ", createDate=" + createDate + ", createTime=" + createTime + ", updateDate="
				+ updateDate + ", updateTime=" + updateTime + "]";
	}
	
	
	
	
	
}
