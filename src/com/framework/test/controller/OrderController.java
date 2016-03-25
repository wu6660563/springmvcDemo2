/**
 *
 * @Title OrderController.java
 * @Package com.framework.test.controller
 * @Description TODO
 * @Date Mar 24, 2016 10:40:35 PM
 * @version 1.0
 */
package com.framework.test.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.framework.test.model.Order;
import com.framework.test.service.OrderService;

/**
 * @ClassName OrderController
 * @Description TODO
 * @author Nick
 * @version 1.0
 * @Date Mar 24, 2016 10:40:35 PM
 */

@Controller
@RequestMapping("/order")
public class OrderController {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void test() {
		logger.info("TEST");
	}
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public @ResponseBody List<Order> findAll() {
		List<Order> list = orderService.findAll();
		for (Order order : list) {
			System.out.println(order.getBussiness_id() + "-----> "+ order.getValue());
		}
		return list;
	}

}
