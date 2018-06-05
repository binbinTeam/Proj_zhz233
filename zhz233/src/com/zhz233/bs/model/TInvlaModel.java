/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TInvlaModel.java 
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
* @ClassName: TInvlaModel
* @Description: TODO 交易明细表
* @author ZhzTeam
* @date 2018年4月24日
*/
public class TInvlaModel implements Serializable{
	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性字段
	 */
	private long id;
	private String order_no;//交易流水号
	private String account_no;//关联账号
	private Integer order_operate_type;//操作类型
	private Double order_amount;//交易金额
	private Date update_time;//交易修改时间
	private Date create_time;//创建时间
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public Integer getOrder_operate_type() {
		return order_operate_type;
	}
	public void setOrder_operate_type(Integer order_operate_type) {
		this.order_operate_type = order_operate_type;
	}
	public Double getOrder_amount() {
		return order_amount;
	}
	public void setOrder_amount(Double order_amount) {
		this.order_amount = order_amount;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
