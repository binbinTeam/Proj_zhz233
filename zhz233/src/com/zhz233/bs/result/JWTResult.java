/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: JWTResult.java 
* @Package com.zhz233.common.result 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月19日
* @version V1.0.0
*/
package com.zhz233.bs.result;

import java.io.Serializable;

import io.jsonwebtoken.Claims;

/**
* @ClassName: JWTResult
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月19日
*/
public class JWTResult implements Serializable{
	/**
	* @Fields serialVersionUID : TODO 
	*/ 
	private static final long serialVersionUID = 1L;
	/**
	 * 返回 字段
	 */
	private boolean status;//状态
	private Claims claims;//内容
	private int statusCode;//状态码

	/**
	 * @return status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status set status
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/**
	 * @return claims
	 */
	public Claims getClaims() {
		return claims;
	}
	/**
	 * @param claims set claims
	 */
	public void setClaims(Claims claims) {
		this.claims = claims;
	}
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
