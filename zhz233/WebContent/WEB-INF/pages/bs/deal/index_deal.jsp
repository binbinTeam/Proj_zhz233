<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<base href="<%=basePath%>">
<head>
    <!-- 设置编码 -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- 网页内容描述 -->
    <meta name="description" content="租号站，租号站233，租出好体验租号平台">
    <!-- 网页内容关键字 -->
    <meta name="keywords" content="zuzhaozhan233,租号站233,租号站">
    <!-- 移动端适配 -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=on">
    <!-- 标题 -->
    <title>租号站233|——租出好体验的网站</title>
    <!-- 引入css样式 -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-grid.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-reboot.min.css">
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/zhz233-common.css">
</head>
<body>
<!-- ban s -->
<div class="container-fluid common-a">
    <div class="container ">
        <div class="row common-a-0">
            <div class="common-a-1" id="lab_user">
            	老铁，欢迎访问租号站233交易平台!
            </div>
            <div class="common-a-2">
                <div class="common-a-2-1 float-left"><span class="btn" id="btn_login">安全登录</span></div>
                <div class="common-a-2-1 float-left"><span class="btn" id="btn_register">免费注册</span></div>
            </div>
            <div class="common-a-3"></div>
            <div class="common-a-4 float-right">
                <div class="common-a-4-1 float-left"><span class="btn" id="btn_index"><span class="fa fa-home common-a-4-2"></span>首页</span></div>
                <div class="common-a-4-1 float-left"><span class="btn" id="btn_user"><span class="fa fa-heart common-a-4-2"></span>个人中心</span></div>
                <div class="common-a-4-1 float-left"><span class="btn" id="btn_services"><span class="fa fa-star common-a-4-2"></span>客服中心</span></div>
                <div class="common-a-4-1 float-left"><span class="btn" id="btn_join"><span class="fa fa-group common-a-4-2"></span>加入我们</span></div>
            </div>
        </div>
    </div>
</div>
<!-- ban e -->
<!-- logo s -->
<div class="container-fluid common-b">
    <div class="container ">
        <div class="row common-b-0">
            <div class="common-b-1 float-right" id="img_logo"><img class="img-fluid" src="img/sy_public_logo.gif" alt="logo.gif"></div>
            <div class="common-b-2 float-right"></div>
            <div class="common-b-3 float-right">
                <div class="input-group common-b-3-1">
                    <lable class="btn input-group-append common-b-3-2"><span class="fa fa-search"></span></lable>
                    <input class="form-control" type="text" placeholder="请输入关键字" id="search_key">
                    <button class="btn input-group-append common-b-3-3" id="btn_search">搜索</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- logo e -->
<!-- nav s -->
<div class="container-fluid common-c">
    <div class="container ">
        <div class="row common-c-0">
            <div class="btn common-c-0-1 common-c-1 common-c-1-1 float-right" id="btn_home">租号站<span class="fa fa-smile-o"></span></div>
            <div class="btn common-c-0-2 common-c-2 float-right" id="btn_taste">体验中心</div>
            <div class="btn common-c-0-2 common-c-2 float-right" id="btn_deal">交易中心</div>
            <div class="btn common-c-0-2 common-c-2 float-right" id="btn_store">商户入驻</div>
            <div class="btn common-c-0-2 common-c-2 float-right" id="btn_download">下载上号器</div>
            <div class="btn common-c-0-2 common-c-2 float-right common-c-1-1" id="btn_help">帮助中心</div>
        </div>
    </div>
</div>
<!-- nav e -->
<!-- show-1 s -->
<div class="container-fluid deal-a">
    <div class="container ">
        <div class="row deal-a-0">
            <div class="deal-a-1">
                <div class="deal-a-1-1">
                    <div class="deal-a-1-1-1">
                        <div class="deal-a-1-1-1-1">
                            <div class="deal-a-1-1-1-1-1 float-left">
                                体验租号乐趣
                            </div>
                        </div>
                    </div>
                    <div class="deal-a-1-1-2">
                        <div class="deal-a-1-1-2-1 float-left">
                            <span>热门推荐</span>
                        </div>
                        <div class="deal-a-1-1-2-2 float-left" id="hot_div">
                            <div class="btn deal-a-1-1-2-2-1 float-left">绝地求生</div>
                            <div class="btn deal-a-1-1-2-2-2 float-left">英雄联盟</div>
                        </div>
                    </div>
                    <div class="deal-a-1-1-3">
                        <div class="deal-a-1-1-3-1 float-left">
                            <span>选择游戏</span>
                        </div>
                        <div class="deal-a-1-1-3-2 float-left">
                            <select class="custom-select deal-a-1-1-3-2-1 float-left" id="search_type">
                                <option value="-1" selected>请选择游戏类型</option>
                                <option value="0">端游</option>
                                <option value="1">页游</option>
                                <option value="2">手游</option>
                                <option value="3">加速器</option>
                            </select>
                            <select class="custom-select deal-a-1-1-3-2-1 float-left" id="search_game">
                                <option value="-1" selected>请选择游戏名称</option>
                                <option value="0">英雄联盟</option>
                                <option value="1">绝地求生</option>
                            </select>
                            <select class="custom-select deal-a-1-1-3-2-1 float-left" id="search_server">
                                <option value="-1" selected>请选择服务器</option>
                                <option value="0">电信</option>
                                <option value="1">网通</option>
                                <option value="2">其他</option>
                            </select>
                            <!-- <div class="input-group deal-a-1-1-3-2-2 float-left">
                                <input class="form-control" type="text" placeholder="请输入大区" id="search_server">
                            </div> -->
                            <div class="input-group deal-a-1-1-3-2-2 float-left">
                                <input class="form-control" type="text" placeholder="请输入关键字" id="search_key_2">
                                <button class="btn input-group-append" id="search_value">搜索</button>
                            </div>
                        </div>
                    </div>
                    <div class="deal-a-1-1-4">
                        <div class="deal-a-1-1-4-1 float-left">
                            <span>价格范围</span>
                        </div>
                        <div class="deal-a-1-1-4-2 float-left">
                            <div class="deal-a-1-1-4-2-1" id="search_price">
                                <div class="deal-a-1-1-4-2-1-1 float-left" id="search_price_1">1元内</div>
                                <div class="deal-a-1-1-4-2-1-1 float-left" id="search_price_2">2元内</div>
                                <div class="deal-a-1-1-4-2-1-1 float-left" id="search_price_3">5元内</div>
                                <div class="deal-a-1-1-4-2-1-1 float-left" id="search_price_4">10元内</div>
                                <div class="deal-a-1-1-4-2-1-1 float-left" id="search_price_5">100元内</div>
                                <div class="deal-a-1-1-4-2-1-1 float-left" id="search_price_6">1000元内</div>
                                <div class="deal-a-1-1-4-2-1-1 float-left" id="search_price_7">大于1000元</div>
                                <div class="deal-a-1-1-4-2-1-1 float-left" id="search_price_8">清除范围</div>
                            </div>
                        </div>
                    </div>
                    <div class="deal-a-1-1-5">
                        <div class="deal-a-1-1-5-1 float-left">
                            <span>安全认证</span>
                        </div>
                        <div class="deal-a-1-1-5-2 float-left">
                            <div class="deal-a-1-1-5-2-1">
                            	<!-- <div class="deal-a-1-1-5-2-1-1 float-left"  id="search_auth_0">普通认证</div> -->
                                <div class="deal-a-1-1-5-2-1-1 float-left"  id="search_auth_1">个人认证</div>
                                <div class="deal-a-1-1-5-2-1-1 float-left"  id="search_auth_2">商家认证</div>
                                <div class="deal-a-1-1-5-2-1-1 float-left"  id="search_auth_3">清除</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- show-1 e -->
<!-- show-2 s -->
<div class="container-fluid deal-b">
    <div class="container ">
        <div class="row deal-b-0">
            <div class="deal-b-1">
                <div class="deal-b-1-1">
                    <div class="deal-b-1-1-1 float-left">
                        <div class="deal-b-1-1-1-2 float-left"  id="sortAuto">
                            <div class="deal-b-1-1-1-2-1">综合排序</div>
                        </div>
                        <div class="deal-b-1-1-1-2 float-left" id="sortNumber">
                            <div>信用排序</div>
                        </div>
                        <div class="deal-b-1-1-1-2 float-left" id="sortPrice">
                            <div>价格排序</div>
                        </div>
                        <div class="deal-b-1-1-1-3 float-right">
                            <div class="deal-b-1-1-1-3-1">
                               <!--  <img src="img/doit_2.png" alt=""> -->
                            </div>
                        </div>
                    </div>
                    <div class="deal-b-1-1-2 float-left" id="searchContent">
                        
                    </div>
                    <div class="deal-b-1-1-3 float-left">
                     <div class="deal-b-1-1-3-1">
                     	<span onclick="goPages('1')">首页</span>
                     	<span onclick="goPages('-1')">上一页</span>
                     	第<input id="goPage">页
                     	<span onclick="goPages('n')">立即前往</span>
	                    <span onclick="goPages('+1')">下一页</span>
	                    <span onclick="goPages('N')">尾页</span>
                     </div>
                     <div class="deal-b-1-1-3-2" id="pageAuto">
                     	<div class="float-right">总记录数：[<span id="pageA">10</span>]条记录</div>
                     	<div class="float-right">总页数:[<span id="pageB">2</span>]页 </div>
                     	<div class="float-right">每页显示：[<span id="pageC">8</span>]条记录 </div>
                     	<div class="float-right">当前页：第[<span id="pageD">1</span>]页 </div>
                     	 
                     </div>
                        <!-- <img src="img/doit_1.png" alt=""> -->
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- show-2 e -->
<!-- bottom s -->
<div class="container-fluid common-i">
    <div class="container ">
        <div class="row common-i-0">
            <div class="common-i-1">
                <div class="common-i-1-1 float-left">
                    <img class="img-fluid" src="img/sy_public_boom.png" alt="boom.gif">
                </div>
                <div class="common-i-1-2 float-left">
                    <div class="common-i-1-2-1">
                        <div class="common-i-1-2-1-1">
                            <div class="common-i-1-2-1-1-1 float-right"><img src="img/sy_public_bottom_3.png" alt="bottom_3.png"><span>权威认证 安全可靠</span></div>
                            <div class="common-i-1-2-1-1-1 float-right"><img src="img/sy_public_bottom_2.png" alt="bottom_2.png"><span>每天9：00-次日2：00专属客服</span></div>
                            <div class="common-i-1-2-1-1-1 float-right"><img src="img/sy_public_bottom_1.png" alt="bottom_1.png"><span>省心交易</span> 快捷上号</div>
                        </div>
                        <div class="common-i-1-2-1-2">
                            <div class="common-i-1-2-1-2-1 float-right">
                                <div class="common-i-1-2-1-2-1-1">
                                    <span>客服电话</span><br>023-21321321
                                </div>
                                <div class="common-i-1-2-1-2-1-1">
                                    <span>客服微信</span><br>02321321321
                                </div>
                                <div class="common-i-1-2-1-2-1-1">
                                    <span>客服QQ</span><br>0221321321
                                </div>
                            </div>
                            <div class="common-i-1-2-1-2-2 float-right">
                                <div class="common-i-1-2-1-2-2-1 float-right">
                                    <span>关于租号</span><br>
                                    <a href="#">招贤纳士</a><br>
                                    <a href="#">免责声明</a><br>
                                    <a href="#">联系我们</a><br>
                                    <a href="#">租号玩流程</a>
                                </div>
                                <div class="common-i-1-2-1-2-2-1 float-right">
                                    <span>安全中心</span><br>
                                    <a href="#">租号安全</a><br>
                                    <a href="#">买号安全</a><br>
                                    <a href="#">资金安全</a><br>
                                    <a href="#">数据和信息</a></div>
                                <div class="common-i-1-2-1-2-2-1 float-right">
                                    <span>新手帮助</span><br>
                                    <a href="#">新手必读</a><br>
                                    <a href="#">注册认证</a><br>
                                    <a href="#">如何发布商品</a><br>
                                    <a href="#">如何寻找代练</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="common-i-1-2-2">
                        <div class="common-i-1-2-2-1">
                            <div class="common-i-1-2-2-1-1">
                                <span>友情链接：</span>
                                <a href="#">游戏交易平台</a>
                                <a href="#">王者荣耀代练</a>
                                <a href="#">海豹加速器</a>
                                <a href="#">电竞饰品交易平台</a>
                                <a href="#">新星饰品交易</a>
                                <a href="#">交易代练通</a>
                                <a href="#">游戏币交易平台</a>
                                <a href="#">淘宝交易平台</a>
                            </div>
                            <div class="common-i-1-2-2-1-2">
                                Copyright © 2018-2019 zuhaozhan233.com版权所有 ICP证：渝B1-20110004-10(重庆XXXX网络科技股份有限公司) 渝网文[2018]2034-030号
                                <img class="img-fluid" src="img/sy_public_wpolic.gif" alt="">渝公网安备 31010202010327号
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- bottom e -->
</body>
<!-- jquery-3.2.1.min.js 引入JQ -->
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<!-- bootstrap.bundle.min.js 用于弹窗、提示、下拉菜单 -->
<script type="text/javascript" src="js/bootstrap.bundle.min.js"></script>
<!-- bootstrap.min.js 核心库-->
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<!-- zhz233-common.js 核心库-->
<script type="text/javascript" src="js/zhz233-common.js"></script>
<!-- js/zhz233-deal.js 核心库-->
<script type="text/javascript" src="js/zhz233-deal.js"></script>

</html>