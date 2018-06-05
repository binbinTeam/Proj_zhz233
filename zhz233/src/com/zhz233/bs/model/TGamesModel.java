/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TGamesModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月10日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;
import java.util.Date;

/**
* @ClassName: TGamesModel
* @Description: TODO games字段表
* @author ZhzTeam
* @date 2018年4月10日
*/
public class TGamesModel implements Serializable{

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性字段
	 */
	private long id;//自增id
	private String games_no;//游戏no
	private Integer games_type;//1:端游 2： 页游 3：手游
	private String games_name;//游戏名称
	private Integer games_recomm;//游戏热度
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getgames_no() {
		return games_no;
	}
	public void setgames_no(String games_no) {
		this.games_no = games_no;
	}
	public Integer getgames_type() {
		return games_type;
	}
	public void setgames_type(Integer games_type) {
		this.games_type = games_type;
	}
	public String getgames_name() {
		return games_name;
	}
	public void setgames_name(String games_name) {
		this.games_name = games_name;
	}
	public Integer getgames_recomm() {
		return games_recomm;
	}
	public void setgames_recomm(Integer games_recomm) {
		this.games_recomm = games_recomm;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
