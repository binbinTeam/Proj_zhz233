/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: .java 
* @Package com.zhz233.bs.idao 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月21日
* @version V1.0.0
*/
package com.zhz233.bs.idao;

import java.util.List;

import com.zhz233.bs.model.TNoticeModel;
import com.zhz233.bs.model.VNoticeModel;

/**
* @ClassName: 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月21日
*/
public interface TNoticeIDAO extends BasicIDAO<TNoticeModel>{
	//获取 Notice top5
	public List<VNoticeModel> selectTop5ByNT(TNoticeModel t);
}
