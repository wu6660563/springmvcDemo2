/**
 *
 * @Title OrderMapper.java
 * @Package com.framework.test.mapper
 * @Description TODO
 * @Date Mar 24, 2016 9:59:51 PM
 * @version 1.0
 */
package com.framework.test.mapper;

import org.springframework.stereotype.Repository;

import com.framework.base.mapper.BaseMapper;
import com.framework.test.model.Order;

/**
 * @ClassName OrderMapper
 * @Description TODO
 * @author Nick
 * @version 1.0
 * @Date Mar 24, 2016 9:59:51 PM
 */
@Repository
public interface OrderMapper extends BaseMapper<Order>{

}
