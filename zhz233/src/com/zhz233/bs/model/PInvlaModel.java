/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: PInvlaModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月3日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;
import java.util.Date;

/**
* @ClassName: PInvlaModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月3日
*/
public class PInvlaModel implements Serializable{
	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	private Date start_time;//开始时间
	private Date end_time;//结束时间
	private Integer startPage;//当前页
	private Integer pageSize;//每页数目
	private Integer order_operate_type;//资金类型
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public Integer getStartPage() {
		return startPage;
	}
	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getOrder_operate_type() {
		return order_operate_type;
	}
	public void setOrder_operate_type(Integer order_operate_type) {
		this.order_operate_type = order_operate_type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
