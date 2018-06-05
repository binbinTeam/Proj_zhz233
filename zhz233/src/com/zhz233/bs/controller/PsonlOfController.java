/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: PagesOfController.java 
* @Package com.zhz233.bs.controller 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
* @version V1.0.0
*/
package com.zhz233.bs.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
* @ClassName: PagesOfController
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
*/
@Controller
@RequestMapping("/pspg")
@Scope("prototype")
public class PsonlOfController {
	
	/**
	 * 定义全局变量
	 */
	private ModelAndView modelAndView;
	/**
	 * 
	* @Title: home
	* @Description: TODO 
	* @param hsRequest
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/home")
	@ResponseBody
	public ModelAndView home() {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/psonl/index_psonl");
		//返回视图
		return modelAndView;
	}
	
	/**
	 * 
	* @Title: publishRent
	* @Description: TODO 
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/publishRent")
	@ResponseBody
	public ModelAndView publishRent() {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/psonl/index_psonl");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: psonl_pg1
	* @Description: TODO 
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/psonl_pg1")
	@ResponseBody
	public ModelAndView psonl_pg1() {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/psonl/htm/psonl_pg1");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: psonl_pg1
	* @Description: TODO 
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/psonl_pg2")
	@ResponseBody
	public ModelAndView psonl_pg2() {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/psonl/htm/psonl_pg2");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: psonl_pg3
	* @Description: TODO 
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/psonl_pg3")
	@ResponseBody
	public ModelAndView psonl_pg3(){
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/psonl/htm/psonl_pg3");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: psonl_pg4
	* @Description: TODO 
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/psonl_pg4")
	@ResponseBody
	public ModelAndView psonl_pg4(){
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/psonl/htm/psonl_pg4");
		//返回视图
		return modelAndView;
	}
}
