package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap.min.css\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"./js/jquery.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"./js/bootstrap.min.js\"></script>\r\n");
      out.write("      \r\n");
      out.write("        <title>Register Page</title>\r\n");
      out.write("        \r\n");
      out.write("        <style>\r\n");
      out.write("            h1,h2{\r\n");
      out.write("                text-shadow: 1px 1.5px #808080;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("            #regisButt{\r\n");
      out.write("                color:#0C1021;\r\n");
      out.write("                border : 1.5px inset #021014;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("            #backToLogin{\r\n");
      out.write("                border : 1.5px inset #021014;\r\n");
      out.write("            }\r\n");
      out.write("            a{\r\n");
      out.write("                color:#0C1021;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("            hr{\r\n");
      out.write("               border : 1.5px inset #3e4f5e;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            \r\n");
      out.write("            <h1> Register Account  <i class=\"glyphicon glyphicon-pencil\"></i></h1>\r\n");
      out.write("            \r\n");
      out.write("            <hr>\r\n");
      out.write("            \r\n");
      out.write("            <form action=\"RegisterData\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <p><b>Username : </b><input type=\"text\" name = \"username\" class=\"form-control\" placeholder=\"Username\"</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <p><b>Password : </b><input type=\"password\" name = \"password\" class=\"form-control\" placeholder=\"Password\"></p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <p><b>Name : </b><input type=\"text\" name = \"name\" class=\"form-control\" placeholder=\"Name\"></p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <p><b>Surname : </b><input type=\"text\" name = \"surname\" class=\"form-control\" placeholder=\"Surname\"></p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <input type=\"submit\" class=\"btn btn-default\" value=\"Register\" id=\"regisButt\">\r\n");
      out.write("                &nbsp<button type=\"submit\" class=\"btn btn-default\" id=\"backToLogin\"><a href=\"login.jsp\" >Back to Sign in</a></button>\r\n");
      out.write("            </form>    \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
