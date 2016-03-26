/**
 *
 * @Title StringToDateConverter.java
 * @Package com.framework.base.util
 * @Description TODO
 * @Date Mar 26, 2016 1:15:46 PM
 * @version 1.0
 */
package com.framework.base.util;

import java.text.ParseException;
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
public class StringToDateConverter implements Converter<String, Date> {
	
	private String datePattern;
	
	/**
	 * @Title StringToDateConverter
	 * 
	 * @Description TODO
	 */
	public StringToDateConverter(String datePattern) {
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
	public Date convert(String string) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.datePattern);
		simpleDateFormat.setLenient(false);
		try {
			return simpleDateFormat.parse(string);
		} catch (ParseException e) {
			throw new IllegalArgumentException("Invalid date format.Please use this pattern:" + datePattern);
		}
	}
	
}
