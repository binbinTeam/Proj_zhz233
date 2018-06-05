/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: PaginationModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月24日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;
import java.util.Date;

/**
* @ClassName: PaginationModel
* @Description: TODO 交易明细表
* @author ZhzTeam
* @date 2018年4月24日
*/
public class PaginationModel implements Serializable{
	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性字段
	 */
	private Integer startPage;//当前页
	private Integer pageSize;//每页数目
	private Date start_time;//开始时间
	private Date end_time;//结束时间
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
