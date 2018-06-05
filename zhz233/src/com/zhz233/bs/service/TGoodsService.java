/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TGoodsService.java 
* @Package com.zhz233.bs.service 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月23日
* @version V1.0.0
*/
package com.zhz233.bs.service;

import java.util.List;

import com.zhz233.bs.model.SearchModel;
import com.zhz233.bs.model.TGoodsModel;
import com.zhz233.bs.model.VGoodsModel;
import com.zhz233.bs.model.VSpecialGoodsModel;

/**
* @ClassName: TGoodsService
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月23日
*/
public interface TGoodsService extends BasicService<TGoodsModel> {
	public List<VSpecialGoodsModel > selectTop10ByTRS(TGoodsModel t);
	public List<VGoodsModel> selectShowListT(SearchModel t);
	//获取一条数据
	public TGoodsModel selectTByGNO(TGoodsModel t);
}
