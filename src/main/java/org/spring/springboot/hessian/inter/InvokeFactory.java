package org.spring.springboot.hessian.inter;

import java.util.Map;

public class InvokeFactory {
	private Map<String, InvokeInterface> invokeMap;
	


	public Map<String, InvokeInterface> getInvokeMap() {
		return invokeMap;
	}



	public void setInvokeMap(Map<String, InvokeInterface> invokeMap) {
		this.invokeMap = invokeMap;
	}



	/**
	 * 根据方法名获取 对应的实现
	 */
	public InvokeInterface getInvoke(String key) {
		return invokeMap.get(key);
	}
}
