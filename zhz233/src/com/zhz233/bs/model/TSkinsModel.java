/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TSkinsModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: TSkinsModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
*/
public class TSkinsModel implements Serializable {

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性变量
	 */
	private long id;
	private String skins_no;
	private String skins_heros_no;
	private String skins_name;	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSkins_no() {
		return skins_no;
	}
	public void setSkins_no(String skins_no) {
		this.skins_no = skins_no;
	}
	public String getSkins_heros_no() {
		return skins_heros_no;
	}
	public void setSkins_heros_no(String skins_heros_no) {
		this.skins_heros_no = skins_heros_no;
	}
	public String getSkins_name() {
		return skins_name;
	}
	public void setSkins_name(String skins_name) {
		this.skins_name = skins_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
