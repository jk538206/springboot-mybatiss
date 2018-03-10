package org.spring.springboot.hessian.bean;

public class Info {
	
	private String respCode;
	
	private String respMsg;
	
	/**
	 * 请求方法 名
	 */
	private String methodName;

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	
	
}
