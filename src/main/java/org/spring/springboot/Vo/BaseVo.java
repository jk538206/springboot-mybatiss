package org.spring.springboot.Vo;

import java.util.List;


public class BaseVo {

	/**
	 * 存放分页的list
	 */
	private List pageList;

	/**
	 * 页码
	 */
	private int pageNo;

	/**
	 * 页面数据条数
	 */
	private int pageSize;

	/**
	 * 总记录数
	 */
	private int totalRecordNum;
	/**
	 * 总页数
	 */
	private int totalPageNum;

	private int minRecordNum;
	
	

}
