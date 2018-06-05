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
<!-- info-a s -->
<div class="container-fluid personal-a">
    <div class="container ">
        <div class="row personal-a-0">
            <div class="personal-a-1">
                <div class="personal-a-1-0"></div>
                <div class="personal-a-1-1">
                    <div class="personal-a-1-1-1 float-left">
                        <div class="personal-a-1-1-1-1">
                            <div class="personal-a-1-1-1-1-1">
                                个人中心
                            </div>
                            <div class="personal-a-1-1-1-1-2" id="psonl_pg1">
                                个人信息管理
                            </div>
                        </div>
                        <div class="personal-a-1-1-1-1">
                            <div class="personal-a-1-1-1-1-1">
                                买家中心
                            </div>
                            <div class="personal-a-1-1-1-1-2" id="psonl_pg4">
                                我的租号订单
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                我的购买订单
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                我的代练订单
                            </div>
                        </div>
                        <div class="personal-a-1-1-1-1">
                            <div class="personal-a-1-1-1-1-1">
                                卖家中心
                            </div>
                            <div class="personal-a-1-1-1-1-2" id="psonl_pg2">
                                发布出租账号
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                出租账号管理
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                出租订单管理
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                发布卖出账号
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                卖出账号管理
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                发布代练账号
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                代练账号管理
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                代练订单管理
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                增值服务管理
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                维权记录管理
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                黑名单管理
                            </div>
                        </div>
                        <div class="personal-a-1-1-1-1">
                            <div class="personal-a-1-1-1-1-1">
                                资金管理
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                充值管理
                            </div>
                            <div class="personal-a-1-1-1-1-2">
                                提现管理
                            </div>
                            <div class="personal-a-1-1-1-1-2" id="psonl_pg3">
                                资金明细
                            </div>
                        </div>
                    </div>
                    <div class="personal-a-1-1-2 float-left" id="psonl_content">
                        <div class="personal-a-1-1-2-1">
                            <div class="personal-a-1-1-2-1-1">
                                <div class="personal-a-1-1-2-1-1-1 float-left">
                                    <span class="fa fa-user"></span>
                                    <!--<img src="" alt="usr.png">-->
                                </div>
                                <div class="personal-a-1-1-2-1-1-2 float-left">
                                    <div class="personal-a-1-1-2-1-1-2-1 auto-a-0"> 欢迎
                                        <span id="usrName"><!-- binbin2017 --></span>
                                        大佬回家！
                                    </div>
                                    <div class="personal-a-1-1-2-1-1-2-2 auto-a-0 float-left">可用余额：
                                        <span id="usr1">￥12.00</span>
                                    </div>
                                    <div class="personal-a-1-1-2-1-1-2-3 auto-a-0 float-left">冻结金额：
                                        <span id="usr2">￥12.00</span>
                                    </div>
                                </div>
                                <div class="personal-a-1-1-2-1-1-3 float-left">
                                    <div class="personal-a-1-1-2-1-1-3-0">
                                        <div class="personal-a-1-1-2-1-1-3-2 float-left">
                                            <span>充值</span>
                                        </div>
                                        <div class="personal-a-1-1-2-1-1-3-1 float-left">
                                            <span>提现</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="personal-a-1-1-2-1-2">
                                <div class="personal-a-1-1-2-1-2-1 float-left">
                                    <div class="personal-a-1-1-2-1-2-1-1">累计收入（元）</div>
                                    <div class="personal-a-1-1-2-1-2-1-2" id="sc01">￥0.00</div>
                                </div>
                                <div class="personal-a-1-1-2-1-2-1 float-left">
                                    <div class="personal-a-1-1-2-1-2-1-1">累计收入订单（笔）</div>
                                    <div class="personal-a-1-1-2-1-2-1-2" id="sc02">0</div>
                                </div>
                                <div class="personal-a-1-1-2-1-2-1 float-left">
                                    <div class="personal-a-1-1-2-1-2-1-1">累计支出（元）</div>
                                    <div class="personal-a-1-1-2-1-2-1-2" id="sc03">￥0.00</div>
                                </div>
                                <div class="personal-a-1-1-2-1-2-1 float-left">
                                    <div class="personal-a-1-1-2-1-2-1-1">累计支出订单（笔）</div>
                                    <div class="personal-a-1-1-2-1-2-1-2" id="sc04">0</div>
                                </div>
                            </div>
                            <div class="personal-a-1-1-2-1-3">
                                <div class="personal-a-1-1-2-1-3-1">
                                    <div class="personal-a-1-1-2-1-3-1-1 float-left">
                                        <span>账户安全</span>
                                    </div>
                                    <div class="personal-a-1-1-2-1-3-1-2 float-left"></div>
                                </div>
                                <div class="personal-a-1-1-2-1-3-2">
                                    <div class="personal-a-1-1-2-1-3-2-1">
                                        <div class="personal-a-1-1-2-1-3-2-1-1 float-left">
                                            <span class="fa fa-lock"></span>
                                        </div>
                                        <div class="personal-a-1-1-2-1-3-2-1-2 float-left">
                                            <div class="personal-a-1-1-2-1-3-2-1-2-1">登录密码</div>
                                            <div class="personal-a-1-1-2-1-3-2-1-2-2">用于保护帐号信息和登录安全，建议您不定期更换</div>
                                        </div>
                                        <div class="personal-a-1-1-2-1-3-2-1-3 float-left">
                                            <div class="personal-a-1-1-2-1-3-2-1-3-1">
                                                <div class="personal-a-1-1-2-1-3-2-1-3-1">修改密码</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="personal-a-1-1-2-1-3-2">
                                    <div class="personal-a-1-1-2-1-3-2-1">
                                        <div class="personal-a-1-1-2-1-3-2-1-1 float-left">
                                            <span class="fa fa-phone"></span>
                                        </div>
                                        <div class="personal-a-1-1-2-1-3-2-1-2 float-left">
                                            <div class="personal-a-1-1-2-1-3-2-1-2-1">绑定手机</div>
                                            <div class="personal-a-1-1-2-1-3-2-1-2-2">绑定手机可以用于登录帐号，重置密码或其他安全验证</div>
                                        </div>
                                        <div class="personal-a-1-1-2-1-3-2-1-3 float-left">
                                            <div class="personal-a-1-1-2-1-3-2-1-3-1">
                                                <div class="personal-a-1-1-2-1-3-2-1-3-1">换绑手机</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="personal-a-1-1-2-1-3-2">
                                    <div class="personal-a-1-1-2-1-3-2-1">
                                        <div class="personal-a-1-1-2-1-3-2-1-1 float-left">
                                            <span class="fa fa-id-card"></span>
                                        </div>
                                        <div class="personal-a-1-1-2-1-3-2-1-2 float-left">
                                            <div class="personal-a-1-1-2-1-3-2-1-2-1">实名认证</div>
                                            <div class="personal-a-1-1-2-1-3-2-1-2-2">根据国家要求，网络虚拟交易需要进行实名认证</div>
                                        </div>
                                        <div class="personal-a-1-1-2-1-3-2-1-3 float-left">
                                            <div class="personal-a-1-1-2-1-3-2-1-3-1">
                                                <div class="personal-a-1-1-2-1-3-2-1-3-1">立即认证</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="personal-a-1-1-2-1-3-2">
                                    <div class="personal-a-1-1-2-1-3-2-1">
                                        <div class="personal-a-1-1-2-1-3-2-1-1 float-left">
                                            <span class="fa fa-lock"></span>
                                        </div>
                                        <div class="personal-a-1-1-2-1-3-2-1-2 float-left">
                                            <div class="personal-a-1-1-2-1-3-2-1-2-1">支付密码</div>
                                            <div class="personal-a-1-1-2-1-3-2-1-2-2">用于支付时使用，保障账户资金安全</div>
                                        </div>
                                        <div class="personal-a-1-1-2-1-3-2-1-3 float-left">
                                            <div class="personal-a-1-1-2-1-3-2-1-3-1">
                                                <div class="personal-a-1-1-2-1-3-2-1-3-1">立即设置</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- info-a e -->
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
<!-- zhz233-psonl.js 核心库-->
<script type="text/javascript" src="js/zhz233-psonl.js"></script>
<!-- zhz233-load-1.js 核心库-->
<script type="text/javascript" src="js/zhz233-load-1.js"></script>
<!-- dateFormat.js 核心库-->
<script type="text/javascript" src="js/dateFormat.js"></script>
</html>