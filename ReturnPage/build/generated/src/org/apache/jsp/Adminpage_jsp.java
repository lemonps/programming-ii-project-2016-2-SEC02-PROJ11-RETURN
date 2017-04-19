package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Adminpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>  \n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <form method=\"post\"  action=\"UploadFile\" enctype=\"multipart/form-data\">\n");
      out.write("                    <input type=\"file\" name=\"File\" >\n");
      out.write("                    <input type=\"submit\" value=\"Upload\">  \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <div>   \n");
      out.write("           <h2>Edit Subject</h2>\n");
      out.write("            <form method=\"post\" action=\"EditSubject\"> \n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subject.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>              \n");
      out.write("                Edit name to :<input type=\"text\" name=\"name\" >     <br>           \n");
      out.write("                Edit course_id to :<input type=\"text\" name=\"course_id\" >   <br>\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"ok\">                    \n");
      out.write("           \n");
      out.write("            </form>                      \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("                           \n");
      out.write("                <input type=\"text\" name=\"name\" >                \n");
      out.write("                <input type=\"text\" name=\"course_id\" >\n");
      out.write("                <input type=\"submit\" name=\"submit\">                    \n");
      out.write("           \n");
      out.write("            </form>                      \n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("                   <h2>Create Subject</h2>\n");
      out.write("            <form method=\"post\" action=\"CreateSub\">       \n");
      out.write("                <input type=\"text\" name=\"id\" placeholder=\"input id\">               \n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"input name\">                \n");
      out.write("                <input type=\"text\" name=\"course_id\" placeholder=\"input course_id\" >\n");
      out.write("                <input type=\"submit\" name=\"submit\">                    \n");
      out.write("            </form>                      \n");
      out.write("        </div>\n");
      out.write("   \n");
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
