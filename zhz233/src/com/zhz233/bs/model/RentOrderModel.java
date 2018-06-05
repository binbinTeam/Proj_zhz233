/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: RentOrderModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月10日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;
import java.util.Date;

/**
* @ClassName: RentOrderModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月10日
*/
public class RentOrderModel implements Serializable {

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	private Date s_time;
	private Date e_time;
	private Integer s_type;
	public Date getS_time() {
		return s_time;
	}
	public void setS_time(Date s_time) {
		this.s_time = s_time;
	}
	public Date getE_time() {
		return e_time;
	}
	public void setE_time(Date e_time) {
		this.e_time = e_time;
	}
	public Integer getS_type() {
		return s_type;
	}
	public void setS_type(Integer s_type) {
		this.s_type = s_type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
