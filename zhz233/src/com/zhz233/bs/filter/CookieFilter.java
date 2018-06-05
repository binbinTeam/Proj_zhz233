/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: CookieFilter.java 
* @Package com.zhz233.bs.filter 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
* @version V1.0.0
*/
package com.zhz233.bs.filter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* @ClassName: CookieFilter
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
*/
public class CookieFilter implements Filter{

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
		HttpServletRequest hsRequest = (HttpServletRequest) request;
		Cookie[] cookies = hsRequest.getCookies();
		if (cookies != null) {  
            Cookie cookie = cookies[0];
            if (cookie != null) {
                String value = cookie.getValue();  
                StringBuilder builder = new StringBuilder();  
                builder.append("JSESSIONID=" + value + "; "); 
                builder.append("Path="+"/"+"; ");
                /*builder.append("Domain="+"localhost:8080"+"; ");*/
                builder.append("Secure; ");
                builder.append("HttpOnly; ");  
                Calendar cal = Calendar.getInstance();  
                cal.add(Calendar.HOUR, 1);  
                Date date = cal.getTime();  
                Locale locale = Locale.CHINA;  
                SimpleDateFormat sdf =   
                        new SimpleDateFormat("dd-MM-yyyy HH:mm:ss",locale);  
                builder.append("Expires=" + sdf.format(date));  
                hsResponse.setHeader("Set-Cookie", builder.toString());  
            }  
		}
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
