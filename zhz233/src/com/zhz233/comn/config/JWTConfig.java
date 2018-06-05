/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: JWTConfig.java 
* @Package com.zhz233.common.config 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月19日
* @version V1.0.0
*/
package com.zhz233.comn.config;

/**
* @ClassName: JWTConfig
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月19日
*/
public class JWTConfig {
	/**
	 * JWT 配置信息
	 */
	//发行人
	public static final String JWT_ADMIN_ROBOT = "robot";
	public static final String JWT_ADMIN_MANMADE = "man-made";
	//观众
	public static final String JWT_AUDD_TOURIST = "tourist";
	public static final String JWT_AUDD_STORE = "store";
	//密钥binbinzhz2332018
	public static final String JWT_SECERT = "YmluYmluemh6MjMzMjAxOA==";
	//时间配置
	public static final long JWT_TTL_ONDDAY = 24 * 60 * 60 * 1000;//24hour
	public static final long JWT_TTL_60MIN = 60 * 60 * 1000;//60min
	public static final long JWT_TTL_30MIN = 30 * 60 * 1000;//30min
	public static final long JWT_TTL_15MIN = 15 * 60 * 1000;//15min
	//验证状态码配置
	public static final int JWTREQCODE_SUCCESS = 000;//验证成功
	public static final int JWTREQCODE_EXPIRE = 100;//验证过期
	public static final int JWTREQCODE_FAIL = 101;//验证不通过
}
