package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;
import java.sql.*;

public final class Compro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Computer Programming</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"1.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            try {
                Connection con = ConnectionBuilder.getConnection();
                String sql = "select id from subscription where user_id=? AND subject_id=5";
                PreparedStatement ps = con.prepareStatement(sql);
                String userId = request.getParameter("userId");
                request.getSession().setAttribute("userId", userId);
                request.setAttribute("text", "Subscribe");
                int uid = 0;
                uid = Integer.parseInt(userId);
                ps.setInt(1, uid);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    request.setAttribute("text", "Unsubscribe");
                }
                con.close();

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }


        
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"header\">\n");
      out.write("\n");
      out.write("            <div id=\"image\"><img src=\"logo.png\" alt=\"logo\" ></div>                      \n");
      out.write("            <h1>RETURN</h1>  \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"nav\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th><a href=\"Home.html\" target=\"_blank\">Home</a></th>\n");
      out.write("                    <th><a href=\"Return.html\" target=\"_blank\">Return</a></th>\n");
      out.write("                    <th><a href=\"ma-tew.html\" target=\"_blank\">ma-tew</a></th>\n");
      out.write("                    <th><a href=\"kookle.html\" target=\"_blank\">kookle</a></th>\n");
      out.write("                    <th><a href=\"oneforall.html\" target=\"_blank\">oneforall</a></th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <h2>Computer Programimng</h2>\n");
      out.write("\n");
      out.write("        <form action=\"Subscribe\">\n");
      out.write("            <input type=\"hidden\" name=\"userId\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("            <input type=\"hidden\" name=\"subId\" value=\"5\">\n");
      out.write("            <input type=\"hidden\" name=\"jspPath\" value=\"Compro.jsp\">\n");
      out.write("            <input type=\"hidden\" name=\"subscribeStatus\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${text}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <input type=\"submit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${text}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" onclick=\"location.reload(true)\"> \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"contentMaster\">\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br>            <h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"contentMaster\">\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"contentMaster\">\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"contentMaster\">\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"contentMaster\">\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content2\">\n");
      out.write("                <a href=\"viewvideo1.html\" \"><img src=\"stary.png\" style=\"width: 50%; height: 50%;\"></a> \n");
      out.write("                <br><h3>MTH101 CALCULUS I</h3>\n");
      out.write("                <p>AJ. KASEM KEETAK</p>\n");
      out.write("                <p>SEC.1 8.30-11.30</p>\n");
      out.write("                <p>11 NOV 2016</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <center><p>2016 &copy KADEMY 2016</p></center>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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