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
<!-- top s -->
<div class="container-fluid assist-a">
    <div class="container ">
        <div class="row assist-a-0">
            <div class="assist-a-1">
                <div class="assist-a-1-1 float-left">
                    <img src="img/bs_assist_logo.png" alt="logo.png">
                </div>
                <div class="assist-a-1-2 float-left"></div>
                <div class="assist-a-1-3 float-right">
                    <a href="bspg/home">首页</a>
                    <a href="bspg/help">帮助中心</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- top e -->
<!-- img s -->
<div class="container-fluid">
    <div class="assist-img">
        <img class="img-fluid" src="img/bs_assist_bg_2.gif" alt="bg_1.gif">
    </div>
</div>
<!-- img e -->
<!-- register s -->
<div class="container-fluid assist-d">
    <div class="container ">
        <div class="row assist-d-0">
            <div class="assist-d-1">
                <div class="assist-d-1-1">
                    <div class="assist-d-1-1-1">
                        <div class="assist-d-1-1-1-1">
                            <div class="assist-d-1-1-1-1-1 float-left">
                                <span>注册</span>
                            </div>
                            <div class="assist-d-1-1-1-1-2 float-right">
                                已有账号，<a href="bspg/login">去登录</a>
                            </div>
                        </div>
                    </div>
                    <div class="assist-d-1-1-2">
                        <div class="assist-d-1-1-2-1">
                            <div class="assist-d-1-1-2-1-0">
                                <div class="assist-d-1-1-2-1-1-tip">
                                    <!-- 提示 -->
                                    <span id="user_name_tip"></span>
                                </div>
                                <div class="input-group assist-d-1-1-2-1-1">
                                    <lable class="btn input-group-append"><span class="fa fa-user-o"></span></lable>
                                    <input class="form-control" type="text" placeholder="请输入用户名" id="user_name" maxlength="12">
                                </div>
                            </div>
                            <div class="assist-d-1-1-2-1-0">
                                <div class="assist-d-1-1-2-1-1-tip">
                                    <!-- 提示 -->
                                    <span id="user_phone_tip"></span>
                                </div>
                                <div class="input-group assist-d-1-1-2-1-1">
                                    <lable class="btn input-group-append"><span class="fa fa-mobile-phone"></span></lable>
                                    <input class="form-control" type="phone" placeholder="请输入手机号" id="user_phone" maxlength="11">
                                </div>
                            </div>
                            <div class="assist-d-1-1-2-1-0">
                                <div class="assist-d-1-1-2-1-1-tip">
                                    <!-- 提示 -->
                                    <span id="user_cod_tip"></span>
                                </div>
                                <div class="input-group assist-d-1-1-2-1-1">
                                    <lable class="btn input-group-append"><span class="fa fa-code"></span></lable>
                                    <input class="form-control assist-d-1-1-2-1-1-1" type="text" placeholder="手机验证码" id="user_cod" maxlength="6">
                                    <button class="btn input-group-append assist-d-1-1-2-1-1-2" id="btn_cod">获取短信验证码</button>
                                </div>
                            </div>
                            <div class="assist-d-1-1-2-1-0">
                                <div class="assist-d-1-1-2-1-1-tip">
                                    <!-- 提示 -->
                                    <span id="user_pwd_tip"></span>
                                </div>
                                <div class="input-group assist-d-1-1-2-1-1">
                                    <lable class="btn input-group-append"><span class="fa fa-unlock-alt"></span></lable>
                                    <input class="form-control" type="password" placeholder="请输入密码" id="user_pwd" maxlength="12">
                                </div>
                            </div>
                            <div class="assist-d-1-1-2-1-0">
                                <div class="assist-d-1-1-2-1-1-tip">
                                    <!-- 提示 -->
                                    <span id="user_pwd_t_tip"></span>
                                </div>
                                <div class="input-group assist-d-1-1-2-1-1">
                                    <lable class="btn input-group-append"><span class="fa fa-lock"></span></lable>
                                    <input class="form-control" type="password" placeholder="再次输入密码" id="user_pwd_t" maxlength="12">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="assist-d-1-1-3">
                        <div class="assist-d-1-1-3-0">
                            <div class="assist-d-1-1-3-0-tip">
                                <!-- 提示 -->
                                <span id="user_cb_tip"></span>
                            </div>
                            <div class="assist-d-1-1-3-1">
                                <div class="input-group assist-d-1-1-3-1-1">
                                    <input class="form-check" type="checkbox" id="user_cb">我已阅读并同意 <a href="help/te1">《租号须知》</a>
                                </div>
                            </div>
                            <div class="btn assist-d-1-1-3-2" id="btn_regist">
                                立即注册
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- register e -->
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
<!-- zhz233-regist.js 核心库-->
<script type="text/javascript" src="js/zhz233-regist.js"></script>
</html>