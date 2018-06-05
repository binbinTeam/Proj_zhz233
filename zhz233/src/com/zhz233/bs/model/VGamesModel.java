/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: VGamesModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月10日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: VGamesModel
* @Description: TODO games字段表
* @author ZhzTeam
* @date 2018年4月10日
*/
public class VGamesModel implements Serializable{

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性字段
	 */
	private String games_no;//游戏no
	private String games_name;//游戏名称
	private Integer games_recomm;//游戏热度
	public String getGames_no() {
		return games_no;
	}
	public void setGames_no(String games_no) {
		this.games_no = games_no;
	}
	public String getGames_name() {
		return games_name;
	}
	public void setGames_name(String games_name) {
		this.games_name = games_name;
	}
	public Integer getGames_recomm() {
		return games_recomm;
	}
	public void setGames_recomm(Integer games_recomm) {
		this.games_recomm = games_recomm;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
