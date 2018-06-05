/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: RedisTest.java 
* @Package com.zhz233.test 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
* @version V1.0.0
*/
package com.zhz233.test;

import org.junit.Test;

import com.zhz233.comn.utils.RedisUtils;

import redis.clients.jedis.Jedis;

/**
* @ClassName: RedisTest
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
*/
public class RedisTest {
	public static void main(String []args) {
		Jedis jedis = RedisUtils.getJedis();
		jedis.set("abc", "456");
		jedis.expire("abc", 100);
		if(jedis.exists("abc"))
			System.err.println(jedis.get("abc"));;
		//释放资源
		RedisUtils.reJedis(jedis);
	}
	@Test
	public void redisTest0() {
		Jedis jedis = RedisUtils.getJedis();
		if(jedis.exists("binbin2017") && jedis.exists(jedis.get("binbin2018"))) {
			System.err.println("yes");
		}else {
			System.err.println("no");
		}
		//释放资源
		RedisUtils.reJedis(jedis);
	}	
}
