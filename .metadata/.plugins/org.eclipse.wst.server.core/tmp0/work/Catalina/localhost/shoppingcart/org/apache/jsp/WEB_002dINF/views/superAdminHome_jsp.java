/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2015-09-08 05:04:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class superAdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/shivas7/Documents/GSAP2015/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Team-C/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("jar:file:/C:/Users/shivas7/Documents/GSAP2015/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Team-C/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1440652807010L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Home</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<center>\r\n");
      out.write("<body>\r\n");
      out.write("<h2 color=\"green\">\r\n");
      out.write("Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataMap.get(\"user\").getUserFname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("</h2>\r\n");
      out.write("\r\n");
      out.write("<h3> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prodMsg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("<h3><p id=\"notSelected\"></h3>\r\n");
      out.write("\r\n");
      out.write("<p1>\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("<thead>\r\n");
      out.write(" <tr><h2>Product List</h2></tr>\r\n");
      out.write(" <tr>\r\n");
      out.write(" \t<th>selection</th>\r\n");
      out.write("    <th>Product Name</th>\r\n");
      out.write("    <th>Product Price</th>\r\n");
      out.write("    <th>Product Category</th>\r\n");
      out.write("    <th>Product Image Name</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("</thead>\r\n");
      out.write("\r\n");
      out.write(" <tbody> \r\n");
      out.write(" ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("  </tbody>\r\n");
      out.write("</table> \r\n");
      out.write("</p1>\r\n");
      out.write("</br>\r\n");
      out.write("<table>\r\n");
      out.write("<tr></tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<input type=\"button\" value=\"Add Product\" onclick=\"window.location='addProductForm';\" />\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<button onclick=\"delProduct()\">Delete product</button>\r\n");
      out.write("</td>\r\n");
      out.write("</tr></table>\r\n");
      out.write("<p2/>\r\n");
      out.write("<p2/>\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("<thead>\r\n");
      out.write(" <th><h2>User List</h2></th>\r\n");
      out.write(" <tr>\r\n");
      out.write("    <th>Name</th>\r\n");
      out.write("    <th>Email ID</th>\r\n");
      out.write("    <th>Address</th>\r\n");
      out.write("    <th>Phone number</th>\r\n");
      out.write("    <th>Gender</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("</thead>\r\n");
      out.write("\r\n");
      out.write(" <tbody> \r\n");
      out.write(" ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("  </tbody>\r\n");
      out.write("</table> \r\n");
      out.write("</p2>\r\n");
      out.write("</p3>\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("<thead>\r\n");
      out.write(" <tr><h2>Admin List</h2></tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("    <th>Name</th>\r\n");
      out.write("    <th>Email ID</th>\r\n");
      out.write("   <!--  <th>Address</th> -->\r\n");
      out.write("<!--     <th>Phone number</th>\r\n");
      out.write("    <th>Gender</th> -->\r\n");
      out.write("  </tr>\r\n");
      out.write("</thead>\r\n");
      out.write("\r\n");
      out.write(" <tbody> \r\n");
      out.write(" ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<table>\r\n");
      out.write("<tr></tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<input type=\"button\" value=\"Add Admin\" onclick=\"window.location='adminRegForm';\" />\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<input type=\"button\" id=\"delAdmin\" value=\"Delete Admin\"  onclick=\"delAdmin()\" />\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr></table> \r\n");
      out.write("</p3>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/* var checker = document.getElementById('cbox');\r\n");
      out.write("var sendbtn = document.getElementById('delAdmin'); */\r\n");
      out.write("var userNameList=[];\r\n");
      out.write(" function onCheckbox2(checkbox) {\r\n");
      out.write("\t //if(sendbtn.disabled== false){sendbtn.disabled = false;}\r\n");
      out.write("  \t\t\r\n");
      out.write("  if (checkbox.checked) \r\n");
      out.write("  {\r\n");
      out.write("\t  userNameList.push(checkbox.value);\r\n");
      out.write("  }\r\n");
      out.write("  else \r\n");
      out.write("  {\r\n");
      out.write("  \t\tvar index;\r\n");
      out.write("  \t\tfor(i=0;i<userNameList.length;i++)\r\n");
      out.write("  \t\t{\r\n");
      out.write("  \t\t\tif(userNameList[i]==checkbox.value)\r\n");
      out.write("  \t\t\tindex=i;\r\n");
      out.write("  \t\t}\r\n");
      out.write("  \t\tif(index > -1)\r\n");
      out.write("  \t\t\tuserNameList.splice(index,1);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("function delAdmin() {\r\n");
      out.write("\t\r\n");
      out.write("\tif(userNameList.length)\r\n");
      out.write("\t\twindow.location.href = \"deleteAdmin?userNameList=\" + userNameList;\r\n");
      out.write("\telse \r\n");
      out.write("\t\talert(\"no item selected\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var test=[];\r\n");
      out.write("\r\n");
      out.write("        function onChangeCheckbox (checkbox) {\r\n");
      out.write("            if (checkbox.checked) \r\n");
      out.write("            {\r\n");
      out.write("               test.push(checkbox.value);\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            else \r\n");
      out.write("            {\r\n");
      out.write("            \t\tvar index;\r\n");
      out.write("            \t\tfor(i=0;i<test.length;i++)\r\n");
      out.write("            \t\t{\r\n");
      out.write("            \t\t\tif(test[i]==checkbox.value)\r\n");
      out.write("            \t\t\tindex=i;\r\n");
      out.write("            \t\t}\r\n");
      out.write("            \t\tif(index > -1)\r\n");
      out.write("            \t\ttest.splice(index,1);\r\n");
      out.write("            \t\r\n");
      out.write("            \t\r\n");
      out.write("            }\r\n");
      out.write("       \t}\r\n");
      out.write("        \r\n");
      out.write("      function delProduct() {\r\n");
      out.write("        \tif(test.length){window.location = \"deleteProduct?prodIductList=\" +test;\r\n");
      out.write("                }\t\t\r\n");
      out.write("        \telse \r\n");
      out.write("        \t\t//document.getElementById(\"notSelected\").innerHTML=\"No Items selected!\";\r\n");
      out.write("        \talert(\"no item selected\")\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</center>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/superAdminHome.jsp(32,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/superAdminHome.jsp(32,1) '${dataMap.get(\"productList\")}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${dataMap.get(\"productList\")}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/superAdminHome.jsp(32,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("product");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <tr>\r\n");
          out.write("    <td><input type=\"checkbox\" name=\"products\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.getpId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" style=\"cursor: pointer;\" onclick=\"onChangeCheckbox (this)\" /></td>\r\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.getpName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.getPrice()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.getCategory()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.getImageName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("    </tr>\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/views/superAdminHome.jsp(70,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/superAdminHome.jsp(70,1) '${dataMap.get(\"userList\")}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${dataMap.get(\"userList\")}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/superAdminHome.jsp(70,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("user");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getUserFname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getUserLname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getEmailId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getAddressLine1()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getAddressLine2()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getPhoneNumber()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getGender()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("    </tr>\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/views/superAdminHome.jsp(96,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/superAdminHome.jsp(96,1) '${dataMap.get(\"adminList\")}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${dataMap.get(\"adminList\")}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/superAdminHome.jsp(96,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("admin");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <tr>\r\n");
          out.write("    <td><input type=\"checkbox\" id=\"cbox\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.getEmailId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\"  onclick=\"onCheckbox2 (this)\" /></td>\r\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.getUserFname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.getUserLname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("      <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.getEmailId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("       \r\n");
          out.write("    </tr>\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }
}