/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: LogonOfController.java 
* @Package com.zhz233.bs.controller 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
* @version V1.0.0
*/
package com.zhz233.bs.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhz233.bs.model.TUserModel;
import com.zhz233.bs.result.CodeResult;
import com.zhz233.bs.result.SMSResult;
import com.zhz233.bs.result.ZHZResult;
import com.zhz233.bs.service.impl.TUserServiceImpl;
import com.zhz233.comn.config.ModelConfig;
import com.zhz233.comn.config.RedisConfig;
import com.zhz233.comn.config.SMSConfig;
import com.zhz233.comn.config.ZHZConfig;
import com.zhz233.comn.utils.REVUtils;
import com.zhz233.comn.utils.RedisUtils;
import com.zhz233.comn.utils.SMSUtils;
import com.zhz233.comn.utils.TimeUtils;
import com.zhz233.comn.utils.ZHZUtils;

import redis.clients.jedis.Jedis;

/**
* @ClassName: LogonOfController
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
*/
@Controller
@RequestMapping("/lsfo")//游客控制层
@Scope("prototype")
public class LogonOfController {
	
	/**
	 * 定义全局变量
	 */
	private TUserModel tUserModel;
	private TUserModel tModel;
	private Jedis jedis;
	
	private String old_No;//old no
	private String new_No;//new no
	private Map<String, Object> map;
	private ZHZResult zhzResult;
	private HttpSession hSession;
	private String ssid;
	private CodeResult codeResult;
	private SMSResult smsResult;
	/**
	 * 注解资源
	 */
	@Resource
	private TUserServiceImpl tUserServiceImpl;
	/**
	 * 
	* @Title: giucod
	* @Description: TODO 获取验证码
	* @param hsRequest
	* @param upho
	* @return 
	* Map<String,Object>  
	* @throws
	 */
	@RequestMapping(value="/giucod", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> giucod(HttpServletRequest hsRequest,
			@RequestParam("upho") String upho){
		//初始化对象
		map = new HashMap<String,Object>();
		zhzResult = new ZHZResult();
		//判断uacc 符合 请求标准
		if(upho != null) {
			if(REVUtils.isSimplePhone(upho)) {//验证格式
				jedis = RedisUtils.getJedis();
				boolean Flag = jedis.exists("u_"+upho);//upho 验证	
				jedis.close();
				if(!Flag) {//不存在缓存数据 发送验证码 并存入缓存
					try {
						codeResult = SMSUtils.cerateMsg(6);//获取信息组合
						smsResult = SMSUtils.execute(upho, codeResult.getMsg());
					}catch (Exception e) {
						// TODO: handle exception
						e.getMessage();
						e.printStackTrace();
						System.err.println("网络异常！");
					}
					if(smsResult.getRespCode() == null) {//网络异常
						System.err.println("网络异常！");
					}else {//发送成功
						if(smsResult.getRespCode().equals(SMSConfig.RESPCODE_SUCCESS)) {//发送 回调code
							//缓存 code 信息
							jedis = RedisUtils.getJedis();
							jedis.set("u_"+upho, codeResult.getCode());
							jedis.expire("u_"+upho, RedisConfig.REDIS_TIMEOUT_30MIN);
							jedis.close();
							zhzResult.setCode(ZHZConfig.REQCODE_1010);
							zhzResult.setMsg("验证码发送成功！");
						}else {//请稍后再试
							zhzResult.setCode(ZHZConfig.REQCODE_1011);
							zhzResult.setMsg("验证码发送失败，请稍后重试！");
						}
					}
				}else {//存在 则已发送验证码 //提示稍后再试
					jedis = RedisUtils.getJedis();
					jedis.expire("u_"+upho, RedisConfig.REDIS_TIMEOUT_30MIN);
					jedis.close();
					zhzResult.setCode(ZHZConfig.REQCODE_1009);
					zhzResult.setMsg("验证码已发送！");
				}
			}else{
				zhzResult.setCode(ZHZConfig.ERROEREQCODE_2005);
				zhzResult.setMsg("手机号格式错误！");
			}
		}else {
			zhzResult.setCode(ZHZConfig.ERROEREQCODE_2004);
			zhzResult.setMsg("手机号信息错误！");
		}
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("result", zhzResult);
		return map;
	}
	/**
	 * 
	* @Title: ckucod
	* @Description: TODO 验证 手机号 验证码
	* @param hsRequest
	* @param ucod
	* @return 
	* Map<String,Object>  
	* @throws
	 */
	@RequestMapping(value="/ckucod", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> ckucod(HttpServletRequest hsRequest,
			@RequestParam("ucod") String ucod,
			@RequestParam("upho") String upho){
		//初始化对象
		map = new HashMap<String,Object>();
		zhzResult = new ZHZResult();
		//判断ucod upho 符合 请求标准
		if(ucod != null && upho != null) {
			if(REVUtils.isCode_6(ucod) && REVUtils.isSimplePhone(upho)) {//验证格式
				jedis = RedisUtils.getJedis();
				boolean Flag = jedis.exists("u_"+upho);//upho 验证	
				jedis.close();
				if(Flag) {//验证码失效 验证
					jedis = RedisUtils.getJedis();
					String Temp = jedis.get("u_"+upho);
					jedis.close();
					if(Temp != null) {//验证码失效
						String Temp0 = Temp.toLowerCase();
						String Temp1 = ucod.toLowerCase();
						if(Temp1.equals(Temp0)) {//验证成功
							zhzResult.setCode(ZHZConfig.REQCODE_1014);
							zhzResult.setMsg("手机号，验证码验证成功！");
						}else {//验证失败
							zhzResult.setCode(ZHZConfig.REQCODE_1013);
							zhzResult.setMsg("手机号，验证码验证失败！");
						}
					}else {
						zhzResult.setCode(ZHZConfig.REQCODE_1012);
						zhzResult.setMsg("手机号，验证码失效！");
					}
				}else {
					zhzResult.setCode(ZHZConfig.REQCODE_1012);
					zhzResult.setMsg("手机号，验证码失效！");
				}
			}else{
				zhzResult.setCode(ZHZConfig.ERROEREQCODE_2006);
				zhzResult.setMsg("手机号或验证码格式错误！");
			}
		}else {
			zhzResult.setCode(ZHZConfig.ERROEREQCODE_2007);
			zhzResult.setMsg("手机号或验证码信息错误！");
		}
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("result", zhzResult);
		return map;
	}
	/**
	 * 
	* @Title: ckupho
	* @Description: TODO 检查 验证手机号
	* @param hsRequest
	* @param upho
	* @return 
	* Map<String,Object>  
	* @throws
	 */
	@RequestMapping(value="/ckupho", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> ckupho(HttpServletRequest hsRequest,
			@RequestParam("upho") String upho){
		//初始化对象
		map = new HashMap<String,Object>();
		zhzResult = new ZHZResult();
		//判断uacc 符合 请求标准
		if(upho != null) {
			if(REVUtils.isSimplePhone(upho)) {//验证格式
				tUserModel = new TUserModel();				
				tModel = new TUserModel();
				tUserModel.setCell_phone(upho);
				tModel = tUserServiceImpl.selectByAccPho(tUserModel);
				if(tModel != null) {//查询acc 合法性
					if(tModel.getAccess() == 0) {
						zhzResult.setCode(ZHZConfig.WARNREQCODE_3000);
						zhzResult.setMsg("手机号已封禁！");
					}else {
						zhzResult.setCode(ZHZConfig.REQCODE_1007);
						zhzResult.setMsg("手机号已存在！");
					}					
				}else {
					zhzResult.setCode(ZHZConfig.REQCODE_1008);
					zhzResult.setMsg("手机号不存在！");
				}
			}else {
				zhzResult.setCode(ZHZConfig.ERROEREQCODE_2005);
				zhzResult.setMsg("手机号格式错误！");
			}
		}else {
			zhzResult.setCode(ZHZConfig.ERROEREQCODE_2004);
			zhzResult.setMsg("手机号错误！");
		}
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("result", zhzResult);
		return map;
	}
	/**
	 * 
	* @Title: ckuacc
	* @Description: TODO 验证 是否存在 用户名 
	* @param hsRequest
	* @param uacc
	* @return 
	* Map<String,Object>  
	* @throws
	 */
	@RequestMapping(value="/ckuacc", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> ckuacc(HttpServletRequest hsRequest,
			@RequestParam("uacc") String uacc){
		//初始化对象
		map = new HashMap<String,Object>();
		zhzResult = new ZHZResult();
		//判断uacc 符合 请求标准
		if(uacc != null) {
			if(REVUtils.isAccount8_abc(uacc)) {//验证格式
				tUserModel = new TUserModel();
				tModel = new TUserModel();
				tUserModel.setAccount(uacc);
				tModel = tUserServiceImpl.selectByAccPho(tUserModel);
				if(tModel != null) {//查询acc 合法性
					if(tModel.getAccess() == 0) {
						zhzResult.setCode(ZHZConfig.WARNREQCODE_3000);
						zhzResult.setMsg("用户名已封禁！");
					}else {
						zhzResult.setCode(ZHZConfig.REQCODE_1000);
						zhzResult.setMsg("用户名已存在！");
					}					
				}else {
					zhzResult.setCode(ZHZConfig.REQCODE_1001);
					zhzResult.setMsg("用户名不存在！");
				}
			}else {
				zhzResult.setCode(ZHZConfig.ERROEREQCODE_2001);
				zhzResult.setMsg("用户名格式错误！");
			}
		}else {
			zhzResult.setCode(ZHZConfig.ERROEREQCODE_2000);
			zhzResult.setMsg("用户名错误！");
		}
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("result", zhzResult);
		return map;
	}
	/**
	 * 
	* @Title: regist
	* @Description: TODO 用户信息注册
	* @param hsRequest
	* @param uacc
	* @param upwd
	* @param ucod
	* @return 
	* Map<String,Object>  
	* @throws
	 */
	@RequestMapping(value="/regist", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> regist(HttpServletRequest hsRequest,
			@RequestParam("uacc") String uacc,
			@RequestParam("upwd") String upwd,
			@RequestParam("upho") String upho,
			@RequestParam("ucod") String ucod){
		//初始化对象
		map = new HashMap<String,Object>();
		hSession = hsRequest.getSession();
		ssid = (String) hSession.getId();
		zhzResult = new ZHZResult();
		//注册数据验证
		if(uacc !=null && upwd !=null && upho !=null) {
			if(REVUtils.isAccount8_abc(uacc)
					&& REVUtils.isPwd6_abc(upwd) 
					&& REVUtils.isSimplePhone(upho)
					&& REVUtils.isCode_6(ucod)) {//格式验证
				tUserModel = new TUserModel();
				tModel = new TUserModel();
				tUserModel.setAccount(uacc);
				tModel = tUserServiceImpl.selectByAccPho(tUserModel);
				if(tModel == null) {
					tUserModel = new TUserModel();
					tUserModel.setCell_phone(upho);
					tModel = tUserServiceImpl.selectByAccPho(tUserModel);
					if(tModel == null) {
						//获取验证码手机号缓存
						jedis = RedisUtils.getJedis();
						boolean Flag = jedis.exists("u_"+upho);
						String Temp = jedis.get("u_"+upho);
						jedis.close();
						if(Flag && Temp != null) {//验证缓存信息
							if(Temp.toLowerCase().equals(ucod.toLowerCase())) {
								//获取自增User_No
								old_No = tUserServiceImpl.selectN();
								new_No = ZHZUtils.AutoNoTUser(old_No);
								//设置用户注册信息
								tUserModel = new TUserModel();
								tUserModel.setAccount_no(new_No);
								tUserModel.setAccount(uacc);
								tUserModel.setCell_phone(upho);
								tUserModel.setAccess(ModelConfig.TUSER_ACCESS_1);
								tUserModel.setPassword(upwd);
								tUserModel.setUpdate_time(new Date());
								tUserModel.setCreate_time(new Date());
								if(tUserServiceImpl.insert(tUserModel) > 0) {//注册用户信息
									jedis = RedisUtils.getJedis();
									jedis.del("u_"+upho);
									jedis.close();
									zhzResult.setCode(ZHZConfig.REQCODE_1016);
									zhzResult.setMsg("注册成功！");
								}else {//添加失败
									zhzResult.setCode(ZHZConfig.REQCODE_1015);
									zhzResult.setMsg("注册失败！");
								}
							}else {//验证失败
								zhzResult.setCode(ZHZConfig.REQCODE_1013);
								zhzResult.setMsg("验证码验证失败！");
							}
						}else {//验证码失效
							zhzResult.setCode(ZHZConfig.REQCODE_1012);
							zhzResult.setMsg("验证码验证失效！");
						}
					}else {//手机已存在
						zhzResult.setCode(ZHZConfig.REQCODE_1007);
						zhzResult.setMsg("手机号已存在！");
					}
				}else {//用户已存在
					zhzResult.setCode(ZHZConfig.REQCODE_1000);
					zhzResult.setMsg("用户名已存在！");
				}
			}else {//格式错误
				zhzResult.setCode(ZHZConfig.ERROEREQCODE_2008);
				zhzResult.setMsg("注册信息格式错误！");
			}
		}else {//错误
			zhzResult.setCode(ZHZConfig.ERROEREQCODE_2009);
			zhzResult.setMsg("注册信息错误！");
		}
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("result", zhzResult);
		return map;
	}
	/**
	 * 
	* @Title: logout
	* @Description: TODO 退出登录
	* @param hsRequest
	* @return 
	* Map<String,Object>  
	* @throws
	 */
	@RequestMapping(value="/logout", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> logout(HttpServletRequest hsRequest){
		//初始化对象
		map = new HashMap<String,Object>();
		hSession = hsRequest.getSession();
		ssid = (String) hSession.getId();
		zhzResult = new ZHZResult();
		//获取缓存ssid
		jedis = RedisUtils.getJedis();
		boolean Flag = jedis.exists(ssid);//ssid
		boolean Flag2 = jedis.exists(jedis.get(ssid));//uacc
		jedis.close();
		if(Flag && Flag2) {//清除登录信息
			jedis = RedisUtils.getJedis();
			jedis.del(jedis.get(ssid));
			jedis.del(ssid);
			jedis.close();
			zhzResult.setCode(ZHZConfig.REQCODE_1018);
			zhzResult.setMsg("退出成功！");
		}else {//退出失败
			zhzResult.setCode(ZHZConfig.REQCODE_1017);
			zhzResult.setMsg("退出失败！");
		}
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("result", zhzResult);
		return map;
	}
	/**
	 * 
	* @Title: logon
	* @Description: TODO 登录验证 如果同 ssid 则 不允许重复登录
	* @param hsRequest
	* @param acc
	* @param pwd
	* @return 
	* Map<String,Object>  
	* @throws
	 */
	@RequestMapping(value="/logon", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> logon(HttpServletRequest hsRequest,
			@RequestParam("uacc") String uacc,
			@RequestParam("upwd") String upwd){
		//初始化对象
		map = new HashMap<String,Object>();
		hSession = hsRequest.getSession();
		ssid = (String) hSession.getId();
		zhzResult = new ZHZResult();
		if(uacc != null && upwd != null) {//请求参数 判断
			if(REVUtils.isAccount8_abc(uacc) && REVUtils.isPwd6_abc(upwd)) {//格式判断
				tUserModel = new TUserModel();
				tUserModel.setAccount(uacc);
				tUserModel.setPassword(upwd);
				tModel = tUserServiceImpl.selectByAccPwd(tUserModel);
				if(tModel != null) {//验证数据库 数据合法性
					if(tModel.getAccess() == 0) {
						zhzResult.setCode(ZHZConfig.REQCODE_1003);
						zhzResult.setMsg("登录失败！");
					}else {
						jedis = RedisUtils.getJedis();
						boolean Flag = jedis.exists(ssid);//ssid
						boolean Flag2 = jedis.exists(uacc);	//uacc			
						jedis.close();
						if(!Flag2 && !Flag) {//缓存 状态
							jedis = RedisUtils.getJedis();
							jedis.set(ssid, uacc);
							jedis.set(uacc, ssid);
							jedis.expire(ssid, RedisConfig.REDIS_TIMEOUT_30MIN);
							jedis.expire(uacc, RedisConfig.REDIS_TIMEOUT_30MIN);
							jedis.close();
							zhzResult.setCode(ZHZConfig.REQCODE_1002);
							zhzResult.setMsg("登录成功！");
						}else if(Flag2 && !Flag){//重置缓存状态1
							jedis = RedisUtils.getJedis();
							jedis.del(jedis.get(uacc));
							jedis.del(uacc);							
							jedis.set(ssid, uacc);
							jedis.set(uacc, ssid);
							jedis.expire(ssid, RedisConfig.REDIS_TIMEOUT_30MIN);
							jedis.expire(uacc, RedisConfig.REDIS_TIMEOUT_30MIN);
							jedis.close();
							zhzResult.setCode(ZHZConfig.REQCODE_1005);
							zhzResult.setMsg("异地登录成功！");
						}else if(!Flag2 && Flag){//重置缓存状态2
							jedis = RedisUtils.getJedis();
							jedis.del(jedis.get(ssid));
							jedis.del(ssid);					
							jedis.set(ssid, uacc);
							jedis.set(uacc, ssid);
							jedis.expire(ssid, RedisConfig.REDIS_TIMEOUT_30MIN);
							jedis.expire(uacc, RedisConfig.REDIS_TIMEOUT_30MIN);
							jedis.close();
							zhzResult.setCode(ZHZConfig.REQCODE_1006);
							zhzResult.setMsg("异号登录成功！");
						}else {//重复登录 同ssid uacc 刷新过期时间
							jedis = RedisUtils.getJedis();
							jedis.expire(ssid, RedisConfig.REDIS_TIMEOUT_30MIN);
							jedis.expire(uacc, RedisConfig.REDIS_TIMEOUT_30MIN);
							jedis.close();
							zhzResult.setCode(ZHZConfig.REQCODE_1004);
							zhzResult.setMsg("重复登录成功！");
						}
					}
				}else {
					zhzResult.setCode(ZHZConfig.REQCODE_1003);
					zhzResult.setMsg("登录失败！");
				}
			}else {
				zhzResult.setCode(ZHZConfig.ERROEREQCODE_2003);
				zhzResult.setMsg("登录信息格式错误！");
			}
		}else {
			zhzResult.setCode(ZHZConfig.ERROEREQCODE_2002);
			zhzResult.setMsg("登录信息错误！");
		}
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("result", zhzResult);
		return map;
	}
}
