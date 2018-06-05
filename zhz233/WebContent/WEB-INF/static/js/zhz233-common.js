/**
 * 属性获取
 */
var token = "";
/**
 * 数据加载
 * @returns
 */
$(document).ready(function() {
	chkusr();
});
//通用属性
var lab_user = $("#lab_user");

var btn_login = $("#btn_login");
var btn_register = $("#btn_register");
btn_login.bind("click",function () {
    $(location).attr('href', "bspg/login");
});
btn_register.bind("click",function () {
    $(location).attr('href', "bspg/register");
});
var llogin = $("#llogin");
//检查登录状态
function chkusr() {
	$.ajax({
        url: "info/showUserInfo",//要请求的服务器url
        data: {},  //参数
        async: true,   //是否为异步请求
        cache: false,  //是否缓存结果
        type: "POST", //请求方式为POST
        dataType: "json",   //服务器返回的数据是什么类型
        beforeSend: function(request) { 
        },
        success: function (data) {
        	var json = eval(data);
            var res = json.result;
            var ires = json.iResult;
            if(res.code == 1022 && ires.code == 1024){//数据获取成功
            	var reMap = ires.reMap;
            		lab_user.text(reMap.lab_user);
            		//llogin.html("");
            		//llogin2.text(reMap.lab_user);
            }else{
            	lab_user.html("<p>数据加载错误...</p>");
            }
        },
        error: function () {
        	//$(location).attr('href', 'bspg/home');
        }
	});
}
var btn_index = $("#btn_index");
btn_index.bind("click",function () {
    $(location).attr('href', "bspg/home");
});
var btn_user = $("#btn_user");
btn_user.bind("click",function () {
    $(location).attr('href', "pspg/home");
});
var btn_services = $("#btn_services");
btn_services.bind("click",function () {
    $(location).attr('href', "bspg/help");
});
var btn_join = $("#btn_join");
btn_join.bind("click",function () {
    $(location).attr('href', "bspg/help");
});

var img_logo = $("#img_logo");
img_logo.bind("click",function () {
    $(location).attr('href', "bspg/home");
});
var search_key = $("#search_key");
search_key.bind("click",function () {
	alert();
});
var btn_search = $("#btn_search");
btn_search.bind("click",function () {
	alert();
});

var btn_home = $("#btn_home");
btn_home.bind("click",function () {
	$(location).attr('href', "bspg/home");
});
var btn_taste = $("#btn_taste");
btn_taste.bind("click",function () {
	$(location).attr('href', "bspg/taste");
});
var btn_deal = $("#btn_deal");
btn_deal.bind("click",function () {
	$(location).attr('href', "bspg/deal");
});
var btn_store = $("#btn_store");
btn_store.bind("click",function () {
	$(location).attr('href', "bspg/store");
});
var btn_download = $("#btn_download");
btn_download.bind("click",function () {
	$(location).attr('href', "bspg/download");
});
var btn_help = $("#btn_help");
btn_help.bind("click",function () {
	$(location).attr('href', "bspg/help");
});