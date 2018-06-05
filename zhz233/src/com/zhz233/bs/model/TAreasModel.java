/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TAreasModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: TAreasModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
*/
public class TAreasModel implements Serializable{

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性变量
	 */
	private long id;
	private String areas_no;
	private String areas_name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAreas_no() {
		return areas_no;
	}
	public void setAreas_no(String areas_no) {
		this.areas_no = areas_no;
	}
	public String getAreas_name() {
		return areas_name;
	}
	public void setAreas_name(String areas_name) {
		this.areas_name = areas_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
