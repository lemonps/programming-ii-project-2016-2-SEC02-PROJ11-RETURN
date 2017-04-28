package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Returnvideo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"2.css\">\n");
      out.write("        <title>Return video</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div id=\"pictures\">\n");
      out.write("            <img src=\"logo.png\" width=\"70px\" height=\"70px\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"nav\">\n");
      out.write("            <a href=\"\">Home</a>\n");
      out.write("         </div>\n");
      out.write("       \n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <div id=\"videos\">\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("            <video width=\"961\" height=\"524\" controls>\n");
      out.write("                <source src=\"VideoStore\\eiei\" type=\"video/mp4\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("        <div id=\"contents\">\n");
      out.write("                    <p>AJ. KASEM KEETAK</p>\n");
      out.write("\n");
      out.write("                    <p>SEC.2 13.30-16.30</p>\n");
      out.write("\n");
      out.write("                    <p>12 NOV 2016</p>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("            </video>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
