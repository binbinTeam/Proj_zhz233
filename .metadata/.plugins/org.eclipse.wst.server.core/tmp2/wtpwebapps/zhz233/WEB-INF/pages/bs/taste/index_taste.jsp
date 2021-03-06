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
<div class="container-fluid taste-a">
    <div class="container ">
        <div class="row taste-a-0">
            <div class="taste-a-1">
                <div class="taste-a-1-1">
                    <div class="taste-a-1-1-1 float-left">
                        <div class="taste-a-1-1-1-1">
                            <div class="taste-a-1-1-1-1-1">
                                |<span>立即体验</span>
                            </div>
                        </div>
                        <div class="taste-a-1-1-1-2">
                            <img class="img-fluid" src="img/tx_taste_game_1.png" alt="game_1.png">
                        </div>
                    </div>
                    <div class="taste-a-1-1-2 float-left">
                        <div class="taste-a-1-1-2-0"></div>
                        <div class="taste-a-1-1-2-1" id="taste_1">
                            
                        </div>
                        <div class="taste-a-1-1-2-1" id="taste_2">
                            
                        </div>
                        <div class="taste-a-1-1-2-1"  id="taste_3">
                            
                        </div>
                        <div class="taste-a-1-1-2-1" id="taste_4">
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- show-1 e -->
<!-- show-2 s -->
<div class="container-fluid taste-b">
    <div class="container ">
        <div class="row taste-b-0">
            <div class="taste-b-1">
                <div class="taste-b-1-1">
                    <div class="taste-b-1-1-1">
                        <div class="taste-b-1-1-1-1">
                            <img class="img-fluid" src="img/tx_taste_game_2.png" alt="game_2.png">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- show-2 e -->
<!-- show-3 s -->
<div class="container-fluid taste-c">
    <div class="container ">
        <div class="row taste-c-0">
            <div class="taste-c-1" id="tastecontent">
                
            </div>
        </div>
    </div>
</div>
<!-- show-3 e -->
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
<!-- zhz233-home.js 核心库-->
<script type="text/javascript" src="js/zhz233-taste.js"></script>
</html>