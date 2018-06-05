/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: VNoticeModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月19日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: VNoticeModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月19日
*/
public class VNoticeModel implements Serializable{

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性变量
	 */
	private String notice_no;//编号
	private String notice_theme;//主题
	private long notice_viewcount;//累计访问量
	public String getNotice_no() {
		return notice_no;
	}
	public void setNotice_no(String notice_no) {
		this.notice_no = notice_no;
	}
	public String getNotice_theme() {
		return notice_theme;
	}
	public void setNotice_theme(String notice_theme) {
		this.notice_theme = notice_theme;
	}
	public long getNotice_viewcount() {
		return notice_viewcount;
	}
	public void setNotice_viewcount(long notice_viewcount) {
		this.notice_viewcount = notice_viewcount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
