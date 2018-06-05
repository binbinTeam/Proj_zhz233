/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: CodeResult.java 
* @Package com.zhz233.bs.result 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月26日
* @version V1.0.0
*/
package com.zhz233.bs.result;

import java.io.Serializable;

/**
* @ClassName: CodeResult
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月26日
*/
public class CodeResult implements Serializable{
	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	//属性参数
	private String code;
	private String msg;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
