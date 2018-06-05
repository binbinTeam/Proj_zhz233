/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TCertificationModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;

/**
* @ClassName: TCertificationModel
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
*/
public class TCertificationModel implements Serializable {

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性变量
	 */
	private long id;
	private String certification_no;
	private String account_no;
	private String real_name;
	private String id_number;
	private String front_face_url;
	private String reverse_face_url;
	private String handheld_face_url;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCertification_no() {
		return certification_no;
	}
	public void setCertification_no(String certification_no) {
		this.certification_no = certification_no;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getFront_face_url() {
		return front_face_url;
	}
	public void setFront_face_url(String front_face_url) {
		this.front_face_url = front_face_url;
	}
	public String getReverse_face_url() {
		return reverse_face_url;
	}
	public void setReverse_face_url(String reverse_face_url) {
		this.reverse_face_url = reverse_face_url;
	}
	public String getHandheld_face_url() {
		return handheld_face_url;
	}
	public void setHandheld_face_url(String handheld_face_url) {
		this.handheld_face_url = handheld_face_url;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
