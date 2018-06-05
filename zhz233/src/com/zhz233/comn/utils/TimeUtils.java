/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TimeUtils.java 
* @Package com.zhz233.comn.utils 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月21日
* @version V1.0.0
*/
package com.zhz233.comn.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
* @ClassName: TimeUtils
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月21日
*/
public class TimeUtils {
	/**
	 * 格式 yyyy-MM-dd HH:mm:ss
	 */
	private static final String PATTERN_YMD_HMS = "yyyy-MM-dd HH:mm:ss";
	
	/*private static final String PATTERN_YMD = "yyyy-MM-dd";*/
	/**
	 * 
	* @Title: getDate
	* @Description: TODO 
	* @param date
	* @param SimpleDateFormatType
	* @return 
	* Date  
	* @throws
	 */
	public static Date getDate(String date){
		Date dt = new Date();
		try {
			dt = new SimpleDateFormat(PATTERN_YMD_HMS).parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dt;
	}
	/**
	 * 
	* @Title: getCurrentYear
	* @Description: TODO 获取年份
	* @return 
	* String  
	* @throws
	 */
	public static String getCurrentYear(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = new Date();
        return sdf.format(date);
	}
	/**
	 * 
	* @Title: getSysYear
	* @Description: TODO 获取年份
	* @return 
	* String  
	* @throws
	 */
	public static String getSysYear() {
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        return year;
	}	
	/**
	 * 
	* @Title: getDate
	* @Description: TODO 获取时间戳
	* @return 
	* String  
	* @throws
	 */
	public static String getDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		return df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
	}
	/**
	 * 
	* @Title: getSimpleDate
	* @Description: TODO 获取简单时间戳
	* @return 
	* String  
	* @throws
	 */
	public static String getSimpleDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
		return df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
	}
	/**
	 * 
	* @Title: getLocalDate
	* @Description: TODO 
	* @return 
	* String  
	* @throws
	 */
	public static String getLocalDate() {
		Locale locale = Locale.CHINA; 
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",locale);//设置日期格式
		return df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
	}
	
}
