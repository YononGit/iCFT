/**
 * 
 */
package com.yonon.framework.util;

import org.apache.log4j.Logger;

/**
 * @author Yonon
 * 2016��8��7��
 */
public class Convert {
	private static Logger log = Logger.getLogger(Convert.class);
	
	public static int stringToInt(String arg){
		
		return Integer.parseInt(arg);
	}
	/**
	 * @param Integer 
	 * @return String
	 * */
	public static String intToString(int arg){
		return Integer.toString(arg);
	}
	
}
