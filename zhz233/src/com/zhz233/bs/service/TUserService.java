/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TUserServiceImpl.java 
* @Package com.zhz233.bs.service.impl 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月21日
* @version V1.0.0
*/
package com.zhz233.bs.service;

import com.zhz233.bs.model.TUserModel;

/**
* @ClassName: TUserServiceImpl
* @Description: TODO TUser逻辑
* @author ZhzTeam
* @date 2018年3月21日
*/
public interface TUserService extends BasicService<TUserModel>{
	//验证 用户密码
	public TUserModel selectByAccPwd(TUserModel t);
	//验证 用户名 手机号
	public TUserModel selectByAccPho(TUserModel t);
	//获取 No
	public String selectByAC(TUserModel t);
}
