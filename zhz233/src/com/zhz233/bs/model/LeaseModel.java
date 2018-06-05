/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: LeaseModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月11日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: LeaseModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月11日
*/
public class LeaseModel implements Serializable {

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	private String goods_no;
	private String start_time;
	private String end_time;
	public String getGoods_no() {
		return goods_no;
	}
	public void setGoods_no(String goods_no) {
		this.goods_no = goods_no;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
