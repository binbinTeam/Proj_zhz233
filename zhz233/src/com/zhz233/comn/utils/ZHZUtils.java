/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: ZHZUtils.java 
* @Package com.zhz233.comn.utils 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月30日
* @version V1.0.0
*/
package com.zhz233.comn.utils;

import redis.clients.jedis.Jedis;

/**
* @ClassName: ZHZUtils
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月30日
*/
public class ZHZUtils{
	/**
	 * 新自增编号
	 */
	private static String new_No;
	/**
	 * 折扣计算
	 */
	private static double new_Discount;
	
	/**
	 * 
	* @Title: BigDecimal
	* @Description: TODO 返回金融金额数字 并保留2位小数
	* @param old_Discount
	* @return 
	* double  
	* @throws
	 */
	public static double AutoDiscount(double old_Discount,double discount) {
		//获取折扣
		new_Discount = DecimalUtils.mul(old_Discount, discount, 2);
		return new_Discount;
	}
	/**
	 * 
	* @Title: AutoNoTGoods
	* @Description: TODO 
	* @param old_No
	* @return 
	* String  
	* @throws
	 */
	public static String AutoNoTGoods(String old_No) {
		//判断是否为空
		String autoT = TimeUtils.getSimpleDate();
		long no = 1L;
		if(old_No != null) {
			if(autoT.equals(old_No.substring(0, 8))) {
				no = Long.parseLong(old_No.substring(9, 20))+1;
			}
		}
		return autoT + String.format("%012d", no);		
	}
	/**
	 * 
	* @Title: AutoNoTLease
	* @Description: TODO 
	* @param old_No
	* @return 
	* String  
	* @throws
	 */
	public static String AutoNoTLease(String old_No) {
		//判断是否为空
		String autoT = TimeUtils.getSimpleDate();
		long no = 1L;
		if(old_No != null) {
			if(autoT.equals(old_No.substring(0, 8))) {
				no = Long.parseLong(old_No.substring(11, 22)) + 1;
			}
		}
		return autoT + "03" +String.format("%012d", no);		
	}
	/**
	 * 
	* @Title: AutoNoTGame
	* @Description: TODO 获取game 自增No
	* @param old_No
	* @return 
	* String  
	* @throws
	 */
	public static String AutoNoTGame(String old_No) {
		//判断是否为空
		if(old_No == null) {
			old_No = TimeUtils.getSimpleDate();
			new_No = old_No + "0001";
		}else {
			String auto = old_No.substring(0, 8);
			String autoT = TimeUtils.getSimpleDate();
			long no = 0001;
			if(auto.equals(autoT)) {
				no = Long.parseLong(old_No.substring(9, 12)) + 1;
				new_No = auto + String.format("%04d", no);
			}
			new_No = autoT + String.format("%04d", no);
		}
		return new_No;
	}
	
	/**
	 * 
	* @Title: AutoNoTNotice
	* @Description: TODO 获取notice 自增No
	* @param old_No
	* @return 
	* String  
	* @throws
	 */
	public static String AutoNoTNotice(String old_No) {
		//判断是否为空
		if(old_No == null) {
			old_No = TimeUtils.getSimpleDate();
			new_No = old_No + "0001";
		}else {
			String auto = old_No.substring(0, 8);
			String autoT = TimeUtils.getSimpleDate();
			long no = 0001;
			if(auto.equals(autoT)) {
				no = Long.parseLong(old_No.substring(9, 12)) + 1;
				new_No = auto + String.format("%04d", no);
			}
			new_No = autoT + String.format("%04d", no);
		}
		return new_No;
	}
	/**
	 * 
	* @Title: AutoNoTUser
	* @Description: TODO 返回自增user No
	* @param old_No
	* @return 
	* String  
	* @throws
	 */
	public static String AutoNoTUser(String old_No) {
		//判断是否为空
		if(old_No == null) {
			old_No = TimeUtils.getCurrentYear();
			new_No = old_No + "00000001";
		}else {
			String auto = old_No.substring(0, 4);
			long no = Long.parseLong(old_No.substring(5, 12)) + 1;
			new_No = auto + String.format("%08d", no);
		}
		return new_No;
	}
	/**
	 * 
	* @Title: isLogin
	* @Description: TODO 判断登录状态
	* @param ssid
	* @return 
	* boolean  
	* @throws
	 */
	public static boolean isLogin(String ssid) {
		Jedis jedis = RedisUtils.getJedis();
		boolean Flag = jedis.exists(ssid);
		boolean Flag2 = false;
		if(Flag) {//判断 缓存 合理性
			Flag2 = jedis.exists(jedis.get(ssid));
		}
		jedis.close();
		return Flag2;
	}
	/**
	 * 
	* @Title: giacc
	* @Description: TODO 获取登录名
	* @param ssid
	* @return 
	* String  
	* @throws
	 */
	public static String giacc(String ssid) {
		Jedis jedis = RedisUtils.getJedis();
		String uacc = jedis.get(ssid);
		jedis.close();
		return uacc;
	}
	/**
	 * 
	* @Title: getUsr
	* @Description: TODO 获取用户名
	* @param ssid
	* @return 
	* boolean  
	* @throws
	 */
	public static String getUsr(String ssid) {
		Jedis jedis = RedisUtils.getJedis();
		boolean Flag = jedis.exists(ssid);
		boolean Flag2 = false;
		if(Flag) {//判断 缓存 合理性
			Flag2 = jedis.exists(jedis.get(ssid));
		}
		String usrName = "老铁，欢迎访问租号站233交易平台！";
		if(Flag && Flag2) {//判断 缓存 合理性
			usrName = "欢迎"+jedis.get(ssid)+"大佬！";
		}
		jedis.close();
		return usrName;
	}
}
