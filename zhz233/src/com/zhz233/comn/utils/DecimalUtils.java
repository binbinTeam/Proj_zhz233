/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: DecimalUtils.java 
* @Package com.zhz233.comn.utils 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月10日
* @version V1.0.0
*/
package com.zhz233.comn.utils;

import java.math.BigDecimal;

/**
* @ClassName: DecimalUtils
* @Description: TODO 精度 金融 数据 处理类
* @author ZhzTeam
* @date 2018年4月10日
*/
public class DecimalUtils {
	/**
	 * 
	 */
	private static double resultDecimal;
	private static String resultSDecimal;
	/**
	 * 
	* @Title: ChangeDS
	* @Description: TODO 获取格式化 经济数字 数据
	* @param v1
	* @param scale
	* @return 
	* double  
	* @throws
	 */
	public static double ChangeDS(double v1,int scale) {
		if(scale < 0) {
			scale = 2;
		}
		BigDecimal b1 = new BigDecimal(Double.valueOf(v1)); 
		return b1.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	/**
	 * 
	* @Title: ChangeDS
	* @Description: TODO 获取格式化 经济数字 数据
	* @param v1
	* @param scale
	* @return 
	* String  
	* @throws
	 */
	public static String ChangeDS(String v1,int scale) {
		if(scale < 0) {
			scale = 2;
		}
		BigDecimal b1 = new BigDecimal(Double.valueOf(v1)); 
		return b1.setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
	}
	/**
	 * 
	* @Title: add
	* @Description: TODO 加法
	* @param v1
	* @param v2
	* @return 
	* double  
	* @throws
	 */
	public static double add(double v1,double v2,int scale){
		if(scale < 0) {
			scale = 2;
		}
		BigDecimal b1 = new BigDecimal(Double.valueOf(v1)); 
		BigDecimal b2 = new BigDecimal(Double.valueOf(v2)); 
		resultDecimal = b1.add(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
		return resultDecimal;
	}
	/**
	 * 
	* @Title: add
	* @Description: TODO 加法
	* @param v1
	* @param v2
	* @return 
	* String  
	* @throws
	 */
	public static String add(String v1,String v2,int scale){
		if(scale < 0) {
			scale = 2;
		}
		BigDecimal b1 = new BigDecimal(Double.valueOf(v1)); 
		BigDecimal b2 = new BigDecimal(Double.valueOf(v2)); 
		resultSDecimal = b1.add(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
		return resultSDecimal;
	}
	/**
	 * 
	* @Title: sub
	* @Description: TODO 减法
	* @param v1
	* @param v2
	* @return 
	* double  
	* @throws
	 */
	public static double sub(double v1,double v2,int scale){
		if(scale < 0) {
			scale = 2;
		}
		BigDecimal b1 = new BigDecimal(Double.valueOf(v1)); 
		BigDecimal b2 = new BigDecimal(Double.valueOf(v2)); 
		resultDecimal = b1.subtract(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
		return resultDecimal;
	}
	/**
	 * 
	* @Title: sub
	* @Description: TODO 减法
	* @param v1
	* @param v2
	* @return 
	* String  
	* @throws
	 */
	public static String sub(String v1,String v2,int scale){
		if(scale < 0) {
			scale = 2;
		}
		BigDecimal b1 = new BigDecimal(Double.valueOf(v1)); 
		BigDecimal b2 = new BigDecimal(Double.valueOf(v2)); 
		resultSDecimal = b1.subtract(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
		return resultSDecimal;
	}
	/**
	 * 
	* @Title: mul
	* @Description: TODO 乘法
	* @param v1
	* @param v2
	* @return 
	* String  
	* @throws
	 */
	public static String mul(String v1,String v2,int scale){
		if(scale < 0) {
			scale = 2;
		}
		BigDecimal b1 = new BigDecimal(Double.valueOf(v1)); 
		BigDecimal b2 = new BigDecimal(Double.valueOf(v2)); 
		resultSDecimal = b1.subtract(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
		return resultSDecimal;
	}
	/**
	 * 
	* @Title: mul
	* @Description: TODO 乘法
	* @param v1
	* @param v2
	* @return 
	* double  
	* @throws
	 */
	public static double mul(double v1,double v2,int scale){
		if(scale < 0) {
			scale = 2;
		}
		BigDecimal b1 = new BigDecimal(Double.valueOf(v1)); 
		BigDecimal b2 = new BigDecimal(Double.valueOf(v2)); 
		resultDecimal = b1.subtract(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
		return resultDecimal;
	}
	/**
	 * 
	* @Title: div
	* @Description: TODO 除法
	* @param v1
	* @param v2
	* @return 
	* double  
	* @throws
	 */
	public static double div(double v1,double v2 ,int scale){
		if(scale < 0) {
			scale = 2;
		}
		BigDecimal b1 = new BigDecimal(Double.valueOf(v1)); 
		BigDecimal b2 = new BigDecimal(Double.valueOf(v2)); 
		resultDecimal = b1.divide(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
		return resultDecimal;
	}
	/**
	 * 
	* @Title: div
	* @Description: TODO 除法
	* @param v1
	* @param v2
	* @return 
	* String  
	* @throws
	 */
	public static String div(String v1,String v2,int scale) {
		if(scale < 0) {
			scale = 2;
		}
		BigDecimal b1 = new BigDecimal(Double.valueOf(v1)); 
		BigDecimal b2 = new BigDecimal(Double.valueOf(v2)); 
		resultSDecimal = b1.divide(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).toString();
		return resultSDecimal;
	}
}
