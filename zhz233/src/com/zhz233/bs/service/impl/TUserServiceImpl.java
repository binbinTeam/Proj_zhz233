/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TUserServiceImpl.java 
* @Package com.zhz233.bs.service 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月21日
* @version V1.0.0
*/
package com.zhz233.bs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhz233.bs.idao.TUserIDAO;
import com.zhz233.bs.model.TUserModel;
import com.zhz233.bs.service.TUserService;

/**
* @ClassName: TUserServiceImpl
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月21日
*/
@Service("tUserServiceImpl")
public class TUserServiceImpl implements TUserService{
	/**
	 * 注解idao
	 */
	@Autowired
	private TUserIDAO tUserIDAO;

	/* (no-Javadoc)
	* <p>Title: insert</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#insert(java.lang.Object)
	*/
	@Override
	public long insert(TUserModel t) {
		// TODO Auto-generated method stub
		return tUserIDAO.insert(t);
	}

	/* (no-Javadoc)
	* <p>Title: save</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#save(java.lang.Object)
	*/
	@Override
	public long save(TUserModel t) {
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
	public void delete(TUserModel t) {
		// TODO Auto-generated method stub
		
	}

	/* (no-Javadoc)
	* <p>Title: remove</p>
	* <p>Description: </p>
	* @param t
	* @see com.zhz233.bs.service.BasicService#remove(java.lang.Object)
	*/
	@Override
	public void remove(TUserModel t) {
		// TODO Auto-generated method stub
		
	}

	/* (no-Javadoc)
	* <p>Title: select</p>
	* <p>Description: </p>
	* @return
	* @see com.zhz233.bs.service.BasicService#select()
	*/
	@Override
	public List<TUserModel> select() {
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
	public TUserModel selectT(TUserModel t) {
		// TODO Auto-generated method stub
		return tUserIDAO.selectT(t);
	}

	/* (no-Javadoc)
	* <p>Title: selectListT</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#selectListT(java.lang.Object)
	*/
	@Override
	public List<TUserModel> selectListT(TUserModel t) {
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
	public List<TUserModel> selectTimeListT(TUserModel t) {
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
	public List<TUserModel> selectBlurListT(TUserModel t) {
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
	public void update(TUserModel t) {
		// TODO Auto-generated method stub
		
	}

	/* (no-Javadoc)
	* <p>Title: replace</p>
	* <p>Description: </p>
	* @param t
	* @see com.zhz233.bs.service.BasicService#replace(java.lang.Object)
	*/
	@Override
	public void replace(TUserModel t) {
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
		return tUserIDAO.selectN();
	}

	/* (no-Javadoc)
	* <p>Title: selectA</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.TUserService#selectA(com.zhz233.bs.model.TUserModel)
	*/
	@Override
	public TUserModel selectByAccPwd(TUserModel t) {
		// TODO Auto-generated method stub
		return tUserIDAO.selectByAccPwd(t);
	}

	/* (no-Javadoc)
	* <p>Title: selectByAccPho</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.TUserService#selectByAccPho(com.zhz233.bs.model.TUserModel)
	*/
	@Override
	public TUserModel selectByAccPho(TUserModel t) {
		// TODO Auto-generated method stub
		return tUserIDAO.selectByAccPho(t);
	}

	/* (no-Javadoc)
	* <p>Title: selectByAC</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.TUserService#selectByAC(com.zhz233.bs.model.TUserModel)
	*/
	@Override
	public String selectByAC(TUserModel t) {
		// TODO Auto-generated method stub
		return tUserIDAO.selectByAC(t);
	}

}
