/**
 *
 * @Title Order.java
 * @Package com.framework.test.model
 * @Description TODO
 * @Date Mar 24, 2016 9:53:25 PM
 * @version 1.0
 */
package com.framework.test.model;

import java.io.Serializable;

/**
 * @ClassName Order
 * @Description TODO
 * @author Nick
 * @version 1.0
 * @Date Mar 24, 2016 9:53:25 PM
 */
public class Order implements Serializable {
	
	/**
	 * @Fields serialVersionUID TODO
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @Fields id 主键
	 */
	private Long id;
	
	/**
	 * @Fields bussinessId 业务ID
	 */
	private String bussiness_id;
	
	/**
	 * @Fields state 状态
	 */
	private String state;
	
	/**
	 * @Fields paymentMethod 支付方式
	 */
	private String payment_method;
	
	/**
	 * @Fields value 支付值
	 */
	private String value;
	
	/**
	 * @Fields taxValue 税
	 */
	private String tax_value;
	
	/**
	 * @Fields creatTime 创建时间
	 */
	private String creat_time;
	
	/**
	 * @Fields modifyTime 修改时间
	 */
	private String modify_time;

	/**
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 * id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return bussiness_id
	 */
	public String getBussiness_id() {
		return bussiness_id;
	}

	/**
	 * @param bussiness_id
	 * bussiness_id
	 */
	public void setBussiness_id(String bussiness_id) {
		this.bussiness_id = bussiness_id;
	}

	/**
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 * state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return payment_method
	 */
	public String getPayment_method() {
		return payment_method;
	}

	/**
	 * @param payment_method
	 * payment_method
	 */
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	/**
	 * @return value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 * value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return tax_value
	 */
	public String getTax_value() {
		return tax_value;
	}

	/**
	 * @param tax_value
	 * tax_value
	 */
	public void setTax_value(String tax_value) {
		this.tax_value = tax_value;
	}

	/**
	 * @return creat_time
	 */
	public String getCreat_time() {
		return creat_time;
	}

	/**
	 * @param creat_time
	 * creat_time
	 */
	public void setCreat_time(String creat_time) {
		this.creat_time = creat_time;
	}

	/**
	 * @return modify_time
	 */
	public String getModify_time() {
		return modify_time;
	}

	/**
	 * @param modify_time
	 * modify_time
	 */
	public void setModify_time(String modify_time) {
		this.modify_time = modify_time;
	}

	

}
