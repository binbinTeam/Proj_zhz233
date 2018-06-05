/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: VGoodsMoreModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月19日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: VGoodsMoreModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月19日
*/
public class VGoodsMoreModel implements Serializable{

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性变量
	 */
	private String goods_no;//编号
	private String account_no;//发布者编号
	private String goods_theme;//商品主题
	private Double goods_hour;
	private Double goods_night;
	private Double goods_day;
	private Double goods_week;
    private Integer goods_recomm;//推荐等级
    private String games_name;//游戏名称
    private String areas_name;
    private String servers_name;
	private Integer goods_logon_style;
    private Double goods_compensate;//保证金
	private String goods_lol_role;
	private Integer goods_lol_rank;//段位
	private Integer goods_lol_grade;//等级
	private Integer goods_lol_case;//框
	private Integer goods_lol_access;//允许排位
	private Integer goods_delay;
	private Integer goods_beforehand;
    private Integer goods_short_time;//最短时间
    private Integer goods_credit_level;//用户等级
    
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

	public String getGoods_theme() {
		return goods_theme;
	}

	public void setGoods_theme(String goods_theme) {
		this.goods_theme = goods_theme;
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

	public Integer getGoods_recomm() {
		return goods_recomm;
	}

	public void setGoods_recomm(Integer goods_recomm) {
		this.goods_recomm = goods_recomm;
	}

	public String getGames_name() {
		return games_name;
	}

	public void setGames_name(String games_name) {
		this.games_name = games_name;
	}

	public String getAreas_name() {
		return areas_name;
	}

	public void setAreas_name(String areas_name) {
		this.areas_name = areas_name;
	}

	public String getServers_name() {
		return servers_name;
	}

	public void setServers_name(String servers_name) {
		this.servers_name = servers_name;
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

	public String getGoods_lol_role() {
		return goods_lol_role;
	}

	public void setGoods_lol_role(String goods_lol_role) {
		this.goods_lol_role = goods_lol_role;
	}

	public Integer getGoods_lol_rank() {
		return goods_lol_rank;
	}

	public void setGoods_lol_rank(Integer goods_lol_rank) {
		this.goods_lol_rank = goods_lol_rank;
	}

	public Integer getGoods_lol_grade() {
		return goods_lol_grade;
	}

	public void setGoods_lol_grade(Integer goods_lol_grade) {
		this.goods_lol_grade = goods_lol_grade;
	}

	public Integer getGoods_lol_case() {
		return goods_lol_case;
	}

	public void setGoods_lol_case(Integer goods_lol_case) {
		this.goods_lol_case = goods_lol_case;
	}

	public Integer getGoods_lol_access() {
		return goods_lol_access;
	}

	public void setGoods_lol_access(Integer goods_lol_access) {
		this.goods_lol_access = goods_lol_access;
	}

	public Integer getGoods_delay() {
		return goods_delay;
	}

	public void setGoods_delay(Integer goods_delay) {
		this.goods_delay = goods_delay;
	}

	public Integer getGoods_beforehand() {
		return goods_beforehand;
	}

	public void setGoods_beforehand(Integer goods_beforehand) {
		this.goods_beforehand = goods_beforehand;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
