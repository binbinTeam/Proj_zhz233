/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TGoodsModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;
import java.util.Date;

/**
* @ClassName: TGoodsModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
*/
public class TGoodsModel implements Serializable {

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性变量
	 */
	private long id;
	private String goods_no;
	private String account_no;
	private Integer goods_type;
	private String goods_theme;
	private String goods_content;
	private Integer goods_recomm;
	private Integer goods_status;
	private Date update_time;
	private Date create_time;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGoods_no() {
		return goods_no;
	}
	public void setGoods_no(String goods_no) {
		this.goods_no = goods_no;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public Integer getGoods_type() {
		return goods_type;
	}
	public void setGoods_type(Integer goods_type) {
		this.goods_type = goods_type;
	}
	public String getGoods_theme() {
		return goods_theme;
	}
	public void setGoods_theme(String goods_theme) {
		this.goods_theme = goods_theme;
	}
	public String getGoods_content() {
		return goods_content;
	}
	public void setGoods_content(String goods_content) {
		this.goods_content = goods_content;
	}
	public Integer getGoods_recomm() {
		return goods_recomm;
	}
	public void setGoods_recomm(Integer goods_recomm) {
		this.goods_recomm = goods_recomm;
	}
	public Integer getGoods_status() {
		return goods_status;
	}
	public void setGoods_status(Integer goods_status) {
		this.goods_status = goods_status;
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
