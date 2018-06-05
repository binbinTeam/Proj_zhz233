/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TServersModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: TServersModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
*/
public class TServersModel implements Serializable{

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性变量
	 */
	private long id;
	private String servers_no;
	private String servers_name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getServers_no() {
		return servers_no;
	}
	public void setServers_no(String servers_no) {
		this.servers_no = servers_no;
	}
	public String getServers_name() {
		return servers_name;
	}
	public void setServers_name(String servers_name) {
		this.servers_name = servers_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
