/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.49
 * Generated at: 2018-05-09 02:59:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.bs.deal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005fdeal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/G:/JAVA/Proj_zhz233/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/zhz233/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1521464765704L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- 设置编码 -->\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <!-- 网页内容描述 -->\r\n");
      out.write("    <meta name=\"description\" content=\"租号站，租号站233，租出好体验租号平台\">\r\n");
      out.write("    <!-- 网页内容关键字 -->\r\n");
      out.write("    <meta name=\"keywords\" content=\"zuzhaozhan233,租号站233,租号站\">\r\n");
      out.write("    <!-- 移动端适配 -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=on\">\r\n");
      out.write("    <!-- 标题 -->\r\n");
      out.write("    <title>租号站233|——租出好体验的网站</title>\r\n");
      out.write("    <!-- 引入css样式 -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-grid.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-reboot.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/zhz233-common.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- ban s -->\r\n");
      out.write("<div class=\"container-fluid common-a\">\r\n");
      out.write("    <div class=\"container \">\r\n");
      out.write("        <div class=\"row common-a-0\">\r\n");
      out.write("            <div class=\"common-a-1\" id=\"lab_user\">\r\n");
      out.write("            \t老铁，欢迎访问租号站233交易平台!\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"common-a-2\">\r\n");
      out.write("                <div class=\"common-a-2-1 float-left\"><span class=\"btn\" id=\"btn_login\">安全登录</span></div>\r\n");
      out.write("                <div class=\"common-a-2-1 float-left\"><span class=\"btn\" id=\"btn_register\">免费注册</span></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"common-a-3\"></div>\r\n");
      out.write("            <div class=\"common-a-4 float-right\">\r\n");
      out.write("                <div class=\"common-a-4-1 float-left\"><span class=\"btn\" id=\"btn_index\"><span class=\"fa fa-home common-a-4-2\"></span>首页</span></div>\r\n");
      out.write("                <div class=\"common-a-4-1 float-left\"><span class=\"btn\" id=\"btn_user\"><span class=\"fa fa-heart common-a-4-2\"></span>个人中心</span></div>\r\n");
      out.write("                <div class=\"common-a-4-1 float-left\"><span class=\"btn\" id=\"btn_services\"><span class=\"fa fa-star common-a-4-2\"></span>客服中心</span></div>\r\n");
      out.write("                <div class=\"common-a-4-1 float-left\"><span class=\"btn\" id=\"btn_join\"><span class=\"fa fa-group common-a-4-2\"></span>加入我们</span></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ban e -->\r\n");
      out.write("<!-- logo s -->\r\n");
      out.write("<div class=\"container-fluid common-b\">\r\n");
      out.write("    <div class=\"container \">\r\n");
      out.write("        <div class=\"row common-b-0\">\r\n");
      out.write("            <div class=\"common-b-1 float-right\" id=\"img_logo\"><img class=\"img-fluid\" src=\"img/sy_public_logo.gif\" alt=\"logo.gif\"></div>\r\n");
      out.write("            <div class=\"common-b-2 float-right\"></div>\r\n");
      out.write("            <div class=\"common-b-3 float-right\">\r\n");
      out.write("                <div class=\"input-group common-b-3-1\">\r\n");
      out.write("                    <lable class=\"btn input-group-append common-b-3-2\"><span class=\"fa fa-search\"></span></lable>\r\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"请输入关键字\" id=\"search_key\">\r\n");
      out.write("                    <button class=\"btn input-group-append common-b-3-3\" id=\"btn_search\">搜索</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- logo e -->\r\n");
      out.write("<!-- nav s -->\r\n");
      out.write("<div class=\"container-fluid common-c\">\r\n");
      out.write("    <div class=\"container \">\r\n");
      out.write("        <div class=\"row common-c-0\">\r\n");
      out.write("            <div class=\"btn common-c-0-1 common-c-1 common-c-1-1 float-right\" id=\"btn_home\">租号站<span class=\"fa fa-smile-o\"></span></div>\r\n");
      out.write("            <div class=\"btn common-c-0-2 common-c-2 float-right\" id=\"btn_taste\">体验中心</div>\r\n");
      out.write("            <div class=\"btn common-c-0-2 common-c-2 float-right\" id=\"btn_deal\">交易中心</div>\r\n");
      out.write("            <div class=\"btn common-c-0-2 common-c-2 float-right\" id=\"btn_store\">商户入驻</div>\r\n");
      out.write("            <div class=\"btn common-c-0-2 common-c-2 float-right\" id=\"btn_download\">下载上号器</div>\r\n");
      out.write("            <div class=\"btn common-c-0-2 common-c-2 float-right common-c-1-1\" id=\"btn_help\">帮助中心</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- nav e -->\r\n");
      out.write("<!-- show-1 s -->\r\n");
      out.write("<div class=\"container-fluid deal-a\">\r\n");
      out.write("    <div class=\"container \">\r\n");
      out.write("        <div class=\"row deal-a-0\">\r\n");
      out.write("            <div class=\"deal-a-1\">\r\n");
      out.write("                <div class=\"deal-a-1-1\">\r\n");
      out.write("                    <div class=\"deal-a-1-1-1\">\r\n");
      out.write("                        <div class=\"deal-a-1-1-1-1\">\r\n");
      out.write("                            <div class=\"deal-a-1-1-1-1-1 float-left\">\r\n");
      out.write("                                体验租号乐趣\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"deal-a-1-1-2\">\r\n");
      out.write("                        <div class=\"deal-a-1-1-2-1 float-left\">\r\n");
      out.write("                            <span>热门推荐</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"deal-a-1-1-2-2 float-left\" id=\"hot_div\">\r\n");
      out.write("                            <div class=\"btn deal-a-1-1-2-2-1 float-left\">绝地求生</div>\r\n");
      out.write("                            <div class=\"btn deal-a-1-1-2-2-2 float-left\">英雄联盟</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"deal-a-1-1-3\">\r\n");
      out.write("                        <div class=\"deal-a-1-1-3-1 float-left\">\r\n");
      out.write("                            <span>选择游戏</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"deal-a-1-1-3-2 float-left\">\r\n");
      out.write("                            <select class=\"custom-select deal-a-1-1-3-2-1 float-left\" id=\"search_type\">\r\n");
      out.write("                                <option value=\"-1\" selected>请选择游戏类型</option>\r\n");
      out.write("                                <option value=\"0\">端游</option>\r\n");
      out.write("                                <option value=\"1\">页游</option>\r\n");
      out.write("                                <option value=\"2\">手游</option>\r\n");
      out.write("                                <option value=\"3\">加速器</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                            <select class=\"custom-select deal-a-1-1-3-2-1 float-left\" id=\"search_game\">\r\n");
      out.write("                                <option value=\"-1\" selected>请选择游戏名称</option>\r\n");
      out.write("                                <option value=\"0\">英雄联盟</option>\r\n");
      out.write("                                <option value=\"1\">绝地求生</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                            <select class=\"custom-select deal-a-1-1-3-2-1 float-left\" id=\"search_server\">\r\n");
      out.write("                                <option value=\"-1\" selected>请选择服务器</option>\r\n");
      out.write("                                <option value=\"0\">电信</option>\r\n");
      out.write("                                <option value=\"1\">网通</option>\r\n");
      out.write("                                <option value=\"2\">其他</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                            <!-- <div class=\"input-group deal-a-1-1-3-2-2 float-left\">\r\n");
      out.write("                                <input class=\"form-control\" type=\"text\" placeholder=\"请输入大区\" id=\"search_server\">\r\n");
      out.write("                            </div> -->\r\n");
      out.write("                            <div class=\"input-group deal-a-1-1-3-2-2 float-left\">\r\n");
      out.write("                                <input class=\"form-control\" type=\"text\" placeholder=\"请输入关键字\" id=\"search_key_2\">\r\n");
      out.write("                                <button class=\"btn input-group-append\" id=\"search_value\">搜索</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"deal-a-1-1-4\">\r\n");
      out.write("                        <div class=\"deal-a-1-1-4-1 float-left\">\r\n");
      out.write("                            <span>价格范围</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"deal-a-1-1-4-2 float-left\">\r\n");
      out.write("                            <div class=\"deal-a-1-1-4-2-1\" id=\"search_price\">\r\n");
      out.write("                                <div class=\"deal-a-1-1-4-2-1-1 float-left\" id=\"search_price_1\">1元内</div>\r\n");
      out.write("                                <div class=\"deal-a-1-1-4-2-1-1 float-left\" id=\"search_price_2\">2元内</div>\r\n");
      out.write("                                <div class=\"deal-a-1-1-4-2-1-1 float-left\" id=\"search_price_3\">5元内</div>\r\n");
      out.write("                                <div class=\"deal-a-1-1-4-2-1-1 float-left\" id=\"search_price_4\">10元内</div>\r\n");
      out.write("                                <div class=\"deal-a-1-1-4-2-1-1 float-left\" id=\"search_price_5\">100元内</div>\r\n");
      out.write("                                <div class=\"deal-a-1-1-4-2-1-1 float-left\" id=\"search_price_6\">1000元内</div>\r\n");
      out.write("                                <div class=\"deal-a-1-1-4-2-1-1 float-left\" id=\"search_price_7\">大于1000元</div>\r\n");
      out.write("                                <div class=\"deal-a-1-1-4-2-1-1 float-left\" id=\"search_price_8\">清除范围</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"deal-a-1-1-5\">\r\n");
      out.write("                        <div class=\"deal-a-1-1-5-1 float-left\">\r\n");
      out.write("                            <span>安全认证</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"deal-a-1-1-5-2 float-left\">\r\n");
      out.write("                            <div class=\"deal-a-1-1-5-2-1\">\r\n");
      out.write("                            \t<!-- <div class=\"deal-a-1-1-5-2-1-1 float-left\"  id=\"search_auth_0\">普通认证</div> -->\r\n");
      out.write("                                <div class=\"deal-a-1-1-5-2-1-1 float-left\"  id=\"search_auth_1\">个人认证</div>\r\n");
      out.write("                                <div class=\"deal-a-1-1-5-2-1-1 float-left\"  id=\"search_auth_2\">商家认证</div>\r\n");
      out.write("                                <div class=\"deal-a-1-1-5-2-1-1 float-left\"  id=\"search_auth_3\">清除</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- show-1 e -->\r\n");
      out.write("<!-- show-2 s -->\r\n");
      out.write("<div class=\"container-fluid deal-b\">\r\n");
      out.write("    <div class=\"container \">\r\n");
      out.write("        <div class=\"row deal-b-0\">\r\n");
      out.write("            <div class=\"deal-b-1\">\r\n");
      out.write("                <div class=\"deal-b-1-1\">\r\n");
      out.write("                    <div class=\"deal-b-1-1-1 float-left\">\r\n");
      out.write("                        <div class=\"deal-b-1-1-1-2 float-left\"  id=\"sortAuto\">\r\n");
      out.write("                            <div class=\"deal-b-1-1-1-2-1\">综合排序</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"deal-b-1-1-1-2 float-left\" id=\"sortNumber\">\r\n");
      out.write("                            <div>信用排序</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"deal-b-1-1-1-2 float-left\" id=\"sortPrice\">\r\n");
      out.write("                            <div>价格排序</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"deal-b-1-1-1-3 float-right\">\r\n");
      out.write("                            <div class=\"deal-b-1-1-1-3-1\">\r\n");
      out.write("                               <!--  <img src=\"img/doit_2.png\" alt=\"\"> -->\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"deal-b-1-1-2 float-left\" id=\"searchContent\">\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"deal-b-1-1-3 float-left\">\r\n");
      out.write("                     <div class=\"deal-b-1-1-3-1\">\r\n");
      out.write("                     \t<span onclick=\"goPages('1')\">首页</span>\r\n");
      out.write("                     \t<span onclick=\"goPages('-1')\">上一页</span>\r\n");
      out.write("                     \t第<input id=\"goPage\">页\r\n");
      out.write("                     \t<span onclick=\"goPages('n')\">立即前往</span>\r\n");
      out.write("\t                    <span onclick=\"goPages('+1')\">下一页</span>\r\n");
      out.write("\t                    <span onclick=\"goPages('N')\">尾页</span>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"deal-b-1-1-3-2\" id=\"pageAuto\">\r\n");
      out.write("                     \t<div class=\"float-right\">总记录数：[<span id=\"pageA\">10</span>]条记录</div>\r\n");
      out.write("                     \t<div class=\"float-right\">总页数:[<span id=\"pageB\">2</span>]页 </div>\r\n");
      out.write("                     \t<div class=\"float-right\">每页显示：[<span id=\"pageC\">8</span>]条记录 </div>\r\n");
      out.write("                     \t<div class=\"float-right\">当前页：第[<span id=\"pageD\">1</span>]页 </div>\r\n");
      out.write("                     \t \r\n");
      out.write("                     </div>\r\n");
      out.write("                        <!-- <img src=\"img/doit_1.png\" alt=\"\"> -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- show-2 e -->\r\n");
      out.write("<!-- bottom s -->\r\n");
      out.write("<div class=\"container-fluid common-i\">\r\n");
      out.write("    <div class=\"container \">\r\n");
      out.write("        <div class=\"row common-i-0\">\r\n");
      out.write("            <div class=\"common-i-1\">\r\n");
      out.write("                <div class=\"common-i-1-1 float-left\">\r\n");
      out.write("                    <img class=\"img-fluid\" src=\"img/sy_public_boom.png\" alt=\"boom.gif\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"common-i-1-2 float-left\">\r\n");
      out.write("                    <div class=\"common-i-1-2-1\">\r\n");
      out.write("                        <div class=\"common-i-1-2-1-1\">\r\n");
      out.write("                            <div class=\"common-i-1-2-1-1-1 float-right\"><img src=\"img/sy_public_bottom_3.png\" alt=\"bottom_3.png\"><span>权威认证 安全可靠</span></div>\r\n");
      out.write("                            <div class=\"common-i-1-2-1-1-1 float-right\"><img src=\"img/sy_public_bottom_2.png\" alt=\"bottom_2.png\"><span>每天9：00-次日2：00专属客服</span></div>\r\n");
      out.write("                            <div class=\"common-i-1-2-1-1-1 float-right\"><img src=\"img/sy_public_bottom_1.png\" alt=\"bottom_1.png\"><span>省心交易</span> 快捷上号</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"common-i-1-2-1-2\">\r\n");
      out.write("                            <div class=\"common-i-1-2-1-2-1 float-right\">\r\n");
      out.write("                                <div class=\"common-i-1-2-1-2-1-1\">\r\n");
      out.write("                                    <span>客服电话</span><br>023-21321321\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"common-i-1-2-1-2-1-1\">\r\n");
      out.write("                                    <span>客服微信</span><br>02321321321\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"common-i-1-2-1-2-1-1\">\r\n");
      out.write("                                    <span>客服QQ</span><br>0221321321\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"common-i-1-2-1-2-2 float-right\">\r\n");
      out.write("                                <div class=\"common-i-1-2-1-2-2-1 float-right\">\r\n");
      out.write("                                    <span>关于租号</span><br>\r\n");
      out.write("                                    <a href=\"#\">招贤纳士</a><br>\r\n");
      out.write("                                    <a href=\"#\">免责声明</a><br>\r\n");
      out.write("                                    <a href=\"#\">联系我们</a><br>\r\n");
      out.write("                                    <a href=\"#\">租号玩流程</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"common-i-1-2-1-2-2-1 float-right\">\r\n");
      out.write("                                    <span>安全中心</span><br>\r\n");
      out.write("                                    <a href=\"#\">租号安全</a><br>\r\n");
      out.write("                                    <a href=\"#\">买号安全</a><br>\r\n");
      out.write("                                    <a href=\"#\">资金安全</a><br>\r\n");
      out.write("                                    <a href=\"#\">数据和信息</a></div>\r\n");
      out.write("                                <div class=\"common-i-1-2-1-2-2-1 float-right\">\r\n");
      out.write("                                    <span>新手帮助</span><br>\r\n");
      out.write("                                    <a href=\"#\">新手必读</a><br>\r\n");
      out.write("                                    <a href=\"#\">注册认证</a><br>\r\n");
      out.write("                                    <a href=\"#\">如何发布商品</a><br>\r\n");
      out.write("                                    <a href=\"#\">如何寻找代练</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"common-i-1-2-2\">\r\n");
      out.write("                        <div class=\"common-i-1-2-2-1\">\r\n");
      out.write("                            <div class=\"common-i-1-2-2-1-1\">\r\n");
      out.write("                                <span>友情链接：</span>\r\n");
      out.write("                                <a href=\"#\">游戏交易平台</a>\r\n");
      out.write("                                <a href=\"#\">王者荣耀代练</a>\r\n");
      out.write("                                <a href=\"#\">海豹加速器</a>\r\n");
      out.write("                                <a href=\"#\">电竞饰品交易平台</a>\r\n");
      out.write("                                <a href=\"#\">新星饰品交易</a>\r\n");
      out.write("                                <a href=\"#\">交易代练通</a>\r\n");
      out.write("                                <a href=\"#\">游戏币交易平台</a>\r\n");
      out.write("                                <a href=\"#\">淘宝交易平台</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"common-i-1-2-2-1-2\">\r\n");
      out.write("                                Copyright © 2018-2019 zuhaozhan233.com版权所有 ICP证：渝B1-20110004-10(重庆XXXX网络科技股份有限公司) 渝网文[2018]2034-030号\r\n");
      out.write("                                <img class=\"img-fluid\" src=\"img/sy_public_wpolic.gif\" alt=\"\">渝公网安备 31010202010327号\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- bottom e -->\r\n");
      out.write("</body>\r\n");
      out.write("<!-- jquery-3.2.1.min.js 引入JQ -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<!-- bootstrap.bundle.min.js 用于弹窗、提示、下拉菜单 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<!-- bootstrap.min.js 核心库-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- zhz233-common.js 核心库-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zhz233-common.js\"></script>\r\n");
      out.write("<!-- js/zhz233-deal.js 核心库-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/zhz233-deal.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
