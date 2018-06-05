/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: SearchModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月7日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: SearchModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月7日
*/
public class SearchModel implements Serializable {

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	private Integer search_type;//游戏类型
	private String search_game;//游戏名称
	private String search_server;//服务器
	private String search_key;//关键字
	private Integer search_price_low;
	private Integer search_price_high;
	private Integer search_auth;
	private Integer sortStyle;
	private Integer showStyle;//缺省字段 显示样式
	private Integer startPage;
	private Integer pageSize;
	public Integer getSearch_type() {
		return search_type;
	}
	public void setSearch_type(Integer search_type) {
		this.search_type = search_type;
	}
	public String getSearch_game() {
		return search_game;
	}
	public void setSearch_game(String search_game) {
		this.search_game = search_game;
	}
	public String getSearch_server() {
		return search_server;
	}
	public void setSearch_server(String search_server) {
		this.search_server = search_server;
	}
	public String getSearch_key() {
		return search_key;
	}
	public void setSearch_key(String search_key) {
		this.search_key = search_key;
	}
	public Integer getSearch_price_low() {
		return search_price_low;
	}
	public void setSearch_price_low(Integer search_price_low) {
		this.search_price_low = search_price_low;
	}
	public Integer getSearch_price_high() {
		return search_price_high;
	}
	public void setSearch_price_high(Integer search_price_high) {
		this.search_price_high = search_price_high;
	}
	public Integer getSearch_auth() {
		return search_auth;
	}
	public void setSearch_auth(Integer search_auth) {
		this.search_auth = search_auth;
	}
	public Integer getSortStyle() {
		return sortStyle;
	}
	public void setSortStyle(Integer sortStyle) {
		this.sortStyle = sortStyle;
	}
	public Integer getShowStyle() {
		return showStyle;
	}
	public void setShowStyle(Integer showStyle) {
		this.showStyle = showStyle;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
