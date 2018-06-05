/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TNoticeService.java 
* @Package com.zhz233.bs.service 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月9日
* @version V1.0.0
*/
package com.zhz233.bs.service;

import java.util.List;

import com.zhz233.bs.model.TNoticeModel;
import com.zhz233.bs.model.VNoticeModel;

/**
* @ClassName: TNoticeService
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月9日
*/
public interface TNoticeService extends BasicService<TNoticeModel>{
	//获取 Notice top5
	public List<VNoticeModel> selectTop5ByNT(TNoticeModel t);
}
