/**
 * 准备页面数据
 * @returns
 */
$(document).ready(function() {
	showAutoInfo();
});
/**
 * 属性获取
 */

var btn_search_yxlm = $("#btn_search_yxlm");
btn_search_yxlm.bind("click",function () {
    $(location).attr('href', "bspg/search");
});
var btn_search_blzy = $("#btn_search_blzy");
var btn_search_jdqs = $("#btn_search_jdqs");
var btn_search_sy = $("#btn_search_sy");
var btn_search_dy = $("#btn_search_dy");
var btn_search_yy = $("#btn_search_yy");
var btn_search_all = $("#btn_search_all");

var banner_1 = $("#banner_1");
var banner_2 = $("#banner_2");
var banner_3 = $("#banner_3");
var banner_4 = $("#banner_4");

var btn_login2 = $("#btn_login2");
var btn_register2 = $("#btn_register2");
btn_login2.bind("click",function () {
    $(location).attr('href', "bspg/login");
});
btn_register2.bind("click",function () {
    $(location).attr('href', "bspg/register");
});
var llogin2 = $("#llogin2");
//数据盒子
var notice = $("#notice");
var newbie = $("#newbie");
var upsite = $("#upsite");


var btn_down = $("#btn_down");

var feature_1 = $("#feature_1");
var feature_2 = $("#feature_2");
var feature_3 = $("#feature_3");

var ad = $("#ad");

var news = $("#news");//最新租号信息
var black = $("#black");//最新黑名单信息

//获取列表数据
function showAutoInfo(){
	$.ajax({
        url: "info/showNoticeInfo",//要请求的服务器url
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
            	$.each(reMap,function(i,item){
            		if(i == "notice"){
        				notice.html("");
        				$.each(item,function(i,item){
                			notice.append("<p><a href='bspg/help?n_no="+item.notice_no+"'>【公告】"+item.notice_theme+"</a></p>");
                    	});
        			}else if(i == "newbie"){
            			newbie.html("");
        				$.each(item,function(i,item){
        					newbie.append("<p><a href='bspg/help?n_no="+item.notice_no+"'>【入门须知】"+item.notice_theme+"</a></p>");
                    	});
        			}else if(i == "upsite"){
            			upsite.html("");
        				$.each(item,function(i,item){
        					upsite.append("<p><a href='bspg/help?n_no="+item.notice_no+"'>【网站更新】"+item.notice_theme+"</a></p>");
                    	});
        			}else{//错误数据加载
        				notice.html("<p>数据加载错误...</p>");
        			}
            	});
            }
            //加载数据
            $('#notice_tab li:eq(0) a').tab('show');
        },
        error: function () {
        	//$(location).attr('href', 'bspg/home');
        }
	});
}