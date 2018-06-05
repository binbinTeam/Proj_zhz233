/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TGoodsRentModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: TGoodsRentModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
*/
public class TGoodsRentModel implements Serializable {

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性变量
	 */
	private long id;
	private String goods_no;
	private String goods_game_no;
	private Double goods_hour;
	private Double goods_night;
	private Double goods_day;
	private Double goods_week;
	private Double goods_month;
	private Double goods_year;
	private String goods_access;
	private String goods_password;
	private Integer goods_logon_style;
	private Double goods_compensate;
	private Integer goods_beforehand;
	private Integer goods_delay;
	private Integer goods_short_time;
	private Integer goods_credit_level;
	private long goods_view_count;
	private long goods_rent_count;
	private long goods_recomm_count;
	private long goods_complaint_count;
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
	public String getGoods_game_no() {
		return goods_game_no;
	}
	public void setGoods_game_no(String goods_game_no) {
		this.goods_game_no = goods_game_no;
	}
	public Double getGoods_hour() {
		return goods_hour;
	}
	public void setGoods_hour(Double goods_hour) {
		this.goods_hour = goods_hour;
	}
	public Double getGoods_night() {
		return goods_night;
	}
	public void setGoods_night(Double goods_night) {
		this.goods_night = goods_night;
	}
	public Double getGoods_day() {
		return goods_day;
	}
	public void setGoods_day(Double goods_day) {
		this.goods_day = goods_day;
	}
	public Double getGoods_week() {
		return goods_week;
	}
	public void setGoods_week(Double goods_week) {
		this.goods_week = goods_week;
	}
	public Double getGoods_month() {
		return goods_month;
	}
	public void setGoods_month(Double goods_month) {
		this.goods_month = goods_month;
	}
	public Double getGoods_year() {
		return goods_year;
	}
	public void setGoods_year(Double goods_year) {
		this.goods_year = goods_year;
	}
	public String getGoods_access() {
		return goods_access;
	}
	public void setGoods_access(String goods_access) {
		this.goods_access = goods_access;
	}
	public String getGoods_password() {
		return goods_password;
	}
	public void setGoods_password(String goods_password) {
		this.goods_password = goods_password;
	}
	public Integer getGoods_logon_style() {
		return goods_logon_style;
	}
	public void setGoods_logon_style(Integer goods_logon_style) {
		this.goods_logon_style = goods_logon_style;
	}
	public Double getGoods_compensate() {
		return goods_compensate;
	}
	public void setGoods_compensate(Double goods_compensate) {
		this.goods_compensate = goods_compensate;
	}
	public Integer getGoods_beforehand() {
		return goods_beforehand;
	}
	public void setGoods_beforehand(Integer goods_beforehand) {
		this.goods_beforehand = goods_beforehand;
	}
	public Integer getGoods_delay() {
		return goods_delay;
	}
	public void setGoods_delay(Integer goods_delay) {
		this.goods_delay = goods_delay;
	}
	public Integer getGoods_short_time() {
		return goods_short_time;
	}
	public void setGoods_short_time(Integer goods_short_time) {
		this.goods_short_time = goods_short_time;
	}
	public Integer getGoods_credit_level() {
		return goods_credit_level;
	}
	public void setGoods_credit_level(Integer goods_credit_level) {
		this.goods_credit_level = goods_credit_level;
	}
	public long getGoods_view_count() {
		return goods_view_count;
	}
	public void setGoods_view_count(long goods_view_count) {
		this.goods_view_count = goods_view_count;
	}
	public long getGoods_rent_count() {
		return goods_rent_count;
	}
	public void setGoods_rent_count(long goods_rent_count) {
		this.goods_rent_count = goods_rent_count;
	}
	public long getGoods_recomm_count() {
		return goods_recomm_count;
	}
	public void setGoods_recomm_count(long goods_recomm_count) {
		this.goods_recomm_count = goods_recomm_count;
	}
	public long getGoods_complaint_count() {
		return goods_complaint_count;
	}
	public void setGoods_complaint_count(long goods_complaint_count) {
		this.goods_complaint_count = goods_complaint_count;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
