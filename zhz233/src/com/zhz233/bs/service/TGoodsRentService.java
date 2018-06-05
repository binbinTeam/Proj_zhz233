/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TGoodsRentService.java 
* @Package com.zhz233.bs.service 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月23日
* @version V1.0.0
*/
package com.zhz233.bs.service;

import com.zhz233.bs.model.TGoodsRentModel;
import com.zhz233.bs.model.VGoodsMoreModel;

/**
* @ClassName: TGoodsRentService
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月23日
*/
public interface TGoodsRentService extends BasicService<TGoodsRentModel> {
	public VGoodsMoreModel selectTByNo(TGoodsRentModel t);
}
