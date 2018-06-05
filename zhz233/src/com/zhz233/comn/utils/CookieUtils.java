/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: CookieUtils.java 
* @Package com.zhz233.comn.utils 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月22日
* @version V1.0.0
*/
package com.zhz233.comn.utils;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhz233.comn.config.CookieConfig;

/**
* @ClassName: CookieUtils
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月22日
*/
public class CookieUtils {
	/**
	 * 
	* @Title: addCookie
	* @Description: TODO 设置cookie
	* @param response
	* @param name
	* @param value
	* @param maxAge 
	* void  
	* @throws
	 */
	public static void addCookie(HttpServletResponse response,String name,String value,int maxAge){
	    Cookie cookie = new Cookie(name,value);
	    cookie.setPath(CookieConfig.COOKIE_PATH);
	    if(maxAge>0)  cookie.setMaxAge(maxAge);
	    response.addCookie(cookie);
	}
	/**
	 * 
	* @Title: getCookieByName
	* @Description: TODO 根据名字获取cookie
	* @param request
	* @param name
	* @return 
	* Cookie  
	* @throws
	 */
	public static Cookie getCookieByName(HttpServletRequest request,String name){
	    Map<String,Cookie> cookieMap = ReadCookieMap(request);
	    if(cookieMap.containsKey(name)){
	        Cookie cookie = (Cookie)cookieMap.get(name);
	        return cookie;
	    }else{
	        return null;
	    }   
	}
	/**
	 * 
	* @Title: ReadCookieMap
	* @Description: TODO 将cookie封装到Map里面
	* @param request
	* @return 
	* Map<String,Cookie>  
	* @throws
	 */
	private static Map<String,Cookie> ReadCookieMap(HttpServletRequest request){  
	    Map<String,Cookie> cookieMap = new HashMap<String,Cookie>();
	    Cookie[] cookies = request.getCookies();
	    if(null != cookies){
	        for(Cookie cookie : cookies){
	            cookieMap.put(cookie.getName(), cookie);
	        }
	    }
	    return cookieMap;
	}
}
