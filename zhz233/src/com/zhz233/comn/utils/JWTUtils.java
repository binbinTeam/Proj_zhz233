/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: JWTUtils.java 
* @Package com.zhz233.common.utils 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月19日
* @version V1.0.0
*/
package com.zhz233.comn.utils;

import java.util.Date;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import com.zhz233.bs.result.JWTResult;
import com.zhz233.comn.config.JWTConfig;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;

/**
* @ClassName: JWTUtils
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月19日
*/
public class JWTUtils {
	/**
	 * 
	 * @Title: createJWT
	 * @Description: TODO(创建token 签发JWT)
	 * @param id
	 * @param subject
	 * @param ttlMillis
	 * @return String
	 * @throws
	 */
	public static String createJWT(String iss, String aud, String id, String subject, long ttlMillis) {
		//指定签名的时候使用的签名算法，也就是header部分
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		////生成JWT的时间
		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);
		//获取密钥
		SecretKey secretKey = generalKey();
		JwtBuilder builder = Jwts.builder()
				.setIssuer(iss)							    //发行人
				.setAudience(aud)							//观众
				.setId(id)									//jwt id
				.setSubject(subject)						//内容
				.setIssuedAt(now)							//签发时间
				.signWith(signatureAlgorithm, secretKey);	//签名
		if (ttlMillis >= 0) {
			long expMillis = nowMillis + ttlMillis;
			Date expDate = new Date(expMillis);
			builder.setExpiration(expDate);					//设置过期
		}
		return builder.compact();
	}

	public static JWTResult validateJWT(String jwtStr) {
		//初始化
		JWTResult vResult = new JWTResult();
		boolean status = false;
		int status_code = 101;
		Claims claims = null;
		//验证
		try {
			claims = parseJWT(jwtStr);
			status = true;
			status_code = (JWTConfig.JWTREQCODE_SUCCESS);//成功
		} catch (ExpiredJwtException e) {
			// TODO Auto-generated catch block
			status = false;
			status_code = (JWTConfig.JWTREQCODE_EXPIRE);//超时
		} catch (SignatureException e) {
			// TODO: handle exception
			status = false;
			status_code = (JWTConfig.JWTREQCODE_FAIL);//失败
		} catch (Exception e) {
			// TODO: handle exception
			status = false;
			status_code = (JWTConfig.JWTREQCODE_FAIL);//失败
		}finally {
			vResult.setClaims(claims);
			vResult.setStatus(status);
			vResult.setStatusCode(status_code);
		}
		return vResult;
	}
	/**
	 * 
	 * @Title: parseJWT 
	 * @Description: TODO(解析JWT字符串)
	 * @param jwt
	 * @return
	 * @throws Exception Claims
	 * @throws
	 */
	public static Claims parseJWT(String jwtStr) throws Exception {
		SecretKey secretKey = generalKey();
		return Jwts.parser()
			.setSigningKey(secretKey)
			.parseClaimsJws(jwtStr)
			.getBody();
	}
	/**
	 * 
	 * @Title: generalKey 
	 * @Description: TODO(由字符串生成加密key)
	 * @return SecretKey
	 * @throws
	 */
	public static SecretKey generalKey() {
		byte[] encodedKey = Base64.decode(JWTConfig.JWT_SECERT);
	    SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
	    return key;
	}
	
}
