/**
 *
 * @Title SysResourceCenter.java
 * @Package com.framework.sytem.resource
 * @Description TODO
 * @Date Mar 24, 2016 9:32:09 PM
 * @version 1.0
 */
package com.framework.sytem.resource;

/**
 * @ClassName SysResourceCenter
 * @Description TODO
 * @author Nick
 * @version 1.0
 * @Date Mar 24, 2016 9:32:09 PM
 */
public final class SysResourceCenter {
	
	/**
	 * instance：
	 * <p>
	 * 静态的唯一的 SysResourceCenter 实例
	 * 
	 * @since v1.01
	 */
	private static SysResourceCenter instance;

	/**
	 * sysPath：
	 * <p>
	 * 系统路径
	 * </p>
	 * 
	 * @since v1.01
	 */
	private String sysPath = "";

	/**
	 * <p>
	 * 创建一个新的 {@link SysResourceCenter} 实例。 由于该类使用单例模式，所以该方法为私有的。
	 * </p>
	 * 
	 * @since v1.01
	 */
	private SysResourceCenter() {
	}

	/**
	 * getInstance:
	 * <p>
	 * 获取 {@link SysResourceCenter} 的实例，如果该实例为 <code>null</code>，则创建一个
	 * {@link SysResourceCenter} 实例。
	 * 
	 * @return {@link SysResourceCenter} - 返回 {@link SysResourceCenter} 的实例
	 * 
	 * @since v1.01
	 */
	public static SysResourceCenter getInstance() {
		if (instance == null) {
			instance = new SysResourceCenter();
		}
		return instance;
	}

	/**
	 * getSysPath
	 * <p>
	 * 获取系统路径
	 * </p>
	 * 
	 * @return {@link String} - 返回系统路径
	 * @since v1.01
	 */
	public String getSysPath() {
		return sysPath;
	}

	/**
	 * setSysPath:
	 * <p>
	 * 设置系统路径
	 * 
	 * @param sysPath
	 *            - 系统路径
	 * 
	 * @since v1.01
	 */
	public void setSysPath(String sysPath) {
		this.sysPath = sysPath;
	}



}
