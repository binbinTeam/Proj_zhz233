/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TGoodsIDAO.java 
* @Package com.zhz233.bs.idao 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月10日
* @version V1.0.0
*/
package com.zhz233.bs.idao;

import java.util.List;

import com.zhz233.bs.model.SearchModel;
import com.zhz233.bs.model.TGoodsModel;
import com.zhz233.bs.model.VGoodsModel;
import com.zhz233.bs.model.VSpecialGoodsModel;

/**
* @ClassName: TGoodsIDAO
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月10日
*/
public interface TGoodsIDAO extends BasicIDAO<TGoodsModel>{
	//获取 Games top8
	public List<VSpecialGoodsModel > selectTop10ByTRS(TGoodsModel t);
	//获取goods show 8
	public List<VGoodsModel> selectShowListT(SearchModel t);
	//获取一条数据
	public TGoodsModel selectTByGNO(TGoodsModel t);
}
