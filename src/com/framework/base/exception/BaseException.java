/**
 *
 * @Title BaseException.java
 * @Package com.framework.base.exception
 * @Description TODO
 * @Date Mar 26, 2016 10:39:06 AM
 * @version 1.0
 */
package com.framework.base.exception;

/**
 * 系统异常的超类，所有自定义异常都需要继承这个类
 * @ClassName BaseException
 * @Description TODO
 * @author Nick
 * @version 1.0
 * @Date Mar 26, 2016 10:39:06 AM
 */
public class BaseException extends Exception {

	/**
	 * @Fields serialVersionUID TODO
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @Fields code 异常代码，默认是1
	 */
	protected String code = "1";
	
	
	/**
	 * @Fields msg 异常信息，默认是空字符串
	 */
	protected String msg = "";
	
	/**
	 * @Title BaseException
	 * 
	 * @Description 构造方法
	 */
	public BaseException() {
	}
	
	/**
	 * @Title BaseException
	 * 
	 * @Description 构造方法
	 * @param code	异常代码
	 */
	public BaseException(String code) {
		this.code = code;
	}
	
	/**
	 * @Title BaseException
	 * 
	 * @Description 描述信息
	 * @param code	异常代码
	 * @param msg	异常信息
	 */
	public BaseException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	

}
