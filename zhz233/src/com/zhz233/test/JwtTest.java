/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: JwtTest.java 
* @Package com.zhz233.test 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月19日
* @version V1.0.0
*/
package com.zhz233.test;

import org.junit.Test;

import com.zhz233.comn.config.JWTConfig;
import com.zhz233.comn.utils.JWTUtils;
import com.zhz233.comn.utils.TimeUtils;

import io.jsonwebtoken.Claims;

/**
* @ClassName: JwtTest
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月19日
*/
public class JwtTest {
	@Test
	public void test1() {
		String token = JWTUtils.createJWT(
				JWTConfig.JWT_ADMIN_ROBOT,
				JWTConfig.JWT_AUDD_TOURIST,
				"binbin2017",
				TimeUtils.getDate(),
				JWTConfig.JWT_TTL_15MIN);
		
		
		
		System.out.println(token);
		/*JWTResult v = JWTUtils.validateJWT(token);
		String j = GsonUtils.objectToJsonStr(v.getClaims());
		JWTModel jj = GsonUtils.jsonStrToObject(j,JWTModel.class);
		System.err.println(v);
		System.err.println(j);
		System.err.println(jj);*/
	}
	@Test
	public void test0() {

		String jjw=JWTUtils.createJWT("a","b","binbin2017", "", JWTConfig.JWT_TTL_15MIN);
		System.err.println(jjw);
		System.out.println(JWTUtils.validateJWT(jjw).isStatus());
		
	}

}
