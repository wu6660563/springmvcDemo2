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

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;

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
	public String test(HttpServletRequest request,Model model) {
		logger.info("TEST");
		
		//从后台代码获取国际化信息
        RequestContext requestContext = new RequestContext(request);
        model.addAttribute("name", requestContext.getMessage("name"));
		return "index";
	}
	
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public @ResponseBody String test2() {
		logger.info("TEST");
		return "测试中午乱码问题";
	}
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public @ResponseBody List<Order> findAll() {
		List<Order> list = orderService.findAll();
		for (Order order : list) {
			System.out.println(order.getBussiness_id() + "-----> "+ order.getValue()+"--->"+order.getCreate_time());
		}
		return list;
	}
	
	@RequestMapping(value = "/findAll2", method = RequestMethod.GET)
	public ModelAndView findAll2() {
		System.out.println("--------------->findAll2");
		ModelAndView modelAndView = new ModelAndView();
		List<Order> list =  orderService.findAll();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("order/findAll2");
		return modelAndView;
	}
	
	@RequestMapping(value = "/findAll3", method = RequestMethod.GET)
	@ModelAttribute("list")
	public List<Order> findAll3() {
		System.out.println("--------------->findAll3");
		
		return orderService.findAll();
	}
	
	@RequestMapping(value = "/findAll4", method = RequestMethod.GET)
	public String findAll4(Model model) {
		System.out.println("--------------->findAll4");
		model.addAttribute("list", orderService.findAll());
		return "order/findAll3";
	}

}
