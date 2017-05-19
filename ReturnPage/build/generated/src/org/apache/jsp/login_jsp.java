package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <title>KADEMY | STRONGEST LEARNING PLATFORM FOR KMUTT STUDENT</title>\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\" />\r\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"assets/global/plugins/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"assets/global/plugins/simple-line-icons/simple-line-icons.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"assets/global/plugins/bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"assets/global/plugins/bootstrap-switch/css/bootstrap-switch.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("        <link href=\"assets/global/css/components-md.css\" rel=\"stylesheet\" id=\"style_components\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"assets/global/css/plugins-md.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"assets/layouts/layout3/css/layout.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"assets/layouts/layout3/css/themes/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\" />\r\n");
      out.write("        <link href=\"assets/layouts/layout3/css/custom.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\" />\r\n");
      out.write("        <style>\r\n");
      out.write("            a{\r\n");
      out.write("             color:black;   \r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"page-container-bg-solid page-md\">\r\n");
      out.write("        <div class=\"page-wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"page-wrapper-row full-height\">\r\n");
      out.write("                <div class=\"page-wrapper-middle\">\r\n");
      out.write("                    <div class=\"page-container\">\r\n");
      out.write("                        <div class=\"page-content-wrapper\">\r\n");
      out.write("                            <div class=\"page-content\">\r\n");
      out.write("                                <div class=\"container\">\r\n");
      out.write("                                    <div class=\"page-header-top\">\r\n");
      out.write("                                        <div class=\"container\">\r\n");
      out.write("                                            <div class=\"page-logo\">\r\n");
      out.write("                                                <a href=\"index.html\">\r\n");
      out.write("                                                    <img src=\"img/kademy.png\" alt=\"logo\" style=\"margin-top: 20px;\" width=\"70px\" height=\"70px\">\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-md-4\">\r\n");
      out.write("                                            <div class=\"portlet light \">\r\n");
      out.write("                                                <div class=\"portlet-title\">\r\n");
      out.write("                                                    <div class=\"caption font-kademy\">\r\n");
      out.write("                                                        <span class=\"caption-subject bold uppercase\"> What is KADEMY ? </span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"portlet-body form\">\r\n");
      out.write("                                                    <p style=\"color: white;\">เพราะการเรียนรู้คือสิ่งสำคัญ Kademy ได้ตระหนักถึงความสำคัญของการเรียนรู้การเรียนในห้องเรียนคือสิ่งสำคัญ</p><br><br>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-8\">\r\n");
      out.write("                                            <div class=\"portlet light \">\r\n");
      out.write("                                                <div class=\"portlet-title\">\r\n");
      out.write("                                                    <div class=\"caption font-kademy\">\r\n");
      out.write("                                                        <i class=\"icon-settings font-kademy\"></i>\r\n");
      out.write("                                                        <span class=\"caption-subject bold uppercase\"> Login </span>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"portlet-body form\">\r\n");
      out.write("                                                    <form role=\"form\" id=\"form_sample_2\" class=\"form-horizontal\" action=\"ConnectLogin\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                                                        <div class=\"form-body\">\r\n");
      out.write("\r\n");
      out.write("                                                            <div class=\"form-group form-md-line-input\">\r\n");
      out.write("                                                                <label class=\"col-md-2 control-label\" for=\"form_control_1\"><i class=\"fa fa-user font-kademy\" aria-hidden=\"true\"></i></label>\r\n");
      out.write("                                                                <div class=\"col-md-6\">\r\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" name=\"username\" id=\"form_control_1\" placeholder=\"Username\" required>\r\n");
      out.write("                                                                    <div class=\"form-control-focus\"> </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"form-group form-md-line-input\">\r\n");
      out.write("                                                                <label class=\"col-md-2 control-label\" for=\"form_control_2\"><i class=\"fa fa-unlock-alt font-kademy\" aria-hidden=\"true\"></i></label>\r\n");
      out.write("                                                                <div class=\"col-md-6\">\r\n");
      out.write("                                                                    <input type=\"password\" class=\"form-control\" name=\"password\" id=\"form_control_2\" placeholder=\"Password\" required>\r\n");
      out.write("                                                                    <div class=\"form-control-focus\"> </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"form-actions\">\r\n");
      out.write("                                                                <div class=\"row\">\r\n");
      out.write("                                                                    <div class=\"col-md-offset-2 col-md-10\">\r\n");
      out.write("                                                                        <input type=\"submit\" onclick=\"\" id=\"loginbtn\" class=\"btn btn-default\" value=\"Sign in\" disable>\r\n");
      out.write("                                                                        <i clsss=\"glyphicon glyphicon-pencil\"></i><button id=\"regisButton\" type=\"button\" class=\"btn btn-default\"><a href=\"Register.jsp\">Register</a></button>\r\n");
      out.write("                                                                        <button id=\"signAdButton\" type=\"button\" class=\"btn btn-default\"><a href=\"#\">Sign in(Admin)</a></button>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </form>\r\n");
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"page-wrapper-row\">\r\n");
      out.write("            <div class=\"page-wrapper-bottom\">\r\n");
      out.write("                <!-- BEGIN FOOTER -->\r\n");
      out.write("\r\n");
      out.write("                <!-- BEGIN INNER FOOTER -->\r\n");
      out.write("                <div class=\"page-footer\">\r\n");
      out.write("                    <div class=\"container\"> 2016 &copy; KADEMY 2016\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"scroll-to-top\">\r\n");
      out.write("                    <i class=\"icon-arrow-up\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- END INNER FOOTER -->\r\n");
      out.write("                <!-- END FOOTER -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"assets/global/plugins/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"assets/global/plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"assets/global/plugins/js.cookie.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"assets/global/plugins/jquery.blockui.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"https://www.gstatic.com/firebasejs/3.5.0/firebase.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
