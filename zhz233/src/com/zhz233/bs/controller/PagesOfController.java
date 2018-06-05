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

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@RequestMapping("/bspg")//游客控制层
@Scope("prototype")
public class PagesOfController {
	
	/**
	 * 定义全局变量
	 */
	private ModelAndView modelAndView;
	
	@RequestMapping("/test")
	@ResponseBody
	public ModelAndView test() {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("test/test");
		//返回视图
		return modelAndView;
	}
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
		modelAndView.setViewName("bs/home/index_home");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: taste
	* @Description: TODO 
	* @param hsRequest
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/taste")
	@ResponseBody
	public ModelAndView taste(Model model) {
		//获取页面对象
		modelAndView = new ModelAndView();
		//放置返回数据
		//putDB(model);
		//设置视图
		modelAndView.setViewName("bs/taste/index_taste");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: deal
	* @Description: TODO 
	* @param hsRequest
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/deal")
	@ResponseBody
	public ModelAndView deal() {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/deal/index_deal");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: store
	* @Description: TODO 
	* @param hsRequest
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/store")
	@ResponseBody
	public ModelAndView store() {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/store/index_store");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: help
	* @Description: TODO 
	* @param hsRequest
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/help")
	@ResponseBody
	public ModelAndView help() {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/help/index_help");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: download
	* @Description: TODO 
	* @param hsRequest
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/download")
	@ResponseBody
	public ModelAndView download(HttpServletRequest hsRequest) {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/download/index_download");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: download
	* @Description: TODO 
	* @param hsRequest
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/login")
	@ResponseBody
	public ModelAndView login(HttpServletRequest hsRequest) {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/psonl/login");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: register
	* @Description: TODO 
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/register")
	@ResponseBody
	public ModelAndView register() {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/psonl/register");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: showinfo
	* @Description: TODO 
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/showinfo")
	@ResponseBody
	public ModelAndView showinfo() {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/store/showinfo");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: back1
	* @Description: TODO 
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/back1")
	@ResponseBody
	public ModelAndView back1() {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("bs/psonl/psonl_back1");
		//返回视图
		return modelAndView;
	}
	/**
	 * 
	* @Title: Error404
	* @Description: TODO 
	* @return 
	* ModelAndView  
	* @throws
	 */
	@RequestMapping("/Error404")
	@ResponseBody
	public ModelAndView Error404() {
		//获取页面对象
		modelAndView = new ModelAndView();
		//设置视图
		modelAndView.setViewName("error/404");
		//返回视图
		return modelAndView;
	}
}
