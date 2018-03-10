package org.spring.springboot.domain;

public class Question {

	private static final long serialVersionUID = 3474754787L;
	/**
	 *  describe wx_question;
	+------------------+--------------+------+-----+---------+-------+
	| Field            | Type         | Null | Key | Default | Extra |
	+------------------+--------------+------+-----+---------+-------+
	| question_id      | varchar(100) | NO   | PRI | NULL    |       |
	| question_date    | varchar(100) | YES  |     | NULL    |       |
	| question_title   | varchar(100) | YES  |     | NULL    |       |
	| question_content | varchar(800) | YES  |     | NULL    |       |
	| create_date      | varchar(100) | YES  |     | NULL    |       |
	| create_time      | varchar(100) | YES  |     | NULL    |       |
	| update_date      | varchar(100) | YES  |     | NULL    |       |
	| update_time      | varchar(100) | YES  |     | NULL    |       |
	+------------------+--------------+------+-----+---------+-------+
	 */
	private String questionId;
	private String questionDate;
	private String questionTitle;
	private String questionContent;
	private String createDate;
	private String createTime;
	private String updateDate ;
	private String updateTime;
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestionDate() {
		return questionDate;
	}
	public void setQuestionDate(String questionDate) {
		this.questionDate = questionDate;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getQuestionContent() {
		return questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
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
		return "Question [questionId=" + questionId + ", questionDate=" + questionDate + ", questionTitle="
				+ questionTitle + ", questionContent=" + questionContent + ", createDate=" + createDate
				+ ", createTime=" + createTime + ", updateDate=" + updateDate + ", updateTime=" + updateTime + "]";
	}
	
	
	
}
