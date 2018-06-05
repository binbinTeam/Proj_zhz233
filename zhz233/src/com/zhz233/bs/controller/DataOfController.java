/**
* Copyright © 2018 ZhzTeam Info. All rights reserved.
*  
* @Title: .java 
* @Package com.zhz233.bs.controller 
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
* @version V1.0.0
*/
package com.zhz233.bs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhz233.bs.model.LOLRentListModel;
import com.zhz233.bs.model.LeaseModel;
import com.zhz233.bs.model.PInvlaModel;
import com.zhz233.bs.model.PaginationModel;
import com.zhz233.bs.model.RentOrderModel;
import com.zhz233.bs.model.TAccountModel;
import com.zhz233.bs.model.TGoodsModel;
import com.zhz233.bs.model.TGoodsRentModel;
import com.zhz233.bs.model.TGoodsRentMoreLOLModel;
import com.zhz233.bs.model.TInvlaModel;
import com.zhz233.bs.model.TLeaseModel;
import com.zhz233.bs.model.TUserModel;
import com.zhz233.bs.model.VAccountModel;
import com.zhz233.bs.model.VInvlaModel;
import com.zhz233.bs.model.VLeaseModel;
import com.zhz233.bs.result.InfoResult;
import com.zhz233.bs.result.ZHZResult;
import com.zhz233.bs.service.impl.TAccountServiceImpl;
import com.zhz233.bs.service.impl.TGamesServiceImpl;
import com.zhz233.bs.service.impl.TGoodsRentMoreLOLServiceImpl;
import com.zhz233.bs.service.impl.TGoodsRentServiceImpl;
import com.zhz233.bs.service.impl.TGoodsServiceImpl;
import com.zhz233.bs.service.impl.TInvlaServiceImpl;
import com.zhz233.bs.service.impl.TLeaseServiceImpl;
import com.zhz233.bs.service.impl.TNoticeServiceImpl;
import com.zhz233.bs.service.impl.TUserServiceImpl;
import com.zhz233.comn.config.ModelConfig;
import com.zhz233.comn.config.ZHZConfig;
import com.zhz233.comn.utils.DecimalUtils;
import com.zhz233.comn.utils.TimeUtils;
import com.zhz233.comn.utils.ZHZUtils;

/**
* @ClassName: DataOfController
* @Description: TODO 
* @author ZhzTeam
* @date 2018年3月18日
*/
@Controller
@RequestMapping("/dbfo")//游客控制层
@Scope("prototype")
public class DataOfController {
	/**
	 * 定义全局变量
	 */
	private ZHZResult zhzResult;
	private InfoResult infoResult;
	
	//private TNoticeModel tNoticeModel;
	//private TGamesModel tGamesModel;
	private TUserModel tUserModel;
	//private TUserModel tModel;
	private TAccountModel tAccountModel;
	private TGoodsModel tGoodsModel;
	private TGoodsModel tModel;
	private TGoodsRentModel tGoodsRentModel;
	private TGoodsRentMoreLOLModel tGoodsRentMoreLOLModel;
	private TInvlaModel tInvlaModel;
	private TLeaseModel tLeaseModel;
	private PaginationModel paginationModel;
	
	private VAccountModel vAccountModel;
	private VInvlaModel vInvlaModel;

	private List<TInvlaModel> tinvlaList;
	
	private List<VLeaseModel> vLeaseList;
	
	//private List<VNoticeModel> vnoticeList;
	//private List<VGamesModel> vgameList;
	//private List<VAccountModel> vaccountList;
	//private List<TRentOrder> rentOrderList;
	
	private Map<String, Object> map;
	private Map<String, Object> reMap;
	//private Map<String, Object> rentMap;
	
	//httpsession
	private HttpSession hSession;
	//ssid
	private String ssid ;
	/**
	 * 注解资源
	 */
	@Resource
	private TUserServiceImpl tUserServiceImpl;
	@Resource
	private TAccountServiceImpl tAccountServiceImpl;
	@Resource
	private TNoticeServiceImpl tNoticeServiceImpl;
	@Resource
	private TGamesServiceImpl tGamesServiceImpl;
	@Resource
	private TGoodsServiceImpl tGoodsServiceImpl;
	@Resource
	private TGoodsRentServiceImpl tGoodsRentServiceImpl;
	@Resource
	private TGoodsRentMoreLOLServiceImpl tGoodsRentMoreLOLServiceImpl;
	@Resource
	private TInvlaServiceImpl tInvlaServiceImpl;
	@Resource
	private TLeaseServiceImpl tLeaseServiceImpl;
	
	@RequestMapping(value="/ShowInvlaInfo", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> ShowInvlaInfo(HttpServletRequest hsRequest,
			HttpServletResponse hsResponse,
			@RequestBody PInvlaModel pinvlaModel){
		//初始化map zhzResult
		map = new HashMap<String, Object>();
		reMap = new HashMap<String, Object>();
		zhzResult = new ZHZResult();
		infoResult = new InfoResult();
		//获取session id
		hSession = hsRequest.getSession();
		ssid = hSession.getId();
		//获取username
		String userName = ZHZUtils.giacc(ssid);
		//获取账户交易信息
		tUserModel = new TUserModel();
		//获取用户名 no
		tUserModel.setAccount(userName);
		String userNo = tUserServiceImpl.selectByAC(tUserModel);
		//创建返回数据容器
		tinvlaList = new ArrayList<TInvlaModel>();
		//设置参数
		tInvlaModel = new TInvlaModel();
		tInvlaModel.setAccount_no(userNo);
		//其他参数
		tInvlaModel.setOrder_operate_type(pinvlaModel.getOrder_operate_type());
		
		/*System.err.println(pinvlaModel.getOrder_operate_type());
		System.err.println(pinvlaModel.getEnd_time());
		System.err.println(pinvlaModel.getStart_time());
		System.err.println(pinvlaModel.getStartPage());
		System.err.println(pinvlaModel.getPageSize());*/
		
		//设置条件时间 条件
		paginationModel = new PaginationModel();
		/*paginationModel.setStartPage(0);
		paginationModel.setPageSize(5);*/
		paginationModel.setStartPage(pinvlaModel.getStartPage());
		paginationModel.setPageSize(ModelConfig.PAGESIZE_5);
		paginationModel.setStart_time(pinvlaModel.getStart_time());
		paginationModel.setEnd_time(pinvlaModel.getEnd_time());
		tinvlaList = tInvlaServiceImpl.selectPaginationListT(tInvlaModel, paginationModel);
		int total_count;
		int current_page;
		int each_page;
		vInvlaModel = new VInvlaModel();
		vInvlaModel = tInvlaServiceImpl.selectSumCountByANOT(tInvlaModel);
		total_count = vInvlaModel.getCount();
		current_page = pinvlaModel.getStartPage();
		each_page = pinvlaModel.getPageSize();
		reMap.put("total_count", total_count);
		reMap.put("current_page", current_page);
		reMap.put("each_page", each_page);
		reMap.put("data_list", tinvlaList);
		//判断数据是否获取成功
		if(reMap != null) {//放置返回数据
			infoResult.setReMap(reMap);
			infoResult.setCode(ZHZConfig.REQCODE_1024);
			infoResult.setMsg("发布信息获取成功");
			zhzResult.setCode(ZHZConfig.REQCODE_1022);
			zhzResult.setMsg("发布信息获取成功");
		}else {
			infoResult.setCode(ZHZConfig.REQCODE_1023);
			infoResult.setMsg("发布信息获取失败");
			zhzResult.setCode(ZHZConfig.REQCODE_1021);
			zhzResult.setMsg("发布信息获取失败");
		}
		infoResult.setZtime(TimeUtils.getDate());
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("iResult", infoResult);
		map.put("result", zhzResult);
		//放入返回数据
		return map;
	}
	/**
	 * 
	* @Title: AddLeaseOrder
	* @Description: TODO 
	* @param hsRequest
	* @param hsResponse
	* @return 
	* Map<String,Object>  
	* @throws
	 */
	@RequestMapping(value="/AddLeaseOrder", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> AddLeaseOrder(HttpServletRequest hsRequest,
			HttpServletResponse hsResponse,
			@RequestBody LeaseModel leaseModel){
		//初始化map zhzResult
		map = new HashMap<String, Object>();
		reMap = new HashMap<String, Object>();
		zhzResult = new ZHZResult();
		infoResult = new InfoResult();
		//数据库读取发布信息 是否完成
		System.err.println(leaseModel.getStart_time());
		System.err.println(leaseModel.getEnd_time());
		if(leaseModel.getStart_time().equals(" ")|| leaseModel.getStart_time().equals("") || leaseModel.getStart_time() == null) {
			leaseModel.setStart_time(TimeUtils.getDate());
			leaseModel.setEnd_time(TimeUtils.getDate());
		}
		tLeaseModel = new TLeaseModel();
		String Old = tLeaseServiceImpl.selectN();
		String New = ZHZUtils.AutoNoTLease(Old);
		tGoodsModel = new TGoodsModel();
		tGoodsModel.setGoods_no(leaseModel.getGoods_no());
		tModel = new TGoodsModel();
		tModel = tGoodsServiceImpl.selectTByGNO(tGoodsModel);
		//获取session id
		hSession = hsRequest.getSession();
		ssid = hSession.getId();
		//获取username
		String userName = ZHZUtils.giacc(ssid);
		//获取登录用户 基本信息
		tAccountModel = new TAccountModel();
		tUserModel = new TUserModel();
		tUserModel.setAccount(userName);
		String userNo = tUserServiceImpl.selectByAC(tUserModel);
		//时间
		//int hour = leaseModel.getStart_time() - leaseModel.getEnd_time();
		int hour = 2;
		//单价
		Double amount = 2.00;
		tLeaseModel.setOrder_state(0);
		tLeaseModel.setUpdate_time(TimeUtils.getDate(leaseModel.getStart_time()));
		tLeaseModel.setCreate_time(TimeUtils.getDate(leaseModel.getStart_time()));
		tLeaseModel.setOrder_start_time(TimeUtils.getDate(leaseModel.getStart_time()));
		tLeaseModel.setOrder_end_time(TimeUtils.getDate(leaseModel.getEnd_time()));
		tLeaseModel.setOrder_amount(hour * amount);
		tLeaseModel.setBuyer_no(userNo);
		tLeaseModel.setSale_no(tModel.getAccount_no());
		tLeaseModel.setGoods_no(leaseModel.getGoods_no());
		tLeaseModel.setOrder_no(New);
		
		reMap.put("", "");
		//判断数据是否获取成功
		if(reMap != null) {//放置返回数据
			infoResult.setReMap(reMap);
			infoResult.setCode(ZHZConfig.REQCODE_1024);
			infoResult.setMsg("发布信息获取成功");
			zhzResult.setCode(ZHZConfig.REQCODE_1022);
			zhzResult.setMsg("发布信息获取成功");
		}else {
			infoResult.setCode(ZHZConfig.REQCODE_1023);
			infoResult.setMsg("发布信息获取失败");
			zhzResult.setCode(ZHZConfig.REQCODE_1021);
			zhzResult.setMsg("发布信息获取失败");
		}
		infoResult.setZtime(TimeUtils.getDate());
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("iResult", infoResult);
		map.put("result", zhzResult);
		//放入返回数据
		return map;
	}
	/**
	 * 
	* @Title: ShowRentInfo
	* @Description: TODO 
	* @param hsRequest
	* @param hsResponse
	* @return 
	* Map<String,Object>  
	* @throws
	 */
	@RequestMapping(value="/ShowRentInfo", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> ShowRentInfo(HttpServletRequest hsRequest,
			HttpServletResponse hsResponse){
		//初始化map zhzResult
		map = new HashMap<String, Object>();
		reMap = new HashMap<String, Object>();
		zhzResult = new ZHZResult();
		infoResult = new InfoResult();
		//数据库读取发布信息 是否完成
		
		//判断数据是否获取成功
		if(reMap != null) {//放置返回数据
			infoResult.setReMap(reMap);
			infoResult.setCode(ZHZConfig.REQCODE_1024);
			infoResult.setMsg("发布信息获取成功");
			zhzResult.setCode(ZHZConfig.REQCODE_1022);
			zhzResult.setMsg("发布信息获取成功");
		}else {
			infoResult.setCode(ZHZConfig.REQCODE_1023);
			infoResult.setMsg("发布信息获取失败");
			zhzResult.setCode(ZHZConfig.REQCODE_1021);
			zhzResult.setMsg("发布信息获取失败");
		}
		infoResult.setZtime(TimeUtils.getDate());
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("iResult", infoResult);
		map.put("result", zhzResult);
		//放入返回数据
		return map;
	}
	/**
	 * 
	* @Title: ShowRentOrderInfo
	* @Description: TODO 
	* @param hsRequest
	* @param hsResponse
	* @return 
	* Map<String,Object>  
	* @throws
	 */
	@RequestMapping(value="/ShowRentOrderInfo", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> ShowRentOrderInfo(HttpServletRequest hsRequest,
			HttpServletResponse hsResponse,@RequestBody RentOrderModel RentOrderModel){
		//初始化map zhzResult
		map = new HashMap<String, Object>();
		reMap = new HashMap<String, Object>();
		zhzResult = new ZHZResult();
		infoResult = new InfoResult();
		//获取订单信息
		//获取session id
		hSession = hsRequest.getSession();
		ssid = hSession.getId();
		//获取username
		String userName = ZHZUtils.giacc(ssid);
		//获取登录用户 基本信息
		tAccountModel = new TAccountModel();
		tUserModel = new TUserModel();
		tUserModel.setAccount(userName);
		String userNo = tUserServiceImpl.selectByAC(tUserModel);
		
		paginationModel = new PaginationModel();
		paginationModel.setPageSize(5);
		paginationModel.setStartPage(0);
		paginationModel.setStart_time(RentOrderModel.getS_time());
		paginationModel.setEnd_time(RentOrderModel.getE_time());
		
		Integer state = RentOrderModel.getS_type();
		
		if(state < 0) {
			state = null;
		}
		//vLeaseModel;
		vLeaseList = tLeaseServiceImpl.selectPaginationListT(userNo, state, paginationModel);
		reMap.put("leaseList", vLeaseList);
		//判断数据是否获取成功
		if(reMap != null) {//放置返回数据
			infoResult.setReMap(reMap);
			infoResult.setCode(ZHZConfig.REQCODE_1024);
			infoResult.setMsg("出租订单信息获取成功");
			zhzResult.setCode(ZHZConfig.REQCODE_1022);
			zhzResult.setMsg("出租订单信息获取成功");
		}else {
			infoResult.setCode(ZHZConfig.REQCODE_1023);
			infoResult.setMsg("出租订单信息获取失败");
			zhzResult.setCode(ZHZConfig.REQCODE_1021);
			zhzResult.setMsg("出租订单信息获取失败");
		}
		infoResult.setZtime(TimeUtils.getDate());
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("iResult", infoResult);
		map.put("result", zhzResult);
		//放入返回数据
		return map;
	}
	/**
	 * 
	* @Title: AddRentAccessInfo
	* @Description: TODO 
	* @param hsRequest
	* @param hsResponse
	* @return 
	* Map<String,Object>  
	* @throws
	 */
	@RequestMapping(value="/AddLOLRentAccessInfo", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> AddLOLRentAccessInfo(HttpServletRequest hsRequest,
			HttpServletResponse hsResponse,
			@RequestBody LOLRentListModel rentModel){
		//初始化map zhzResult
		map = new HashMap<String, Object>();
		reMap = new HashMap<String, Object>();
		zhzResult = new ZHZResult();
		infoResult = new InfoResult();
		//获取session id
		hSession = hsRequest.getSession();
		ssid = hSession.getId();
		//获取username
		String userName = ZHZUtils.giacc(ssid);
		//获取登录用户 基本信息
		tAccountModel = new TAccountModel();
		tUserModel = new TUserModel();
		tUserModel.setAccount(userName);
		String userNo = tUserServiceImpl.selectByAC(tUserModel);
		//设置出租信息 并添加至数据库
		tGoodsModel = new TGoodsModel();
		tGoodsRentModel = new TGoodsRentModel();
		tGoodsRentMoreLOLModel = new TGoodsRentMoreLOLModel();
		//获取goods_no
		String old_No = tGoodsServiceImpl.selectN();
		String new_No = ZHZUtils.AutoNoTGoods(old_No);
		//设置goods_no
		tGoodsModel.setGoods_no(new_No);
		tGoodsRentModel.setGoods_no(new_No);
		tGoodsRentMoreLOLModel.setGoods_no(new_No);
		//设置tGoodsModel
		tGoodsModel.setAccount_no(userNo);
		tGoodsModel.setGoods_type(ModelConfig.TGOODS_TYPE_0);
		tGoodsModel.setGoods_theme(rentModel.getGoods_theme());
		tGoodsModel.setGoods_content(rentModel.getGoods_content());
		tGoodsModel.setGoods_recomm(ModelConfig.TGOODSRECOMM_TYPE_0);
		tGoodsModel.setGoods_status(ModelConfig.TGOODSSTATUS_TYPE_0);
		//tGoodsModel.setCreate_time(new Date());
		//tGoodsModel.setUpdate_time(new Date());
		//设置tGoodsRentModel
		tGoodsRentModel.setGoods_game_no(rentModel.getGoods_game());
		tGoodsRentModel.setGoods_hour(DecimalUtils.ChangeDS(rentModel.getGoods_hour(),2));
		tGoodsRentModel.setGoods_night(DecimalUtils.ChangeDS(rentModel.getGoods_night(),2));
		tGoodsRentModel.setGoods_day(DecimalUtils.ChangeDS(rentModel.getGoods_day(), 2));
		tGoodsRentModel.setGoods_week(DecimalUtils.ChangeDS(rentModel.getGoods_week(), 2));
		tGoodsRentModel.setGoods_month(0.00);
		tGoodsRentModel.setGoods_year(0.00);
		tGoodsRentModel.setGoods_access(rentModel.getGoods_access());
		tGoodsRentModel.setGoods_password(rentModel.getGoods_password());
		tGoodsRentModel.setGoods_logon_style(rentModel.getGoods_logon_style());
		tGoodsRentModel.setGoods_compensate(rentModel.getGoods_compensate());
		tGoodsRentModel.setGoods_beforehand(rentModel.getGoods_beforehand());
		tGoodsRentModel.setGoods_delay(rentModel.getGoods_delay());
		tGoodsRentModel.setGoods_short_time(rentModel.getGoods_short_time());
		tGoodsRentModel.setGoods_credit_level(rentModel.getGoods_credit_level());
		tGoodsRentModel.setGoods_rent_count(0);
		tGoodsRentModel.setGoods_recomm_count(0);
		tGoodsRentModel.setGoods_complaint_count(0);
		//设置tGoodsRentMoreLOLModel
		tGoodsRentMoreLOLModel.setGoods_lol_role(rentModel.getGoods_lol_role());
		tGoodsRentMoreLOLModel.setGoods_lol_area(rentModel.getGoods_lol_area());
		tGoodsRentMoreLOLModel.setGoods_lol_server(rentModel.getGoods_lol_server());
		tGoodsRentMoreLOLModel.setGoods_lol_grade(rentModel.getGoods_lol_grade());
		tGoodsRentMoreLOLModel.setGoods_lol_rank(rentModel.getGoods_lol_rank());
		tGoodsRentMoreLOLModel.setGoods_lol_case(rentModel.getGoods_lol_case());
		tGoodsRentMoreLOLModel.setGoods_lol_access(rentModel.getGoods_lol_access());
		tGoodsRentMoreLOLModel.setGoods_lol_hero("无");
		tGoodsRentMoreLOLModel.setGoods_lol_skin("无");
		try {//添加一条记录
			tGoodsServiceImpl.insert(tGoodsModel);
			tGoodsRentServiceImpl.insert(tGoodsRentModel);
			tGoodsRentMoreLOLServiceImpl.insert(tGoodsRentMoreLOLModel);
		}catch (Exception e) {//错误执行
			// TODO: handle exception
			reMap = null;
		}
		//判断数据是否获取成功
		if(reMap != null) {//放置返回数据
			infoResult.setReMap(reMap);
			infoResult.setCode(ZHZConfig.REQCODE_1024);
			infoResult.setMsg("发布信息获取成功");
			zhzResult.setCode(ZHZConfig.REQCODE_1022);
			zhzResult.setMsg("发布信息获取成功");
		}else {
			infoResult.setCode(ZHZConfig.REQCODE_1023);
			infoResult.setMsg("发布信息获取失败");
			zhzResult.setCode(ZHZConfig.REQCODE_1021);
			zhzResult.setMsg("发布信息获取失败");
		}
		infoResult.setZtime(TimeUtils.getDate());
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("iResult", infoResult);
		map.put("result", zhzResult);
		//放入返回数据
		return map;
	}
	/**
	 * 
	* @Title: showUserInfo
	* @Description: TODO 
	* @param hsRequest
	* @param hsResponse
	* @return 
	* Map<String,Object>  
	* @throws
	 */
	@RequestMapping(value="/showBasicUserInfo", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> showBasicUserInfo(HttpServletRequest hsRequest,
			HttpServletResponse hsResponse){
		//初始化map zhzResult
		map = new HashMap<String, Object>();
		reMap = new HashMap<String, Object>();
		zhzResult = new ZHZResult();
		infoResult = new InfoResult();
		//获取session id
		hSession = hsRequest.getSession();
		ssid = hSession.getId();
		//获取username
		String userName = ZHZUtils.giacc(ssid);
		//获取登录状态
		reMap.put("userName", userName);
		//获取登录用户 基本信息
		vAccountModel = new VAccountModel();
		tAccountModel = new TAccountModel();
		tUserModel = new TUserModel();
		String userNo = tUserServiceImpl.selectByAC(tUserModel);
		tAccountModel.setAccount_no(userNo);
		vAccountModel = tAccountServiceImpl.selectByN(tAccountModel);
		reMap.put("ubasic", vAccountModel);
		//获取总额
		tInvlaModel = new TInvlaModel();
		tInvlaModel.setAccount_no(userNo);
		//获取收入总额
		tInvlaModel.setOrder_operate_type(ModelConfig.TINVLA_OPERATE_TYPE_1);
		vInvlaModel = tInvlaServiceImpl.selectSumCountByANOT(tInvlaModel);
		reMap.put("SC1", vInvlaModel);
		//获取消费总额
		tInvlaModel.setOrder_operate_type(ModelConfig.TINVLA_OPERATE_TYPE_0);
		vInvlaModel = tInvlaServiceImpl.selectSumCountByANOT(tInvlaModel);
		reMap.put("SC2", vInvlaModel);
		//判断数据是否获取成功
		if(reMap != null) {//放置返回数据
			infoResult.setReMap(reMap);
			infoResult.setCode(ZHZConfig.REQCODE_1024);
			infoResult.setMsg("个人信息获取成功");
			zhzResult.setCode(ZHZConfig.REQCODE_1022);
			zhzResult.setMsg("个人信息获取成功");
		}else {
			infoResult.setCode(ZHZConfig.REQCODE_1023);
			infoResult.setMsg("个人信息获取失败");
			zhzResult.setCode(ZHZConfig.REQCODE_1021);
			zhzResult.setMsg("个人信息获取失败");
		}
		infoResult.setZtime(TimeUtils.getDate());
		zhzResult.setZtime(TimeUtils.getDate());
		map.put("iResult", infoResult);
		map.put("result", zhzResult);
		//放入返回数据
		return map;
	}
}
