/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: RedisUtils.java 
* @Package com.zhz233.common.utils 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月20日
* @version V1.0.0
*/
package com.zhz233.comn.utils;

import com.zhz233.comn.config.RedisConfig;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.exceptions.JedisConnectionException;
import redis.clients.jedis.exceptions.JedisException;

/**
* @ClassName: RedisUtils
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月20日
*/
public class RedisUtils {
	//属性变量
	private static JedisPool jedisPool;
	/**
	 * 初始化Redis连接池
	 */
	static{
		try {//JedisPoolConfig配置
			JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
			jedisPoolConfig.setMaxTotal(RedisConfig.MAX_TOTAL);
			jedisPoolConfig.setMinIdle(RedisConfig.MIN_IDLE);
			jedisPoolConfig.setMaxIdle(RedisConfig.MAX_IDLE);
			jedisPoolConfig.setMaxWaitMillis(RedisConfig.MAX_WAITMILLIS);
			jedisPoolConfig.setTestOnBorrow(true);
			jedisPoolConfig.setTestOnReturn(true);
			jedisPoolConfig.setTestWhileIdle(true);
			jedisPoolConfig.setTimeBetweenEvictionRunsMillis(RedisConfig.TBERUNSMILLIS);
			jedisPoolConfig.setNumTestsPerEvictionRun(RedisConfig.NTPERUN);
			jedisPoolConfig.setMinEvictableIdleTimeMillis(RedisConfig.MEITMILLIS);
			//初始化连接池
			jedisPool = new JedisPool(jedisPoolConfig,
					RedisConfig.IP,
					RedisConfig.PORT,
					RedisConfig.TIMEOUT,
					RedisConfig.AUTH);
		}catch (JedisConnectionException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (JedisException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/**
	 * 
	* @Title: getJedis
	* @Description: TODO 获取 jedis 实例
	* @return 
	* Jedis  
	* @throws
	 */
	public synchronized static Jedis getJedis() {
		try {
			if(jedisPool != null) {
				return jedisPool.getResource();
			}else {
				return null;
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}		
	}
	/**
	 * 
	* @Title: reJedis
	* @Description: TODO 释放资源
	* @param jedis 
	* void  
	* @throws
	 */
	public static void reJedis(final Jedis jedis) {
		if(jedis != null) {
			jedisPool.destroy();
		}
	}
}
