/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TAccountIDAO.java 
* @Package com.zhz233.bs.idao 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
* @version V1.0.0
*/
package com.zhz233.bs.idao;

import com.zhz233.bs.model.TAccountModel;
import com.zhz233.bs.model.VAccountModel;

/**
* @ClassName: TAccountIDAO
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月17日
*/
public interface TAccountIDAO extends BasicIDAO<TAccountModel> {
	//获取用户基本信息
	public VAccountModel selectByN(TAccountModel t);
}
