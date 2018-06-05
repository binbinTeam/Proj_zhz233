/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: VAccountModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月16日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: VAccountModel
* @Description: TODO account 表
* @author ZhzTeam
* @date 2018年4月16日
*/
public class VAccountModel implements Serializable{

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 变量属性
	 */
	private String account_no;//账号no
	private Double available;//可用余额
	private Double frozen;//冻结资金
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public Double getAvailable() {
		return available;
	}
	public void setAvailable(Double available) {
		this.available = available;
	}
	public Double getFrozen() {
		return frozen;
	}
	public void setFrozen(Double frozen) {
		this.frozen = frozen;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
