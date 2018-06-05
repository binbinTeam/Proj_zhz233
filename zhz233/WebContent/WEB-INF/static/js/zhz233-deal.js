
/**
 * 参数集合
 */
var SearchModel = {
		search_type : 1,
		search_game : "",
		search_server : "",
		search_key : "",
		search_price_low : 0,
		search_price_high : 9999,
		search_auth : 0,
		sortStyle: 0,
		showStyle: 0,
		startPage: 1,
		pageSize: 8
};
/**

 * 页面加载数据
 * @returns
 */
$(document).ready(function() {
	var searchKey = sessionStorage.getItem("searchKey");
	if(sessionStorage.getItem("searchKey") != null){
		SearchModel.search_key = searchKey;
	}
	getChangeInfo(SearchModel);
});

/**
 * ID
 * @returns
 */
var searchContent = $("#searchContent");
var search_price_1 = $("#search_price_1");
search_price_1.bind("click",function(){
	SearchModel.search_price_low = 0;
	SearchModel.search_price_high = 1;
	ChangeBordorClass2();
	search_price_1.addClass("deal-a-1-1-4-2-1-1-2");
	getChangeInfo(SearchModel);
});
var search_price_2 = $("#search_price_2");
search_price_2.bind("click",function(){
	SearchModel.search_price_low = 1;
	SearchModel.search_price_high = 2;
	ChangeBordorClass2();
	search_price_2.addClass("deal-a-1-1-4-2-1-1-2");
	getChangeInfo(SearchModel);
});
var search_price_3 = $("#search_price_3");
search_price_3.bind("click",function(){
	SearchModel.search_price_low = 2;
	SearchModel.search_price_high = 5;
	ChangeBordorClass2();
	search_price_3.addClass("deal-a-1-1-4-2-1-1-2");
	getChangeInfo(SearchModel);
});
var search_price_4 = $("#search_price_4");
search_price_4.bind("click",function(){
	SearchModel.search_price_low = 5;
	SearchModel.search_price_high = 10;
	ChangeBordorClass2();
	search_price_4.addClass("deal-a-1-1-4-2-1-1-2");
	getChangeInfo(SearchModel);
});
var search_price_5 = $("#search_price_5");
search_price_5.bind("click",function(){
	SearchModel.search_price_low = 10;
	SearchModel.search_price_high = 100;
	ChangeBordorClass2();
	search_price_5.addClass("deal-a-1-1-4-2-1-1-2");
	getChangeInfo(SearchModel);
});
var search_price_6 = $("#search_price_6");
search_price_6.bind("click",function(){
	SearchModel.search_price_low = 100;
	SearchModel.search_price_high = 1000;
	ChangeBordorClass2();
	search_price_6.addClass("deal-a-1-1-4-2-1-1-2");
	getChangeInfo(SearchModel);
});
var search_price_7 = $("#search_price_7");
search_price_7.bind("click",function(){
	SearchModel.search_price_low = 1000;
	SearchModel.search_price_high = 9999;
	ChangeBordorClass2();
	search_price_7.addClass("deal-a-1-1-4-2-1-1-2");
	getChangeInfo(SearchModel);
});
var search_price_8 = $("#search_price_8");
search_price_8.bind("click",function(){
	SearchModel.search_price_low = 0;
	SearchModel.search_price_high = 9999;
	ChangeBordorClass2();
	search_price_8.addClass("deal-a-1-1-4-2-1-1-2");
	getChangeInfo(SearchModel);
});
var search_auth_1 = $("#search_auth_1");
search_auth_1.bind("click",function(){
	SearchModel.search_auth = 1;
	getChangeInfo(SearchModel);
	ChangeBordorClass1();
	search_auth_1.addClass("deal-a-1-1-5-2-1-1-2");
});
var search_auth_2 = $("#search_auth_2");
search_auth_2.bind("click",function(){
	SearchModel.search_auth = 2;
	getChangeInfo(SearchModel);
	ChangeBordorClass1();
	search_auth_2.addClass("deal-a-1-1-5-2-1-1-2");
});
var search_auth_3 = $("#search_auth_3");
search_auth_3.bind("click",function(){
	SearchModel.search_auth = 0;
	getChangeInfo(SearchModel);
	ChangeBordorClass1();
	search_auth_3.addClass("deal-a-1-1-5-2-1-1-2");
});
var sortAuto = $("#sortAuto");
sortAuto.bind("click",function(){
	SearchModel.sortStyle = 0;
	getChangeInfo(SearchModel);
	ChangeDIV();
	sortAuto.find("div").addClass("deal-b-1-1-1-2-1");
});
var sortNumber = $("#sortNumber");
sortNumber.bind("click",function(){
	SearchModel.sortStyle = 1;
	getChangeInfo(SearchModel);
	ChangeDIV();
	sortNumber.find("div").addClass("deal-b-1-1-1-2-1");
});
var sortPrice = $("#sortPrice");
sortPrice.bind("click",function(){
	SearchModel.sortStyle = 2;
	getChangeInfo(SearchModel);
	ChangeDIV();
	sortPrice.find("div").addClass("deal-b-1-1-1-2-1");
});

var goPage =  $("#goPage");
var pageAuto = $("#PageAuto");

var pageA = $("#pageA");
var pageB = $("#pageB");
var pageC = $("#pageC");
var pageD = $("#pageD");
function goPages(temp){
	if(temp == "1"){
		SearchModel.startPage = 1;
	}else if(temp == "-1"){
		if(pageD.text() <= 1){
			SearchModel.startPage = 1;
		}else{
			SearchModel.startPage = pageD.text() - 1;
		}
	}else if(temp == "n"){
		if(goPage.val() >= 1 && goPage.val() <= pageB.text()){
			SearchModel.startPage = goPage.val();
		}else{
			SearchModel.startPage = 1;
		}
	}else if(temp == "+1"){
		var tem = SearchModel.startPage + 1;
		if(tem > pageB.text()){
			;
		}else{
			SearchModel.startPage = SearchModel.startPage + 1;
		}
	}else if(temp == "N"){
		SearchModel.startPage = pageB.text();
	}else{
		SearchModel.startPage = 1;
	}
	getChangeInfo(SearchModel);
}

function ChangeDIV(){
	sortAuto.find("div").removeClass("deal-b-1-1-1-2-1");
	sortNumber.find("div").removeClass("deal-b-1-1-1-2-1");
	sortPrice.find("div").removeClass("deal-b-1-1-1-2-1");
}
function ChangeBordorClass1() {
	search_auth_1.removeClass("deal-a-1-1-5-2-1-1-2");
	search_auth_2.removeClass("deal-a-1-1-5-2-1-1-2");
	search_auth_3.removeClass("deal-a-1-1-5-2-1-1-2");
}
function ChangeBordorClass2() {
	search_price_8.removeClass("deal-a-1-1-4-2-1-1-2");
	search_price_7.removeClass("deal-a-1-1-4-2-1-1-2");
	search_price_6.removeClass("deal-a-1-1-4-2-1-1-2");
	search_price_5.removeClass("deal-a-1-1-4-2-1-1-2");
	search_price_4.removeClass("deal-a-1-1-4-2-1-1-2");
	search_price_3.removeClass("deal-a-1-1-4-2-1-1-2");
	search_price_2.removeClass("deal-a-1-1-4-2-1-1-2");
	search_price_1.removeClass("deal-a-1-1-4-2-1-1-2");
}
var hot_div = $("#hot_div");
var search_type = $("#search_type");
var search_game = $("#search_game");
var search_server = $("#search_server")
var search_key_2 = $("#search_key_2");
search_key_2.change(function(){
	var searchKey = sessionStorage.getItem("searchKey");
	if(sessionStorage.getItem("searchKey") != null){
		sessionStorage.setItem("searchKey",search_key_2.val());
	}
	SearchModel.search_key = search_key_2.val();
});
var search_value = $("#search_value");
search_value.bind("click",function(){
	var temp1 = search_type.find("option:selected").val();
	var temp2 = search_game.find("option:selected").val();
	var temp3 = search_server.find("option:selected").val();
	var temp4 = search_key_2.val();
	if(temp1 >= 0){
		SearchModel.search_type = getType(temp1);
	}
	if(temp2 >= 0){
		SearchModel.search_game = getGame(temp2);
	}
	if(temp3 >= 0){
		SearchModel.search_server = getServer(temp3);
	}
	if(temp4.length >= 0){
		SearchModel.search_key = temp4;
	}
	getChangeInfo(SearchModel);
});
function getType(temp){
	return ++temp;
	/*if(temp == 0){
		return "端游";
	}else if(temp == 1){
		return "手游";
	}else if(temp == 2){
		return "页游";
	}else if(temp == 3){
		return "加速器";
	}else{
		return "";
	}*/
}
function getGame(temp){
	if(temp == 0){
		return "英雄联盟";
	}else if(temp == 1){
		return "绝地求生";
	}else{
		return "";
	}
}
function getServer(temp){
	if(temp == 0){
		return "电信";
	}else if(temp == 1){
		return "网通";
	}else{
		return "其他";
	}
}
/**
 * 函数
 * @returns
 */
function showInfo(temp) {
	//alert(temp);
	if(sessionStorage.getItem("showKey") != null){
		sessionStorage.removeItem("showKey");
	}
	sessionStorage.setItem("showKey", temp);
	$(location).attr("href", "bspg/showinfo");
}
function getChangeInfo(temp){
	$.ajax({
		url: "info/showSearchInfo",//要请求的服务器url
        data: JSON.stringify(temp),  //参数
        async: true,   //是否为异步请求
        cache: false,  //是否缓存结果
        type: "POST", //请求方式为POST
        contentType: "application/json",
        dataType: "json",   //服务器返回的数据是什么类型
        beforeSend: function(request) { 
        },
        success: function (data) {
        	var json = eval(data);
            var res = json.result;
            var ires = json.iResult;
            if(res.code == 1022 && ires.code == 1024){//数据获取成功
            	var reMap = ires.reMap;
            	var reList = reMap.goodsList;
            	var reStart = reMap.StartPage;
            	var reCount = reMap.TotalCount;
            	var rePage = reMap.TotalPage;
            	searchContent.html("");
            	if(reList == ""){
            		searchContent.html("<div class='deal-b-1-1-1-2-2'>查询结果为空，请重试...</div>");
            	}else{
            		$.each(reList,function(i,item){
            			searchContent.append("<div class='deal-b-1-1-2-1 float-left' onclick=showInfo('"+item.goods_no+"')>"
            					+ "<div class='deal-b-1-1-2-1-1'>"
            					+ "<img class='img-fluid' src='img/"+getImg(item.games_name)+".png' alt='jdqs.png'>"
            					+ "</div>"
            					+ "<div class='deal-b-1-1-2-1-2'>"
            					+ "<div class='deal-b-1-1-2-1-2-1'>"
            					+ "<div class='deal-b-1-1-2-1-2-1-1 float-left'>"
            					+ "<span>"+item.goods_hour+"元/小时</span>"
            					+ "</div>"
            					+ "<div class='deal-b-1-1-2-1-2-1-2 float-right'>"
            					+ ""+getLevel(item.goods_credit_level)+""
            					+ "</div>"
            					+ "</div>"
            					+ "<div class='deal-b-1-1-2-1-2-2'>"
            					+ "<div class='deal-b-1-1-2-1-2-2-1 float-left'>"
            					+ "押金：<span>"+item.goods_compensate+"</span>元"
            					+ "</div>"
            					+ "<div class='deal-b-1-1-2-1-2-2-2 float-right'>"
            					+ "最低<span>"+item.goods_short_time+"</span>小时"
            					+ "</div>"
            					+ "</div>"
            					+ "<div class='deal-b-1-1-2-1-2-3'>"
            					+ "<div class='deal-b-1-1-2-1-2-3-1'>"
            					+ "<span>[体验租号乐趣]</span>"+item.goods_theme+""
            					+ "</div>"
            					+ "</div>"
            					+ "<div class='deal-b-1-1-2-1-2-4'>"
            					+ ""+gethtml(item.goods_recomm)+""
            					+ "</div>"
            					+ "</div>"
            					+ "</div>");
                	});
            	}
            }
            pageA.text(reCount);
            pageB.text(rePage);
            pageC.text(8);
            pageD.text(reStart);
        },
        error: function () {
        	searchContent.html("<div class='deal-b-1-1-1-2-2'>查询结果为空，请重试...</div>");
        }
	});
}
function gethtml(temp){
	if(temp <= 0) return "<div class='deal-b-1-1-2-1-2-4-1 float-left'><span>个人认证</span></div>";
	else if(temp == 1) return "<div class='deal-b-1-1-2-1-2-4-1 float-left'><span>个人认证</span></div>" +
	"<div class='deal-b-1-1-2-1-2-4-1 float-left'><span>商家认证</span></div>";
	else if(temp == 2) return "<div class='deal-b-1-1-2-1-2-4-1 float-left'><span>个人认证</span></div>" +
	"<div class='deal-b-1-1-2-1-2-4-1 float-left'><span>商家认证</span></div>";
	else if(temp >= 3) return "<div class='deal-b-1-1-2-1-2-4-1 float-left'><span>个人认证</span></div>" +
	"<div class='deal-b-1-1-2-1-2-4-1 float-left'><span>商家认证</span></div>" +
	"<div class='deal-b-1-1-2-1-2-4-1 float-left'><span>特价商品</span></div>";
}
function getLevel(temp){
	if(temp == 0) return "青铜用户";
	else if(temp == 1) return "白银用户";
	else if(temp == 2) return "黄金用户";
	else if(temp == 3) return "钻石用户";
	else if(temp == 4) return "大师用户";
	else if(temp == 5) return "王者用户";
}
function getImg(temp){
	if(temp == "英雄联盟") return "tx_taste_cj_1";//绝地求生
	else return "tx_taste_cj_2";
}
