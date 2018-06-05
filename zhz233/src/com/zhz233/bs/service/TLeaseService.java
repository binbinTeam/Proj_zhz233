/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TInvlaService.java 
* @Package com.zhz233.bs.service 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月24日
* @version V1.0.0
*/
package com.zhz233.bs.service;

import java.util.List;

import com.zhz233.bs.model.PaginationModel;
import com.zhz233.bs.model.TLeaseModel;
import com.zhz233.bs.model.VLeaseModel;

/**
* @ClassName: TInvlaService
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月24日
*/
public interface TLeaseService extends BasicService<TLeaseModel> {
	public List<VLeaseModel> selectPaginationListT(String no,Integer state,PaginationModel p);
	
}
