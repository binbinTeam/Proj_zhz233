/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TLeaseModel.java 
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
* @ClassName: TLeaseModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月10日
*/
public class VLeaseModel implements Serializable {

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	private String order_no;
	private String sale_no;//
	private String goods_no;
	private Double order_amount;
	private Date order_start_time;
	private Date order_end_time;
	private Integer order_state;
	private Date update_time;
	private Date create_time;
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getSale_no() {
		return sale_no;
	}
	public void setSale_no(String sale_no) {
		this.sale_no = sale_no;
	}
	public String getGoods_no() {
		return goods_no;
	}
	public void setGoods_no(String goods_no) {
		this.goods_no = goods_no;
	}
	public Double getOrder_amount() {
		return order_amount;
	}
	public void setOrder_amount(Double order_amount) {
		this.order_amount = order_amount;
	}
	public Date getOrder_start_time() {
		return order_start_time;
	}
	public void setOrder_start_time(Date order_start_time) {
		this.order_start_time = order_start_time;
	}
	public Date getOrder_end_time() {
		return order_end_time;
	}
	public void setOrder_end_time(Date order_end_time) {
		this.order_end_time = order_end_time;
	}
	public Integer getOrder_state() {
		return order_state;
	}
	public void setOrder_state(Integer order_state) {
		this.order_state = order_state;
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
