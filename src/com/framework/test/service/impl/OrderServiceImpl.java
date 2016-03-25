/**
 *
 * @Title OrderServiceImpl.java
 * @Package com.framework.test.service.impl
 * @Description TODO
 * @Date Mar 24, 2016 10:36:33 PM
 * @version 1.0
 */
package com.framework.test.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.framework.test.mapper.OrderMapper;
import com.framework.test.model.Order;
import com.framework.test.service.OrderService;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @author Nick
 * @version 1.0
 * @Date Mar 24, 2016 10:36:33 PM
 */
@Transactional
@Service
public class OrderServiceImpl implements OrderService {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	public OrderMapper orderMapper;

	/**
	 * @Title findAll
	 * @Description 
	 * @return
	 * @see com.framework.test.service.OrderService#findAll()
	 */
	public List<Order> findAll() {
		logger.info("find All");
		return orderMapper.findAll();
	}

}
