/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: ModelUtils.java 
* @Package com.zhz233.comn.utils 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月4日
* @version V1.0.0
*/
package com.zhz233.comn.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;

/**
* @ClassName: ModelUtils
* @Description: TODO 
* @author ZhzTeam
* @date 2018年5月4日
*/
public class ModelUtils {
	
	private static Map<String,Object> map ;
	/**
	 * 
	* @Title: putTasteDB
	* @Description: TODO 
	* @param model
	* @return 
	* Model  
	* @throws
	 */
	public Model putTasteDB(Model model) {
		map = new HashMap<String, Object>();
		model.addAllAttributes(map);
		return model;
	}
}
