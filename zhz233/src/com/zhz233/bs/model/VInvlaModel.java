/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TInvlaModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月24日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: TInvlaModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月24日
*/
public class VInvlaModel implements Serializable{
	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性字段
	 */
	private Double sum;
	private Integer count;
	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
