/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: ZHZTest.java 
* @Package com.zhz233.test 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月4日
* @version V1.0.0
*/
package com.zhz233.test;

import java.util.Date;

import org.junit.Test;

import com.zhz233.comn.utils.DecimalUtils;
import com.zhz233.comn.utils.TimeUtils;
import com.zhz233.comn.utils.ZHZUtils;
/**
* @ClassName: ZHZTest
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月4日
*/
public class ZHZTest {

	@Test
	public void test3() {
		String date="2018-04-2 00:00:00";
		Date dt = TimeUtils.getDate(date);
		System.err.println(dt);
	}

	@Test
	public void test2() {
		System.err.println(ZHZUtils.AutoNoTGoods("20180423000000000001"));
	}
	@Test
	public void test1() {
		System.err.println(ZHZUtils.getUsr("7392FB59DDD464C894C4DF09B5DA3AA3"));
	}
	@Test
	public void test0(){
		String aa = DecimalUtils.add("12.2", "12.2",2);
		double a = ZHZUtils.AutoDiscount(1231231.12312,9);
		System.out.println(a);
	}
}
