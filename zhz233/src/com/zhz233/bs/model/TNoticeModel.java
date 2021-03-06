/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TNoticeModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月9日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;
import java.util.Date;

/**
* @ClassName: TNoticeModel
* @Description: TODO TNoticeModel 表字段
* @author ZhzTeam
* @date 2018年4月9日
*/
public class TNoticeModel implements Serializable{
	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 变量属性
	 */
	private long id;//自增id
	private String notice_no;//编号
	private Integer notice_type;//类型
	private String notice_theme;//主题
	private String notice_content;//内容 
	private Date update_time;//更新时间
	private Date create_time;//创建时间
	private long notice_viewcount;//累计访问量
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNotice_no() {
		return notice_no;
	}
	public void setNotice_no(String notice_no) {
		this.notice_no = notice_no;
	}
	public Integer getNotice_type() {
		return notice_type;
	}
	public void setNotice_type(Integer notice_type) {
		this.notice_type = notice_type;
	}
	public String getNotice_theme() {
		return notice_theme;
	}
	public void setNotice_theme(String notice_theme) {
		this.notice_theme = notice_theme;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
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
