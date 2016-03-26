/**
 *
 * @Title ApplicationContextFactory.java
 * @Package com.framework.base.context
 * @Description TODO
 * @Date Mar 26, 2016 10:55:34 AM
 * @version 1.0
 */
package com.framework.base.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @ClassName ApplicationContextFactory
 * @Description TODO
 * @author Nick
 * @version 1.0
 * @Date Mar 26, 2016 10:55:34 AM
 */
@Component("applicationContextFactory")
public class ApplicationContextFactory  implements ApplicationContextAware {

	/**
	 * @Fields appContext ApplicationContext上下文
	 */
	private static ApplicationContext appContext;

	/**
	 * 
	 * @Title setApplicationContext
	 * @Description 
	 * @param applicationContext
	 * @throws BeansException
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		appContext = applicationContext;
	}

	/**
	 * 
	 * @Title ApplicationContextFactory
	 * @param @return
	 * @return ApplicationContext
	 * @Description TODO
	 * @thorws
	 */
	public static ApplicationContext getAppContext() {
		return appContext;
	}

	/**
	 * 
	 * @Title ApplicationContextFactory
	 * @param @param beanId
	 * @param @return
	 * @return Object
	 * @Description TODO
	 * @thorws
	 */
	public static Object getBean(String beanId) {
		return appContext.getBean(beanId);
	}


}
