package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ShowData;
import java.sql.ResultSet;

public final class CreateSubjectPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap.min.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"./js/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"./js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>Create Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            h1,h2{\n");
      out.write("                text-shadow: 1px 1.5px #808080;\n");
      out.write("            }\n");
      out.write("            hr{\n");
      out.write("               border : 1.5px inset #3e4f5e;\n");
      out.write("            }\n");
      out.write("            #createButt{\n");
      out.write("                border :1px inset #2F353B;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <h1><b>Create Subject <i class=\"glyphicon glyphicon-plus\"></i></b></h1>       \n");
      out.write("            \n");
      out.write("         \n");
      out.write("           \n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                <div id=\"navStyle\" class=\"container-fluid\">                  \n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"Adminpage.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"DeleteSubjectPage.jsp\">Delete Subject</a></li>\n");
      out.write("                        <li><a href=\"EditSubjectPage.jsp\">Edit Subject</a></li>\n");
      out.write("                        <li><a href=\"UploadVideoPage.jsp\">Upload Video</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("       \n");
      out.write("            <b><i class=\"glyphicon glyphicon-list\"></i> Table Data </b>\n");
      out.write("            <hr>\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Subject name</th>\n");
      out.write("                    <th>Subject course id</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");
ResultSet rs = ShowData.showData();
      out.write("\n");
      out.write("                ");
while (rs.next()) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
out.print(rs.getInt("id"));
      out.write("</td>\n");
      out.write("                    <td>");
out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("                    <td>");
out.print(rs.getString("course_id"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write(" \n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <h2><b>Create Subject <i class=\"glyphicon glyphicon-plus-sign\"></i></b></h2>\n");
      out.write("\n");
      out.write("            <form method=\"POST\" action=\"CreateSub\"> \n");
      out.write("                <p><b>id : </b><input type=\"text\" name=\"id\" class=\"form-control\" placeholder=\"enter id of subject\"></p>               \n");
      out.write("                <p><b>Subject name: </b><input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"enter name of subject\"></p>                \n");
      out.write("                <p><b>Course_id : </b><input type=\"text\" name=\"course_id\" class=\"form-control\" placeholder=\"enter course id of subject\"></p>\n");
      out.write("                <input  id=\"createButt\" type=\"submit\" name=\"submit\" class=\"btn btn-default\" value=\"Create\">                    \n");
      out.write("            </form>                      \n");
      out.write("\n");
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
