/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: THerosModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: THerosModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
*/
public class THerosModel implements Serializable{

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性变量
	 */
	private long id;
	private String heros_no;
	private String heros_name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHeros_no() {
		return heros_no;
	}
	public void setHeros_no(String heros_no) {
		this.heros_no = heros_no;
	}
	public String getHeros_name() {
		return heros_name;
	}
	public void setHeros_name(String heros_name) {
		this.heros_name = heros_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
