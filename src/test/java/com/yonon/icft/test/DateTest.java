/**
 * 
 */
package com.yonon.icft.test;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author Yonon
 * 2016��8��7��
 */
public class DateTest {
	private Logger log = Logger.getLogger(this.getClass());
	@Test
	public void dateTest(){
		String time;
		java.text.DateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        time = format1.format(new Date());
        log.info("time��" + time);
	}
}
