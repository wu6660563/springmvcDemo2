/**
 *
 * @Title BaseService.java
 * @Package com.framework.base.service
 * @Description TODO
 * @Date Mar 26, 2016 11:01:20 AM
 * @version 1.0
 */
package com.framework.base.service;

import java.util.List;

/**
 * @ClassName BaseService
 * @Description TODO
 * @author Nick
 * @version 1.0
 * @Date Mar 26, 2016 11:01:20 AM
 */
public interface BaseService<T> {

	/**
	 * 增加
	 * @param t
	 * @return
	 */
	public boolean add(T t);

	/**删除
	 * @param t
	 * @return
	 */
	public boolean delete(T t);

	/**修改
	 * @param t
	 * @return
	 */
	public T update(T t);

	/**按照ID查询
	 * @param id
	 * @return
	 */
	public boolean findById(int id);

	/**查询所有的
	 * @return
	 */
	public List<T> findAll();
	
	/**
	 * 得到最新一条数据
	 * @return
	 */
	public T getLastObject();


}
