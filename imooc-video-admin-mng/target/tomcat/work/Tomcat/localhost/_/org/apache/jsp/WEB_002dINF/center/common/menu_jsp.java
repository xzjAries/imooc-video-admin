/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-23 04:48:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.center.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<!-- BEGIN CONTAINER -->\n");
      out.write("    <!-- BEGIN SIDEBAR -->\n");
      out.write("    <div class=\"page-sidebar-wrapper\">\n");
      out.write("        <!-- BEGIN SIDEBAR -->\n");
      out.write("        <div class=\"page-sidebar navbar-collapse collapse\">\n");
      out.write("            <!-- BEGIN SIDEBAR MENU -->\n");
      out.write("            <ul class=\"page-sidebar-menu  page-header-fixed \" data-keep-expanded=\"false\" data-auto-scroll=\"false\" data-slide-speed=\"200\" style=\"padding-top: 20px\">\n");
      out.write("                <!-- DOC: To remove the sidebar toggler from the sidebar you just need to completely remove the below \"sidebar-toggler-wrapper\" LI element -->\n");
      out.write("                <!-- BEGIN SIDEBAR TOGGLER BUTTON -->\n");
      out.write("                <li class=\"sidebar-toggler-wrapper hide\">\n");
      out.write("                    <div class=\"sidebar-toggler\">\n");
      out.write("                        <span>\n");
      out.write("                        \t\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("               \t<!-- 控制台  start -->\n");
      out.write("               \t<li class=\"nav-item\">\n");
      out.write("                \t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/\">\n");
      out.write("                    \t<i class=\"icon-home\"></i>\n");
      out.write("                        \t<span class=\"title\">首页</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("               \t</li>\n");
      out.write("               \t\n");
      out.write("               \t<!-- 用户管理 start -->\n");
      out.write("\t\t\t\t<li class=\"nav-item \">\n");
      out.write("                    <a href=\"javascript:;\" class=\"nav-link nav-toggle\">\n");
      out.write("                        <i class=\"icon-user\"></i>\n");
      out.write("                        <span class=\"title\">用户信息</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"arrow\"></span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"sub-menu\">\n");
      out.write("                        <li class=\"nav-item \">\n");
      out.write("                            <a href=\"");
      out.print(request.getContextPath() );
      out.write("/users/showList.action\" class=\"ajaxify nav-link \">\n");
      out.write("                                <span class=\"title\">用户列表</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("               \t</li>\n");
      out.write("               \t\n");
      out.write("               \t<!-- 背景音乐 start -->\n");
      out.write("\t\t\t\t<li class=\"nav-item \">\n");
      out.write("                    <a href=\"javascript:;\" class=\"nav-link nav-toggle\">\n");
      out.write("                        <i class=\"icon-basket-loaded\"></i>\n");
      out.write("                        <span class=\"title\">bgm管理</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"arrow\"></span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item \">\n");
      out.write("                            <a id=\"bgmListMenu\" href=\"");
      out.print(request.getContextPath() );
      out.write("/video/showBgmList.action\" class=\"ajaxify nav-link \" id=\"bgmListMenu\">\n");
      out.write("                                <span class=\"title\">bgm列表</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item \">\n");
      out.write("                            <a href=\"");
      out.print(request.getContextPath() );
      out.write("/video/showAddBgm.action\" class=\"ajaxify nav-link \">\n");
      out.write("                                <span class=\"title\">添加bgm</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("               \t</li>\n");
      out.write("               \t\n");
      out.write("               \t<!-- 举报管理 start -->\n");
      out.write("\t\t\t\t<li class=\"nav-item \">\n");
      out.write("                    <a href=\"javascript:;\" class=\"nav-link nav-toggle\">\n");
      out.write("                        <i class=\"icon-notebook\"></i>\n");
      out.write("                        <span class=\"title\">举报管理</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"arrow\"></span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item \">\n");
      out.write("                            <a href=\"");
      out.print(request.getContextPath() );
      out.write("/video/showReportList.action\" class=\"ajaxify nav-link \">\n");
      out.write("                                <span class=\"title\">举报列表</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("               \t</li>\n");
      out.write("               \t\n");
      out.write("            </ul>\n");
      out.write("            <!-- END SIDEBAR MENU -->\n");
      out.write("        </div>\n");
      out.write("        <!-- END SIDEBAR -->\n");
      out.write("    </div>\n");
      out.write("    <!-- END SIDEBAR -->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
