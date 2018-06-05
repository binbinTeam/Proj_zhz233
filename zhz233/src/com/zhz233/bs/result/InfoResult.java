package com.zhz233.bs.result;

import java.io.Serializable;
import java.util.Map;

public class InfoResult implements Serializable{
	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 变量属性
	 */
	//code
	private int Code;
	//msg
	private String msg;
	//date
	private String ztime;
	//map 内容
	private Map<String,Object> reMap;
	
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getZtime() {
		return ztime;
	}
	public void setZtime(String ztime) {
		this.ztime = ztime;
	}
	public Map<String, Object> getReMap() {
		return reMap;
	}
	public void setReMap(Map<String, Object> reMap) {
		this.reMap = reMap;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
