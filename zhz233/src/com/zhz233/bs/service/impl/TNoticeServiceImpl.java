/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TNoticeServiceImpl.java 
* @Package com.zhz233.bs.service.impl 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月9日
* @version V1.0.0
*/
package com.zhz233.bs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhz233.bs.idao.TNoticeIDAO;
import com.zhz233.bs.model.TNoticeModel;
import com.zhz233.bs.model.VNoticeModel;
import com.zhz233.bs.service.TNoticeService;

/**
* @ClassName: TNoticeServiceImpl
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月9日
*/
@Service("tNoticeServiceImpl")
public class TNoticeServiceImpl implements TNoticeService{
	/**
	 * 注解idao
	 */
	@Autowired
	private TNoticeIDAO tNoticeIDAO;

	/* (no-Javadoc)
	* <p>Title: insert</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#insert(java.lang.Object)
	*/
	@Override
	public long insert(TNoticeModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (no-Javadoc)
	* <p>Title: save</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#save(java.lang.Object)
	*/
	@Override
	public long save(TNoticeModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (no-Javadoc)
	* <p>Title: delete</p>
	* <p>Description: </p>
	* @param t
	* @see com.zhz233.bs.service.BasicService#delete(java.lang.Object)
	*/
	@Override
	public void delete(TNoticeModel t) {
		// TODO Auto-generated method stub
		
	}

	/* (no-Javadoc)
	* <p>Title: remove</p>
	* <p>Description: </p>
	* @param t
	* @see com.zhz233.bs.service.BasicService#remove(java.lang.Object)
	*/
	@Override
	public void remove(TNoticeModel t) {
		// TODO Auto-generated method stub
		
	}

	/* (no-Javadoc)
	* <p>Title: select</p>
	* <p>Description: </p>
	* @return
	* @see com.zhz233.bs.service.BasicService#select()
	*/
	@Override
	public List<TNoticeModel> select() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (no-Javadoc)
	* <p>Title: selectT</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#selectT(java.lang.Object)
	*/
	@Override
	public TNoticeModel selectT(TNoticeModel t) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (no-Javadoc)
	* <p>Title: selectListT</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#selectListT(java.lang.Object)
	*/
	@Override
	public List<TNoticeModel> selectListT(TNoticeModel t) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (no-Javadoc)
	* <p>Title: selectTimeListT</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#selectTimeListT(java.lang.Object)
	*/
	@Override
	public List<TNoticeModel> selectTimeListT(TNoticeModel t) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (no-Javadoc)
	* <p>Title: selectBlurListT</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#selectBlurListT(java.lang.Object)
	*/
	@Override
	public List<TNoticeModel> selectBlurListT(TNoticeModel t) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (no-Javadoc)
	* <p>Title: update</p>
	* <p>Description: </p>
	* @param t
	* @see com.zhz233.bs.service.BasicService#update(java.lang.Object)
	*/
	@Override
	public void update(TNoticeModel t) {
		// TODO Auto-generated method stub
		
	}

	/* (no-Javadoc)
	* <p>Title: replace</p>
	* <p>Description: </p>
	* @param t
	* @see com.zhz233.bs.service.BasicService#replace(java.lang.Object)
	*/
	@Override
	public void replace(TNoticeModel t) {
		// TODO Auto-generated method stub
		
	}

	/* (no-Javadoc)
	* <p>Title: selectN</p>
	* <p>Description: </p>
	* @return
	* @see com.zhz233.bs.service.BasicService#selectN()
	*/
	@Override
	public String selectN() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (no-Javadoc)
	* <p>Title: selectTop5ByNT</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.TNoticeService#selectTop5ByNT(com.zhz233.bs.model.TNoticeModel)
	*/
	@Override
	public List<VNoticeModel> selectTop5ByNT(TNoticeModel t) {
		// TODO Auto-generated method stub
		return tNoticeIDAO.selectTop5ByNT(t);
	}

}
