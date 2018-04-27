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
	
	public int getMinRecordNum() {
		return (pageNo - 1) * pageSize;
	}

	public List getPageList() {
		return pageList;
	}

	public void setPageList(List pageList) {
		this.pageList = pageList;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecordNum() {
		return totalRecordNum;
	}

	public void setTotalRecordNum(int totalRecordNum) {
		this.totalRecordNum = totalRecordNum;
	}

	public int getTotalPageNum() {
		return totalPageNum;
	}

	public void setTotalPageNum(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public void setMinRecordNum(int minRecordNum) {
		this.minRecordNum = minRecordNum;
	}

	@Override
	public String toString() {
		return "BaseVo [pageList=" + pageList + ", pageNo=" + pageNo + ", pageSize=" + pageSize + ", totalRecordNum="
				+ totalRecordNum + ", totalPageNum=" + totalPageNum + ", minRecordNum=" + minRecordNum + "]";
	}
	
	
	

}
