/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-02-07 08:11:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fpage_005fapplyDecorator_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fgetProperty_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fpage_005fapplyDecorator_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005fgetProperty_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.release();
    _005fjspx_005ftagPool_005fpage_005fapplyDecorator_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fdecorator_005fgetProperty_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-cn\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t    <meta charset=\"utf-8\">\r\n");
      out.write("\t    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<title>JBOA管理系统-");
      if (_jspx_meth_decorator_005ftitle_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("\t\t<link href=\"");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"");
      if (_jspx_meth_s_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_decorator_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_page_005fapplyDecorator_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_page_005fapplyDecorator_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_decorator_005fgetProperty_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_decorator_005fbody_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_page_005fapplyDecorator_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script src=\"");
      if (_jspx_meth_s_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t\t<script src=\"");
      if (_jspx_meth_s_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t\t");
      if (_jspx_meth_decorator_005fgetProperty_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_decorator_005fgetProperty_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_decorator_005ftitle_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_decorator_005ftitle_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_decorator_005ftitle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005ftitle_005f0.setParent(null);
    // /WEB-INF/template/main.jsp(11,18) name = default type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_decorator_005ftitle_005f0.setDefault("页面");
    int _jspx_eval_decorator_005ftitle_005f0 = _jspx_th_decorator_005ftitle_005f0.doStartTag();
    if (_jspx_th_decorator_005ftitle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.reuse(_jspx_th_decorator_005ftitle_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005ftitle_0026_005fdefault_005fnobody.reuse(_jspx_th_decorator_005ftitle_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f0.setParent(null);
    // /WEB-INF/template/main.jsp(12,14) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setValue("/assets/bootstrap-3.3.7-dist/css/bootstrap.min.css");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f1 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f1.setParent(null);
    // /WEB-INF/template/main.jsp(13,14) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setValue("/assets/layout.css");
    int _jspx_eval_s_005furl_005f1 = _jspx_th_s_005furl_005f1.doStartTag();
    if (_jspx_th_s_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_decorator_005fhead_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_decorator_005fhead_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    _jspx_th_decorator_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fhead_005f0.setParent(null);
    int _jspx_eval_decorator_005fhead_005f0 = _jspx_th_decorator_005fhead_005f0.doStartTag();
    if (_jspx_th_decorator_005fhead_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.reuse(_jspx_th_decorator_005fhead_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.reuse(_jspx_th_decorator_005fhead_005f0);
    return false;
  }

  private boolean _jspx_meth_page_005fapplyDecorator_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  page:applyDecorator
    com.opensymphony.module.sitemesh.taglib.page.ApplyDecoratorTag _jspx_th_page_005fapplyDecorator_005f0 = (com.opensymphony.module.sitemesh.taglib.page.ApplyDecoratorTag) _005fjspx_005ftagPool_005fpage_005fapplyDecorator_0026_005fname_005fnobody.get(com.opensymphony.module.sitemesh.taglib.page.ApplyDecoratorTag.class);
    _jspx_th_page_005fapplyDecorator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_page_005fapplyDecorator_005f0.setParent(null);
    // /WEB-INF/template/main.jsp(18,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_page_005fapplyDecorator_005f0.setName("top");
    int _jspx_eval_page_005fapplyDecorator_005f0 = _jspx_th_page_005fapplyDecorator_005f0.doStartTag();
    if (_jspx_th_page_005fapplyDecorator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fpage_005fapplyDecorator_0026_005fname_005fnobody.reuse(_jspx_th_page_005fapplyDecorator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fpage_005fapplyDecorator_0026_005fname_005fnobody.reuse(_jspx_th_page_005fapplyDecorator_005f0);
    return false;
  }

  private boolean _jspx_meth_page_005fapplyDecorator_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  page:applyDecorator
    com.opensymphony.module.sitemesh.taglib.page.ApplyDecoratorTag _jspx_th_page_005fapplyDecorator_005f1 = (com.opensymphony.module.sitemesh.taglib.page.ApplyDecoratorTag) _005fjspx_005ftagPool_005fpage_005fapplyDecorator_0026_005fname_005fnobody.get(com.opensymphony.module.sitemesh.taglib.page.ApplyDecoratorTag.class);
    _jspx_th_page_005fapplyDecorator_005f1.setPageContext(_jspx_page_context);
    _jspx_th_page_005fapplyDecorator_005f1.setParent(null);
    // /WEB-INF/template/main.jsp(21,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_page_005fapplyDecorator_005f1.setName("left");
    int _jspx_eval_page_005fapplyDecorator_005f1 = _jspx_th_page_005fapplyDecorator_005f1.doStartTag();
    if (_jspx_th_page_005fapplyDecorator_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fpage_005fapplyDecorator_0026_005fname_005fnobody.reuse(_jspx_th_page_005fapplyDecorator_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fpage_005fapplyDecorator_0026_005fname_005fnobody.reuse(_jspx_th_page_005fapplyDecorator_005f1);
    return false;
  }

  private boolean _jspx_meth_decorator_005fgetProperty_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:getProperty
    com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag _jspx_th_decorator_005fgetProperty_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag) _005fjspx_005ftagPool_005fdecorator_005fgetProperty_0026_005fproperty_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag.class);
    _jspx_th_decorator_005fgetProperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fgetProperty_005f0.setParent(null);
    // /WEB-INF/template/main.jsp(25,6) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_decorator_005fgetProperty_005f0.setProperty("page.breadcrumb");
    int _jspx_eval_decorator_005fgetProperty_005f0 = _jspx_th_decorator_005fgetProperty_005f0.doStartTag();
    if (_jspx_th_decorator_005fgetProperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fgetProperty_0026_005fproperty_005fnobody.reuse(_jspx_th_decorator_005fgetProperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fgetProperty_0026_005fproperty_005fnobody.reuse(_jspx_th_decorator_005fgetProperty_005f0);
    return false;
  }

  private boolean _jspx_meth_decorator_005fbody_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_decorator_005fbody_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_decorator_005fbody_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fbody_005f0.setParent(null);
    int _jspx_eval_decorator_005fbody_005f0 = _jspx_th_decorator_005fbody_005f0.doStartTag();
    if (_jspx_th_decorator_005fbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f0);
    return false;
  }

  private boolean _jspx_meth_page_005fapplyDecorator_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  page:applyDecorator
    com.opensymphony.module.sitemesh.taglib.page.ApplyDecoratorTag _jspx_th_page_005fapplyDecorator_005f2 = (com.opensymphony.module.sitemesh.taglib.page.ApplyDecoratorTag) _005fjspx_005ftagPool_005fpage_005fapplyDecorator_0026_005fname_005fnobody.get(com.opensymphony.module.sitemesh.taglib.page.ApplyDecoratorTag.class);
    _jspx_th_page_005fapplyDecorator_005f2.setPageContext(_jspx_page_context);
    _jspx_th_page_005fapplyDecorator_005f2.setParent(null);
    // /WEB-INF/template/main.jsp(33,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_page_005fapplyDecorator_005f2.setName("footer");
    int _jspx_eval_page_005fapplyDecorator_005f2 = _jspx_th_page_005fapplyDecorator_005f2.doStartTag();
    if (_jspx_th_page_005fapplyDecorator_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fpage_005fapplyDecorator_0026_005fname_005fnobody.reuse(_jspx_th_page_005fapplyDecorator_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fpage_005fapplyDecorator_0026_005fname_005fnobody.reuse(_jspx_th_page_005fapplyDecorator_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f2 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f2.setParent(null);
    // /WEB-INF/template/main.jsp(35,15) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f2.setValue("/assets/jquery-1.12.4.min.js");
    int _jspx_eval_s_005furl_005f2 = _jspx_th_s_005furl_005f2.doStartTag();
    if (_jspx_th_s_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f3 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f3.setParent(null);
    // /WEB-INF/template/main.jsp(36,15) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f3.setValue("/assets/bootstrap-3.3.7-dist/js/bootstrap.min.js");
    int _jspx_eval_s_005furl_005f3 = _jspx_th_s_005furl_005f3.doStartTag();
    if (_jspx_th_s_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_decorator_005fgetProperty_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:getProperty
    com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag _jspx_th_decorator_005fgetProperty_005f1 = (com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag) _005fjspx_005ftagPool_005fdecorator_005fgetProperty_0026_005fproperty_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag.class);
    _jspx_th_decorator_005fgetProperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fgetProperty_005f1.setParent(null);
    // /WEB-INF/template/main.jsp(37,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_decorator_005fgetProperty_005f1.setProperty("page.plugin.js");
    int _jspx_eval_decorator_005fgetProperty_005f1 = _jspx_th_decorator_005fgetProperty_005f1.doStartTag();
    if (_jspx_th_decorator_005fgetProperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fgetProperty_0026_005fproperty_005fnobody.reuse(_jspx_th_decorator_005fgetProperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fgetProperty_0026_005fproperty_005fnobody.reuse(_jspx_th_decorator_005fgetProperty_005f1);
    return false;
  }

  private boolean _jspx_meth_decorator_005fgetProperty_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:getProperty
    com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag _jspx_th_decorator_005fgetProperty_005f2 = (com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag) _005fjspx_005ftagPool_005fdecorator_005fgetProperty_0026_005fproperty_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.PropertyTag.class);
    _jspx_th_decorator_005fgetProperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fgetProperty_005f2.setParent(null);
    // /WEB-INF/template/main.jsp(38,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_decorator_005fgetProperty_005f2.setProperty("page.page.js");
    int _jspx_eval_decorator_005fgetProperty_005f2 = _jspx_th_decorator_005fgetProperty_005f2.doStartTag();
    if (_jspx_th_decorator_005fgetProperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fgetProperty_0026_005fproperty_005fnobody.reuse(_jspx_th_decorator_005fgetProperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fgetProperty_0026_005fproperty_005fnobody.reuse(_jspx_th_decorator_005fgetProperty_005f2);
    return false;
  }
}
