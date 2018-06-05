/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: TGoodsServiceImpl.java 
* @Package com.zhz233.bs.service.impl 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月23日
* @version V1.0.0
*/
package com.zhz233.bs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhz233.bs.idao.TGoodsIDAO;
import com.zhz233.bs.model.SearchModel;
import com.zhz233.bs.model.TGoodsModel;
import com.zhz233.bs.model.VGoodsModel;
import com.zhz233.bs.model.VSpecialGoodsModel;
import com.zhz233.bs.service.TGoodsService;

/**
* @ClassName: TGoodsServiceImpl
* @Description: TODO 
* @author ZhzTeam
* @date 2018年4月23日
*/
@Service("tGoodsServiceImpl")
public class TGoodsServiceImpl implements TGoodsService {

	/**
	 * 注解资源
	 */
	@Autowired
	private TGoodsIDAO tGoodsIDAO;
	/* (no-Javadoc)
	* <p>Title: insert</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#insert(java.lang.Object)
	*/
	@Override
	public long insert(TGoodsModel t) {
		// TODO Auto-generated method stub
		return tGoodsIDAO.insert(t);
	}

	/* (no-Javadoc)
	* <p>Title: save</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.BasicService#save(java.lang.Object)
	*/
	@Override
	public long save(TGoodsModel t) {
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
	public void delete(TGoodsModel t) {
		// TODO Auto-generated method stub

	}

	/* (no-Javadoc)
	* <p>Title: remove</p>
	* <p>Description: </p>
	* @param t
	* @see com.zhz233.bs.service.BasicService#remove(java.lang.Object)
	*/
	@Override
	public void remove(TGoodsModel t) {
		// TODO Auto-generated method stub

	}

	/* (no-Javadoc)
	* <p>Title: select</p>
	* <p>Description: </p>
	* @return
	* @see com.zhz233.bs.service.BasicService#select()
	*/
	@Override
	public List<TGoodsModel> select() {
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
	public TGoodsModel selectT(TGoodsModel t) {
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
	public List<TGoodsModel> selectListT(TGoodsModel t) {
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
	public List<TGoodsModel> selectTimeListT(TGoodsModel t) {
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
	public List<TGoodsModel> selectBlurListT(TGoodsModel t) {
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
	public void update(TGoodsModel t) {
		// TODO Auto-generated method stub

	}

	/* (no-Javadoc)
	* <p>Title: replace</p>
	* <p>Description: </p>
	* @param t
	* @see com.zhz233.bs.service.BasicService#replace(java.lang.Object)
	*/
	@Override
	public void replace(TGoodsModel t) {
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
		return tGoodsIDAO.selectN();
	}

	/* (no-Javadoc)
	* <p>Title: selectTop10ByTRS</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.TGoodsService#selectTop10ByTRS(com.zhz233.bs.model.TGoodsModel)
	*/
	@Override
	public List<VSpecialGoodsModel> selectTop10ByTRS(TGoodsModel t) {
		// TODO Auto-generated method stub
		System.err.println(t.getGoods_status());
		return tGoodsIDAO.selectTop10ByTRS(t);
	}

	/* (no-Javadoc)
	* <p>Title: selectShowListT</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.TGoodsService#selectShowListT(com.zhz233.bs.model.SearchModel)
	*/
	@Override
	public List<VGoodsModel> selectShowListT(SearchModel t) {
		// TODO Auto-generated method stub
		return tGoodsIDAO.selectShowListT(t);
	}

	/* (no-Javadoc)
	* <p>Title: selectTByGNO</p>
	* <p>Description: </p>
	* @param t
	* @return
	* @see com.zhz233.bs.service.TGoodsService#selectTByGNO(com.zhz233.bs.model.TGoodsModel)
	*/
	@Override
	public TGoodsModel selectTByGNO(TGoodsModel t) {
		// TODO Auto-generated method stub
		return tGoodsIDAO.selectTByGNO(t);
	}

}
