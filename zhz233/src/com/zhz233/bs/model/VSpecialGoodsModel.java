/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: VSpecialGoodsModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月4日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: VSpecialGoodsModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月4日
*/
public class VSpecialGoodsModel implements Serializable {

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	private String goods_no;
	private String goods_theme;
	private String games_name;
	private Double goods_hour;
	public String getGoods_no() {
		return goods_no;
	}
	public void setGoods_no(String goods_no) {
		this.goods_no = goods_no;
	}
	public String getGoods_theme() {
		return goods_theme;
	}
	public void setGoods_theme(String goods_theme) {
		this.goods_theme = goods_theme;
	}
	public String getGames_name() {
		return games_name;
	}
	public void setGames_name(String games_name) {
		this.games_name = games_name;
	}
	public Double getGoods_hour() {
		return goods_hour;
	}
	public void setGoods_hour(Double goods_hour) {
		this.goods_hour = goods_hour;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
