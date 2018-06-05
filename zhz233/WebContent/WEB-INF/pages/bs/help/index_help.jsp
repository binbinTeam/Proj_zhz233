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
<div class="container-fluid help-a">
    <div class="container ">
        <div class="row help-a-0">
            <div class="help-a-1">
                <div class="help-a-1-1">
                    <div class="help-a-1-1-1">
                        <div class="help-a-1-1-1-1 float-left">
                            <img src="img/hx_help_top_1.png" alt="top_1.png">
                        </div>
                        <div class="help-a-1-1-1-1 float-left">
                            <img src="img/hx_help_top_2.png" alt="top_2.png">
                        </div>
                        <div class="help-a-1-1-1-1 float-left">
                            <img src="img/hx_help_top_3.png" alt="top_3.png">
                        </div>
                        <div class="help-a-1-1-1-1 float-left">
                            <img src="img/hx_help_top_4.png" alt="top_4.png">
                        </div>
                    </div>
                    <div class="help-a-1-1-2">
                        <div class="help-a-1-1-2-1 float-left">
                            <div class="help-a-1-1-2-1-1">
                                <div class="btn help-a-1-1-2-1-1-1" data-toggle="collapse" data-target="#help_q_1">
                                    常见问题
                                </div>
                                <div id="help_q_1" class="collapse in">
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">1 如何在租号站233平台上注册账号</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">2 如何在租号站233平台上发布商品</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">3 如何找回账号密码</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">4 如何在租号站233平台上注册账号</a>
                                    </div>
                                </div>
                                <div class="btn help-a-1-1-2-1-1-1" data-toggle="collapse" data-target="#help_q_2">
                                    新手须知
                                </div>
                                <div id="help_q_2" class="collapse in">
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何在租号站233平台上注册账号</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何在租号站233平台上发布商品</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何找回账号密码</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何在租号站233平台上注册账号</a>
                                    </div>
                                </div>
                                <div class="btn help-a-1-1-2-1-1-1" data-toggle="collapse" data-target="#help_q_3">
                                    买家帮助
                                </div>
                                <div id="help_q_3" class="collapse in">
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何在租号站233平台上注册账号</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何在租号站233平台上发布商品</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何找回账号密码</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何在租号站233平台上注册账号</a>
                                    </div>
                                </div>
                                <div class="btn help-a-1-1-2-1-1-1" data-toggle="collapse" data-target="#help_q_4">
                                    卖家帮助
                                </div>
                                <div id="help_q_4" class="collapse in">
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何在租号站233平台上注册账号</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何在租号站233平台上发布商品</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何找回账号密码</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何在租号站233平台上注册账号</a>
                                    </div>
                                </div>
                                <div class="btn help-a-1-1-2-1-1-1" data-toggle="collapse" data-target="#help_q_5">
                                    账户与资产帮助
                                </div>
                                <div id="help_q_5" class="collapse in">
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何在租号站233平台上注册账号</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何在租号站233平台上发布商品</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何找回账号密码</a>
                                    </div>
                                    <div class="help-a-1-1-2-1-1-2">
                                        <a href="">如何在租号站233平台上注册账号</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="help-a-1-1-2-2 float-left">
                        <h1>租号站233交易平台租号租赁须知</h1>
							<p>
							1、请确保您的游戏客户端可正常登陆后，再进行租号。
							</p><p>
							2、租号成功后，请使用U号租登号器，通过登录钥匙解锁您的订单并登录游戏。
							</p><p>
							3、请进入租号所在游戏区验证所租账号是否正确（要求必须在账号所在游戏区使用租用账号，如果发现在其它游戏区使用所租账号，租号站233交易平台立即扣除全部租金，并结束订单）。
							</p><p>
							4、租号过程中出现租错号或者租错时间等问题，需在订单进行15分钟内进行投诉，超时将按已使用时间扣除租金（不足半小时以半小时计算）。
							</p><p>
							5、租号过程中出现账号无法登录、账号描述与实际不符等问题，请尽快进行投诉 ，超时将按已使用时间扣除租金（不足半小时以半小时计算）。
							</p><p>
							6、租号站233交易平台上号器拥有自动检测外挂功能，一旦检测到外挂直接予以订单结束并扣除全部租金、其他风险或恶意用户等，订单未满15分钟予以撤单，超过15分钟立即结束并扣除其全部租金，情节严重者直接封号。
                        	</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- show-1 2 -->
<!-- bottom s -->
<div class="container-fluid assist-c">
    <div class="container ">
        <div class="row assist-c-0">
            <div class="assist-c-1">
                <div class="assist-c-1-1">
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
                <div class="assist-c-1-2">
                    Copyright © 2018-2019 zuhaozhan233.com版权所有 ICP证：渝B1-20110004-10(重庆XXXX网络科技股份有限公司) 渝网文[2018]2034-030号
                    <img class="img-fluid" src="img/sy_public_wpolic.gif" alt="">渝公网安备 31010202010327号
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
<script type="text/javascript" src="js/zhz233-help.js"></script>
</html>