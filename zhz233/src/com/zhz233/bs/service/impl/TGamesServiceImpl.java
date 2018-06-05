/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TGamesServiceImpl.java 
* @Package com.zhz233.bs.service.impl 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月10日
* @version V1.0.0
*/
package com.zhz233.bs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhz233.bs.idao.TGamesIDAO;
import com.zhz233.bs.model.TGamesModel;
import com.zhz233.bs.model.VGamesModel;
import com.zhz233.bs.service.TGamesService;

/**
* @ClassName: TGamesServiceImpl
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月10日
*/
@Service("tGamesServiceImpl")
public class TGamesServiceImpl implements TGamesService{
	/**
	 * 注解idao
	 */
	@Autowired
	private TGamesIDAO tGamesIDAO;

	/* (no-Javadoc)
	* <p>Title: insert</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#insert(java.lang.Object)
	*/
	@Override
	public long insert(TGamesModel t) {
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
	public long save(TGamesModel t) {
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
	public void delete(TGamesModel t) {
		// TODO Auto-generated method stub
		
	}

	/* (no-Javadoc)
	* <p>Title: remove</p>
	* <p>Description: </p>
	* @param t
	* @see com.zhz233.bs.service.BasicService#remove(java.lang.Object)
	*/
	@Override
	public void remove(TGamesModel t) {
		// TODO Auto-generated method stub
		
	}

	/* (no-Javadoc)
	* <p>Title: select</p>
	* <p>Description: </p>
	* @return
	* @see com.zhz233.bs.service.BasicService#select()
	*/
	@Override
	public List<TGamesModel> select() {
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
	public TGamesModel selectT(TGamesModel t) {
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
	public List<TGamesModel> selectListT(TGamesModel t) {
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
	public List<TGamesModel> selectTimeListT(TGamesModel t) {
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
	public List<TGamesModel> selectBlurListT(TGamesModel t) {
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
	public void update(TGamesModel t) {
		// TODO Auto-generated method stub
		
	}

	/* (no-Javadoc)
	* <p>Title: replace</p>
	* <p>Description: </p>
	* @param t
	* @see com.zhz233.bs.service.BasicService#replace(java.lang.Object)
	*/
	@Override
	public void replace(TGamesModel t) {
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
	* @see com.zhz233.bs.service.TGamesService#selectTop5ByNT(com.zhz233.bs.model.TGamesModel)
	*/
	@Override
	public List<VGamesModel> selectTop8ByGT(TGamesModel t) {
		// TODO Auto-generated method stub
		return tGamesIDAO.selectTop8ByGT(t);
	}

	/* (no-Javadoc)
	* <p>Title: selectTop8ByGR</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.TGamesService#selectTop8ByGR(com.zhz233.bs.model.TGamesModel)
	*/
	@Override
	public List<VGamesModel> selectTop8ByGR() {
		// TODO Auto-generated method stub
		return tGamesIDAO.selectTop8ByGR();
	}
}
