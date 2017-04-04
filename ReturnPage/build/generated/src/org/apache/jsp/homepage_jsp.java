package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<title>PAGE1</title>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"a.css\">\n");
      out.write("        \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<div id=\"all\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<form id=\"searchdata\" action=\"SeachVideo\" method=\"POST\">\n");
      out.write("\t\t\t\tSearch : <input type=\"text\" name=\"title\">\n");
      out.write("                                     <input type=\"submit\" name=\"GO\" value=\"GO\">\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<img src=\"logo.png\" alt=\"logo\">\n");
      out.write("\t\t\t<h1>RETURN</h1>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"nav\">\n");
      out.write("\t\t\t&nbsp&nbsp&nbsp&nbsp<a href=\"homepage.jsp\" target=\"_blank\">Home</a>\n");
      out.write("\t\t\t&nbsp&nbsp&nbsp&nbsp<a href=\"homepage.jsp\" target=\"_blank\">Return</a>\n");
      out.write("\t\t\t&nbsp&nbsp&nbsp&nbsp<a href=\"homepage.jsp\" target=\"_blank\">ma-tew</a>\n");
      out.write("\t\t\t&nbsp&nbsp&nbsp&nbsp<a href=\"homepage.jsp\" target=\"_blank\">kookle</a>\n");
      out.write("\t\t\t&nbsp&nbsp&nbsp&nbsp<a href=\"homepage.jsp\" target=\"_blank\">oneforall</a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"content\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div id=\"subcontent\">\n");
      out.write("\t\t\t\t<iframe src=\"https://www.youtube.com/embed/rmNK0Rh8gTY?controls=0\"></iframe><br><br>\n");
      out.write("\t\t\t\t<iframe src=\"https://www.youtube.com/embed/rmNK0Rh8gTY?controls=0\"></iframe><br><br>\n");
      out.write("\t\t\t\t<iframe src=\"https://www.youtube.com/embed/tVP-aWrFwXE?controls=0\"></iframe><br><br>\n");
      out.write("\t\t\t\t<iframe src=\"https://www.youtube.com/embed/pefzSBTd0m0?controls=0\"></iframe><br><br>\n");
      out.write("\t\t\t\t<iframe src=\"https://www.youtube.com/embed/wLJxrEjYY4w?controls=0\"></iframe><br><br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"incontent\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<div id=\"list1\"><li><a href=\"subject.jsp\">CALCULAS</a></li></div><br>\n");
      out.write("\t\t\t\t\t<div id=\"list2\"><li><a href=\"subject.jsp\">COMPROGRAMMING</a></li></div><br>\n");
      out.write("\t\t\t\t\t<div id=\"list3\"><li><a href=\"subject.jsp\">PLATFORM</a></li></div>\t<br>\n");
      out.write("\t\t\t\t\t<div id=\"list4\"><li><a href=\"subject.jsp\">WEBTECH</a></li></div><br>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("\t\t\t<p>2017 &copy; KADEMY( <a id=\"fbkademy\" href=\"https://www.facebook.com/groups/962608370536714/\" target=\"_blank\">Team-return</a> )</p>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
