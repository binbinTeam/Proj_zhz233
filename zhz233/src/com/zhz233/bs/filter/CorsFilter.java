/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: CorsFilter.java 
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
import javax.servlet.http.HttpServletResponse;

/**
* @ClassName: CorsFilter
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
*/
public class CorsFilter implements Filter{

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
		//获取 hsResponse
		HttpServletResponse hsResponse = (HttpServletResponse) response;
//		HttpServletRequest hsRequest = (HttpServletRequest) request;
		hsResponse.setContentType("text/json");
		hsResponse.setCharacterEncoding("UTF-8");
		hsResponse.setHeader("Access-Control-Max-Age", "1800");
		hsResponse.setHeader("Access-Control-Allow-Headers", 
				"Origin, X-Requested-With, Content-Type, Accept, token");
		hsResponse.setHeader("Access-Control-Allow-Origin", "*");
		hsResponse.setHeader("Access-Control-Allow-Credentials", "true");
		chain.doFilter(request, response);
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
