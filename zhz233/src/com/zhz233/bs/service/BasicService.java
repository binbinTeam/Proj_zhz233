/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: BasicServiceImpl.java 
* @Package com.zhz233.bs.service 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月21日
* @version V1.0.0
*/
package com.zhz233.bs.service;

import java.util.List;

/**
* @ClassName: BasicServiceImpl
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月21日
*/
public interface BasicService<T> {
	//增加一条数据
	public long insert(T t);
	//增加多条数据
	public long save(T t);
	//删除一条数据
	public void delete(T t);
	//删除多条数据
	public void remove(T t);
	//查询所有数据
	public List<T> select();
	//精确查找一条
	public T selectT(T t);
	//精确查找多条
	public List<T> selectListT(T t);
	//查询时间段内 多条
	public List<T> selectTimeListT(T t);
	//模糊查找多条
	public List<T> selectBlurListT(T t);
	//更新一条数据
	public void update(T t);
	//更新多条数据
	public void replace(T t);
	//获取自增主键no
	public String selectN();
}
