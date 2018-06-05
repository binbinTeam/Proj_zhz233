/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: PathFilter.java 
* @Package com.zhz233.bs.filter 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
* @version V1.0.0
*/
package com.zhz233.bs.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zhz233.comn.utils.ZHZUtils;

/**
* @ClassName: PathFilter
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
*/
public class PathFilter implements Filter{

	/* (no-Javadoc)
	* <p>Title: init</p>
	* <p>Description: 初始化 Filter</p>
	* @param filterConfig
	* @throws ServletException
	* @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	*/ 
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	/* (no-Javadoc)
	* <p>Title: doFilter</p>
	* <p>Description: </p>
	* @param request
	* @param response
	* @param chain
	* @throws IOException
	* @throws ServletException
	* @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	*/ 
	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//获取request response session
		HttpServletRequest hsRequest = (HttpServletRequest) request;
		HttpServletResponse hsResponse = (HttpServletResponse) response;
		HttpSession hSession = hsRequest.getSession();
		//ssid
		String ssid = hSession.getId();
		//判断界面
		String servletPath = hsRequest.getServletPath();
		//判断请求类型
		String requestType = hsRequest.getHeader("X-Requested-With");
		/**
		 * 路径判断
		 */
		//静态资源
		if(servletPath.startsWith("/css/")
				|| servletPath.startsWith("/fonts/")
				|| servletPath.startsWith("/img/")
				|| servletPath.startsWith("/js/")
				|| servletPath.startsWith("/bspg/")
				) {//静态资源
			chain.doFilter(request, response);
			return;
		}else
		//首页资源
		if(servletPath.equals("/")
				|| servletPath.equals("/index.jsp")
				) {//首页资源
			hsResponse.sendRedirect(hsRequest.getContextPath() + "/bspg/home");
			return;
		}else
		//登录 注册资源页
		if(requestType == null 
				&& (servletPath.equals("/lsfo/logon")
						|| servletPath.equals("/lsfo/register"))
				&& ZHZUtils.isLogin(ssid)
				) {//登录访问资源
			hsResponse.sendRedirect(hsRequest.getContextPath() + "/pspg/psonl");
			return;
		}else
		//静态数据资源
		if("XMLHttpRequest".equals(requestType)
				&& (servletPath.startsWith("/info/")
						|| servletPath.startsWith("/lsfo/"))
				) {//公共信息资源
			chain.doFilter(request, response);
			return;
		}else
			//个人界面资源
			if(requestType == null
					&& servletPath.startsWith("/pspg/")
					&& ZHZUtils.isLogin(ssid)
				) {//个人信息资源页面
				chain.doFilter(request, response);
				return;
			}else
		//个人界面资源
		if("XMLHttpRequest".equals(requestType)
				&& servletPath.startsWith("/pspg/")
				&& ZHZUtils.isLogin(ssid)
			) {//个人信息资源页面
			request.getRequestDispatcher(servletPath).forward(request, response);
			return;
		}else
		//数据资源
		if("XMLHttpRequest".equals(requestType)
				&& servletPath.startsWith("/dbfo/")
				&& ZHZUtils.isLogin(ssid)
				) {//个人信息资源
			chain.doFilter(request, response);
			return;
		}else
		//载入登录页面
		{
			hsResponse.sendRedirect(hsRequest.getContextPath() + "/bspg/login");
			return;
		}
	}
	/* (no-Javadoc)
	* <p>Title: destroy</p>
	* <p>Description: 销毁 Filter</p>
	* @see javax.servlet.Filter#destroy()
	*/ 
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

}
