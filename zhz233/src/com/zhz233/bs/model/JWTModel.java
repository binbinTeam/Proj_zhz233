/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: JWTModel.java 
* @Package com.zhz233.common.result 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月19日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: JWTModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月19日
*/
public class JWTModel implements Serializable{
	/**
	* @Fields serialVersionUID : TODO 
	*/ 
	private static final long serialVersionUID = 1L;
	private String iss;
	private String aud;
	private String jti;
	private String sub;
	private String iat;
	private String exp;
	/**
	 * @return iss
	 */
	public String getIss() {
		return iss;
	}
	/**
	 * @param iss set iss
	 */
	public void setIss(String iss) {
		this.iss = iss;
	}
	/**
	 * @return aud
	 */
	public String getAud() {
		return aud;
	}
	/**
	 * @param aud set aud
	 */
	public void setAud(String aud) {
		this.aud = aud;
	}
	/**
	 * @return jti
	 */
	public String getJti() {
		return jti;
	}
	/**
	 * @param jti set jti
	 */
	public void setJti(String jti) {
		this.jti = jti;
	}
	/**
	 * @return sub
	 */
	public String getSub() {
		return sub;
	}
	/**
	 * @param sub set sub
	 */
	public void setSub(String sub) {
		this.sub = sub;
	}
	/**
	 * @return iat
	 */
	public String getIat() {
		return iat;
	}
	/**
	 * @param iat set iat
	 */
	public void setIat(String iat) {
		this.iat = iat;
	}
	/**
	 * @return exp
	 */
	public String getExp() {
		return exp;
	}
	/**
	 * @param exp set exp
	 */
	public void setExp(String exp) {
		this.exp = exp;
	}
	/**
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
