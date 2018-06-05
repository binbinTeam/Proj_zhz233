/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TAccountService.java 
* @Package com.zhz233.bs.service 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
* @version V1.0.0
*/
package com.zhz233.bs.service;

import com.zhz233.bs.model.TAccountModel;
import com.zhz233.bs.model.VAccountModel;

/**
* @ClassName: TAccountService
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
*/
public interface TAccountService extends BasicService<TAccountModel> {
	//获取用户基本信息
	public VAccountModel selectByN(TAccountModel t);
}
