/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: RedisConfig.java 
* @Package com.zhz233.common.config 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月20日
* @version V1.0.0
*/
package com.zhz233.comn.config;

/**
* @ClassName: RedisConfig
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月20日
*/
public class RedisConfig {
	/**
	 * 全局变量配置
	 */
	//登录IP
	public static final String IP = "127.0.0.1";
	//端口
	public static final int PORT = 6379;
	//密码
	public static final String AUTH = "123456";
	//最大的活跃连接数
	public static final int MAX_TOTAL = 200;
	//最大的空闲连接数
	public static final int MAX_IDLE = 50;
	//最小的空闲连接数
	public static final int MIN_IDLE = 10;
	//最大的超时时间
	public static final int TIMEOUT = 10000;
	//最大的等待时间
	public static final int MAX_WAITMILLIS = 10000;
	//
	public static final int TBERUNSMILLIS = 30000;
	//
	public static final int NTPERUN = 10;
	//
	public static final int MEITMILLIS = 60000;
	//时间参数
	public static final int REDIS_TIMEOUT_15MIN = 15 * 60;//15min
	public static final int REDIS_TIMEOUT_30MIN = 30 * 60;//30min
	public static final int REDIS_TIMEOUT_60MIN = 60 * 60;//60min
	public static final int REDIS_TIMEOUT_1DAY = 24 * 60 * 60;//1天
}
