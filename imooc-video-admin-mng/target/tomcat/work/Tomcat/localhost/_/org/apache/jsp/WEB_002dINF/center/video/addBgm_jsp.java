/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-23 04:48:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.center.video;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addBgm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- BEGIN PAGE HEADER-->\r\n");
      out.write("\t<!-- BEGIN PAGE BAR -->\r\n");
      out.write("\t<div class=\"page-bar\">\r\n");
      out.write("\t    <ul class=\"page-breadcrumb\">\r\n");
      out.write("\t        <li>\r\n");
      out.write("\t            <span>首页</span>\r\n");
      out.write("\t            <i class=\"fa fa-circle\"></i>\r\n");
      out.write("\t        </li>\r\n");
      out.write("\t        <li>\r\n");
      out.write("\t            <span>bgm管理</span>\r\n");
      out.write("\t            <i class=\"fa fa-circle\"></i>\r\n");
      out.write("\t        </li>\r\n");
      out.write("\t        <li>\r\n");
      out.write("\t            <span>添加背景音乐</span>\r\n");
      out.write("\t        </li>\r\n");
      out.write("\t    </ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- END PAGE BAR -->\r\n");
      out.write("\t<!-- END PAGE HEADER-->\r\n");
      out.write("                        \r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("    \t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<!-- 意见反馈 start -->\r\n");
      out.write("\t\t\t<div class=\"tabbable-line boxless tabbable-reversed\">\r\n");
      out.write("            \t<div class=\"portlet box green-jungle\">\r\n");
      out.write("                \t<div class=\"portlet-title\">\r\n");
      out.write("                    \t<div class=\"caption\">\r\n");
      out.write("                    \t\t<i class=\"icon-plus\"></i>添加背景音乐\r\n");
      out.write("                    \t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"portlet-body form\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t                    <!-- BEGIN FORM-->\r\n");
      out.write("\t                    <form id=\"addBgmForm\" class=\"form-horizontal\">\r\n");
      out.write("\t\t                    <div class=\"form-body\">\r\n");
      out.write("\t\t                    \r\n");
      out.write("\t\t                    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                        \t<label class=\"col-md-3 control-label\"><span class=\"field-required\"> * </span>歌手：</label>\r\n");
      out.write("\t\t                            <div class=\"col-md-4\">\r\n");
      out.write("\t\t                            \t<div id=\"input-error\">\r\n");
      out.write("\t\t                            \t\t<input id=\"author\" name=\"author\" type=\"text\" class=\"form-control\" placeholder=\"1-4字\">\r\n");
      out.write("\t\t                            \t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t                        \t<label class=\"col-md-3 control-label\"><span class=\"field-required\"> * </span>歌曲：</label>\r\n");
      out.write("\t\t                            <div class=\"col-md-4\">\r\n");
      out.write("\t\t                            \t<div id=\"input-error\">\r\n");
      out.write("\t\t                            \t\t<input id=\"name\" name=\"name\" type=\"text\" class=\"form-control\" placeholder=\"1-50字\">\r\n");
      out.write("\t\t                            \t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t                        \t<label class=\"col-md-3 control-label\"><span class=\"field-required\"> * </span>音乐片段</label>\r\n");
      out.write("\t\t                            <div class=\"col-md-4\">\r\n");
      out.write("\t\t                            \t<div id=\"input-error\">\r\n");
      out.write("\t                            \t\t\t<input type=\"hidden\" id=\"path\" name=\"path\" class=\"form-control\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"file\" type=\"file\" name=\"file\" data-url=\"");
      out.print(request.getContextPath() );
      out.write("/video/bgmUpload.action\" accept=\".mp3\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"bgmContent\"></div>\r\n");
      out.write("\t                            \t\t</div>\r\n");
      out.write("\t                            \t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t                                                  \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t                                                        \r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-actions\">\r\n");
      out.write("\t\t\t                    <div class=\"row\">\r\n");
      out.write("\t\t\t                        <div class=\"col-md-offset-3 col-md-9\">\r\n");
      out.write("\t\t\t                            <button type=\"submit\" class=\"btn green-jungle\">提 交</button>\r\n");
      out.write("\t\t\t                            <button type=\"reset\" class=\"btn grey-salsa btn-outline\">取  消</button>\r\n");
      out.write("\t\t\t                        </div>\r\n");
      out.write("\t\t\t                    </div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t<!-- END FORM-->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("                            \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    $(\"#file\").fileupload({\r\n");
      out.write("    \tpasteZone: \"#bgmContent\",\r\n");
      out.write("    \tdataType: \"json\",\r\n");
      out.write("    \tdone: function(e, data) {\r\n");
      out.write("    \t\tconsole.log(data);\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\tif (data.result.status != '200') {\r\n");
      out.write("    \t\t\talert(\"长传失败...\");\r\n");
      out.write("    \t\t} else {\r\n");
      out.write("    \t\t\tvar bgmServer = $(\"#bgmServer\").val();\r\n");
      out.write("    \t\t\tvar url = bgmServer + data.result.data;\r\n");
      out.write("    \t\t\t$(\"#bgmContent\").html(\"<a href='\" + url + \"' target='_blank'>点我播放</a>\");\r\n");
      out.write("    \t\t\t$(\"#path\").attr(\"value\", data.result.data);\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t}\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    var submitBgm = function() {\r\n");
      out.write("    \t$('#addBgmForm').ajaxSubmit({\r\n");
      out.write("    \t\turl: $('#hdnContextPath').val() + '/video/addBgm.action',\r\n");
      out.write("    \t\ttype: 'POST',\r\n");
      out.write("    \t\tsuccess: function(data) {\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t\tif (data.status == 200 && data.msg == 'OK') {\r\n");
      out.write("    \t\t\t\talert('BGM添加成功...')\r\n");
      out.write("    \t\t\t} else {\r\n");
      out.write("    \t\t\t\talert('BGM添加失败...')\r\n");
      out.write("    \t\t\t}\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t\t$(\"#bgmListMenu\").click();\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t});\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    $('#addBgmForm').validate({\r\n");
      out.write("    \terrorElement: 'span', //default input error message container\r\n");
      out.write("        errorClass: 'help-block', // default input error message class\r\n");
      out.write("        focusInvalid: false, // do not focus the last invalid input\r\n");
      out.write("        ignore: \"\", // validate all fields including form hidden input\r\n");
      out.write("        rules: {\r\n");
      out.write("        \tauthor: {\r\n");
      out.write("                required: true,\r\n");
      out.write("                rangelength: [1,8]\r\n");
      out.write("            },\r\n");
      out.write("            name: {\r\n");
      out.write("                required: true,\r\n");
      out.write("                rangelength: [1,50]\r\n");
      out.write("            },\r\n");
      out.write("            path: {\r\n");
      out.write("                required: true\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        messages: {\r\n");
      out.write("        \tauthor: {\r\n");
      out.write("                required: \"歌手不能为空.\",\r\n");
      out.write("                rangelength: \"歌手长度请控制在1-8位.\"\r\n");
      out.write("            },\r\n");
      out.write("            name: {\r\n");
      out.write("                required: \"歌曲不能为空.\",\r\n");
      out.write("                rangelength: \"歌曲长度请控制在1-50位.\"\r\n");
      out.write("            },\r\n");
      out.write("            path: {\r\n");
      out.write("                required: \"路径不能为空.\"\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        invalidHandler: function(event, validator) { //display error alert on form submit   \r\n");
      out.write("            $('.alert-danger', $('#addBgmForm')).show();\r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("        highlight: function(element) { // hightlight error inputs\r\n");
      out.write("            $(element).closest('.form-group').addClass('has-error'); // set error class to the control group\r\n");
      out.write("        },\r\n");
      out.write("        success: function(label) {\r\n");
      out.write("            label.closest('.form-group').removeClass('has-error');\r\n");
      out.write("            label.remove();\r\n");
      out.write("        },\r\n");
      out.write("        errorPlacement: function(error, element) {\r\n");
      out.write("            error.insertAfter(element.closest('#input-error'));\r\n");
      out.write("        },\r\n");
      out.write("        submitHandler: function(form) {\r\n");
      out.write("        \t// FIXME\r\n");
      out.write("        \tsubmitBgm();\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</script>\r\n");
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
