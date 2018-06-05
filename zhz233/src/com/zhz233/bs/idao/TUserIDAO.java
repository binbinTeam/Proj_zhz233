/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TUserIDAO.java 
* @Package com.zhz233.bs.idao 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月21日
* @version V1.0.0
*/
package com.zhz233.bs.idao;

import com.zhz233.bs.model.TUserModel;

/**
* @ClassName: TUserIDAO
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月21日
*/
public interface TUserIDAO extends BasicIDAO<TUserModel>{
	//验证 用户密码
	public TUserModel selectByAccPwd(TUserModel t);
	//验证 用户名 手机号
	public TUserModel selectByAccPho(TUserModel t);
	//获取 No
	public String selectByAC(TUserModel t);
}
