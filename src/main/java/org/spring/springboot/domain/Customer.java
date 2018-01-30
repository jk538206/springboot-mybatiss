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
	/**TODO*/
	private String remarks;
	private String status;
	private String create_date;
	private String create_time;
	private String update_date;
	private String update_time;
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
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", openId=" + openId + ", loginName=" + loginName + ", loginPwd="
				+ loginPwd + ", nikeName=" + nikeName + ", area=" + area + ", age=" + age + ", phone=" + phone
				+ ", email=" + email + ", profession=" + profession + ", remarks=" + remarks + ", status=" + status
				+ ", create_date=" + create_date + ", create_time=" + create_time + ", update_date=" + update_date
				+ ", update_time=" + update_time + "]";
	}
	
	
	
}
