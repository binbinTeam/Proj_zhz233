/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: VGoodsModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月19日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: VGoodsModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月19日
*/
public class VGoodsModel implements Serializable{

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性变量
	 */
	private String goods_no;//编号
	private String goods_theme;//商品主题
    private Integer goods_recomm;//推荐等级
    private String games_name;//游戏名称
    private Double goods_hour;//小时
    private Double goods_compensate;//保证金
    private Integer goods_short_time;//最短时间
    private Integer goods_credit_level;//用户等级
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
	public Double getGoods_hour() {
		return goods_hour;
	}
	public void setGoods_hour(Double goods_hour) {
		this.goods_hour = goods_hour;
	}
	public Double getGoods_compensate() {
		return goods_compensate;
	}
	public void setGoods_compensate(Double goods_compensate) {
		this.goods_compensate = goods_compensate;
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
