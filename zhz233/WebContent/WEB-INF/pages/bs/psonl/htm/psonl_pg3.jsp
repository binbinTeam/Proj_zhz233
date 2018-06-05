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
                            <div class="personal-a-1-1-1-1-2">
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
                    <div class="personal-a-1-1-2 float-left"  id="psonl_content">
                        <div class="personal-a-1-1-2-4">
                            <div class="personal-a-1-1-2-4-1">
                                <span>资金明细</span>
                            </div>
                            <div class="personal-a-1-1-2-4-2">
                                <div class="personal-a-1-1-2-4-2-1">
                                    <div class="personal-a-1-1-2-4-2-1-1">
                                        <div class="personal-a-1-1-2-4-2-1-1-0">
                                            <div class="personal-a-1-1-2-4-2-1-1-0-1">
                                                <span>查询条件设置</span> (注意：选择条件)
                                            </div>
                                        </div><!--（例如:2018/01/01至2018/01/01）-->
                                        <div class="personal-a-1-1-2-4-2-1-1-1">
                                            <div class="personal-a-1-1-2-4-2-1-1-1-1 float-left">时间设置</div>
                                            <div class="personal-a-1-1-2-4-2-1-1-1-2 float-left">
                                                <div class="input-group personal-a-1-1-2-4-2-1-1-1-2-1 float-left">
                                                    <input class="form-control" type="date" placeholder="开始时间" id="start_time">
                                                    <lable class="input-group-append">--</lable>
                                                    <input class="form-control" type="date" placeholder="结束时间" id="end_time">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="personal-a-1-1-2-4-2-1-1-2">
                                            <div class="personal-a-1-1-2-4-2-1-1-2-1 float-left">资金类型</div>
                                            <div class="personal-a-1-1-2-4-2-1-1-2-2 float-left">
                                                <div class="float-left" id="all1">全部</div>
                                                <div class="float-left" id="all2">支出</div>
                                                <div class="float-left" id="all3">收入</div>
                                                <div class="float-left" id="all4">充值</div>
                                                <div class="float-left" id="all5">提现</div>
                                                <div class="float-left" id="all6">冻结</div>
                                            </div>
                                        </div>
                                        <div class="personal-a-1-1-2-4-2-1-1-3">
                                            <div class="personal-a-1-1-2-4-2-1-1-3-1">
                                                <div class="personal-a-1-1-2-4-2-1-1-3-1-1 float-left">时间</div>
                                                <div class="personal-a-1-1-2-4-2-1-1-3-1-2 float-left">类型</div>
                                                <div class="personal-a-1-1-2-4-2-1-1-3-1-3 float-left">明细</div>
                                                <div class="personal-a-1-1-2-4-2-1-1-3-1-4 float-left">金额</div>
                                            </div>
                                            <div class="personal-a-1-1-2-4-2-1-1-3-2" id="showContent">
                                                <!-- <div class="personal-a-1-1-2-4-2-1-1-3-2-0">
                                                    <div class="personal-a-1-1-2-4-2-1-1-3-2-1 float-left">20180401</div>
                                                    <div class="personal-a-1-1-2-4-2-1-1-3-2-2 float-left">充值</div>
                                                    <div class="personal-a-1-1-2-4-2-1-1-3-2-3 float-left">
                                                        <div class="personal-a-1-1-2-4-2-1-1-3-2-3-1 float-left">
                                                            <div>订单号：</div>
                                                            <div>交易类型：</div>
                                                            <div>交易时间：</div>
                                                            <div>创建时间：</div>
                                                            <div>交易总额：</div>
                                                        </div>
                                                        <div class="personal-a-1-1-2-4-2-1-1-3-2-3-2 float-left">
                                                            <div>20181212321312asfadsfawerw2sdfa 3123</div>
                                                            <div>1231231</div>
                                                            <div>123123123</div>
                                                            <div>201123312</div>
                                                            <div>￥0.00元</div>
                                                        </div>
                                                    </div>
                                                    <div class="personal-a-1-1-2-4-2-1-1-3-2-4 float-left">$8.00</div>
                                                </div> -->
                                                <!-- <div class="personal-a-1-1-2-4-2-1-1-3-2-0-1">
                                                    <div class="personal-a-1-1-2-4-2-1-1-3-2-0-1-1 float-left">
                                                        <div class="float-left">当前页码:第<span>1</span>页</div>
                                                        <div class="float-left">每页条数:<span>5</span>条</div>
                                                        <div class="float-left">记录总数：共:<span>5</span>条</div>
                                                    </div>
                                                    <div class="personal-a-1-1-2-4-2-1-1-3-2-0-1-2 float-right">
                                                        <div class="float-left"><span>首页</span></div>
                                                        <div class="float-left"><span>上一页</span></div>
                                                        <div class="float-left"><span>下一页</span></div>
                                                        <div class="float-left"><span>尾页</span></div>
                                                    </div>
                                                </div> -->
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!--<div class="personal-a-1-1-2-4-2-1">2</div>-->
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
<!-- zhz233-load-3.js 核心库-->
<script type="text/javascript" src="js/zhz233-load-3.js"></script>
<!-- dateFormat.js 核心库-->
<script type="text/javascript" src="js/dateFormat.js"></script>
</html>