/**
 *
 * @Title OrderService.java
 * @Package com.framework.test.service
 * @Description TODO
 * @Date Mar 24, 2016 10:36:17 PM
 * @version 1.0
 */
package com.framework.test.service;

import java.util.List;

import com.framework.test.model.Order;

/**
 * @ClassName OrderService
 * @Description TODO
 * @author Nick
 * @version 1.0
 * @Date Mar 24, 2016 10:36:17 PM
 */

public interface OrderService {
	
	public List<Order> findAll();
	
}
