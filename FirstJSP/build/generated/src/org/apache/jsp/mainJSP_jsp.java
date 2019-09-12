package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class mainJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    ");

        Date date = new Date();
        
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("       \n");
      out.write("            \n");
      out.write("            body {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    background: yellow;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".scene {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 50%;\n");
      out.write("    left: 50%;\n");
      out.write("    transform: translate(-50%,-50%);\n");
      out.write("    width: 400px;\n");
      out.write("    height: 400px;\n");
      out.write("    background: #3b93ff;\n");
      out.write("    border: 20px solid #fff;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    overflow: hidden;\n");
      out.write("    box-shadow: inset 0 0 100px rgba(0,0,0,.5);\n");
      out.write("    animation: animateScene 5s linear infinite;\n");
      out.write("    animation-delay: 2s;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".scene:before {\n");
      out.write("    content: '';\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: 50%;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    background: rgba(0,0,0,.3);\n");
      out.write("    z-index: 1;\n");
      out.write("    animation-delay: 2s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-rocket {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 50%;\n");
      out.write("    left:49.3%;\n");
      out.write("    transform: translate(-50%,-50%) rotate(-45deg);\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 10em !important;\n");
      out.write("    animation: animateRocket .2s linear infinite;\n");
      out.write("    animation-delay: 5s;\n");
      out.write("    animation-play-state: paused;\n");
      out.write("    text-shadow: -10px 15px 10px rgba(0,0,0,.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".cloud {\n");
      out.write("    position: absolute;\n");
      out.write("    color: #ccc;\n");
      out.write("    animation: animateCloud 1s linear infinite;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cloud1 {\n");
      out.write("   left: 10%;\n");
      out.write("   font-size: 6em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cloud2 {\n");
      out.write("   left: 45%;\n");
      out.write("   font-size: 3em;\n");
      out.write("   z-index: -1;\n");
      out.write("   animation-delay: -0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cloud3 {\n");
      out.write("   right: 20%;\n");
      out.write("   font-size: 5em;\n");
      out.write("   animation-delay: -0.4;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("@keyframes animateRocket {\n");
      out.write("    \n");
      out.write("    0% {\n");
      out.write("        transform: translate(-50%,-50%) rotate(-45deg) translate(0,0);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    50% {\n");
      out.write("        transform: translate(-50%,-50%) rotate(-45deg) translate(-5px,5px);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    100% {\n");
      out.write("        transform: translate(-50%,-50%) rotate(-45deg) translate(0,0);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("    \n");
      out.write("@keyframes animateCloud {\n");
      out.write("        \n");
      out.write("        0% {\n");
      out.write("            transform: translateY(-100%);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        100% {\n");
      out.write("            transform: translateY(1000%);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("@keyframes animateScene {\n");
      out.write("        \n");
      out.write("        0% {\n");
      out.write("            background: #b339ff;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        30% {\n");
      out.write("            background: #3b93ff;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("         70% {\n");
      out.write("            background: #3b93ff;\n");
      out.write("            \n");
      out.write("         }\n");
      out.write("        \n");
      out.write("        100% {\n");
      out.write("            background: #b339ff;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    @keyframes example {\n");
      out.write("  0%   {background-color:red; left:0px; top:0px;}\n");
      out.write("  25%  {background-color:yellow; left:200px; top:0px;}\n");
      out.write("  50%  {background-color:blue; left:200px; top:200px;}\n");
      out.write("  75%  {background-color:green; left:0px; top:200px;}\n");
      out.write("  100% {background-color:red; left:0px; top:0px;}\n");
      out.write("}\n");
      out.write(" \n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"scene\">\n");
      out.write("            <i class=\"fa fa-rocket\" aria-hidden=\"true\"></i>\n");
      out.write("            <span class=\"cloud cloud1\"><i class=\"fa fa-cloud\" aria-hidden=\"true\"></i></span>\n");
      out.write("            <span class=\"cloud cloud2\"><i class=\"fa fa-cloud\" aria-hidden=\"true\"></i></span>\n");
      out.write("            <span class=\"cloud cloud3\"><i class=\"fa fa-cloud\" aria-hidden=\"true\"></i></span>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <p> Kuuku website Date is ");
      out.print( date );
      out.write(" </p>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("         \n");
      out.write("  ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
