/**
 *
 * @Title BaseMapper.java
 * @Package com.framework.base.mapper
 * @Description TODO
 * @Date Mar 24, 2016 10:00:47 PM
 * @version 1.0
 */
package com.framework.base.mapper;

import java.util.List;

/**
 * @ClassName BaseMapper
 * @Description TODO
 * @author Nick
 * @version 1.0
 * @Date Mar 24, 2016 10:00:47 PM
 */
public interface BaseMapper<T> {

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
