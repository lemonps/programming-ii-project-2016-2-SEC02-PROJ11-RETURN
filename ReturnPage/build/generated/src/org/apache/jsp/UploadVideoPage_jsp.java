package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UploadVideoPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap.min.css\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"./js/jquery.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"./js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <title>Upload Page</title>\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            h1,h2{\r\n");
      out.write("                text-shadow: 1px 1.5px #808080;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <h1><b>Upload Video   <i class=\"glyphicon glyphicon-cloud-upload\"></i></b></h1> \r\n");
      out.write("            <hr>\r\n");
      out.write("            <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("                <div class=\"container-fluid\">                  \r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li><a href=\"CreateSubjectPage.jsp\">Create Subject</a></li>\r\n");
      out.write("                        <li><a href=\"EditSubjectPage.jsp\">Edit Subject</a></li>\r\n");
      out.write("                        <li><a href=\"DeleteVideoPage.jsp\">Delete Subject</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <hr>\r\n");
      out.write("\r\n");
      out.write("            <form method=\"post\"  action=\"UploadFile\" enctype=\"multipart/form-data\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <b>Choose a video <i class=\"glyphicon glyphicon-facetime-video\"></i></b>\r\n");
      out.write("                    <input type=\"file\"  name=\"File\" class=\"form-control\" placeholder=\"please upload only 'mp4' file\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-default\">Upload</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap.min.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"./js/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"./js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>Upload Page</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            h1,h2{\n");
      out.write("                text-shadow: 1px 1.5px #808080;\n");
      out.write("            }\n");
      out.write("            hr{\n");
      out.write("               border : 1.5px inset #3e4f5e;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <h1><b>Upload Video   <i class=\"glyphicon glyphicon-cloud-upload\"></i></b></h1> \n");
      out.write("            <hr>\n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                <div class=\"container-fluid\">                  \n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"Adminpage.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"CreateSubjectPage.jsp\">Create Subject</a></li>\n");
      out.write("                        <li><a href=\"EditSubjectPage.jsp\">Edit Subject</a></li>\n");
      out.write("                        <li><a href=\"DeleteVideoPage.jsp\">Delete Subject</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <form method=\"post\"  action=\"UploadFile\" enctype=\"multipart/form-data\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <b>Choose a video <i class=\"glyphicon glyphicon-facetime-video\"></i></b>\n");
      out.write("                    <input type=\"file\"  name=\"File\" class=\"form-control\" placeholder=\"please upload only 'mp4' file\">\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-default\">Upload</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
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
