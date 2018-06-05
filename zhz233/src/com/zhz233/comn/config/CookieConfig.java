/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: CookieConfig.java 
* @Package com.zhz233.comn.config 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月23日
* @version V1.0.0
*/
package com.zhz233.comn.config;

/**
* @ClassName: CookieConfig
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月23日
*/
public class CookieConfig {
	/**
	 * 属性字段配置
	 */
	//路径配置
	public static final String COOKIE_PATH = "/";
	//时间配置
	public static final int COOKIE_TIMEOUT_15MIN = 15 * 60;//15min
	public static final int COOKIE_TIMEOUT_30MIN = 30 * 60;//30min
	public static final int COOKIE_TIMEOUT_60MIN = 60 * 60;//60min
	public static final int COOKIE_TIMEOUT_1DAY = 24 * 60 * 60;//1天
	//会话cookie
	public static final int COOKIE_TIMEOUT_HH = -1;//会话cookie
	
}
