/**
 *
 * @Title StringToDateConverter.java
 * @Package com.framework.base.util
 * @Description TODO
 * @Date Mar 26, 2016 1:15:46 PM
 * @version 1.0
 */
package com.framework.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * @ClassName StringToDateConverter
 * @Description TODO
 * @author Nick
 * @version 1.0
 * @Date Mar 26, 2016 1:15:46 PM
 */
public class DateToStringConverter implements Converter<Date, String> {
	
	private String datePattern = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * @Title StringToDateConverter
	 * 
	 * @Description TODO
	 */
	public DateToStringConverter(String datePattern) {
		this.datePattern = datePattern;
		System.out.println("instance ... converter with pattern:" + datePattern);
	}

	/**
	 * @Title convert
	 * @Description 
	 * @param arg0
	 * @return
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	public String convert(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.datePattern);
		return simpleDateFormat.format(date);
	}
	
}
