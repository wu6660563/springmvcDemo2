/**
 *
 * @Title InitializeListener.java
 * @Package com.framework.sytem.initialize
 * @Description TODO
 * @Date Mar 24, 2016 9:29:35 PM
 * @version 1.0
 */
package com.framework.sytem.initialize;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.BasicConfigurator;

import com.framework.sytem.resource.SysResourceCenter;

/**
 * @ClassName InitializeListener
 * @Description TODO
 * @author Nick
 * @version 1.0
 * @Date Mar 24, 2016 9:29:35 PM
 */
public class InitializeListener  implements ServletContextListener {
	
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		//配置系统变量
		String sysPath = servletContextEvent.getServletContext().getRealPath("/");
		SysResourceCenter.getInstance().setSysPath(sysPath);
		//初始化日志
		initLog();
	}
	
	/**
     * 
     * <p>初始化LOG4J日志配置
     * 
     * @Date 2016/01/10
     * 
     */
    private void initLog() {
    	String sysPath = SysResourceCenter.getInstance().getSysPath();
    	System.setProperty("sysPath", sysPath);
    	System.out.println("====================sysPath:"+sysPath);
        BasicConfigurator.configure();
    }

}