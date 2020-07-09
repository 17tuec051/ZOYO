package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hotel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>HOTEL REGISTRATION</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"https://c0.wallpaperflare.com/preview/540/1016/960/cheese-food-meal-dinner.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            div{\n");
      out.write("                width: 300px;\n");
      out.write("                border: 15px solid black;\n");
      out.write("                padding: 50px;\n");
      out.write("                margin : 20px;\n");
      out.write("                position: fixed;\n");
      out.write("                top: 25%;\n");
      out.write("                left: 35%;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"addhotel.java\" method=\"post\">\n");
      out.write("        <center>\n");
      out.write("            <div style=\"background-color: lightcoral\">\n");
      out.write("                RESTAURANT NAME:<input type=\"text\" name=\"rname\" placeholder=\"TITLE\"><br><br>\n");
      out.write("                ESTABLISHED YEAR:<input type=\"number\" name=\"year\" placeholder=\"0000\"><br><br>\n");
      out.write("                ADDRESS:<input type=\"text\" name=\"address\" placeholder=\"ADDRESS\"><br><br>\n");
      out.write("                PHONE NUMBER:<input type=\"number\" name=\"num\" placeholder=\"NUMBER\"><br><br>\n");
      out.write("                <center><input type=\"submit\" value=\"SUBMIT\"></center>\n");
      out.write("            </div>\n");
      out.write("        </center>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
