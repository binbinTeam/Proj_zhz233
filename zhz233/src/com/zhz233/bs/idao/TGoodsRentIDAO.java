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

import com.zhz233.bs.model.TGoodsRentModel;
import com.zhz233.bs.model.VGoodsMoreModel;

/**
* @ClassName: TGoodsIDAO
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月10日
*/
public interface TGoodsRentIDAO extends BasicIDAO<TGoodsRentModel>{
	//获取 info
	public VGoodsMoreModel selectTByNo(TGoodsRentModel t);
}
