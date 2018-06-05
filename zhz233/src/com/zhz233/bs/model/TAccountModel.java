/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TAccountModel.java 
* @Package com.zhz233.bs.model 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月16日
* @version V1.0.0
*/
package com.zhz233.bs.model;

import java.io.Serializable;
import java.util.Date;

/**
* @ClassName: TAccountModel
* @Description: TODO account 表
* @author ZhzTeam
* @date 2018年4月16日
*/
public class TAccountModel implements Serializable{

	/**
	* @Fields serialVersionUID : TODO 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 变量属性
	 */
	private long id;
	private String account_no;//账号no
	private Integer certification;//实名 0/无 1/有
	private Double available;//可用余额
	private Double frozen;//冻结资金
	private Integer credit_level;//信用等级 0/普通 1/0-99 ... 6/ 超级用户
	private String traders_password;//支付密码
	private String traders_alipay;//绑定支付宝
	private String traders_wechat_pay;//绑定微信
	private Date update_time;////创建时间
	private Date create_time;////创建时间
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public Integer getCertification() {
		return certification;
	}
	public void setCertification(Integer certification) {
		this.certification = certification;
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
	public Integer getCredit_level() {
		return credit_level;
	}
	public void setCredit_level(Integer credit_level) {
		this.credit_level = credit_level;
	}
	public String getTraders_password() {
		return traders_password;
	}
	public void setTraders_password(String traders_password) {
		this.traders_password = traders_password;
	}
	public String getTraders_alipay() {
		return traders_alipay;
	}
	public void setTraders_alipay(String traders_alipay) {
		this.traders_alipay = traders_alipay;
	}
	public String getTraders_wechat_pay() {
		return traders_wechat_pay;
	}
	public void setTraders_wechat_pay(String traders_wechat_pay) {
		this.traders_wechat_pay = traders_wechat_pay;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
