/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TGoodsRentMoreLOLModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: TGoodsRentMoreLOLModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
*/
public class TGoodsRentMoreLOLModel implements Serializable {

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性变量
	 */
	private long id;
	private String goods_no;
	private String goods_lol_role;
	private String goods_lol_area;
	private String goods_lol_server;
	private Integer goods_lol_grade;
	private Integer goods_lol_rank;
	private Integer goods_lol_case;
	private Integer goods_lol_access;
	private String goods_lol_skin;
	private String goods_lol_hero;
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
	public String getGoods_lol_role() {
		return goods_lol_role;
	}
	public void setGoods_lol_role(String goods_lol_role) {
		this.goods_lol_role = goods_lol_role;
	}
	public String getGoods_lol_area() {
		return goods_lol_area;
	}
	public void setGoods_lol_area(String goods_lol_area) {
		this.goods_lol_area = goods_lol_area;
	}
	public String getGoods_lol_server() {
		return goods_lol_server;
	}
	public void setGoods_lol_server(String goods_lol_server) {
		this.goods_lol_server = goods_lol_server;
	}
	public Integer getGoods_lol_grade() {
		return goods_lol_grade;
	}
	public void setGoods_lol_grade(Integer goods_lol_grade) {
		this.goods_lol_grade = goods_lol_grade;
	}
	public Integer getGoods_lol_rank() {
		return goods_lol_rank;
	}
	public void setGoods_lol_rank(Integer goods_lol_rank) {
		this.goods_lol_rank = goods_lol_rank;
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
	public String getGoods_lol_skin() {
		return goods_lol_skin;
	}
	public void setGoods_lol_skin(String goods_lol_skin) {
		this.goods_lol_skin = goods_lol_skin;
	}
	public String getGoods_lol_hero() {
		return goods_lol_hero;
	}
	public void setGoods_lol_hero(String goods_lol_hero) {
		this.goods_lol_hero = goods_lol_hero;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
