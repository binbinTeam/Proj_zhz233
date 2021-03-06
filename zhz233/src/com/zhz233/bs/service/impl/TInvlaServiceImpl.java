/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TInvlaServiceImpl.java 
* @Package com.zhz233.bs.service.impl 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月24日
* @version V1.0.0
*/
package com.zhz233.bs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhz233.bs.idao.TInvlaIDAO;
import com.zhz233.bs.model.PaginationModel;
import com.zhz233.bs.model.TInvlaModel;
import com.zhz233.bs.model.VInvlaModel;
import com.zhz233.bs.service.TInvlaService;

/**
* @ClassName: TInvlaServiceImpl
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月24日
*/
@Service("tInvlaServiceImpl")
public class TInvlaServiceImpl implements TInvlaService {
	/**
	 * 注解资源
	 */
	@Autowired
	private TInvlaIDAO tInvlaIDAO;
	/* (no-Javadoc)
	* <p>Title: insert</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#insert(java.lang.Object)
	*/
	@Override
	public long insert(TInvlaModel t) {
		// TODO Auto-generated method stub
		return tInvlaIDAO.insert(t);
	}

	/* (no-Javadoc)
	* <p>Title: save</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#save(java.lang.Object)
	*/
	@Override
	public long save(TInvlaModel t) {
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
	public void delete(TInvlaModel t) {
		// TODO Auto-generated method stub

	}

	/* (no-Javadoc)
	* <p>Title: remove</p>
	* <p>Description: </p>
	* @param t
	* @see com.zhz233.bs.service.BasicService#remove(java.lang.Object)
	*/
	@Override
	public void remove(TInvlaModel t) {
		// TODO Auto-generated method stub

	}

	/* (no-Javadoc)
	* <p>Title: select</p>
	* <p>Description: </p>
	* @return
	* @see com.zhz233.bs.service.BasicService#select()
	*/
	@Override
	public List<TInvlaModel> select() {
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
	public TInvlaModel selectT(TInvlaModel t) {
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
	public List<TInvlaModel> selectListT(TInvlaModel t) {
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
	public List<TInvlaModel> selectTimeListT(TInvlaModel t) {
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
	public List<TInvlaModel> selectBlurListT(TInvlaModel t) {
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
	public void update(TInvlaModel t) {
		// TODO Auto-generated method stub

	}

	/* (no-Javadoc)
	* <p>Title: replace</p>
	* <p>Description: </p>
	* @param t
	* @see com.zhz233.bs.service.BasicService#replace(java.lang.Object)
	*/
	@Override
	public void replace(TInvlaModel t) {
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
		return tInvlaIDAO.selectN();
	}

	/* (no-Javadoc)
	* <p>Title: selectSumCountByANOT</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.TInvlaService#selectSumCountByANOT(com.zhz233.bs.model.TInvlaModel)
	*/
	@Override
	public VInvlaModel selectSumCountByANOT(TInvlaModel t) {
		// TODO Auto-generated method stub
		return tInvlaIDAO.selectSumCountByANOT(t);
	}

	/* (no-Javadoc)
	* <p>Title: selectPagination</p>
	* <p>Description: </p>
	* @param t
	* @param startPage
	* @param pageSize
	* @return
	* @see com.zhz233.bs.service.TInvlaService#selectPagination(com.zhz233.bs.model.TInvlaModel, int, int)
	*/
	@Override
	public List<TInvlaModel> selectPagination(TInvlaModel t, int startPage, int pageSize) {
		// TODO Auto-generated method stub
		return tInvlaIDAO.selectPagination(t, startPage, pageSize);
	}

	/* (no-Javadoc)
	* <p>Title: selectPaginationListT</p>
	* <p>Description: </p>
	* @param t
	* @param p
	* @return
	* @see com.zhz233.bs.service.TInvlaService#selectPaginationListT(com.zhz233.bs.model.TInvlaModel, com.zhz233.bs.model.PaginationModel)
	*/
	@Override
	public List<TInvlaModel> selectPaginationListT(TInvlaModel t, PaginationModel p) {
		// TODO Auto-generated method stub
		return tInvlaIDAO.selectPaginationListT(t, p);
	}

}
