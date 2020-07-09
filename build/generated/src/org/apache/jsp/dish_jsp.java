package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dish_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>dish</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-image: url(\"https://png.pngtree.com/thumb_back/fw800/back_our/20190622/ourmid/pngtree-creative-foodie-food-festival-hd-background-image_207691.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("            }      \n");
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
      out.write("        <form action=\"index.html\" method=\"post\">\n");
      out.write("            <center>\n");
      out.write("            <div>\n");
      out.write("                NAME:<input type=\"text\" name=\"name\"><br>\n");
      out.write("                DISH:<input type=\"text\" name=\"dish\"><br>\n");
      out.write("                COST:<input type=\"number\" name=\"cost\">$<br><hr>\n");
      out.write("                <input type=\"submit\" value=\"SUBMIT\">\n");
      out.write("            </div>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"updatehotelDB\">\n");
      out.write("            <center>\n");
      out.write("            <input type=\"submit\" value=\"UPDATE\">\n");
      out.write("            </center>\n");
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
