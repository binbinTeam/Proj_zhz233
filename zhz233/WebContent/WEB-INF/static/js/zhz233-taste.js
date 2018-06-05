/**
 * 页面加载数据
 * @returns
 */
$(document).ready(function() {
	showAutoTasteInfo();
	showRentTasteInfo();
});
/**
 * 数据盒子
 * @returns
 */
var taste_1 = $("#taste_1");
var taste_2 = $("#taste_2");
var taste_3 = $("#taste_3");
var taste_4 = $("#taste_4");
var tastecontent = $("#tastecontent");
//数据查询
function showSearchInfo(temp){
	//alert(temp);
	if(sessionStorage.getItem("searchKey") != null){
		sessionStorage.removeItem("searchKey");
	}
	sessionStorage.setItem("searchKey", temp);
	$(location).attr('href', 'bspg/deal');
}
function show(temp){
	if(sessionStorage.getItem("showKey") != null){
		sessionStorage.removeItem("showKey");
	}
	sessionStorage.setItem("showKey", temp);
	$(location).attr("href", "bspg/showinfo");
}
function getimg(temp){
	if(temp == "英雄联盟"){
		return "img/tx_taste_cj_1.png";
	}else if(temp == "绝地求生"){
		return "img/tx_taste_cj_2.png";
	}else{
		return "img/tx_taste_cj_1.png";
	}
}
function showRentTasteInfo(){
	$.ajax({
        url: "info/showRentTasteInfo",//要请求的服务器url
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
            if(res.code == 1026 && ires.code == 1028){//数据获取成功
            	var reMap = ires.reMap;
            	tastecontent.html("");
            	$.each(reMap,function(i,item){
            		if(i == "taste_special"){
            			for(var a = 0;a < 2;a++){
            				tastecontent.append("<div class='taste-c-1-1' id='taste_special_"+a+"'></div>");
            			}
            			var taste_special_0 = $("#taste_special_0");
            			var taste_special_1 = $("#taste_special_1");
            			taste_special_0.append("<div class='taste-c-1-1-1 float-left' onclick=show('"+item[0].goods_no+"')>"
                    			+ "<div class='taste-c-1-1-1-1'>"
                    			+ "<img class='img-fluid' src='"+getimg(item[0].games_name)+"' alt='cj_1.png'>"
                    			+ "</div>"
                    			+ "<div class='taste-c-1-1-1-2'>"
                    			+ "<div class='taste-c-1-1-1-2-1 auto-a-0'>"
                    			+ ""+item[0].goods_theme+"<br>"
                    			+ ""+item[0].goods_hour+"元/小时"
                                + "</div>"
                                + "</div>"
                                + "</div>");
            			for(var b = 1;b<5;b++){
            				taste_special_0.append("<div class='taste-c-1-1-2 float-left' onclick=show('"+item[b].goods_no+"')>"
                        			+ "<div class='taste-c-1-1-1-1'>"
                        			+ "<img class='img-fluid' src='"+getimg(item[b].games_name)+"' alt='cj_1.png'>"
                        			+ "</div>"
                        			+ "<div class='taste-c-1-1-1-2'>"
                        			+ "<div class='taste-c-1-1-1-2-1 auto-a-0'>"
                        			+ ""+item[b].goods_theme+"<br>"
                        			+ ""+item[b].goods_hour+"元/小时"
                                    + "</div>"
                                    + "</div>"
                                    + "</div>");
            			}
            			taste_special_1.append("<div class='taste-c-1-1-1 float-left' onclick=show('"+item[5].goods_no+"')>"
                    			+ "<div class='taste-c-1-1-1-1'>"
                    			+ "<img class='img-fluid' src='"+getimg(item[5].games_name)+"' alt='cj_1.png'>"
                    			+ "</div>"
                    			+ "<div class='taste-c-1-1-1-2'>"
                    			+ "<div class='taste-c-1-1-1-2-1 auto-a-0'>"
                    			+ ""+item[5].goods_theme+"<br>"
                    			+ ""+item[5].goods_hour+"元/小时"
                                + "</div>"
                                + "</div>"
                                + "</div>");
            			for(var b = 6;b<10;b++){
            				taste_special_1.append("<div class='taste-c-1-1-2 float-left' onclick=show('"+item[b].goods_no+"')>"
            						+ "<div class='taste-c-1-1-1-1'>"
                        			+ "<img class='img-fluid' src='"+getimg(item[b].games_name)+"' alt='cj_1.png'>"
                        			+ "</div>"
                        			+ "<div class='taste-c-1-1-1-2'>"
                        			+ "<div class='taste-c-1-1-1-2-1 auto-a-0'>"
                        			+ ""+item[b].goods_theme+"<br>"
                        			+ ""+item[b].goods_hour+"元/小时"
                                    + "</div>"
                                    + "</div>"
                                    + "</div>");
            			}
                	}
            	});
            }
        },
        error: function () {
        }
	});
}
//获取列表数据
function showAutoTasteInfo(){
	$.ajax({
        url: "info/showGamesInfo",//要请求的服务器url
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
            if(res.code == 1026 && ires.code == 1028){//数据获取成功
            	var reMap = ires.reMap;
            	$.each(reMap,function(i,item){
            		if(i == "taste_1"){
            			taste_1.html("");
            			taste_1.append("<div class='taste-a-1-1-2-1-1'><span>体验租</span><span>热门游戏</span></div>");
        				$.each(item,function(i,item){
        					if(i == 0){
        						taste_1.append("<div class='btn taste-a-1-1-2-1-2 taste-a-1-1-2-1-2-1' data-toggle='tooltip' title='"+item.games_name+"' onclick=showSearchInfo('"+item.games_name+"')>"+item.games_name+"</div>");
        					}else{
        						taste_1.append("<div class='btn taste-a-1-1-2-1-2' data-toggle='tooltip' title='"+item.games_name+"' onclick=showSearchInfo('"+item.games_name+"')>"+item.games_name+"</div>");
        					}
        				});
        			}else if(i == "taste_2"){
        				taste_2.html("");
        				taste_2.append("<div class='taste-a-1-1-2-1-1'><span>体验租</span><span>端游专区</span></div>");
        				$.each(item,function(i,item){
        					taste_2.append("<div class='btn taste-a-1-1-2-1-3' data-toggle='tooltip' title='"+item.games_name+"' onclick=showSearchInfo('"+item.games_name+"')>"+item.games_name+"</div>");
        				});
        			}else if(i == "taste_3"){
        				taste_3.html("");
        				taste_3.append("<div class='taste-a-1-1-2-1-1'><span>体验租</span><span>手游专区</span></div>");
        				$.each(item,function(i,item){
        					taste_3.append("<div class='btn taste-a-1-1-2-1-3' data-toggle='tooltip' title='"+item.games_name+"' onclick=showSearchInfo('"+item.games_name+"')>"+item.games_name+"</div>");
        				});
        			}else if(i == "taste_4"){
        				taste_4.html("");
        				taste_4.append("<div class='taste-a-1-1-2-1-1'><span>体验租</span><span>页游专区</span></div>");
        				$.each(item,function(i,item){
        					taste_4.append("<div class='btn taste-a-1-1-2-1-3' data-toggle='tooltip' title='"+item.games_name+"' onclick=showSearchInfo('"+item.games_name+"')>"+item.games_name+"</div>");
        				});
        			}else{
        				taste_4.html("<p>数据加载中...</p>");
        			}
            	});
            }
            //加载提示
            $("[data-toggle='tooltip']").tooltip();
        },
        error: function () {
        	//$(location).attr('href', 'bspg/home');
        }
	});
}