package org.spring.springboot.domain;

/**
 * 
 * 客户表
 CREATE TABLE `wx_constomer` (
  `user_id` varchar(100) NOT NULL COMMENT '用户ID，系统内唯一ID',
  `open_id` varchar(100) DEFAULT NULL COMMENT '微信openid',
  `login_name` varchar(100) DEFAULT NULL COMMENT '用户登录账号',
  `login_pwd` varchar(100) DEFAULT NULL COMMENT '用户登录密码',
  `nike_name` varchar(100) DEFAULT NULL COMMENT '用户昵称',
  `area` varchar(50) DEFAULT NULL COMMENT '用户所在地区',
  `age` varchar(5) DEFAULT NULL COMMENT '用户年龄',
  `phone` varchar(20) DEFAULT NULL COMMENT '用户手机号（登录可用）',
  `email` varchar(100) DEFAULT NULL COMMENT '用户邮箱（登录可用）',
  `profession` varchar(50) DEFAULT NULL COMMENT '用户职业',
  `regtime` varchar(20) DEFAULT NULL COMMENT '用户注册日期',
  `remarks` varchar(800) DEFAULT NULL COMMENT '用户个人说明',
  `status` varchar(5) DEFAULT NULL COMMENT '用户状态',
  `create_date` varchar(100) DEFAULT NULL COMMENT '创建日期',
  `create_time` varchar(100) DEFAULT NULL COMMENT '创建时间',
  `update_date` varchar(100) DEFAULT NULL COMMENT '更新日期',
  `update_time` varchar(100) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
	private String headimgurl;
	private String sex;
	/**职业*/
	private String profession;
	private String regtime;
	private String remarks;
	private String status;
	private String createDate;
	private String createTime;
	private String updateDate;
	private String updateTime;

	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
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
				+ ", email=" + email + ", headimgurl=" + headimgurl + ", sex=" + sex + ", profession=" + profession
				+ ", regtime=" + regtime + ", remarks=" + remarks + ", status=" + status + ", createDate=" + createDate
				+ ", createTime=" + createTime + ", updateDate=" + updateDate + ", updateTime=" + updateTime + "]";
	}
	
	
	
	
	
}
