/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TGamesIDAO.java 
* @Package com.zhz233.bs.idao 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月10日
* @version V1.0.0
*/
package com.zhz233.bs.idao;

import java.util.List;

import com.zhz233.bs.model.TGamesModel;
import com.zhz233.bs.model.VGamesModel;

/**
* @ClassName: TGamesIDAO
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月10日
*/
public interface TGamesIDAO extends BasicIDAO<TGamesModel>{
	//获取 Games top8
	public List<VGamesModel> selectTop8ByGT(TGamesModel t);
	//获取 Games Hot top8
	public List<VGamesModel> selectTop8ByGR();
}
