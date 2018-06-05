$().ready(function() {
});
/**
 *
 * @type {*|jQuery|HTMLElement}
 */
//usr
var user_name = $("#user_name");
var user_name_tip = $("#user_name_tip");

var user_phone = $("#user_phone");
var user_phone_tip = $("#user_phone_tip");

var user_cod = $("#user_cod");
var user_cod_tip = $("#user_cod_tip");
var btn_cod = $("#btn_cod");

var user_pwd = $("#user_pwd");
var user_pwd_tip = $("#user_pwd_tip");

var user_pwd_t = $("#user_pwd_t");
var user_pwd_t_tip = $("#user_pwd_t_tip");

var user_cb = $("#user_cb");
var user_cb_tip = $("#user_cb_tip");

var btn_regist = $("#btn_regist");
//临时变量
var temp0;
var temp1;
var temp2;
var temp3;
var temp4;
var temp5;
/**
 * 组件方法
 */
//用户手机验证码验证
user_cod.bind("focus",function () {
    user_cod_tip.text("请输入手机验证码！");
    user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-5");
});
user_cod.bind("blur",function () {
    temp0 = user_cod.val().trim().toString();
    checkUsrCod(temp0);
});
//用户名验证
user_name.bind("focus",function () {
    user_name_tip.text("请输入(8~12位长度)用户名！");
    user_name_tip.attr("class","assist-d-1-1-2-1-1-tip-5");
});
user_name.bind("blur",function () {
    temp0 = user_name.val().trim().toString();
    checkUsr(temp0);
});
//用户手机验证
user_phone.bind("focus",function () {
    user_phone_tip.text("请输入(11位长度)手机号！");
    user_phone_tip.attr("class","assist-d-1-1-2-1-1-tip-5");
});
user_phone.bind("blur",function () {
    temp0 = user_phone.val().trim().toString();
    checkPho(temp0);
});
//用户密码验证
user_pwd.bind("focus",function () {
    user_pwd_tip.text("请输入(6~12位长度)密码！");
    user_pwd_tip.attr("class","assist-d-1-1-2-1-1-tip-5");
});
user_pwd_t.bind("focus",function () {
    user_pwd_t_tip.text("请再次输入(6~12位长度)密码！");
    user_pwd_t_tip.attr("class","assist-d-1-1-2-1-1-tip-5");
});
//密码验证
user_pwd.bind("blur",function () {
    temp0 = user_pwd.val().trim().toString();
    temp1 = user_pwd_t.val().trim().toString();
    checkPwd(temp0,temp1);
});
user_pwd_t.bind("blur",function () {
    temp0 = user_pwd.val().trim().toString();
    temp1 = user_pwd_t.val().trim().toString();
    checkPwd(temp0,temp1);
});
user_cb.bind("blur",function () {
    user_cb_tip.text("请阅读并同意用户协议！");
    user_cb_tip.attr("class","assist-d-1-1-2-1-1-tip-5");
    temp0 = user_cb;
    checkCBox(user_cb);
});
btn_cod.bind("click",function () {
    //ajax 获取验证码
	temp0 = user_phone.val().trim().toString();
	temp1 = user_cod.val().trim().toString();
    getCode(temp0);
});
//getcode
function getCode(temp0){
	$.ajax({
        url: "lsfo/giucod",//要请求的服务器url
        data: {upho:temp0},  //参数
        async: true,   //是否为异步请求
        cache: false,  //是否缓存结果
        type: "POST", //请求方式为POST
        dataType: "json",   //服务器返回的数据是什么类型
        beforeSend: function(request) { 
        },
        success: function (data) {
        	var json = eval(data);
            var res = json.result;
            if(res.code == 1010){
            	user_cod_tip.text(res.msg);
            	user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-4");
            }else if(res.code == 1011){
            	user_cod_tip.text(res.msg);
            	user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
            }else if(res.code == 1009){
            	user_cod_tip.text(res.msg);
            	user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-2");
            }else{
            	user_cod_tip.text(res.msg);
            	user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
            }
        },
        error: function () {
        	user_phone_tip.text(res.msg);
        	user_phone_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
        }
	});
}
btn_regist.bind("click",function () {
    temp0 = user_name.val().trim().toString();
    temp1 = user_phone.val().trim().toString();
    temp2 = user_cod.val().trim().toString();
    temp3 = user_pwd.val().trim().toString();
    temp4 = user_pwd_t.val().trim().toString();
    temp5 = user_cb;
    checkUPCPB(temp0,temp1,temp2,temp3,temp4,temp5);
});
//用户申明
function checkUPCPB(temp0,temp1,temp2,temp3,temp4,temp5,temp6){
    var temp7 = temp0;var temp8 = temp1;var temp9 = temp2;var temp10 = temp3;
    var temp11 = temp4;var temp12 = temp5;
    checkCBox(temp12);
    if(temp12.is(":checked")){
    	checkUserInfo(temp7,temp8,temp9,temp10);
    }
}
//注册 用户信息
function checkUserInfo(temp0,temp1,temp2,temp3) {
	$.ajax({
        url: "lsfo/regist",//要请求的服务器url
        data: {uacc:temp0,upho:temp1,ucod:temp2,upwd:temp3},  //参数
        async: true,   //是否为异步请求
        cache: false,  //是否缓存结果
        type: "POST", //请求方式为POST
        dataType: "json",   //服务器返回的数据是什么类型
        beforeSend: function(request) { 
        },
        success: function (data) {
        	var json = eval(data);
            var res = json.result;
            if(res.code == 1016){
            	$(location).attr('href', 'pspg/home');
            }else if(res.code == 1015){            	
            	user_name.text("");
            	user_name_tip.text("大佬，请重试！");
            	user_name_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
            	user_name.focus();            	
            	user_phone.text("");
            	user_cod.text("");
            	user_pwd.text("");
            	user_pwd_t.text("");            	
            	user_phone_tip.text("");
            	user_cod_tip.text("");
            	user_pwd_tip.text("");
            	user_pwd_t_tip.text("");
            }else if(res.code == 1013 || res.code == 1012){
            	user_cod.focus();
            	user_cod_tip.text(res.msg);
            	user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-3");            	
            }else if(res.code == 1007){
            	user_phone.focus();
            	user_cod_tip.text(res.msg);
            	user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
            }else if(res.code == 1000){
            	user_name.focus();
            	user_name_tip.text(res.msg);
            	user_name_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
            }else if(res.code == 2008){
            	user_pwd_t.focus();
            	user_pwd.focus();
            	user_cod.focus();
            	user_phone.focus();
            	user_name.focus();
            }else{
            	user_name.text("");
            	user_name_tip.text("大佬，请重试！");
            	user_name_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
            	user_name.focus();            	
            	user_phone.text("");
            	user_cod.text("");
            	user_pwd.text("");
            	user_pwd_t.text("");
            	user_phone_tip.text("");
            	user_cod_tip.text("");
            	user_pwd_tip.text("");
            	user_pwd_t_tip.text("");
            }
        },
        error: function () {
        	$(location).attr('href', 'bspg/register');
        }
	});
}
//用户申明
function checkCBox(temp0) {
    var temp1 = temp0;
    if(temp1.is(":checked")){
        user_cb_tip.text("已阅读并同意用户协议！");
        user_cb_tip.attr("class","assist-d-1-1-2-1-1-tip-4");
        return true;
    }else{
        temp1.focus();
        user_cb_tip.text("请阅读并同意用户协议！");
        user_cb_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
        return false;
    }
}
//手机验证码
function checkUsrCod(temp0) {
    var temp1 = temp0;
    var temp2 = checkUsrCodOK(temp1);
    if(temp1.length <= 5){
        user_cod_tip.text("请输入(6位长度)手机验证码！");
        user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-2");
    }else if(!temp2){
        user_cod_tip.text("验证码格式错误！");
        user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
    }else{//对比验证码
		var tem0 = user_phone.val().trim().toString();
	    var tem1 = user_cod.val().trim().toString();
	    checkCode(tem0,tem1);
    }
}
//checkcode
function checkCode(temp0,temp1){
	$.ajax({
        url: "lsfo/ckucod",//要请求的服务器url
        data: {upho:temp0,ucod:temp1},  //参数
        async: true,   //是否为异步请求
        cache: false,  //是否缓存结果
        type: "POST", //请求方式为POST
        dataType: "json",   //服务器返回的数据是什么类型
        beforeSend: function(request) { 
        },
        success: function (data) {
        	var json = eval(data);
            var res = json.result;
            if(res.code == 1014){
            	user_cod_tip.text(res.msg);
            	user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-4");
            }else if(res.code == 1013){
            	user_cod_tip.text(res.msg);
            	user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
            }else if(res.code == 1012){
            	user_cod_tip.text(res.msg);
            	user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-2");
            }else{
            	user_cod_tip.text(res.msg);
            	user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
            }
        },
        error: function () {
        	user_cod_tip.text(res.msg);
        	user_cod_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
        }
	});
}
//验证码格式
function checkUsrCodOK(temp0) {
    var str = temp0;
    var uPn = /^[0-9a-zA-Z]{6}$/;
    var reg = new RegExp(uPn);
    if (reg.test(str)) {
        return true;
    } else {
        return false;
    }
}
//验证手机号
function checkPho(temp0) {
    var temp1 = temp0;
    var temp2 = checkPhoOK(temp1);
    if(temp1.length <= 10){
        user_phone_tip.text("请输入(11位长度)手机号！");
        user_phone_tip.attr("class","assist-d-1-1-2-1-1-tip-2");
    }else if(!temp2){
        user_phone_tip.text("手机号格式错误！");
        user_phone_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
    }else{
    	checkPhone(temp1);
    }
}
//checkphone
function checkPhone(temp0){
	$.ajax({
        url: "lsfo/ckupho",//要请求的服务器url
        data: {upho:temp0},  //参数
        async: true,   //是否为异步请求
        cache: false,  //是否缓存结果
        type: "POST", //请求方式为POST
        dataType: "json",   //服务器返回的数据是什么类型
        beforeSend: function(request) { 
        },
        success: function (data) {
        	var json = eval(data);
            var res = json.result;
            if(res.code == 1008){
            	user_phone_tip.text("可以使用");
            	user_phone_tip.attr("class","assist-d-1-1-2-1-1-tip-4");
            }else if(res.code == 1007){
            	user_phone_tip.text(res.msg+"大佬，请更换！");
            	user_phone_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
            }else {
            	user_phone_tip.text(res.msg);
            	user_phone_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
            }
        },
        error: function () {
        	user_phone_tip.text(res.msg);
        	user_phone_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
        }
	});
}
//验证手机格式
function checkPhoOK(temp0) {
    var str = temp0;
    var uPn = /^[1][3,4,5,7,8][0-9]{9}$/;
    var reg = new RegExp(uPn);
    if (reg.test(str)) {
        return true;
    } else {
        return false;
    }
}
//验证密码
function checkPwd(temp0,temp1) {
    var temp2 = temp0;
    var temp3 = temp1;
    var temp4 = checkPwdOk(temp2);
    var temp5 = checkPwdOk(temp3);
    if(temp2.length <= 5){
        user_pwd_tip.text("请输入(6~12位长度)密码！");
        user_pwd_tip.attr("class","assist-d-1-1-2-1-1-tip-2");
    }else if(temp3.length <= 5){
        user_pwd_t_tip.text("请输入(6~12位长度)密码！");
        user_pwd_t_tip.attr("class","assist-d-1-1-2-1-1-tip-2");
    }else if(!temp4){
        user_pwd_tip.text("密码格式错误！");
        user_pwd_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
    }else if(!temp5){
        user_pwd_t_tip.text("密码格式错误！");
        user_pwd_t_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
    }else if(temp2 == temp3){
        user_pwd_tip.text("密码输入成功");
        user_pwd_tip.attr("class","assist-d-1-1-2-1-1-tip-4");
        user_pwd_t_tip.text("设置密码完成！");
        user_pwd_t_tip.attr("class","assist-d-1-1-2-1-1-tip-4");
    }else{
        user_pwd_t_tip.text("两次输入密码不相同！");
        user_pwd_t_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
        user_pwd_tip.text("请输入(6~12位长度)密码！");
        user_pwd_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
    }
}
//验证密码格式
function checkPwdOk(temp0) {
    var str = temp0;
    var uPn = /^[a-zA-Z0-9_]{6,12}$/;
    var reg = new RegExp(uPn);
    if (reg.test(str)) {
        return true;
    } else {
        return false;
    }
}
//验证用户名
function checkUsr(temp0) {
    var temp1 = temp0;
    var temp2 = checkUsrOk(temp1);
    if(temp1.length <= 7){
        user_name_tip.text("请输入(8~12位长度)用户名！");
        user_name_tip.attr("class","assist-d-1-1-2-1-1-tip-2");
    }else if(!temp2){
        user_name_tip.text("用户名格式错误！");
        user_name_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
    }else { 
    	checkUserName(temp1);    	
    }
}
//验证usr  name
function checkUserName(temp0){//home usr
	$.ajax({
        url: "lsfo/ckuacc",//要请求的服务器url
        data: {uacc:temp0},  //参数
        async: true,   //是否为异步请求
        cache: false,  //是否缓存结果
        type: "POST", //请求方式为POST
        dataType: "json",   //服务器返回的数据是什么类型
        beforeSend: function(request) { 
        },
        success: function (data) {
        	var json = eval(data);
            var res = json.result;
            if(res.code == 1000){
            	user_name_tip.text(res.msg+"大佬，请更换后再试！");
            	user_name_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
            }else if(res.code == 1001){	
            	user_name_tip.text("用户名可用！");
            	user_name_tip.attr("class","assist-d-1-1-2-1-1-tip-4");            	
            }else{
            	user_name_tip.text(res.msg);
            	user_name_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
            }
        },
        error: function () {
        	user_name_tip.text(res.msg);
            user_name_tip.attr("class","assist-d-1-1-2-1-1-tip-3");
        }
	});
}
//验证格式
function checkUsrOk(temp0) {
    var str = temp0;
    var uPn = /^[a-zA-Z0-9_]{8,12}$/;
    var reg = new RegExp(uPn);
    if (reg.test(str)) {
        return true;
    } else {
        return false;
    }
}