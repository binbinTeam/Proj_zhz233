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

import org.apache.ibatis.annotations.Param;

import com.zhz233.bs.model.PaginationModel;
import com.zhz233.bs.model.TInvlaModel;
import com.zhz233.bs.model.VInvlaModel;

/**
* @ClassName: TInvlaService
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月24日
*/
public interface TInvlaService extends BasicService<TInvlaModel> {
	/**
	 * 
	* @Title: selectSumCountByANOT
	* @Description: TODO 获取总额总数 根据 交易操作类型
	* @param t
	* @return 
	* double  
	* @throws
	 */
	public VInvlaModel selectSumCountByANOT(TInvlaModel t);
	public List<TInvlaModel> selectPagination(
			@Param("TInvlaModel") TInvlaModel t,
			@Param("startPage") int startPage,
			@Param("pageSize") int pageSize
			);
	public List<TInvlaModel> selectPaginationListT(
			@Param("tModel") TInvlaModel t,
			@Param("pModel") PaginationModel p);
}
