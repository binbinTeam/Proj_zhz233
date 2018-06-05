/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TInvlaIDAO.java 
* @Package com.zhz233.bs.idao 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月24日
* @version V1.0.0
*/
package com.zhz233.bs.idao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhz233.bs.model.PaginationModel;
import com.zhz233.bs.model.TLeaseModel;
import com.zhz233.bs.model.VLeaseModel;

/**
* @ClassName: TInvlaIDAO
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月24日
*/
public interface TLeaseIDAO extends BasicIDAO<TLeaseModel> {
	public List<VLeaseModel> selectPaginationListT(
			@Param("account_no") String no,
			@Param("order_state") Integer state,
			@Param("pModel") PaginationModel p);
}
