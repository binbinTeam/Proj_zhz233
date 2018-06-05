/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TGamesService.java 
* @Package com.zhz233.bs.service 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月10日
* @version V1.0.0
*/
package com.zhz233.bs.service;

import java.util.List;

import com.zhz233.bs.model.TGamesModel;
import com.zhz233.bs.model.VGamesModel;

/**
* @ClassName: TGamesService
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月10日
*/
public interface TGamesService extends BasicService<TGamesModel>{
	//获取 Games top8
	public List<VGamesModel> selectTop8ByGT(TGamesModel t);
	//获取 Games Hot top8
	public List<VGamesModel> selectTop8ByGR();
}
