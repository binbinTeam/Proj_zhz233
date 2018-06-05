/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: SMSResult.java 
* @Package com.zhz233.bs.result 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月26日
* @version V1.0.0
*/
package com.zhz233.bs.result;

import java.io.Serializable;

/**
* @ClassName: SMSResult
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月26日
*/
public class SMSResult implements Serializable{

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 参数 属性
	 */
	private String respCode;
	private String respDesc;
	private String failCount;
	private String smsId;
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespDesc() {
		return respDesc;
	}
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
	public String getFailCount() {
		return failCount;
	}
	public void setFailCount(String failCount) {
		this.failCount = failCount;
	}
	public String getSmsId() {
		return smsId;
	}
	public void setSmsId(String smsId) {
		this.smsId = smsId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
