/**
 * 
 */
package com.yonon.framework.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * @author Yonon
 * 2016年8月7日
 */
public class TimeFormat {
	private static Logger log = Logger.getLogger(TimeFormat.class);
	/**
	 * 获取当前时间
	 * @return yyyy-MM-dd hh:mm:ss
	 * */
	public static String timeFormat(){
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String timeStr = format1.format(new Date());
		log.info("util create time format:" + timeStr);
        return timeStr;
	}
}
